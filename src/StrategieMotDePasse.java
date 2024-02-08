public class StrategieMotDePasse implements StrategieAuthentification{
    @Override
    public void affichage(UserCheck u) {
        System.out.println("Authentification à mot de passe réussie");
    }
}
