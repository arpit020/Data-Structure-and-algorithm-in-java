public class EmployeeNode {
    Employee ee;
    EmployeeNode next;
    EmployeeNode previous;

    public EmployeeNode(Employee ee){
        this.ee=ee;
    }
    public Employee getEe() {
        return ee;
    }

    public void setEe(Employee ee) {
        this.ee = ee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return ee.toString();
    }


}
