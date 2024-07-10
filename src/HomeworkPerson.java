import java.util.Objects;

public class HomeworkPerson {
    private long id;
    private String name;
    private  UserType userType;

    public HomeworkPerson(long id, String name, UserType userType) {
        this.id = id;
        this.name = name;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeworkPerson that = (HomeworkPerson) o;
        return id == that.id && Objects.equals(name, that.name) && userType == that.userType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, userType);
    }

    @Override
    public String toString() {
        return "HomeworkPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userType=" + userType +
                '}';
    }
}
