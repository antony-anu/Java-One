public class CumulativeCalc {
    public static void main(String[] arg){
        Double initAmount = 800000.00;
        Double intRate = (9.00/100.00);
        Double finalAmt = 0.00;
        for (int i=1;i<=4;i++){
            finalAmt = initAmount + (initAmount*intRate);
            System.out.println("Year = " + i + " : Value = " + finalAmt);
            initAmount = finalAmt;
        }

        System.out.println("Value after adding inflation rate of 4 years in india: " + " " + (finalAmt + (finalAmt*(5.75/100))));
        System.out.println("Value in Euros :" + ((finalAmt + (finalAmt*(5.75/100)))/77.00));
        System.out.println(("Value In Euro / 12 :" + (((finalAmt + (finalAmt*(5.75/100)))/77.00)/12)));
    }
}
