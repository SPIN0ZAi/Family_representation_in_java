public class Main {
    public static void main(String[] args) {
        // Create a parent with space for 2 children
        Person parent = new Person("John Doe", "123 Main St", 40, 1.8, 75, 2);

        // Create children
        Person child1 = new Person("Alice Doe", "123 Main St", 5, 1.4, 35, 0);
        Person child2 = new Person("Bob Doe", "123 Main St", 1, 1.1, 25, 0);

        // Add children to the parent
        parent.addChild(child1);
        parent.addChild(child2);

        // Print parent details
        System.out.println(parent);

        // Find the oldest and youngest child
        parent.getOldestChild();
        //youngest
        parent.getYoungestChild();
    }
}
