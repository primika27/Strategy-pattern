public class UserCheck {
    private StrategieAuthentification strategie;
    private String defaultPass;
    private String userName;
    public UserCheck(String userName, String defaultPass) {
        this.userName = userName;
        this.defaultPass = defaultPass;
        //default strategie
        strategie = new StrategieMotDePasse();
    }

    public String getDefaultPass(){
        return this.defaultPass;
    };

    public String getUserName(){
        return this.userName;
    }
    public StrategieAuthentification getStrategie(){
        return this.strategie;
    };

    public void setStrategie(StrategieAuthentification strategie){
       this.strategie=strategie;
    };

    public void Authentifier(){
        strategie.affichage(this);
        System.out.println("Le mot de passe par défaut est: "+ this.getDefaultPass());
    };


}
