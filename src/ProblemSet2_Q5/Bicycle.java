package ProblemSet2_Q5;

public class Bicycle {
    private String ownerName;
    private float value;
    private String make;

    //Mutators and Accessors

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setValue(float value)
    {
        this.value = value;
    }

    public float getValue()
    {
        return this.value;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getMake()
    {
        return this.make;
    }

    //Constructors

    public Bicycle()
    {
        this.ownerName = "Unknown Owner";
        this.value = 0.0f;
        this.make = "Unknown Make";
    }

    public Bicycle(String ownerName, float value, String make)
    {
        setOwnerName(ownerName);
        setValue(value);
        setMake(make);
    }

    public String toString()
    {
        return "Owner name: " + getOwnerName() + "\nValue: €" + getValue() + "\nMake: " + getMake();
    }
}
