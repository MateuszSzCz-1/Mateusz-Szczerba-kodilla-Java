package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    public static final String FB_SHARE_RESPONSE =  "[fb]";
    public static final String TWITTER_SHARE_RESPONSE =  "[twit]";
    public static final String SNAPCHAT_SHARE_RESPONSE =  "[snap]";

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User person = new YGeneration("person");
        User person1 = new Millenials("person 1");
        User person2 = new ZGeneration("person 2");

        //When
        String personSharePost = person.sharePost();
        System.out.println("Person sharing post... " + personSharePost);
        String person1SharePost = person1.sharePost();
        System.out.println("Person 1 sharing post... " + person1SharePost);
        String person2SharePost = person2.sharePost();
        System.out.println("Person 2 sharing post... " + person2SharePost);

        //Then
        assertEquals(FB_SHARE_RESPONSE, personSharePost);
        assertEquals(TWITTER_SHARE_RESPONSE, person1SharePost);
        assertEquals(SNAPCHAT_SHARE_RESPONSE, person2SharePost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User person4 = new YGeneration("Person 4");

        //When
        String person4SharePost = person4.sharePost();
        System.out.println("Person sharing post... " + person4SharePost);
        person4.setShareMethod(new SnapchatPublisher());
        person4SharePost = person4.sharePost();
        System.out.println(person4.getName() + " now sharing on his grandson account... " + person4SharePost);

        //Then
        assertEquals(SNAPCHAT_SHARE_RESPONSE, person4SharePost);
    }
}