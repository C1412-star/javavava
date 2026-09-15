import java.util.Scanner;

public class sumCulculator {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("the start number is:");
        int start = input.nextInt();
        System.out.print("the end number is:");
        int end = input.nextInt();

        if (start >= end){
            System.out.print("error!Start number should be less than end number");
        }else{int sum=0;
            for(int counter = start ; counter<=end ; counter++){
                sum = sum+counter;
            }
            System.out.println("the sum from " + start + " to " + end + " is:" +sum);
            System.out.println("hello rainbowww!!")//C1412 add

        }


    }
}
