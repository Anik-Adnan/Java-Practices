package AssociationClassApp;

public class Owns {
    protected Person aPerson;
    protected Company aCompany;
    protected int noOfShares;

    public Owns(Person aPerson,Company aCompany,int noOfShares){
        this.aCompany=aCompany;
        this.aPerson=aPerson;
        this.noOfShares=noOfShares;
    }
}
