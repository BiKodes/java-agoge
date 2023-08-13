class Ndenge{
    public static void main(String args[]){
        int njiwa, kuku;
        kuku = 18;
        njiwa = 40;

        if(kuku > 10 && njiwa < 60){
            System.out.println("You can eat either");
        }else{
            System.out.println("You can not eat either.");
        }

        njiwa = 100;
        if(kuku > 10 || njiwa < 60){
            System.out.println("You can eat either");
        }else{
            System.out.println("You can't eat either");
        }
    }
}