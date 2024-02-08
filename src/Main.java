public class Main {

    public static void main(String[] args) {

        UserCheck u= new UserCheck("adam", "1234");


        u.setStrategie(new StrategieBiometrique());
        u.Authentifier();

    }



}