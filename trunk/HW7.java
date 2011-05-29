class HW7 {

    public  static int fibonacci(int n){
	if (n <= 2)
	    return 1;
	else return fibonacci(n-1) + fibonacci (n - 2);
    }
 public static void main(String[] args)  {
  
    fib1 = fibonacci(32);
    System.out.println(fib1);
 } 
 
 public static int factorial (int n)  //added by alikerimerkan
  {
  if(n<0)  //control for negative input.
    System.out.println("factorial is not defined for negative integers!");
  else
    return n*factorial(n-1);
  }

public static int lucas (int n) //added by pinarbilgic
  {
  if (n<0) 
    System.out.println("not defined");
  else if (n==0)
    return 2;
  else if (n==1)
    return 1;
  else return (lucas(n-1) + lucas(n-2));
  }
}