import java.util.*;
class Solution {
    public int reverse(int x) {
        int sum = 0;
        while (x != 0) {
            int r = x % 10;
            x = x / 10;
            if (sum > Integer.MAX_VALUE / 10 ||
                (sum == Integer.MAX_VALUE / 10 && r > 7))
                return 0;
            if (sum < Integer.MIN_VALUE / 10 ||
                (sum == Integer.MIN_VALUE / 10 && r < -8))
                return 0;
            sum = sum * 10 + r;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int n = sc.nextInt();
        int result = obj.reverse(n);
        System.out.println(result);
    }
}
