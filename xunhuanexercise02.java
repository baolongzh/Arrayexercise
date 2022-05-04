import java.util.Scanner;
public class xunhuanexercise02{
	public static void main(String[] args){
		// Scanner input= new Scanner(System.in);
		// int a=0;
		// for(int i = 1;i<=100;i++){
		// 	if(i%5!=0){
		// 		System.out.printf("%3d",i);
		// 		a++;
		// 		if(a==5){
		// 			a=0;
		// 			System.out.println();
		// 		}
		// 	}
		// }


		// char num1 = 'a';
		// char num2 = 'Z';
		// for(int i = 1;i <=26;i++){
		// 	System.out.print(num1 +" ");
		// 	num1 = (char)(num1+1);
		// }
		// System.out.println();
		// for(int j = 1;j <= 26;j++){
		// 	System.out.print(num2 +" ");
		// 	num2 = (char)(num2-1);
		// }

		// int flag=1;
		// double sum=0;
		// for(int i = 1;i <= 100;i++){
		// 	sum+=flag*1.0/i;
		// 	flag=-flag;
		// }
		// System.out.print(sum);

		int sum = 0 , count = 0;
		for(int i = 1;i <= 100;i++){
			sum+=i;
			count+=sum;
			
		}
		System.out.print(count);

		// char a='ÕÔ';
		// char b='Ò»';
		// char c='·½';
		// char d = 'a';
		// System.out.println((int)a);
		// System.out.println((int)b);
		// System.out.println((int)c);
		// System.out.println((int)d);
	}
}