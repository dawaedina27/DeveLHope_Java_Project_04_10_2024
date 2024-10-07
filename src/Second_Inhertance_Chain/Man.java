//2- Create inheritance chain.
//
//Create abstract Person Class and inherit that by Man class than inherit that Man by WorkerMan.
//Inherit Person by Woman then inherit Women by WomanWorker.
//
//Create main function, in the main function create 6-7-8 people(each of them will be type of Man or WorkerMan or Woman or WorkerWoman)


package Second_Inhertance_Chain;

public class Man extends Person{
    public Man(String name, int age, String address) {
        super(name, age, address);

    }

    @Override
    void printNameAndType(String name, int age, String address) {
        System.out.println(name + "is a" + this.getClass().getSimpleName());

    }

    @Override
    void work(String name, int age, String address) {
        System.out.println(name + "is a man and can work or not");

    }


    /**
     *
     */
    @Override
    void printNameAndType() {

    }

    /**
     *
     */
    @Override
    void work() {

    }
}

