package solidPrinciples.s.solution;

public class SigleResponsibilityDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setRole(Role.ADMIN);
        MailBoxSettingService mailBoxSettingService=new MailBoxSettingService();
        SecurityService securityService = new SecurityService();
        // responsibility #1 of the mailBoxSettingService - change settings in mailbox
        mailBoxSettingService.setSecendryEmail(user,"yassine@gmail.com");
        System.out.println(user.getSecondaryEmail());
        // responsibility #1 of the securityService - verify access
        if(securityService.hasAccess(user)){
            user.sendManey(new User(), 1000);
        }
        // problem mailBoxSettingService has two responsibilities
    }
}
