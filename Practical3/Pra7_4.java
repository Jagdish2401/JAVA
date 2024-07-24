//return obj
class obj{
    int value;
}
public class Pra7_4 {
   public static void main(String[] args) {
    obj o=new obj();
    o.value=10;
    System.out.println("return value:"+retun(o).value); ;
     System.out.println("after calling function value:"+o.value);
 }

   public static obj  retun(obj o)
   {
       o.value=20;
       return o;
   }
}
