package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 6, 12, 35 };
		int aranacak = 8;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}

		}
		if (varMi) {
			System.out.println(aranacak + " sayısı sayılar listesinde var");

		} else {
			System.out.println(aranacak + " sayısı sayılar listesinde yok");
		}
	}

}
