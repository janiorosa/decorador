public class Calabreza extends Decorador {

    public Calabreza(Pizza nova){
        super(nova);
        System.out.println("Adicionando "+super.getDescricao());
        System.out.println("Adicionando calabreza ");
    }
    
    public String getDescricao(){
        return super.getDescricao()+ " calabreza";
    }
    public double getCusto(){
        return super.getCusto()+15.00;
    }
}
