import java.util.*;
 class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            int K = sc.nextInt();
            
            // Store (X, Y) pairs in a 2D array
            int[][] pairs = new int[K][2];
            for (int i = 0; i < K; i++) {
                pairs[i][0] = sc.nextInt(); // X (car)
                pairs[i][1] = sc.nextInt(); // Y (station)
            }
            
            // Sort by X ascending, then by Y ascending
            Arrays.sort(pairs, (a, b) -> {
                if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            });
            
            // Find Longest Non-Decreasing Subsequence (LNDS) of Y
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < K; i++) {
                int y = pairs[i][1];
                
                // Find first element strictly greater than y
                int pos = upperBound(list, y);
                if (pos == list.size()) {
                    list.add(y);
                } else {
                    list.set(pos, y);
                }
            }
            
            // Total time = base time (N + M - 1) + max extra slow minutes
            System.out.println(N + M - 1 + list.size());
        }
    }
    
    // Simple helper to find the first index where list.get(index) > target
    static int upperBound(ArrayList<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}