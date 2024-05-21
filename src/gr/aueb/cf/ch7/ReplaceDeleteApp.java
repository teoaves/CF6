package gr.aueb.cf.ch7;

public class ReplaceDeleteApp {
    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String NickName;
        String oneName;

        simpleName = firstname.replace("-", " ");

        NickName = firstname.replace("-", " ");
        System.out.println(NickName);

        oneName = firstname.replace("-Helen","");
        System.out.println(oneName);

    }
}
