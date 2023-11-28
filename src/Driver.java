public class Driver
{
    public static void main(String[] args)
    {
        //Instantiating dogs
        Dog dog1 = new Dog("Fang", "Husky", 5, 80);
        Dog dog2 = new Dog("Piper", "Australian Shepherd", 3, 45);
        Dog dog3 = new Dog("Tato", "Golden Retriever", 2, 65);

        //Outputs
        System.out.println(dog1.getBreed() + "\n" +     //Fang
                            dog1.getAge() + "\n");
        System.out.println(dog2.getWeight() + "\n");    //Piper
        System.out.println(dog3.toString() + "\n");     //Tato
        System.out.println(Dog.getDogCount());          //# of Dogs
    }//end main method
}//end driver class