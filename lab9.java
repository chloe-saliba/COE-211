import java.util.Scanner;
public class lab9 {

   
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       int sum=0;
       int[] grade= new int[5];
       int gradeN;
           for (int n=0; n<5; n++){
           System.out.println("Input the grade for assignment "+ (n+1)+":");
           gradeN= scan.nextInt();
           grade[n]=gradeN;
       }
        int attend, midterm;
        System.out.println("Input the number of attended labs:");
        attend=scan.nextInt();
        System.out.println("Input the midterm grade:");
        midterm= scan.nextInt();
            for(int i=0; i<5; i++)
                sum= sum+ grade[i];
        double gradeAvg= (sum/5)*0.30;
        double attendGrade= attend*100/7.0*0.05;
        double midtermGrade= midterm*0.3;
        
        System.out.println("Assignments(30%): "+gradeAvg);
        System.out.println("Attendance(5%): " +attendGrade);
        System.out.println("Midterm(30%): "+ midtermGrade);
        
            
               
               }
    
}