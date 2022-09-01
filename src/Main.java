import java.util.*;

public class Main {

    static List<Person> generateClients(List<Person> list) {
        list.add(new Person("Любовь", "Лукавая", 3));
        list.add(new Person("Максим", "Мосин", 2));
        list.add(new Person("Владимир", "Войский", 1));
        list.add(new Person("Мария", "Мирская", 5));
        list.add(new Person("Пётр", "Покровский", 3));
        return list;
    }

    public static void main(String[] args) {

        List<Person> list = new LinkedList<>();
        Queue<Person> queue = new LinkedList<>(generateClients(list));

        while (!queue.isEmpty()) {
            Person s = queue.poll();
            s.tickets --;
            System.out.println("[" + s + "]" + " прокатился на аттракционе, осталось "
                    + s.tickets + " билета");
            if (s.tickets != 0) {
                queue.offer(s);
            }
        }
    }
}
