public class Webfilter  implements Filter {
    private static String USER_ACCESS = "http://web-for-user";

    @Override
    public boolean AccessToSite(String site, UserType usertype) {
        if (usertype == UserType.ADMIN) {
            return true;
        } else {
            return site.startsWith(USER_ACCESS);


        }

    }
}
