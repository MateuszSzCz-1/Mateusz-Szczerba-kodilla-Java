package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class BoardTestSuite {

    @Test
    void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When

        //Then
        assertEquals(3, project.getTaskLists().size());
    }


    @Test
    void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();

        //When
        User user = new User("developer1", "John Smith");     // [1]
        List<Task> tasks = project.getTaskLists().stream()    // [2]
                .flatMap(l -> l.getTasks().stream())               // [3]
                .filter(t -> t.getAssignedUser().equals(user))     // [4]
                .collect(toList());                                // [5]

        //Then
        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }
    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();             // [1]
        undoneTasks.add(new TaskList("To do"));                     // [2]
        undoneTasks.add(new TaskList("In progress"));               // [3]
        List<Task> tasks = project.getTaskLists().stream()          // [4]
                .filter(undoneTasks::contains)                           // [5]
                .flatMap(tl -> tl.getTasks().stream())                   // [6]
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))  // [7]
                .collect(toList());                                      // [8]

        //Then
        assertEquals(1, tasks.size());                              // [9]
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }
    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();               // [1]
        inProgressTasks.add(new TaskList("In progress"));                 // [2]
        long longTasks = project.getTaskLists().stream()                  // [3]
                .filter(inProgressTasks::contains)                             // [4]
                .flatMap(tl -> tl.getTasks().stream())                         // [5]
                .map(Task::getCreated)                                         // [6]
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)  // [7]
                .count();                                                      // [8]

        //Then
        assertEquals(2, longTasks);                                       // [9]
    }
    @Test
    void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        double averageDaysWorkingOnTask = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tasklist -> tasklist.getTasks().stream())
                .mapToDouble(t -> t.getDeadline().getDayOfYear() - t.getCreated().getDayOfYear())
                .average().getAsDouble();

        //Then
        assertEquals(18, averageDaysWorkingOnTask, 1);
    }

    private Board prepareTestData() {
        // users
        User user1 = new User("user1", "UserD");
        User user2 = new User("user2", "UserC");
        User user3 = new User("user3", "UserB");
        User user4 = new User("user4", "UserA");

        //tasks
        Task task1 = new Task(" Prototyping  devices", "The thesis",
                user1,
                user2,
                LocalDate.now().minusDays(30),
                LocalDate.now().plusDays(30));
        Task task2 = new Task(" Analysis",
                " Queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user2,
                user3,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Logger",
                " Our needs",
                user2,
                user3,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Searching",
                "Searching has to be optimized",
                user2,
                user4,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "Use Streams in predictions",
                user2,
                user4,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        Board project = new Board("Project");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

        return project;
    }
}