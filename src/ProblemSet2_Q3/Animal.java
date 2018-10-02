package ProblemSet2_Q3;

public class Animal {
    private String type;
    private String[] continents = new String[7];
    private float weight;
    private int age;

    public void setType(String type)
    {
        this.type = type;
    }

    public void setContinents(String[] continents)
    {
        this.continents = continents;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getType()
    {
        return this.type;
    }


    public float getWeight()
    {
        return this.weight;
    }

    public int getAge()
    {
        return this.age;
    }

    public Animal(String type, float weight, int age){
        this.type = getType();
        this.weight = getWeight();
        this.age = getAge();
    }
}
