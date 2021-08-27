package com.work.dashboard;

import com.work.dashboard.tasks.Priority;
import com.work.dashboard.tasks.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
public class Controller {

    //test
    List<Task> allTasks = Arrays.asList(
            new Task(1, "test", "this is a test task 1", Priority.High, new Date()),
            new Task(2, "test", "this is a test task 2", Priority.High, new Date())
    );

    @GetMapping(path = "/")
    public String index()
    {
        return "Hello Adnaan";
    }

    @GetMapping(path = "/{taskID}")
    public Task showTask(@PathVariable("taskID") Integer taskID)
    {
        return allTasks.stream()
                .filter(task -> taskID.equals(task.getTaskID()))
                .findFirst()
                .orElse(null);
    }
}
