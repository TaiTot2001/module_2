public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String speak (){
        return "I'm a person";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name =name;
    }

}
