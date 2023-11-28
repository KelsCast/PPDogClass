public class Dog
{
    //Each dog has a name, age, breed and weight in pounds.
    private String name;
    private String breed;
    private int age;
    private int weight;

    //Count how many dogs you have
    static private int dogCount = 0;

    //Constructors
    public Dog(String inName, String inBreed, int inAge, int inWeight)
    {
        this.name = inName;
        this.breed = inBreed;
        this.age = inAge;
        this.weight = inWeight;
        dogCount++;
    }//Full Constructor

    public Dog()
    {
        this.name = "";
        this.breed = "";
        this.age = 0;
        this.weight = 0;
        dogCount++;
    }//Default Constructor

    //Getters
    public String getName()
    {
        return "Name of dog: " + name;
    }
    public String getBreed()
    {
        return "Breed of " + name + ": " + breed;
    }
    public String getAge()
    {
        return "Age of " + name + ": " + age;
    }
    public String getWeight()
    {
        return "Weight of " + name + ": " + weight + "lb";
    }
    static public String getDogCount()
    {
        return "Total dogs: " + dogCount;
    }

    //Setters
    public void setName(String newName)
    {
        name = newName;
    }

    //Brain method
    public String lbToKg()
    {
        //Conversation rate: 0.453592
        double weightKg = (double)weight*0.453592;
        return "Weight in kg: " + weightKg;
    }

    //toString method
    public String toString()
    {
        return "Name: " + name +
                "\nBreed: " + breed +
                "\nAge in years: " + age +
                "\nWeight in pounds: " + weight;
    }
}//end of class Dog
