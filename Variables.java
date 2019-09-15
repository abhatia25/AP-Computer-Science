public class Variables {
   /*public static String myClassVar = "class or static variable";
   
   public static void main(String args[]){
      StaticVarExample obj = new StaticVarExample();
      StaticVarExample obj2 = new StaticVarExample();
      StaticVarExample obj3 = new StaticVarExample();
      
      //All three will display "class or static variable"
      System.out.println(obj.myClassVar);
      System.out.println(obj2.myClassVar);
      System.out.println(obj3.myClassVar);
      
      //changing the value of static variable using obj 2
      obj2.myClassVar = "Changed Text";
      
      //All three will display "Changed Text"
      System.out.println(obj.myClassVar);
      System.out.println(obj2.myClassVar);
      System.out.println(obj3.myClassVar);
   }*/
   
   /*String myInstanceVar = "instance variable";
   
   public static void main(String args[]){
      Variables obj = new Variables();
      Variables obj2 = new Variables();
      Variables obj3 = new Variables();
      
      System.out.println(obj.myInstanceVar);
   	System.out.println(obj2.myInstanceVar);
   	System.out.println(obj3.myInstanceVar);
   
   		
   	obj2.myInstanceVar = "Changed Text";
   
   		
   	System.out.println(obj.myInstanceVar);
   	System.out.println(obj2.myInstanceVar);
   	System.out.println(obj3.myInstanceVar);
   }*/
   
   // instance variable
   public String myVar = "instance variable";
    
   public void myMethod(){
    	// local variable
    	String myVar = "Inside Method";
    	System.out.println(myVar);
   }
   public static void main(String args[]){
      // Creating object
      Variables obj = new Variables();
    	
      /* We are calling the method, that changes the 
         value of myVar. We are displaying myVar again after 
         the method call, to demonstrate that the local 
         variable scope is limited to the method itself.
       */
      System.out.println("Calling Method");
      obj.myMethod();
      System.out.println(obj.myVar);
   }
}