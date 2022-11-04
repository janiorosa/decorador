public abstract class Decorador implements Pizza {
    protected Pizza pizza;
    public Decorador(Pizza nova){
        pizza=nova;
    }
    public String getDescricao(){
        return pizza.getDescricao();
    }
    public double getCusto(){
        return pizza.getCusto();
    }
}
