public class Donuts {
    //class are blure prints for the things we want to make

    //instance variables
    //todo: make the three commets into variables


    //frosting type
    public String frostingType;
    //is there a filling
    public boolean hasFilling;
    //how many donuts
    public int numberOfDonuts;

    //constructor
    //method-special
    //dont say void
    // has to match exactly the name of the class
    public Donuts(int pNumberOfDunuts){
        //we give the instance varaibable there values.
        frostingType="boston Creme";
        hasFilling=true;
        numberOfDonuts=pNumberOfDunuts;

    }//end of donut constructor

    //todo:make a method called printinfo

public void printinfo(){
    System.out.println("The number of dunuts is " + numberOfDonuts);
    System.out.println(" It is " + hasFilling + " that the donuts have filling");
    System.out.println("The frosting type of the donut is " + frostingType);

};

}//end of donuts class
