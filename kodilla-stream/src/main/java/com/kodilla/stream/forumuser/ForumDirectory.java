package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class ForumDirectory {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public ForumDirectory () {
        forumUserList.add(new ForumUser(1011, "Użytkownik1", Sex.M, 1987, 3, 1, 20));
        forumUserList.add(new ForumUser(1088, "Użytkownik2", Sex.F, 2001, 2, 2, 1));
        forumUserList.add(new ForumUser(1091, "Użytkownik3", Sex.M, 1923, 4, 3, 0));
        forumUserList.add(new ForumUser(1021, "Użytkownik4", Sex.F, 2013, 5, 4, 1212));
        forumUserList.add(new ForumUser(9001, "Użytkownik5", Sex.M, 1987, 7, 5, 3));
        forumUserList.add(new ForumUser(1221, "Użytkownik7", Sex.F, 1990, 8, 6, 40));
        forumUserList.add(new ForumUser(1151, "Użytkownik8", Sex.F, 2019, 9, 7, 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
