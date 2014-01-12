import java.util.List;



public class RitualPaths{
    public RitualPaths()
    {
    }

    private int id;

    private NameValue rit1;

    private NameValue rit2;

    private NameValue rit3;

    private NameValue rit4;

    public NameValue getRit1()
    {
        return rit1;
    }

    public void setRit1(NameValue rit1)
    {
        this.rit1 = rit1;
    }

    public NameValue getRit2()
    {
        return rit2;
    }

    public void setRit2(NameValue rit2)
    {
        this.rit2 = rit2;
    }

    public NameValue getRit3()
    {
        return rit3;
    }

    public void setRit3(NameValue rit3)
    {
        this.rit3 = rit3;
    }

    public NameValue getRit4()
    {
        return rit4;
    }

    public void setRit4(NameValue rit4)
    {
        this.rit4 = rit4;
    }

    @Override
    public String toString()
    {
        return "RitualPaths{" +
                "rit1=" + rit1 +
                ", rit2=" + rit2 +
                ", rit3=" + rit3 +
                ", rit4=" + rit4 +
                '}';
    }
}


