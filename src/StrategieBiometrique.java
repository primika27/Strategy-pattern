public class StrategieBiometrique implements StrategieAuthentification {

    private String nom;
    public StrategieBiometrique(){
        this.nom="Biometrique";
    }


    @Override
    public void affichage(UserCheck u) {
        System.out.println("Authentification biométrique réussie");
    }
}
