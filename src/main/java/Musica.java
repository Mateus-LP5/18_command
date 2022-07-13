public class Musica {

    private String nome;
    private String artista;
    private boolean isFavorita;

    public Musica (String nome, String artista){
        this.nome = nome;
        this.artista = artista;
    }

    public boolean isFavorita(){
        return this.isFavorita;
    }

    public void favoritar() {
        this.isFavorita = true;
    }

    public void desfavoritar() {
        this.isFavorita = false;
    }
}
