public class NumberPalindrome {
    public boolean isABoolean(int number){
        int palindromeOrNot = 0,reverse = 0,temp = number;
        while ((number*-1) > 0){
            reverse = number % 10;
            palindromeOrNot = (palindromeOrNot*10) + reverse;
            number = number/10;
        }
        return palindromeOrNot == temp ? true:false;
    }
}
