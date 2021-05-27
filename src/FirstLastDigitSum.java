public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int firstDigit=0,lastDigit = 0;
        if (number < 0) {
            return -1;
        }else if (number == 0){
            return 0;
        }else {
            lastDigit = number % 10;
            while (number != 0) {
                firstDigit = number % 10;
                number = number / 10;
            }
            return  (firstDigit + lastDigit);
        }
    }
}
