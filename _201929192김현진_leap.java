import java.util.Scanner;

public class _201929192김현진_leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

         System.out.print("연도를 입력하세요:");
         int year=0;

         year=sc.nextInt();

         if(year%100==0&&year%400==0){
               System.out.println(year+"는 윤년");
         }

         else if(year%4==0&&year%100!=0){
               System.out.println(year+"는 윤년");
         }

         else
               System.out.println(year+"는 윤년아님");
   }
	}


