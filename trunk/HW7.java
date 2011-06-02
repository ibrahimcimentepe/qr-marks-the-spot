class HW7 {

    public  static int fibonacci(int n){
	if (n <= 2)
	    return 1;
	else return fibonacci(n-1) + fibonacci (n - 2);
    }
    
  public static bool testFiboLog()
  {
    int rndNumber = (int)(100*Math.Random());
    int test1 = fibonacci (rndNumber);
    int test2 = fibonacci (rndNumber++);
    int test3 = fibonacci (rndNumber++);
    if(test1+test2=test3){
      return true;
    }
    else{
      return false;
    }
  }
    public static void testFibo2()
  {
    for(int i=0;i<3;i++)
    {
    if(!testFiboLog())
      {
      System.out.println("Method Fibonacci runs faulty");
      return;
      }
    }
    System.out.println("Method Fibonacci runs correctly");       
  }
    
 public static void main(String[] args)  {
  
    fib1 = fibonacci(32);
    System.out.println(fib1);
 } 
 
 public static int factorial (int n)  //added by alikerimerkan
  {
  if(n<0)  //control for negative input.
    System.out.println("factorial is not defined for negative integers!");
  else if(n=0)
    return 1;
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