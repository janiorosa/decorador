public class TresQueijos extends PizzaBasica {
public String getDescricao(){
    return super.getDescricao()+ " mozzarella, chedar e parmezao ";
}
public double getCusto(){
    return super.getCusto()+30.00;
}
}
