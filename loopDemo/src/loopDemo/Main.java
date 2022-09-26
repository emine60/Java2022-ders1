package loopDemo;

public class Main {
	 public static void main(String[] args) {
	        //for
	        for (int i=1;i<10;i++){
	            System.out.println(i);
	        }
	        System.out.println("for Döngüsü Bitti");

	        for (int i=2;i<10;i++){
	            System.out.println(i);
	        }
	        System.out.println("for Döngüsü Bitti");

	        for (int i=1;i<10;i+=2){
	            System.out.println(i);
	        }
	        System.out.println("for Döngüsü Bitti");

	        //while

	        int i=1;
	        while (i<10){
	            System.out.println(i);
	            i++;
	        }
	        System.out.println("While Döngüsü Bitti");

	        while (i<20){
	            System.out.println(i);
	            i+=2;
	        }
	        System.out.println("While Döngüsü Bitti");

	        int j=2;
	        while (j<10){
	            System.out.println(j);
	            j++;
	        }
	        System.out.println("While Döngüsü Bitti");

	        //Do-While

	        int r =1;
	        do {
	            System.out.println(r);
	            r+=1;
	        }while (r<7);
	        System.out.println("Do-While Döngüsü Bitti");
	    }

}
