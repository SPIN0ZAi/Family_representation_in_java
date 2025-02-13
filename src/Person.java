import java.util.ArrayList;
import java.util.List;


public class Person {
    String name,address;
    int age;
    double height , weight;
    Person[] children;


    public Person(String name, String address, int age,
                  double height, double weight,int numberOfChildren) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.children = new Person[numberOfChildren];

    }





    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }

    public void setHeight(double height) {
        if(height <= 0){
        System.out.println("the height should be a positive number");
        } else {
            this.height = height;
        }
    }

    public void setWeight(double weight) {
        if(weight <= 0){
            System.out.println("the weight should be a positive number");
        }else {
            this.weight = weight;
        }
    }

    public void addChild(Person child){
        for (int i = 0; i < children.length; i++) {
            if(children[i] == null){
                children[i] = child;
            }
            else{
                System.out.println("the children array is full");
            }
        }
    }

    public void getOldestChild(){
        int max = 0;
        for (int i = 0; i < children.length; i++) {
            if(children[i].age > max){
                max = children[i].age;
            }
        }
        System.out.println("the oldest child is: " + max);
    }

    public void getYoungestChild(){
        int max = 80;
        for (int i = 0; i < children.length; i++) {
            if(children[i].age < max){
                max = children[i].age;
            }
        }
        System.out.println("the oldest child is: " + max);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(name)
                .append("\nAddress: ").append(address)
                .append("\nAge: ").append(age)
                .append("\nHeight: ").append(height)
                .append("\nWeight: ").append(weight);

        // Adding children details
        for (int i = 0; i < children.length; i++) {
            if (children[i] != null) {  // To avoid NullPointerException
                sb.append("\nChildren ").append(i + 1).append(":")
                        .append("\n  Name: ").append(children[i].name)
                        .append("\n  Address: ").append(children[i].address)
                        .append("\n  Age: ").append(children[i].age)
                        .append("\n  Height: ").append(children[i].height)
                        .append("\n  Weight: ").append(children[i].weight);
            }
        }

        return sb.toString();
    }

}
