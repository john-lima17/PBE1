package programacao_backend;

import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual é o numero interno? ");
         int num1 = sc.nextInt();
         
         System.out.println("Qual é o outro numero interno? ");
         int num2 = sc.nextInt();
		
		System.out.printf("A soma deles é:  ",( num1+num2));
	}

}
