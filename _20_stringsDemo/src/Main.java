public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı :"+ mesaj.length()); //uzunluğunu verir
        System.out.println("5. eleman :"+ mesaj.charAt(4)); // belirlenen indexsi verir
        System.out.println(mesaj.concat("Yaşasın")); // belirlenen string birleştirmek
        System.out.println(mesaj.startsWith("B")); // belirlenen karakter ile başlıyormu ona bakar
        System.out.println(mesaj.endsWith(".")); // belirlenen karakter ile bitiyormu ona bakar

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);//0-5 kadar karakterlere ata 0 dan itibaren aktar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));// belirlenen karakter kaçıncı indexte onu söyler
        System.out.println(mesaj.lastIndexOf('a'));// belirlenen karakter kaçıncı indexte onu söyler ama aramaya sağdan başlar


        String mesaj2 = mesaj.replace(' ', '-');
        System.out.println(mesaj2);//belirlenen metinde boşluk olan yerlere istenilen eklenir.
        System.out.println(mesaj.substring(2,4));//belirlenen metnin içinden satır almaktır

        for (String kelime : mesaj.split(" ")){ //belirlenen metni parçalara bölmek
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());// belirlenen metni küçük harf yapar
        System.out.println(mesaj.toUpperCase());// belirlenen metni büyük harf yapar



    }
}