package BT_ReadFile;

public class Country {
    private String name;
    private int id;
    private String code;
    public Country(){}
    public Country(int id,  String code,String name){
        this.setName(name);
        this.setId(id);
        this.setCode(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s", getId(), getCode(), getName());
    }
}

