public class StarWorld{

     public static void main(String []args){
        // No of rows 
        int no_of_rows = 5;
        
        // Start with the row and then for each row add column
        for (int row =1; row<=no_of_rows; row++)
        {
            for (int col = 1; col<= row; col++ )
            {
                System.out.print(" * ");
            }
          System.out.println("");  
        }
        // Decrement to the previous state,starting from last column position
        for (int rows = no_of_rows; rows >= 1; rows--)
        {
            for (int cols = rows; cols >= 1; cols-- )
            {
                System.out.print(" * ");
            }
          System.out.println("");  
        }
        
     }
}
