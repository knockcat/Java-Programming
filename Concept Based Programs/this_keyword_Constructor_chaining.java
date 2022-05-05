// use of this keyword

class Chaining {

    long id;
    String name, branch, city, university;

    // Constructor with 1 parameters
    Chaining(String name) {
        this.name = name;
    }

    // Constructor with 2 parameters
    Chaining(String name, String branch) {
        this(name);
        this.branch = branch;
    }

    // Constructor with 3 parameters
    Chaining(String name, String branch, String city) {
        this(name, branch);
        this.city = city;
    }

    // Constructor with 4 parameters
    Chaining(String name, String branch, String city, String university) {
        this(name, branch, city);
        this.university = university;
    }

    // Constructor with 5 parameters
    Chaining(String name, String branch, String city, String university, long id) {
        this(name, branch, city, university);
        this.id = id;
    }

    void display() {
        System.out.println("Name of Student : " + name);
        System.out.println("ID of Student : " + id);
        System.out.println("Branch of Student : " + branch);
        System.out.println("City of Student : " + city);
        System.out.println("University of Student : " + university);
    }

    public static void main(String[] args) {
        Chaining obj = new Chaining("Knockcat", "Computer Science",
                "Dehradun", "Graphic Era Hill University", 69);
        obj.display();

    }

}
