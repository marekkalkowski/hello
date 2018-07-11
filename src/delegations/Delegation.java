package delegations;

public class Delegation {

    private String creationDate ;
    private String startDate ;
    private String endDate ;
    private String purpose ;
    private String status ;
    private String startPoint ;


    /*Obiekty z klas zawierających pola i metody */
    private Employee employee = new Employee();
    private Destination destination = new Destination();
  //  private AddDelegation addDelegation = new AddDelegation();
  //  private AcceptDelegation acceptDelegation = new AcceptDelegation();
   // private DiscardDelegation discardDelegation = new DiscardDelegation();
  //  private PreviewDelegation previewDelegation = new PreviewDelegation();

    public Delegation() {
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Delegation{" +
                "creationDate='" + creationDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", purpose='" + purpose + '\'' +
                ", status='" + status + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", employee=" + employee +
                ", destination=" + destination +
                '}' + '\n';
    }
}
