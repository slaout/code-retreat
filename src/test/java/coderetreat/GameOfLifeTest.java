package coderetreat;

import org.junit.jupiter.api.Test;

//JUNIT[1/2] import static org.junit.jupiter.api.Assertions.*;

//ASSERTJ[2/3] import static org.assertj.core.api.Assertions.assertThat;

class GameOfLifeTest {

    private final GameOfLife game = new GameOfLife();

    @Test
    void first() {
        //JUNIT[2/2] assertNotNull(game);

        //ASSERTJ[3/3] assertThat(game).isNotNull();
    }

}
