import java.util.ArrayList;

public class CustomerList {
    private String name;
    private String region;
    private ArrayList<Customer> ListofCustomers;

    /**
     * This construct contractor and hold list of providers in an arrayList
     *
     * @param name   is the list name of arraylist of the corresponding providers
     * @param region is their operating country
     */
    public CustomerList(String name, String region) {
        this.name = name;
        this.region = region;
        ListofCustomers = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        ListofCustomers.add(c);
    }

    public void listAllCustomers() {
        for (Object obj : ListofCustomers) {
            System.out.println(obj);
        }
    }

    public int getCountCustomer() {
        int count = ListofCustomers.size();

        return count;
    }

//    public Provider matchSkill(ListofProviders v){
//        for (Provider p : vancouverProvider.getListofProviders()){
//
//        }
//    }

}
