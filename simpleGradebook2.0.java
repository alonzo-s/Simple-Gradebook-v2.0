public class Assignment4 
{
    
    public static void main(String[] args) 
    {	
        // declare variables and constants
        final int MIN_VAL = 0;
        final int MAX_VAL = 100;
        int studentNum;
        int quizNum;
        double qScore;
               
        System.out.println("Welcome to Simple Gradebook v2.0");
        
        // create object using default constructor
        GradeBook gradeB = new GradeBook();
 
        System.out.print("Enter the number of students: ");
       // calling promptInt method
        studentNum = promptForInteger(" ", MIN_VAL, MAX_VAL);   
       // setting pfvStudents equal to studentNum
        gradeB.setStudents(studentNum);                         
        
        
        System.out.print("Enter the number of quizzes: ");
        // calling promptInt method
        quizNum = promptForInteger(" ", MIN_VAL, MAX_VAL);
        // setting pfvQuizzes equal to quizNum
        gradeB.setQuizzes(quizNum);
        
        // create new object 
        GradeBook grades = new GradeBook(studentNum, quizNum);
        
        // for loop using inner/outer loops for 2D Array
        for (int student=0; student < grades.getStudents(); student++)
        {
            for (int quiz=0; quiz < grades.getQuizzes(); quiz++)
            {
                System.out.printf("Enter the score for Student#%d and Quiz#%d: "
                        + "", student, quiz);
                qScore = promptForDouble(" ", MIN_VAL, MAX_VAL);
                grades.inputGrade(studentNum, quizNum, qScore);
            }
        }
        
       // Output average to user 
        System.out.printf("The average score for %d students and %d quizzes is"
                + grades.calcAvgScore(), grades.getStudents(), 
                grades.getStudents());
    }
    
    public static int promptForInteger(String message, int minValue, 
            int maxValue)
    {
        // declare variable and validate input
        int value;
        Scanner keyboard = new Scanner(System.in);
        value = Integer.parseInt(keyboard.nextLine());
        if (value < minValue || value > maxValue)
        {
            System.err.printf("Enter a number in between %d and %d: ", 
                    minValue, maxValue);
            value = Integer.parseInt(keyboard.nextLine());
        }
        
        return value;
    }
    
    public static double promptForDouble(String message, double minValue, 
            double maxValue)
    {
        // declare variable and validate input
        double num;
        Scanner keyboard = new Scanner(System.in);
        num = Double.parseDouble(keyboard.nextLine());
        if (num < minValue || num > maxValue)
        {
            System.err.printf("Enter a number in between %.0f and %.0f: ", 
                    minValue, maxValue);
            num = Double.parseDouble(keyboard.nextLine());
        }
        
        return num;
    }
    
}



