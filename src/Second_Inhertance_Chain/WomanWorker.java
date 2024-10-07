//2- Create inheritance chain.
//
//Create abstract Person Class and inherit that by Man class then inherit that Man by WorkerMan.
//Inherit Person by Woman then inherit Women by WomanWorker.
//
//Create main function, in the main function create 6-7-8 people(each of them will be type of Man or WorkerMan or Woman or WorkerWoman)


package Second_Inhertance_Chain;

public class WomanWorker extends Woman{
    private String jobTitle;
    private int workingHours;

    public WomanWorker(String name, int age, String address, String jobTitle, int workingHours) {
        super(name, age, address);
        this.jobTitle = jobTitle;
        this.workingHours = workingHours;
    }

    @Override
    void work() {
        System.out.println(name + ": is the " + jobTitle + ", she worked for " + workingHours);
    }
}
