public class PerfectNumber {
    public static boolean isPerfectNumber(int one) {
        int perfectNumSum = 0;
        if (one > 0){
            for(int i=1;i<one;i++){
                if(one%i == 0){
                    perfectNumSum = perfectNumSum + i;
                }
            }
            if(perfectNumSum == one){
                return true;
            }
        }
        return false;
    }
}
