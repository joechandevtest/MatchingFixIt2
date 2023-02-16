public class Customer {

    private String name;
    private String serviceLocation;
    private boolean serviceNow;
    private int jobPay;

    private static int accumulatedCustomerNum = 100;
    private int customerNum;

    private ProblemSet solver;
    public enum ProblemSet{
        PLUMBER, ELECTRICIAN, PAINTER
    }


    public Customer(String name, ProblemSet solver, String serviceLocation, int jobPay, boolean serviceNow){
        this.name = name;
        //this.SkillsHold = new ArrayList<>(); //how to add multiple values in the tester in single line
        this.solver = solver;
        this.serviceLocation = serviceLocation;
        this.jobPay = jobPay;
        this.serviceNow = serviceNow;
        this.customerNum = accumulatedCustomerNum;
        accumulatedCustomerNum++;
    }

    public int getJobPay() {
        return jobPay;
    }

    public ProblemSet getSolver() {
        return solver;
    }

    public String getServiceLocation() {
        return serviceLocation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", serviceLocation='" + serviceLocation + '\'' +
                ", serviceNow=" + serviceNow +
                ", jobPay=" + jobPay +
                ", customerNum=" + customerNum +
                ", solver=" + solver +
                '}';
    }




}
