class Main{
    String name;
    Main()
    {
        name="NAVATEJA";
    }
    Main(String name){
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Main o=new Main();
        o.display();
        Main o1=new Main("DEVARA");
        o1.display();
    }
}