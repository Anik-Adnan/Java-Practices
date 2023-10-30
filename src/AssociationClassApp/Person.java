package AssociationClassApp;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String SSN;
    public String name;
    public String contact;
    public String email;

    private List<Owns> investment=new ArrayList<>();

    public void byShares(Company c,int noOfShares){
        Owns aOwn=new Owns(this,c,noOfShares);
        investment.add(aOwn);

    }
    public List<Owns> getShares(){
        return  this.investment;
    }

}
