public class Burguer extends Produto {

    private int gramas;

    public Burguer(String descricao, double preco, int gramas) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

}
