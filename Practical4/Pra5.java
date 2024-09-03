
class Degree{
    void getdegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{
    void degree()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree{
    void degree()
    {
        System.out.println("I am an postgraduate");
    }
}
public class Pra5 {
    public static void main(String[] args)
     {
        Undergraduate o2=new Undergraduate();
        o2.degree();
        o2.getdegree();
        Postgraduate o3=new Postgraduate();
        o3.degree();
        o3.getdegree();
    }
    
}
