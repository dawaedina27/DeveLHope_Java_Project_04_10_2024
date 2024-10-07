//2- Create inheritance chain.
//
//Create abstract Person Class and inherit that by Man class than inherit that Man by WorkerMan.
//Inherit Person by Woman then inherit Women by WomanWorker.
//
//Create main function, in the main function create 6-7-8 people(each of them will be type of Man or WorkerMan or Woman or WorkerWoman)

package Second_Inhertance_Chain;

public abstract class Person {
    public String name;
    private int age;
    private String address;
    abstract void printNameAndType();

    abstract void work();

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    abstract void printNameAndType(String name, int age, String address);

    abstract void work(String name, int age, String address);
}
