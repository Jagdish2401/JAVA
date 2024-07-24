public class Pra4 
{
    public static void main(String[] args) {
        
        String str1=new String("The");
        String str2=new String("AAbb");
        String str3=new String("Hi-There");
        String str4=new String(doublechar(str1));
        String str5=new String(doublechar(str2));
        String str6=new String(doublechar(str3));
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

    }
    public static String doublechar(String s)
    {
        String result=" ";
        for(int i=0;i<s.length();i++)
        {
            result=result+s.charAt(i)+s.charAt(i);
        }

        return result;
    }

    
}
