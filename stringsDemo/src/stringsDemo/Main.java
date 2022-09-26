package stringsDemo;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı = " + mesaj.length());
		
		System.out.println("6. Elemanı : " + mesaj.charAt(5));
		
		System.out.println(mesaj.concat(",yaşasın!"));
		
		System.out.println(mesaj.startsWith("B"));
		
		System.out.println(mesaj.endsWith("."));
		char[] karakter = new char[5];
		mesaj.getChars(0, 5, karakter, 0);
		
		System.out.println(karakter);
		
		System.out.println(mesaj.indexOf("ço"));
		
		System.out.println(mesaj.lastIndexOf("a")); 
		
		String yeniMesaj =  mesaj.replace(' ', '-');
		
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		
		System.out.println(mesaj.substring(2,5));
		
		//kelimeleri bir alt satıra yazdırır:
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		//küçük haf yapmak için:
		System.out.println(mesaj.toLowerCase());
		
		//büyük harf yapmak için:
		System.out.println(mesaj.toUpperCase());
		
		//başındaki ve sonundaki boşlukları kaldırmak için:
		System.out.println(mesaj.trim());
		
		

	}


}
