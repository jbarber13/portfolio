/**
 * Student -- Defines a Student 
 *
 * @author  Jake Barber
 * @version 4 NOV, 2015
 */
public class Student{
   private String name;
   private int[] scores;
   private int midterm;
   private int finalExam;
   
   public Student(String _name){
      name = _name;
      scores = new int[9];
      for(int i=0; i<scores.length; ++i)
         scores[i]=0;
      midterm = 0;
      finalExam = 0;
   }
   public void setQuizScore(int quizNum, int quizScore){
      if(quizNum>0 && quizNum<10)
         scores[quizNum-1]=quizScore;
   }
   public void setMidtermScore(int score){
      midterm = score;
   }
   public void setFinalScore(int score){
      finalExam = score;
   }
   public double getQuizAve(){
      double ave = 0;
      int sum = 0;
      int min = 11;
      int ind1 = 0;
      int ind2 = 0;
      int[] newScores = new int[9]; 
            
      for(int i=0; i<scores.length; ++i){
         if(scores[i]>min){
            min = scores[i];
            ind1 = i;
         }
      }
      min = 11;
      for(int i=0; i<scores.length; ++i){
         if(scores[i]>min && i!=ind1){
            min = scores[i];
            ind2 = i;
         }
      } 
      for(int i=0; i<scores.length; ++i){
         newScores[i] = scores[i];
      }
      newScores[ind1]=-1;
      newScores[ind2]=-1;
      for(int i=0; i<newScores.length; ++i){
         if(newScores[i]>=0){
            sum+=newScores[i];
         }
      }
      
      ave = sum/7;
            
      return ave;
   }
   public double getSemesterAve(){
      double ave = 0;
      double quizAve = (this.getQuizAve()*10)*.35;
      double midAve = midterm*.25;
      double finalAve = finalExam*.40;
      ave = quizAve+midAve+finalAve;
      return ave;
   }
   public char letterGrade(){
      char grade = 'F';
      if(this.getSemesterAve()>=90)
         grade = 'A';
      else if(this.getSemesterAve()>=80)
         grade = 'B';
      else if(this.getSemesterAve()>=70)
         grade = 'C';
      else if(this.getSemesterAve()>=60)
         grade = 'D';
      return grade;
   }
   public String toString(){
      return "Grade Report for "+name+"\n\nQuiz Average   : "+this.getQuizAve()+"\nMidterm grade  : "+midterm+"\nFinal Exam     : "+finalExam+"\n\nSemester average : "+this.getSemesterAve()+"    "+this.letterGrade();
   }
}