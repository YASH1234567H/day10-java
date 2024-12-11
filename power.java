class main
{
    static int power( int b,int exp)
    {
        if(exp==0) return 1;
        return b*power(b,exp-1);
    }
    public static void main(String args[])
    {
        int res=power(7,8);
        System.out.println(res);
    }
}

  