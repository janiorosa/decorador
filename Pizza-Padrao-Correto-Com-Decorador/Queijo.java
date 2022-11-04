public class Queijo extends Decorador {

    public Queijo(Pizza nova){
        super(nova);
        System.out.println("Adicionando "+super.getDescricao());
        System.out.println("Adicionando chedar, catupiri e parmesao ");
    }
    
    public String getDescricao(){
        return super.getDescricao()+ "chedar, catupiri e parmesao ";
    }
    public double getCusto(){
        return super.getCusto()+25.00;
    }
}
