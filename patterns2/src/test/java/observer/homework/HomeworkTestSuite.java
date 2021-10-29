package observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeworkTestSuite {

    @Test
    void testUpdate() {
        // given
        Queue jimmy = new Queue("Jimmy Cas");
        Queue jola = new Queue("Jola Cannon");
        Queue robert = new Queue("Robert Redforf");
        Mentor thomas = new Mentor("Thomas Hilfiger");
        Mentor calvin = new Mentor("Calvin Clain");
        Mentor boob = new Mentor("Boob Lee");
        jimmy.assignWatcher(thomas);
        jola.assignWatcher(calvin);
        robert.assignWatcher(boob);
        jola.assignWatcher(boob);
        jimmy.assignWatcher(boob);
        // when
        jimmy.addExercise(new Exercise(1, "/jimmy_repo/03.6"));
        jimmy.addExercise(new Exercise(1, "/jimmy_repo/03.7"));
        jola.addExercise(new Exercise(1, "/jola_repo/01.3"));
        jola.addExercise(new Exercise(1, "/jola_repo/01.4"));
        robert.addExercise(new Exercise(1, "/boob_repo/03.1"));
        robert.addExercise(new Exercise(1, "/boob_repo/03.2"));
        robert.addExercise(new Exercise(1, "/bob_repo/03.3"));
        // then
        assertEquals(2, thomas.getUpdatesQuantity());
        assertEquals(2, calvin.getUpdatesQuantity());
        assertEquals(7, boob.getUpdatesQuantity());
    }
}