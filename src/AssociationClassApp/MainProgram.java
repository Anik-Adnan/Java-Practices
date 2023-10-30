package AssociationClassApp;

import java.util.SortedMap;

public class MainProgram {
    public static void main(String[] args) {
        Person aPerson=new Person();
        aPerson.name="Smith";

        Company company1=new Company();
        company1.name="ABC";
        aPerson.byShares(company1,5);
        Company company2=new Company();
        company2.name="XYZ";
        aPerson.byShares(company2,10);

        for (Owns investment : aPerson.getShares()) {
            System.out.println(investment.aPerson.name+ " owns "+investment.noOfShares+" share of "+ investment.aCompany.name+" company." );
        }

    }
}
