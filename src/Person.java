import java.util.Objects;

public class Person {
    private long id;
    private String name;
    private  AgeCategory category;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(AgeCategory category) {
        this.category = category;
    }

    public AgeCategory getCategory() {
        return category;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && category == person.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.category = AgeCategory.getCategoryByAge(age);



    }
}
