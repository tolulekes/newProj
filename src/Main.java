import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner aise = new Scanner(System.in);
        int xyz;
        System.out.print("Number: ");
        xyz = aise.nextInt();


        System.out.println("Hello World!");

        for(int i = 1; i <= 20; i++){
            xyz++;
            System.out.println(i + ": " + xyz);

        }
    }
}
