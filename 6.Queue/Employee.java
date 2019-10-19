public class Employee {
    String Fname;
    String Lname;
    int id;

    public Employee(String fname, String lname, int id) {
        Fname = fname;
        Lname = lname;
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", id=" + id +
                '}';
    }
}
