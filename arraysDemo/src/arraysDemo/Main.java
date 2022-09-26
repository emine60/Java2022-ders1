package arraysDemo;

public class Main {
	 public static void main(String[] args) {
	        String ogrenci1 = "Ahmet";
	        String ogrenci2 = "Talha";
	        String ogrenci3 = "Kübra";
	        String ogrenci4 = "Kerem";

	        System.out.println(ogrenci1);
	        System.out.println(ogrenci2);
	        System.out.println(ogrenci3);
	        System.out.println(ogrenci4);

	        System.out.println("-------------------");

	        String[] ogrenciler = new String[5];
	        ogrenciler[0]="Ahmet";
	        ogrenciler[1]="Talha";
	        ogrenciler[2]="Kübra";
	        ogrenciler[3]="Kerem";
	        ogrenciler[4]="Meriç";

	        for (int i=0; i<ogrenciler.length; i++){
	            System.out.println(ogrenciler[i]);
	        }

	        System.out.println("******************");

	        for (String ogrenci:ogrenciler){
	            System.out.println(ogrenci);
	        }
	    }

}
