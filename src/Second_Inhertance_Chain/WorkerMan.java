package Second_Inhertance_Chain;

public class WorkerMan extends Man{

    private String jobTitle;
    private int workingHours;


    public WorkerMan(String name, int age, String address, String jobTitle, int workingHours) {
        super(name, age, address);
        this.workingHours = workingHours;

    }


    @Override
    void printNameAndType() {

    }

    @Override
    void work() {
        System.out.println(name + ": is a man and he works as  " + jobTitle + ", Last week he worked for " + workingHours);

    }
}
