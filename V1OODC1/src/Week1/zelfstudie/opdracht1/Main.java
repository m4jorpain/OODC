package Week1.zelfstudie.opdracht1;

public class Main {
	public static void main(String[] args){
        System.out.println("For Loop:");
		for(int i=1; i<=10; i=i+1){
             System.out.println(i);
        }
        System.out.println("While Loop:");
        int count = 1;
        while (count < 11) {
            System.out.println(count);
            count++;
        }
        System.out.println("Random:");
		for(int i=1; i<=10; i=i+1){
             System.out.println((int)(Math.random()*10));
        }
		System.out.println("Zelfstudie 4:");
		int count2 = 0;
		for(int i=1; i<=39; i=i+1){
			count2 = count2 + i;
            System.out.println(count2);
		}
		System.out.println("Zelfstudie 5:");
		for(int i=1; i<=4; i=i+1){
			if(i==2){
				System.out.println("ss");
			} else {
				System.out.println("s");
			}
		}
	}
}
