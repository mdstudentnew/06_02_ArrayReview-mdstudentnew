import org.junit.*;

/**
 * This class tests the Dog array
 * 
 * @author Mr. Aronson
 */
public class ArrayReviewTest extends junit.framework.TestCase
{
  
    public static void main(String args[])
    {
        DogArrayTest p = new DogArrayTest();
        p.testEmployeeNames();
        p.testAverage();
    }
    
    private Employee[] makeEmployees()
    {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Michelle", 25);
        employees[1] = new Employee("George", 19);
        employees[2] = new Employee("Eva", 5);
        employees[3] = new Employee("Frank", 34);
        employees[4] = new Employee("Jackie", 23);
        return employees;
    }

    @Test
    public void testEmployeeNames()
    {
        Employee[] employees = makeEmployees();

        String names = ArrayReview.getNames(employees).trim();
        assertEquals("Michelle Frank Jackie", names);
    }

    @Test
    public void testAverage()
    {
        Employee[] employees = makeEmployees();

        double nums[] = {3.0, -5.0, 4.0, -10.0, 5.0};
        double average = ArrayReview.average(nums);

        assertEquals(4.0, average, .0001);

        double nums2[] = {-4.0, -5.0};
        average = ArrayReview.average(nums2);

        assertEquals(0.0, average, .0001);

    }

}
