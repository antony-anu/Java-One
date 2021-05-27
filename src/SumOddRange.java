public class SumOddRange {
    public static  void main(String [] args){
        System.out.println("sumOdd:=" + sumOdd(100,1000));
    }

    public static boolean isOdd(int one) {
        if (one > 0){
            if(one % 2 != 0){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int oddSum = 0;
        if (start > 0 && end > 0 && end >= start){
            for (int i=start;i<=end;i++){
                if(isOdd(i)){
                    oddSum = oddSum + i;
                }
            }
            return oddSum;
        }else{
            return -1;
        }
    }
}
