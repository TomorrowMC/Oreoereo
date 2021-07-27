package day06;

import java.util.Scanner;

public class grades {
   public static void main(String[] args) {
       int max = 0;
       Scanner scan = new Scanner(System.in);
       System.out.println("请输入学生人数");
       int studentNum = scan.nextInt();
       System.out.println("请输入"+studentNum+"个成绩");
       int[] database = new int[studentNum];
       for( int i=0;i<=studentNum-1;i++){
        database[i] = scan.nextInt(); 
       }
       for(int i=0;i<studentNum-1;i++){
           if(database[i]>max){
               max = database[i];
           }
       }
       System.out.println("最高分是:"+max);
       for(int i=0;i<=studentNum-1;i++){
           if(database[i]>=max -10){
            System.out.println("student "+ i + " score is " + database[i] + " grade is " + "A"); 
           }else if(database[i]>=max -20) {
            System.out.println("student "+ i + " score is " + database[i] + " grade is " + "B"); 
           }else{
            System.out.println("student "+ i + " score is " + database[i] + " grade is " + "C"); 
           }
       }
   } 
}
