package composition;

import java.util.List;

public class University {
    private final List<College> colleges;
    public University(List<College> colleges){
        this.colleges=colleges;
    }
    public List<College> getCollegesInUniversity(){
        return colleges;
    }

}
