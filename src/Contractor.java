import java.util.ArrayList;

public class Contractor {

    private String name;
    private String country ;
    private ArrayList <Provider> ListofProviders;

    /**
     * This construct contractor and hold list of providers in an arrayList
     * @param name is the list name of arraylist of the corresponding providers
     * @param country is their operating country
     */
    public Contractor(String name, String country){
        this.name = name;
        this.country = country;
        ListofProviders = new ArrayList<>();
    }

    public void addProvider(Provider p){ListofProviders.add(p);}

    public void listAllContractors(){
        for (Object obj : ListofProviders) {
            System.out.println(obj);
        }
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                '}';
    }
}
