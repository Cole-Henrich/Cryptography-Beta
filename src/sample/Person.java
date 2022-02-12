package sample;

public class Person {
    private String name;
    private String biography;
    public Person(String biography, String name){
        setBiography(biography);
        setName(name);
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBiography() {
        return biography;
    }
    public String getName() {
        return name;
    }
}
