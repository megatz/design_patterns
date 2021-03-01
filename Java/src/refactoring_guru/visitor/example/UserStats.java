package refactoring_guru.visitor.example;


import java.util.Optional;

public class UserStats {
    private Optional<Long> visitCount;

    public UserStats(Optional<Long> l) {
        visitCount=l;
    }

    public Optional<Long> getVisitCount(){
        return visitCount;
    }

}
