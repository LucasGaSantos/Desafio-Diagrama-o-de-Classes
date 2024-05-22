public class iPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical rp = new ReprodutorMusical();
        AparelhoTelefonico at = new AparelhoTelefonico();
        NavegadorInternet nt = new NavegadorInternet();

        rp.SelecionarMusica();
        rp.tocar();
        rp.pausar();
        at.atender();
        nt.adicionarNovaAba();
        nt.exibirPagina();
        nt.atualizarPagina();
        at.ligar();
        at.IniciarCorreioVoz();
    }
}
