
public class Solution {
    public static void main(String[] args) {
        int current = 0, next = 1;
        int currentSum = 0;
        int sum = 0;

        while (currentSum < 4000000) {
            currentSum = (current + next);
            if (currentSum % 2 == 0) {
                sum += currentSum;
            }
            current = next;
            next = currentSum;
        }
        System.out.println(sum);
    }
}