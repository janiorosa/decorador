public class Brocolis extends Decorador {

    public Brocolis(Pizza nova){
        super(nova);
        System.out.println("Adicionando "+super.getDescricao());
        System.out.println("Adicionando brocolis ");
    }
    
    public String getDescricao(){
        return super.getDescricao()+ " brocolis";
    }
    public double getCusto(){
        return super.getCusto()+10.00;
    }
}
