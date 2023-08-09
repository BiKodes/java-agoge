import java.util.Scanner;

class Matunda{
    public static void main(String args[]){
        Scanner maembe = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = maembe.nextDouble();
        System.out.println("Enter second num: ");
        snum = maembe.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}