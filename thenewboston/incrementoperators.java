import java.util.Scanner;

class Waziri{
    public static void main(String args[]){
        Scanner Forodhani = new Scanner(System.in);

        int aridhi = 5;
        int usalama = 18;
        ++aridhi;
        System.out.println(aridhi);
        // This is pre-increasing avariable before accessing it
        System.out.println(++aridhi); 
        System.out.println(usalama);

        System.out.println(--aridhi);
        System.out.println(usalama);

        aridhi = aridhi + 5;
        aridhi += 5;
        System.out.println(aridhi);

        aridhi -= 5;
        System.out.println(aridhi);

        aridhi *= 5;
        System.out.println(aridhi);

    }
}