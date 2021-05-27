public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int digits = 0,evenSum = 0;
        if (number < 0) {
            return -1;
        }else {
            while (number != 0) {
                digits = number % 10;
                if (digits%2 == 0){
                    evenSum = evenSum + digits;
                }
                number = number / 10;
            }
            return  evenSum;
        }
    }
}
