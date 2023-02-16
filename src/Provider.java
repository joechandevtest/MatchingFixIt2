public class Provider {

    private String name;
    private String serviceLocation;
    private boolean availableNow;
    private int jobCharge;

    private static int accumulatedContractorNum = 100;
    private int contractorNum;

    private Skillset skill;
    public enum Skillset{
        PLUMBER, ELECTRICIAN, PAINTER
    }

    //private ArrayList<Skillset> SkillsHold;

    public Provider(String name, Skillset skill, String serviceLocation, int jobCharge, boolean availableNow){
        this.name = name;
        //this.SkillsHold = new ArrayList<>(); //how to add multiple values in the tester in single line
        this.skill = skill;
        this.serviceLocation = serviceLocation;
        this.jobCharge = jobCharge;
        this.availableNow = availableNow;
        this.contractorNum = accumulatedContractorNum;
        accumulatedContractorNum++;


    }

    public int getJobCharge() {
        return jobCharge;
    }

    public String getServiceLocation() {
        return serviceLocation;
    }

    public boolean isAvailableNow() {
        return availableNow;
    }

    public Skillset getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                ", skill=" + skill +
                //", SkillsHold=" + SkillsHold +
                ", serviceLocation='" + serviceLocation + '\'' +
                ", jobCharge=" + jobCharge +
                ", availableNow=" + availableNow +
                ", Contractor Number =" + contractorNum +
                '}';
    }


}
