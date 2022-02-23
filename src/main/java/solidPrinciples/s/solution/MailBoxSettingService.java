package solidPrinciples.s.solution;

public class MailBoxSettingService {
    SecurityService securityService= new SecurityService();
    public void setSecendryEmail(User user , String setSecendryEmail ){
        if (securityService.hasAccess(user)){
            user.setSecondaryEmail(setSecendryEmail);
        } else {
             throw new RuntimeException("Cannot set secondry email ,  not authorized ");

        }
    }

}
