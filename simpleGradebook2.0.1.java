public class GradeBook
{
    // public constant variables
    public final static double MIN_SCORE = 0.0;
    public final static double MAX_SCORE = 100.0;
    public final static int MIN_STUDENTS = 0;
    public final static int MAX_STUDENTS = 100;
    public final static int MIN_QUIZZES = 0;
    public final static int MAX_QUIZZES = 100;
    
    // private field variables
    private int pfvStudents;
    private int pfvQuizzes;
    private double [][] scores ;
    
    public GradeBook()                              // default constructor
    {

    }
    
    public GradeBook(int students, int quizzes)    // parameterized constructor
    {
        pfvStudents = students;
        pfvQuizzes = quizzes;
        scores = new double [pfvStudents][pfvQuizzes];
    }
    
    public void setStudents(int students)
    {
        if (students <= MIN_STUDENTS)             // secondary input validation
        {
            System.err.println("Number of students must be greater than zero.");
            return;
        }
        pfvStudents = students;
        scores = new double [pfvStudents][pfvQuizzes];
    }
    
    public void setQuizzes(int quizzes)
    {
        if (quizzes <= MIN_QUIZZES)               // secondary input validation
        {
            System.err.println("Number of quizzes must be greater than zero.");
            return;
        }
        pfvQuizzes = quizzes;
        scores = new double [pfvStudents][pfvQuizzes];
    }
    
    public int getStudents()
    {
        return pfvStudents;
    }
    
    public int getQuizzes()
    {
        return pfvQuizzes;
    }
    
    public void inputGrade(int studentName, int quizNum, double score)
    {
       
        scores[studentName][quizNum] = score;
    }
    
    public double calcAvgScore()
    {
        double averageScore;        
        double total = 0;           // accumulator
        
        // for loop to calculate total scores
        for (int student=0; student < scores.length; student++)
        {
            
            for (int quiz=0; quiz < scores[student].length; quiz++)
            {
                total = total + scores[student][quiz];
            }
        }
        
        // calculate average by multipling # students by # quizzes
        averageScore = total / (pfvStudents*pfvQuizzes);
        
        return averageScore;
    }
}