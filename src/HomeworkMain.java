public class HomeworkMain {
    public static void main(String[] args) {
        Webfilter webfilter = new Webfilter();
        Person person = new Person(69,"Ivan", UserType.USER.ordinal());
        boolean answer = webfilter.AccessToSite("informatik.msk.ru",UserType.USER);
        System.out.println(answer);
        person = new Person(897, "Sergej",UserType.ADMIN.ordinal());
        boolean answer1 = webfilter.AccessToSite("informatik.msk.ru", UserType.ADMIN);
        System.out.println(answer1);


    }
}
