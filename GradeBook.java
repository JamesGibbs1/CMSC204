package GradeBook;

import java.util.ArrayList;
import java.util.Arrays;
	/**
	 * This is Gradebook to add and calculate scores in a gradebook
	 * This code adds new scores to gradebook, calculates the sum of
	 * the gradebook, and calculates the lowest grade and final score
	 * score of the gradebook by subtracting the lowest score if two or more
	 * scores are in gradebook
	 * @author james gibbs
	 *
	 */

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      double smallest = Double.MAX_VALUE;
      for(int i = 0; i < scoresSize; i++) {
    	  if(scores[i] < smallest) {
    		  smallest = scores[i];
    	  }
      }
      
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
   /**
    * Gets the scores size of GradeBook
    * @return the scores size
    */
   public int getScoreSize() {
	   return scoresSize;
   }
   /**
    * Creates a string of all grades in GradeBook separated by a space
    * @param scores which holds all of scores in GradeBook
    * @return the scores from GradeBook separated by a space
    */
   public String toString() {
	  double[] scores1 = new double[scoresSize];
	  for(int i = 0; i <scoresSize; i++) {
		  scores1[i] = scores[i];
	  }
	  String str = " ";
	  for(int j = 0; j < scoresSize; j++) {
		  str = Arrays.toString(scores1).replace("[", "").replace(",", "").replace("]", "");
	  }
	  return str;
   }
   
}

