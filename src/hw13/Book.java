package hw13;

public class Book {
    String name;
    Author author;
    int yearOfPub;

    public Book (String name, Author author, int yearOfPub) {
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public String toString() {
        return "Имя книги - " + name + ", " + author.toString() + ", год публикации - " + yearOfPub;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Knizhka = (Book) other;
        return name.equals(Knizhka.name);
    }
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
