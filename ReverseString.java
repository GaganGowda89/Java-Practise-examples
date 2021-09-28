class ReverseString {  
  public static void main(String args[]) { 
     System.out.println("Hello, world!"); 
	 String name = "REVERSE ME";
	 System.out.println("Before rev:"+ name); 
	 int sum = addSum(50,40);
	  char revStr[] = reverseString(name);
	  System.out.println("Sum is :"+ sum); 
	  System.out.println("After Rev :"+ name); 
	  for (int i = name.length()-1; i>=0; i--)
		  System.out.println(revStr[i]);
  } 
 // Method to reverse String
 static char[] reverseString(String str) {
      char ch[] = new char[str.length()];

	  for (int i = str.length()-1; i>=0; i--)
		  ch[i] = str.charAt(i);
      
	 return ch;
  }
//Method to add 2 numbers
 static int addSum(int a, int b) {
	return (a+b);
  }
}

