package solidPrinciples.s.problem;

public class SigleResponsibilityDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setRole(Role.ADMIN);
        MailBoxSettingService mailBoxSettingService=new MailBoxSettingService();
        // responsibility #1 of the mailBoxSettingService - change settings in mailbox
        mailBoxSettingService.setSecendryEmail(user,"yassine@gmail.com");
        System.out.println(user.getSecondaryEmail());
        // responsibility #2 of the mailBoxSettingService - verify access
        if(mailBoxSettingService.hasAccess(user)){
            user.sendManey(new User(), 1000);
        }
        // problem mailBoxSettingService has two responsibilities
    }
}
