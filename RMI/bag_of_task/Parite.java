public class Parite implements Task{
    int n;// Nombre à vérifier


    // Constructeur qui initialise l'attribut n avec le nombre donné
    public Parite(int n){
        this.n=n;
    }
      // Méthode execute() qui exécute la vérification de parité en appelant la méthode paire() et retourne le résultat.
    @Override
    public Object execute() {
        return paire(this.n);
    }
    // Méthode statique paire() qui vérifie si un entier est pair ; retourne true si n est pair, sinon false.
    public static boolean paire(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
     // Accesseur pour obtenir le nombre à vérifier.
    public int getN() {
        return n;
    }
    
}