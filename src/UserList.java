import java.util.ArrayList;

public class UserList {

    private String name;
    private String region;
    private ArrayList<Provider> listOfProviders;
    private ArrayList<Customer> listOfCustomers;

    /**
     * This construct contractor and hold list of providers in an arrayList
     *
     * @param name   is the list name of arraylist of the corresponding providers
     * @param region is their operating country
     */
    public UserList(String name, String region) {
        this.name = name;
        this.region = region;
        listOfProviders = new ArrayList<>();
        listOfCustomers = new ArrayList<>();
    }

    public void addProvider(Provider p) {
        listOfProviders.add(p);
    }

    public void addCustomer(Customer c) {
        listOfCustomers.add(c);
    } // does it need to be duplicated with addProvider?


    public void listAllProviders() {
        for (Object obj : listOfProviders) {
            System.out.println(obj);
        }
    }

    public void listAllCustomers() {
        for (Object obj : listOfCustomers) {
            System.out.println(obj);
        }
    }


    public ArrayList<Provider> getListOfProviders() {
        return listOfProviders;
    }

    public int getCountCustomer() {
        int count = listOfCustomers.size();

        return count;
    }

    public int countProvider() {
        int count = listOfProviders.size();
        return count;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public ArrayList<Provider> matching(Customer customer) {

        System.out.println("Customer is looking for provider has skill " + customer.getSolver());
        System.out.println(customer);
//
//        if(customer.getSolver() instanceof String){
//            System.out.println("it is a String");
//        }
        ArrayList<Provider> matchedProviders = new ArrayList<>();

        for (Provider p : listOfProviders) {
            System.out.println("Looping... Current provider has skill " + p.getSkill());
            System.out.println(p);
            if (p.getJobCharge() <= customer.getJobPay() && p.getSkill().toString().equals(customer.getSolver().toString())) {
                System.out.println("Match found");

                matchedProviders.add(p);
            } else {
                System.out.println("Not match");

            }
        }

        System.out.println(matchedProviders.size());
        return matchedProviders;
    }
}
//p.getSkill().equals(customer.getSolver()) &&
//p.getJobCharge() <= customer.getJobPay()
//p.getServiceLocation().equals(customer.getServiceLocation())