public class equals{
    public static void main(String[] arg)
    {
        Integer i=20;
        String s="21";
        String g=i.toString();
        System.out.println(g);
        if(i.equals(s))
        {
            System.out.println("equals");
        }
        else
        {
            System.out.println("reject");
        }

    }
}
