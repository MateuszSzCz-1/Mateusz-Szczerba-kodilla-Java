package com.kodilla.hibernate.task.dao.dao;



import com.kodilla.hibernate.task.dao.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);

    @Query
    List<com.kodilla.hibernate.task.dao.Task> retrieveLongTasks();

    @Query
    List<com.kodilla.hibernate.task.dao.Task> retrieveShortTasks();

    @Query(nativeQuery = true)
    List<com.kodilla.hibernate.task.dao.Task> retrieveTasksWithEnoughTime();

    @Query
    List<com.kodilla.hibernate.task.dao.Task> retrieveTasksWithDurationLongerThan(@Param("DURATION") int duration);
}