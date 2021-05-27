public class NumberToWords {
    public static void numberToWords(int number) {
        int tempNum = 0,numTemp=number;
        int revNumber = reverse(number);
        if (revNumber >= 0){
            number = revNumber;
            while (number >0){
                tempNum = number%10;
                switch (tempNum) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 0:
                        System.out.println("Zero");
                        break;
                }
                number = number/10;
            }
            if (revNumber ==0){
                System.out.println("Zero");
            }
            if ((getDigitCount(numTemp)-getDigitCount(revNumber)) !=0){
                for(int i=0;i<(getDigitCount(numTemp)-getDigitCount(revNumber));i++){
                    System.out.println("Zero");
                }
            }
        }else {
            System.out.println("Invalid Value");
        }
    }
    public static int reverse(int number){
        int tempNum1 = 0,tempNum2=0,count = 0;
            while (number !=0){
                tempNum1 = number%10;
                tempNum2 = (tempNum2*10) + tempNum1;
                number = number/10;
                count++;
            }
            return tempNum2;
    }

    public static int getDigitCount(int number){
        if(number >= 0) {
            String numStr = String.valueOf(number);
            return Integer.valueOf(numStr.length());
        }else{
            return  -1;
        }
    }
}
