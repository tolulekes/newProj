import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class fileCreate {

    static Scanner aise = new Scanner(System.in);
    static Scanner aise1 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1   Read File\n2   Entry into file\n3   Exit");
        int opt;
        opt = aise.nextInt();
        try {
            switch (opt){
                case 1:
                    fileRead();
                    break;

                case 2:
                    fileWrite();
                    break;

                case 3:
                    System.out.println("You quit the application");
                    break;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    static void fileWrite (){


        try{

            FileWriter fo = new FileWriter("Aisosa.doc", true);
            String text = aise1.nextLine();
            fo.write(text);
            fo.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("You picked option 2");
        }
    }

    static void fileRead(){
        try{
            FileReader fo2 = new FileReader("Aisosa.doc");
            int c;

           while((c = fo2.read())!=-1){
               System.out.print((char) c);
           }
            System.out.print("\n");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("You picked option 1");
        }
    }
}
