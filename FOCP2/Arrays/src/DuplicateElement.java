import java.util.*;
 
class DuplicateElement
 {
 
     public static void main(String args[])
     {
        Scanner input = new Scanner( System.in );
        int [] array = new int [5];
 
        int count = 0; 
        int entered = 0;
        int num =0;
 
       while( entered < array.length )
        {
           System.out.print( "Enter number: " );
            num = input.nextInt(); 
 
            if ((num>=10) && ( num<=100))
             {
                boolean containsNumber = false;
                entered++;
 
                 for (int i=0;i<array.length;i++)
                   {
         	 if (array[i]==num)
         	   containsNumber=true;
                   }
 
                 if ( !containsNumber )
                  { 
                     for (int i=0; i<array.length;i++)
                       {
                          array[i]=num;
                          count++;
                       }
 
                   } 
 
                 else
                  System.out.printf( "%d has already been entered\n",num );
               } 
 
                else
          System.out.println( "number must be between 10 and 100" );
 
        
          for(int i=0 ; i<array.length;i++)
           {
            System.out.printf("%d\n",array[i]);
             break;
           }
 
       } 
    } 
 } 