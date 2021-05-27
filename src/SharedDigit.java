import java.util.ArrayList;

public class SharedDigit {
    public static boolean hasSharedDigit(int one,int two) {
        int oneTemp = 0, twoTemp = 0, count = 0;
        ArrayList<Integer> oneList = new ArrayList<Integer>();
        ArrayList<Integer> twoList = new ArrayList<Integer>();
        if ((one >= 10 && one <= 99) && (two >= 10 && two <= 99)) {
            while (one != 0) {
                oneTemp = one % 10;
                twoTemp = two % 10;
                one = one / 10;
                two = two / 10;
                oneList.add(oneTemp);
                twoList.add(twoTemp);
            }
            for (Integer integer : oneList) {
                if (twoList.contains(integer)) {
                    count++;
                }
            }
            if (count >0){
                return true;
            }
        }
        return false;
    }
}
