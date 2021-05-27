public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one,int two,int three) {
        int oneTemp = 0, twoTemp = 0, threeTemp = 0,count = 0;
        if ((one >= 10 && one <= 1000) && (two >= 10 && two <= 1000) && (three >= 10 && three <= 1000)) {
            while (one != 0 && two != 0 && three != 0) {
                oneTemp = one % 10;
                twoTemp = two % 10;
                threeTemp = three % 10;

                if ((oneTemp == twoTemp) || (oneTemp == threeTemp) || (twoTemp == threeTemp)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int one){
        if (one >= 10 && one <= 1000) {
            return  true;
        }else {
            return false;
        }
    }
}
