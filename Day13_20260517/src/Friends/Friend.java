package Friends;

public class Friend {
    private int id;
    private String name;
    private int age;
    private String character;

    public Friend(int id, String name, int age, String character) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
