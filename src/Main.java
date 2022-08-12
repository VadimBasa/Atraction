import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;

class Main {

    static List<Person> generateClients() {

        List<Person> list = new ArrayList<>();
        Person person1 = new Person("Владимир Путин", 7);
        Person person2 = new Person("Сергей Лавров", 4);
        Person person3 = new Person("Анжелина Джолли", 2);
        Person person4 = new Person("Илон Маск", 8);
        Person person5 = new Person("Николай Романов", 5);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        //for (Person clients : list) {
        //    System.out.println(clients.name + " " + clients.countTickets + " билетов");
        //}
        return list;
    }

    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<>();
        deque.add(generateClients().get(0));
        deque.add(generateClients().get(1));
        deque.add(generateClients().get(2));
        deque.add(generateClients().get(3));
        deque.add(generateClients().get(4));
        while (deque.size() != 0) {
            for (int i = 0; i < deque.size(); i++) {
                Person client = deque.poll(); //poll client1
                client.countTickets -= 1;
                System.out.println(client.name + " прокатился на атракционе. У него осталось " + client.countTickets + " билетов");
                if (client.countTickets > 0) {
                    deque.addLast(client);
                }
            }
        }
    }
}