package hw13;

public class Main {
    public static void main (String[] args) {
        Author marsik = new Author("Marsik", "Semakov");
        Book findFood = new Book("How to find food", marsik, 2020);
        Author bulka = new Author("Bulka", "Shigapov");
        Book findMarsik = new Book("How to find Marsik with food", bulka, 2021);
        findMarsik.setYearOfPub(2022);
        System.out.println(findFood.toString());
        System.out.println(findFood.equals(findMarsik));
        System.out.println(findFood.hashCode());
    }
}
