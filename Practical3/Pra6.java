import java.util.*;

class complex
{
    int real,img;
    complex(int tempreal,int tempimg){
        real=tempreal;
        img=tempimg;
    }
    complex sum(complex c1,complex c2)
    {
        complex temp=new complex(real, img);
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;
    }
    void printcomplexnumber(){
        System.out.println(real+"+"+img+"i");
    }
    complex subtract(complex c1,complex c2)
    {
        complex temp=new complex(real, img);
        temp.real=c1.real-c2.real;
        temp.img=c1.img-c2.img;
        return temp;
    }
    complex product(complex c1,complex c2)
    {
        complex temp=new complex(real, img);
        temp.real=c1.real*c2.real;
        temp.img=c1.img*c2.img;
        return temp;
    }

}

public class Pra6 {
    public static void main(String[] args) {
        complex c1=new complex(3, 5);
        c1.printcomplexnumber();
        complex c2=new complex(3, 5);
        c2.printcomplexnumber();
        complex c3=new complex(3,5);
        c3=c3.sum(c1, c2);
        c3.printcomplexnumber();
        c3=c3.subtract(c1, c2);
        c3.printcomplexnumber();
        c3=c3.product(c1, c2);
        c3.printcomplexnumber();

    }
    
}
