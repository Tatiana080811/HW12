import java.util.Objects;
public class Author {
    private String name;
    private String firstName;

    public Author(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name, firstName, author.firstName);

    public int hashCode() {
        return Objects.hash(name,firstName);
    }

    @Override
    public String toString() {
        return name + " " + firstName;
    }
}




}
