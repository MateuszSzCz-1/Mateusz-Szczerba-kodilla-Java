package com.kodilla.testing.forum;

import com.kodilla.testing.User.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ForumTestSuite {

    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        //When
        String result = simpleUser.getUsername();

        String expectedResult = "theForumUser";


        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}