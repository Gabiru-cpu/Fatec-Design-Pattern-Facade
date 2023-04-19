public class Combo {

    private Burguer burguer = new Burguer(null, 0, 0);
    private Sobremesa sobremesa = new Sobremesa(null, 0, null);
    private Bebida bebida = new Bebida(null, 0, 0);
    private Produto produto = new Produto(null, 0);

    public void CriarCombo(int tipo) {
        if (tipo == 1) {
            burguer.setGramas(200);
            burguer.setDescricao("Completo Hamburguer, bacon, queijo, molhos");
            burguer.setPreco(50);

            sobremesa.setTamanho("300G");
            sobremesa.setDescricao("Brownie");
            sobremesa.setPreco(15);

            bebida.setMl(650);
            bebida.setDescricao("Cocacola alimonada 650ml");
            bebida.setPreco(13);

            produto.setDescricao("Master Combo");
            produto.setPreco(78);
        }
        if (tipo == 2) {
            burguer.setGramas(150);
            burguer.setDescricao("Hamburguer, queijo, molhos");
            burguer.setPreco(35);

            sobremesa.setTamanho("200Ml");
            sobremesa.setDescricao("Sorvete");
            sobremesa.setPreco(12);

            bebida.setMl(600);
            bebida.setDescricao("cocacola 600ml");
            bebida.setPreco(10);

            produto.setDescricao("Super Combo");
            produto.setPreco(57);
        }
    }

    @Override
    public String toString() {
        return "Burguer descrição: " + burguer.getDescricao() + "Burguer Gramas: " + burguer.getGramas()
                + "Burguer preço: " + burguer.getPreco() +
                ", sobremesa descrição: " + sobremesa.getDescricao() + "sobremesa tamanho: " + sobremesa.getTamanho()
                + "sobremesa preço: " + sobremesa.getPreco() +
                ", bebida descricao: " + bebida.getDescricao() + "bebida tamanho: " + bebida.getMl() + "bebida preço: "
                + bebida.getPreco() +
                ", produto descricao: " + produto.getDescricao() + "bebida preço: " + produto.getPreco();
    }

}
