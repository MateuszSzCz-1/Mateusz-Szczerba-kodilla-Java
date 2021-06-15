package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testAddTask() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().add("write something");
        board.getToDoList().add("write something");
        board.getToDoList().add("write something");
        board.getInProgressList().add("write something");
        board.getInProgressList().add("write something ");

        //Then
        assertEquals(3, board.getToDoList().size());
        assertEquals(2, board.getInProgressList().size());

    }
}