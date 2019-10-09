public class EmployeeNode {

    private Employee ee;
    private EmployeeNode next;

    public EmployeeNode(Employee ee){
        this.ee=ee;
    }

    public Employee getEe() {
        return ee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setEe(Employee ee) {
        this.ee = ee;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){
        return ee.toString();
    }


}
