public class PizzaComMolho  extends Decorador {

    public PizzaComMolho(Pizza nova){
        super(nova);
        System.out.println("Adicionando molho ");
    }
    
    public String getDescricao(){
        return super.getDescricao()+ " molho ";
    }
    public double getCusto(){
        return super.getCusto()+5.00;
    }
}
