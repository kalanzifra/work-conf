

public class Family {
    String name;
    String sex;
    int age;

    public Family(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void getFamilyStatus() {
        System.out.println("His gender is " + this.sex);
        System.out.println("His name is " + this.name);
        System.out.println("His age is " + this.age);
    }

}