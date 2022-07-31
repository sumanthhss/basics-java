package Basic;

class ThisKey
{
    double height =5.5;
    void jump()
    {
        double height = 4.4;
        System.out.println(this.height);
        System.out.println(height);
    }
    public static void main(String[] args)
    {
        ThisKey t = new ThisKey();
        t.jump();
    }
}
