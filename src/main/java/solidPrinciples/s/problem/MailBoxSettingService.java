package solidPrinciples.s.problem;

import static javafx.scene.AccessibleAttribute.ROLE;

public class MailBoxSettingService {
    public void setSecendryEmail(User user , String setSecendryEmail ){
        if (hasAccess(user)){
            user.setSecondaryEmail(setSecendryEmail);
        } else {
             throw new RuntimeException("Cannot set secondry email ,  not authorized ");

        }
    }
    public boolean hasAccess(User user){
        if (user.getRole()==Role.ADMIN) return true;
        else return false;

    }
}
