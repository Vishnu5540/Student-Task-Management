import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(int id, String title) {
        tasks.add(new Task(id, title));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task.getId() + " | " + task.getTitle() + " | " + task.getStatus());
        }
    }

    public void markCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus("Completed");
                System.out.println("Task marked as completed!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}
