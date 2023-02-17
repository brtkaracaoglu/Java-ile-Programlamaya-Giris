import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(100);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size()); // eleman sayısını söyler
        //sayilar.set(1,10); // 1. indexsi güncelliyor
        //sayilar.remove(0); // 0. indexsi siler diğer elemanlar sola kayar
        //sayilar.clear(); // tüm elemanları siler
        //System.out.println(sayilar.get(0));

        for (Object i : sayilar){
            System.out.println(i);
        }

    }
}