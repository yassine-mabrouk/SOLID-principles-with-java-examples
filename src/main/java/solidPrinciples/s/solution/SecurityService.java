package solidPrinciples.s.solution;

public class SecurityService {

    public boolean hasAccess(User user){
        if (user.getRole()== Role.ADMIN) return true;
        else return false;

    }
}
