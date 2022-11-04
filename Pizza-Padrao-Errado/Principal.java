public class Principal  {
public static void main(String[] argsalksdjflkasjdf){
    PizzaBasica basica = new PizzaBasica();
    System.out.println(basica.getDescricao() + " / " 
        +basica.getCusto());
    TresQueijos q = new TresQueijos();
    System.out.println(q.getDescricao() + " / " 
        +q.getCusto());
    Brocolis b = new Brocolis();
    System.out.println(b.getDescricao() + " / " 
        +b.getCusto());
    Calabreza c = new Calabreza();
    System.out.println(c.getDescricao() + " / " 
        +c.getCusto());
}
}
