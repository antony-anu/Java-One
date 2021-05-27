public class FactorPrinter {
    public static void printFactors(int one) {
        if (one > 0){
            for(int i=1;i<=one;i++){
                if(one%i == 0){
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
