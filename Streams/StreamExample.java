package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(4000);
        salaryList.add(14000);
        salaryList.add(2000);
        salaryList.add(5000);
        salaryList.add(8000);

        int count = 0;
        for(Integer salary : salaryList){
            if(salary > 3000)
                count++;
        }
        System.out.println("The salary more than 3000 are: " + count);
        System.out.println("-------------------Using Streams---------------------");

    // Same is implemented using Java Streams

        List<Integer> salaryList1 = new ArrayList<>();
        salaryList1.add(14000);
        salaryList1.add(4000);
        salaryList1.add(2000);
        salaryList1.add(5000);
        salaryList1.add(8000);

        long output = salaryList1.stream()                              // FIRST STEP (Create a stream)
                                 .filter((Integer sal) -> sal > 3000)   // SECOND STEP (Intermediate operations- You can use 0 or more Intermediate operations)
                                 .count();                              // THIRD STEP (Terminal operation- This is used to print the output)
        System.out.println("The salary using streams for more than 3000 are: " + output);
    } 
    
}
