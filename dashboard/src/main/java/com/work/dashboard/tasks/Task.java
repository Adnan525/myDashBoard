package com.work.dashboard.tasks;

import java.util.Date;

public class Task {
    Integer TaskID;
    String taskName;
    String Description;
    Priority priority;
    Date date;

    public Task(Integer taskID, String taskName, String description, Priority priority, Date date) {
        TaskID = taskID;
        this.taskName = taskName;
        Description = description;
        this.priority = priority;
        this.date = date;
    }

    public Integer getTaskID() {
        return TaskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return Description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }
}
