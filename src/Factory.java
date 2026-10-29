public class Factory {
//instance varibles
//only use public for instance varibles

        public String owner = "Ellie";
        public boolean isOpen =true;
        public int yearFounded=2026;
        //donutorder1 is an object of class Donuts
        public Donuts donutOrder1;
    //only do the monopoly box creation, dont use constructor!
        public Donuts donutsOrder2;



        //class--> blueprints
        //objects--> is the house

    public int randomNumber;
    public int randomNumber2;
        //what types do I need? give the variables values
        public static void main(String[] args) {
            Factory a = new Factory();



        }

        //special method:constructor
        //name has to be the same name as class
        //you do not say void
        public Factory() {
            System.out.println("Welcome to Ellie's factory");
            System.out.println("the factory was founded in ");
            System.out.println(yearFounded);
            System.out.println("it is " + isOpen + " that the factory is open");

            //make an object of type Donuts
            randomNumber = (int)(Math.random() * 100) + 1;
            donutOrder1=new Donuts(randomNumber);
            System.out.println("Each batch of donuts come with " + donutOrder1.numberOfDonuts + " donuts");
            System.out.println("The Donuts are " + donutOrder1.frostingType + " flavor");
            System.out.println(donutOrder1.hasFilling);
            donutOrder1.numberOfDonuts=donutOrder1.numberOfDonuts +1;
            System.out.println(  donutOrder1.numberOfDonuts + "order 1 #donuts");

            randomNumber2=(int)(Math.random() * 45) + 1;
            donutsOrder2=new Donuts(randomNumber2);
            //todo:sout the donutsorder2 instance varables
            //bonus: give the variables context
            System.out.println( + donutsOrder2.numberOfDonuts);
            System.out.println(donutsOrder2.hasFilling);
            System.out.println(donutsOrder2.frostingType);
            donutsOrder2.numberOfDonuts=donutOrder1.numberOfDonuts * 2;
            System.out.println(donutsOrder2.numberOfDonuts);

            donutsOrder2.printinfo();




        }




}
