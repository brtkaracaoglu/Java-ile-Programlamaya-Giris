public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[] {1,2,3,5,8,0};
        int aranacak = 0;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
            }
        }
        if (varMi){
            System.out.println("sayı mevcuttur.");
        }else{
            System.out.println("sayı mevcut değildir.");
        }


    }
}