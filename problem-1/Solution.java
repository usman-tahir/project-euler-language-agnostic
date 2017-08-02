
public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for(i = 3; i < 1000; i += 1) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}