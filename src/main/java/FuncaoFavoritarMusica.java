public class FuncaoFavoritarMusica implements Funcao {

    private Musica musica;

    public FuncaoFavoritarMusica(Musica musica) {
        this.musica=musica;
    }

    @Override
    public void executar() {
        this.musica.favoritar();
    }

    @Override
    public void cancelar() {
        this.musica.desfavoritar();
    }
}
