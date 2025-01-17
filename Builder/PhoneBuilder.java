public class PhoneBuilder {

    private String os;
    private int ram;
    private int screenSize;
    
    public PhoneBuilder setOS(String s)
    {
        this.os=s;
        return this;
    }
    public PhoneBuilder setRAM(int s)
    {
        this.ram=s;
        return this;
    }
    public Phone build()
    {
        Phone p1=new Phone();
        p1.setOS(this.os);
        p1.setRAM(this.ram);
        return p1;
    }
    
}
