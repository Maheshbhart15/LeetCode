package Math;
import java.math.*;

public class SumofSqnum633 {
    public static void main(String[] args) {
             int c=5; // try with 3 flase
        solution objsol = new solution();
        boolean result=objsol.judgeSquareSum(c);
        System.out.println(result); // Print the result


                      }
    public static class solution{

        public boolean judgeSquareSum(int c) {
            long left=0, right= (long) Math.sqrt(c);
            while (left<=right)
            {
                long curresult= left * left+right*right;
                if(curresult<c)
                {
                    left++;
                }else if (curresult > c){
                    right --;
                } else {
                    return  true;
                }

            }
            return  false;
        }
    }
}
