package Second_Inhertance_Chain;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Person woman1 = new Woman("Patricia", 24, "Arua");
        Person woman2 = new WomanWorker("Aliya", 30, "Kampala", "IT Manager", 48);
        Person woman3 = new WomanWorker("Edina", 49, "Yei", "Ethical Hacker", 38);
        Person woman4 = new Woman("Roda", 27, "Canada");
        
        Person man = new Man("John", 44, "Awindiri");
        Person man1 = new WorkerMan("Peter", 31, "Arua", "Member of Parliament (MP)", 48);
        Person man2 = new Man("Patrick", 29,"Arua");



        ArrayList<Person> people = new ArrayList<>(List.of(woman1, woman2, woman3, woman4, man, man1, man2));
    }
}
