package cajero;

public class Billetes {
    int b100;
    int b200;
    int b500;
    int b1000;
    int b2000;
    
    public Billetes (int b100,int b200,int b500,int b1000,int b2000)
    {
        this.b100 = b100;
        this.b200 = b200;
        this.b500 = b500;
        this.b1000 = b1000;
        this.b2000 = b2000;
    }
    
    public int b100()
    {
        return b100;
    }
    
    public int b200()
    {
        return b200;
    }
    
    public int b500()
    {
        return b500;
    }
    
    public int b1000()
    {
        return b1000;
    }
    
    public int b2000()
    {
        return b2000;
    } 
}
