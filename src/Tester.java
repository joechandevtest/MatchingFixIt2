public class Tester {
    public static void main(String[] args) {
//Add marketplace

        UserList vancouverMarketplace = new UserList("Vancouver Market", "Vancouver");
        UserList richmondMarketplace = new UserList("Richmond Contractor", "Richmond");

        System.out.println(vancouverMarketplace + "is printed");
        System.out.println(richmondMarketplace);

        System.out.println("//////////\n");
//Add providers
        // Add in Vancouver
        Provider Peter = new Provider("Peter", Provider.Skillset.PLUMBER, "Langara", 300, true);
        vancouverMarketplace.addProvider(Peter);
        System.out.println(Peter);

        Provider Paul = new Provider("Paul", Provider.Skillset.PLUMBER, "Downtown", 50, true);
        vancouverMarketplace.addProvider(Paul);
        System.out.println(Paul);

        Provider Mary = new Provider("Mary", Provider.Skillset.PAINTER, "UBC", 100, false);
        vancouverMarketplace.addProvider(Mary);
        System.out.println(Mary);

        Provider Tom = new Provider("Tom", Provider.Skillset.PLUMBER, "Langara", 50, false);
        vancouverMarketplace.addProvider(Tom);

        System.out.println("//////////\n");
        System.out.println("In Vancouver, there are following providers");
        vancouverMarketplace.listAllProviders();

        System.out.println("##########\n");
        System.out.println("by getListofProviders " + vancouverMarketplace.getListOfProviders());

        System.out.println("There are " + vancouverMarketplace.countProvider() + " providers in the list");

        //Add in Richmond
//        Provider John = new Provider("John", Provider.Skillset.PAINTER, "KPU", 500, false);
//        richmondMarketplace.addProvider(John);
//
//        Provider Doe = new Provider("Doe", Provider.Skillset.PAINTER, "Trinity", 500, false);
//        richmondMarketplace.addProvider(Doe);
//        System.out.println("//////////\n");
//        System.out.println("In Richmond, there are following providers");
//        richmondMarketplace.listAllProviders();
//        System.out.println("There are " + richmondMarketplace.countProvider() + " providers in the list");



        /////////////////
/**Add customer
 *
 */
        //CustomerList vancouverCustomer = new CustomerList("Vancouver Customer", "Vancouver");

        Customer Amy = new Customer("Amy", Customer.Skillset.PLUMBER, "Langara", 100, true);
        vancouverMarketplace.addCustomer(Amy);
        Customer Brenda = new Customer("Brenda", Customer.Skillset.PLUMBER, "Langara", 500, true);
        vancouverMarketplace.addCustomer(Brenda);

        vancouverMarketplace.listAllCustomers();
        System.out.println("There are " + vancouverMarketplace.getCountCustomer() + " customers in the list");



        ////Matching

        System.out.println("//////////");

        //
        System.out.println("In Vancouver, matching providers by providing Amy");
        System.out.println(vancouverMarketplace.matching(Amy));


        System.out.println("##########\n");
        System.out.println("In Vancouver, matching providers by providing Brenda");
        System.out.println(vancouverMarketplace.matching(Amy));


    }



}
