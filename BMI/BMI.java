import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        //user input
        System.out.println(" Please enter your full name : " );
        String name = in.nextLine(); 
        System.out.println(); 
        System.out.println(" Please enter height in feet and inches (I.E. 5 2) : " ); 
        int heightFeetFake = in.nextInt();
        int heightInchesFake = in.nextInt();
        System.out.println();
        System.out.println( " Please enter weight in pounds : " );
        double weightFake = in.nextDouble(); 
        System.out.println();
        
        //conversion 
        double heightInches = (heightFeetFake * 12) + heightInchesFake;
        double height = heightInches * 0.0254;
        double weight = weightFake / 2.2046; 
        
        
        //calculate 
        double BMI = (weight) / ((height) * height);
       
        
        //if 
        String status = "";
        if(BMI <= 18.5)
           status = "Underweight"; 
        else if(BMI <= 24.9)
            status = "Healthy Weight";
        else if(BMI <= 29.9)
            status = "Overweight"; 
        else if(BMI <= 30.0)
            status = "Obese"; 
            
        //output
        System.out.println(" Name: " + name );
        System.out.println();
        System.out.println(" Height (m) : " + height);
        System.out.println();
        System.out.println("Weight (kg) :" + weight );
        System.out.println();
        System.out.println("BMI :" + BMI);
        System.out.println();
        System.out.println("Status : " + status);
         
        
    }
}
