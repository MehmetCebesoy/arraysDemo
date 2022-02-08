public class Main {

    public static void main(String[] args) {
        // []:array dizi diye okunur,
        // []ilk kullanımda dizideki eleman sayısı için sonrasında dizidenin kaçıncı elemanı olduğu gösteririve
        // [] kullanımda 0 dan başlar
        String ogrenci1 = "Ali";
        String ogrenci2 = "Veli";
        String ogrenci3 = "Ayşe";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Mehmet";
        ogrenciler[1] = "Engin";
        ogrenciler[2] = "Fatma";
//ogrenciler[3]="Tuğba"; yazdğımızda alttakş hatayı verir,
//.ArrayIndexOutOfBoundsException: dizi indeksi sınırların dışında demektir
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------------");
        for (String ogrencı: ogrenciler)
        {System.out.println(ogrencı);
        }
    }
}
//reverse enginering: tersine mühendislik