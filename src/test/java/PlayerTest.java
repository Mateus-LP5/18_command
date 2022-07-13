import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player musicPlayer;
    Musica musica;

    @BeforeEach
    void setUp() {
        musicPlayer = new Player();
        musica = new Musica("Stairway to Heaven", "Led Zeppelin");
    }

    @Test
    void deveFavoritarMusica() {
        Funcao favoritar = new FuncaoFavoritarMusica(musica);
        musicPlayer.executarFuncao(favoritar);
        assertEquals(true, musica.isFavorita());
    }

    @Test
    void deveDesfavoritarMusica() {
        Funcao desfavoritar = new FuncaoDesfavoritarMusica(musica);
        musicPlayer.executarFuncao(desfavoritar);
        assertEquals(false, musica.isFavorita());
    }

    @Test
    void deveCancelarDESFavoritarMusica() {
        Funcao favoritarMusica = new FuncaoFavoritarMusica(musica);
        Funcao desfavoritarMusica = new FuncaoDesfavoritarMusica(musica);

        musicPlayer.executarFuncao(favoritarMusica);
        musicPlayer.executarFuncao(desfavoritarMusica);

        musicPlayer.cancelarUltimaFuncao();

        assertEquals(true, musica.isFavorita());
    }

}