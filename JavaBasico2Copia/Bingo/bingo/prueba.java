package bingo;

import java.util.Scanner;

public class prueba {
	

	public static void main(String[] args) {

	
		int a;
		int i;
		int j;
		int s=0;
	
System.out.println("******BINGO IES MARTINEZ MONTAÑEZ******");
		
		System.out.println("\t\tPREMIOS");
		
		System.out.println("\tLinea:100$");
		System.out.println("\tBingo:500$");	
		
	
		
		int[][] matriz = new int[3][5];

//pintar la matriz		
		matriz[0][0]=
		matriz[0][1]=
		matriz[0][2]=
		matriz[0][3]=
		matriz[0][4]=
		
		matriz[1][0]=
		matriz[1][1]=
		matriz[1][2]=
		matriz[1][3]=
		matriz[1][4]=
		
		matriz[2][0]=
		matriz[2][1]=
		matriz[2][2]=
		matriz[2][3]=
		matriz[2][4]=
		
//primera columna
	 matriz[0][0]=(int)(Math.random()*10)+1;	
	 matriz[1][0]=(int)(Math.random()*10)+1;
	 matriz[2][0]=(int)(Math.random()*10)+1;
		
//segunda columna
	 
	 matriz[0][1]=(int)(Math.random()*(19-10)+10);	
	 matriz[1][1]=(int)(Math.random()*(19-10)+10);
	 matriz[2][1]=(int)(Math.random()*(19-10)+10);
	 
//tercera columna
	 
	 matriz[0][2]=(int)(Math.random()*(29-20)+20);	
	 matriz[1][2]=(int)(Math.random()*(29-20)+20);
	 matriz[2][2]=(int)(Math.random()*(29-20)+20);
	 
//cuarta columna
	 
	 matriz[0][3]=(int)(Math.random()*(39-30)+30);
	 matriz[1][3]=(int)(Math.random()*(39-30)+30);
	 matriz[2][3]=(int)(Math.random()*(39-30)+30);
	 
//quinta columna
	 
	 matriz[0][4]=(int)(Math.random()*(49-40)+40);
	 matriz[1][4]=(int)(Math.random()*(49-40)+40);
	 matriz[2][4]=(int)(Math.random()*(49-40)+40);

	 
//bola aleatoria
	 int bola=(int)(Math.random()*+50);
	 
//recorer matriz
	 System.out.println("----------------------------------");
	 System.out.println("\tJugador1");
	 System.out.println("----------------------------------");
		for ( i = 0; i < 3; i++) {
			System.out.println();
			for ( j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]+" | ");
				
			}}
		
		

	boolean  encontrado=false;
Scanner sn=new Scanner(System.in);
	
//para repetir la matriz
do {
	System.out.println(" ");
	System.out.println("Introduce un 0 para continuar ");
	 s=sn.nextInt();
	
	
//recorer matriz y comprobar que  pones 0 y poner la bola
if (s==0) {
	 System.out.println("----------------------------------");
	 System.out.println("\tJugador1");
	 System.out.println("----------------------------------");
	 for ( i = 0; i < 3; i++) {
			System.out.println();
			for ( j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]+" | ");
				
			}}
	 
	 System.out.println("La bola es "+bola);
}else {
	System.out.println("Introduce un 0 para continuar");
	 s=sn.nextInt();
	 for ( i = 0; i < 3; i++) {
			System.out.println();
			for ( j = 0; j < 5; j++) {
				System.out.print(matriz[i][j]+" | ");
				
			}}
	 System.out.println(" ");
	 System.out.println("La bola es "+bola);
}
	

	



	
} while (encontrado);		
	
		
		
		
		
		
		
		
		
		
		}
		
	
		
		
		
	

	}

