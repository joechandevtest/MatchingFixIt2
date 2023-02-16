public class ContractorTester {
    public static void main(String[] args) {
        Contractor caSupplier = new Contractor("Canada Contractor", "Canada");
        Contractor usaSupplier = new Contractor("US Contractor", "USA");

        System.out.println(caSupplier);
        System.out.println(usaSupplier);

        System.out.println("//////////\n");

        //Provider Peter = new Provider("Peter", Provider.add(Skillset.PLUMBER), "Langara", 300, true);
        Provider Peter = new Provider("Peter", Provider.Skillset.PLUMBER, "Langara", 300, true);
        caSupplier.addProvider(Peter);
        System.out.println(Peter);


        //Provider Mary = new Provider("Mary", Provider.Skillset.Painter, "BCIT", 100, false);
        Provider Mary = new Provider("Mary", Provider.Skillset.PAINTER, "UBC", 100, false);
        caSupplier.addProvider(Mary);
        System.out.println(Mary);


        Provider Paul = new Provider("Paul", Provider.Skillset.PLUMBER,"Downtown",50,true);
        caSupplier.addProvider(Paul);
        System.out.println(Paul);

        System.out.println("//////////\n");
        caSupplier.listAllContractors();

    }

}
