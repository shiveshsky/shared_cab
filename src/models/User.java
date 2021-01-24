package models;

public class User {
    private String name;
    private Character gender;
    private int age;
//    private UsetType usetType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public UsetType getUsetType() {
//        return usetType;
//    }
//
//    public void setUsetType(UsetType usetType) {
//        this.usetType = usetType;
//    }
}
