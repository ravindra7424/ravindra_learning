interface A{  
  public void fun();  
}  
class B{  
 public static void main(String args[]){  
  A a=new A(){  
  public void fun(){System.out.println("fun method ");}  
  };  
  a.fun();  
 }  
}  