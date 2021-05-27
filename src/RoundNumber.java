import java.text.DecimalFormat;

public class RoundNumber {
    public static void main(String[] args)
    {
       // double number = 0.3333333333333333;
        // rounding number to 2 decimal places
        //System.out.format("%.2f", number);


        double d = 2.34568;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(d));
    }
}
