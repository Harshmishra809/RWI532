 // try catch example 1
 
 
 // public class exceptionHandling {

//     public static void main(String[] args) {
//         try {
            
//             int[] numbers = {1, 2, 3};
//             System.out.println(numbers[10]); 
//         } catch (ArrayIndexOutOfBoundsException e) {
            
//             System.out.println("Exception occurred: " + e.getMessage());
//             e.printStackTrace(); 
//         }
 
//         System.out.println("After try-catch block");
//     }
// }



// try catch example 2

// public class exception

// {
//     public static void main(String[] args) {
//         try {

//             System.out.println(10/0);
//         }
//         catch(Exception error) {
//             System.out.println("you can not divide num by zero");


//         }
//     System.out.println("Hello");
   
        
//     }


// }


// try catch finally example 3

// public class exceptin {

//     public static void main(String[] args) {

//         try {
//             System.out.println("learn coding");
//             int a = 20, b = 2, c;
//             c = a/b;
//             System.out.println(c);



//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("can not divided by 0");

//         }
        
//         finally {

//             System.out.println("Hello");
//         }

        
        
        
//     }
// }

// try  catch finally  example 4



// public class exceptin {

//     public static void main(String[] args) {

//         try {
//             System.out.println("learn coding");
//             int a = 20, b = 0, c;
//             c = a/b;
//             System.out.println(c);



//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("can not divided by 0");

//         }
        
//         finally {

//             System.out.println("Hello");
//         }

        
        
        
//     }
// }

//   try catch and throw  example 5

// public class ExceptionHandlingExample {

//     public static void main(String[] args) {
//         try {
//             int result = divideNumbers(10, 0);
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//     }

//     public static int divideNumbers(int dividend, int divisor) {
//         if (divisor == 0) {
//             throw new ArithmeticException("Cannot divide by zero");
//         }
//         return dividend / divisor;
//     }
// }


// try catch example 6


 
// public class Example {
//     public static void main(String[] args) {
//         try {
            
//             int result = divideNumbers(10, 2);
//             System.out.println("Result: " + result); 
//         } catch (ArithmeticException e) {
            
//             System.out.println("Exception caught: " + e);
//         }
//     }

//     public static int divideNumbers(int dividend, int divisor) {
//         if (divisor == 0) {
        
//             throw new ArithmeticException("Cannot divide by zero");
//         }
//         return dividend / divisor;
//     }
// }



//  try catch throw , throws   example 7



// public class Exceptionha{

//     public static void main(String[] args) throws Exception {

//         int arr  [] = {1,34,5,67,6};

//         System.out.println(arr[1]);

//         try{

//             System.out.println(arr[-1]);
//         }
//         finally{

//             System.out.println(arr[0]);
//         }



//         }
//         static void myException() throws Exception {
//         throw  new Exception("wrong");

        
//     }
// }