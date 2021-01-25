public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] employees)
    {
    String str = "";
  	for (int i = 0; i < employees.length; i++) 
	  {
	  	if (employees[i].getYears() > 20)
		  	str = str + employees[i].getName() + " ";
	  }
	    return str.trim();
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
        int count = 0;
        double sum = 0.0;
        for(double value: nums){
          if(value>0){
            sum += value;
            count++;
          }
        }
        if(count>0)
          return sum/count;
        else
          return 0;
    }
}
