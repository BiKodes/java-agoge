import java.util.Scanner;

class apples{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        tuna tunaObject = new tuna();

        System.out.println("Enter name of first girl friend here: ");

        String temp = input.nextLine();
        tunaObject.setName(temp);

        tunaObject.saying();
 
    }
}