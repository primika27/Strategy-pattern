public class StrategieDeuxFacteurs implements StrategieAuthentification{
    @Override

    public void affichage(UserCheck u) {
        System.out.println("Authentification à deux facteur réussie");
    }
}
