public class Pra5 {
    public static void main(String[] args) {
        String str="To be or not to be";
        String arr[]=str.split(" ");
        String result=" ";
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                result=result+arr[i].charAt(j);

            }
            result=result+" ";

        }
        System.out.println(result+" ");
    }
}
