class CRUDmethods {

    int id;
    String name;
    int marks;

    void addStudent(int i, String n, int m) {
        id = i;
        name = n;
        marks = m;
    }

    void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    void updateMarks(int newMarks) {
        marks = newMarks;
    }

    public static void main(String args[]) {

        CRUDmethods s1 = new CRUDmethods();

        s1.addStudent(1, "Mahesh", 75);
        s1.displayStudent();

        System.out.println("After Updating Marks:");
        s1.updateMarks(85);
        s1.displayStudent();
    }
}
