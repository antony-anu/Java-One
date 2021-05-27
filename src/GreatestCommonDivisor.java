import java.util.ArrayList;
import java.util.Collections;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int one,int two) {
        ArrayList<Integer> oneList = new ArrayList<>();
        ArrayList<Integer> twoList = new ArrayList<>();
        if (one > 10 && two > 10) {
            int minimum = Math.min(one,two);
            for (int i=1;i<=minimum;i++) {
                if (one%i == 0){
                    oneList.add(i);
                }
                if (two%i == 0){
                    twoList.add(i);
                }
            }
            oneList.retainAll(twoList);
            return (Collections.max(oneList));
        }else {
            return -1;
        }
    }
}
