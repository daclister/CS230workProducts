package taskAppServices;
import java.util.ArrayList;


//his class defines the main functionality for managing tasks.
public class taskServices {


	    // Start with an ArrayList of tasks to hold the list of tasks
	    public ArrayList<Task> taskList = new ArrayList<Task>();

	    /**
	     * Displays the full list of tasks to the console for error checking.
	     */
	    public void displayTaskList() {
	        for (Task task : taskList) {
	            System.out.println("\t Task ID: " + task.getTaskID());
	            System.out.println("\t Task Name: " + task.getTaskName());
	            System.out.println("\t Task Description: " + task.getTaskDesc());
	        }
	    }

	    /**
	     * Adds a new task to the list using the Task constructor.
	     * @param taskName The name of the new task.
	     * @param taskDesc The description of the new task.
	     */
	    public void addTask(String taskName, String taskDesc) {
	        // Create the new task
	        Task task = new Task(taskName, taskDesc);
	        taskList.add(task);
	    }

	    /**
	     * Returns a task object based on the provided task ID.
	     * If no matching task ID is found, a task object with default values is returned.
	     * @param taskID The ID of the task to retrieve.
	     * @return The task object.
	     */
	    public Task getTask(String taskID) {
	        Task task = new Task(null, null);
	        for (Task t : taskList) {
	            if (t.getTaskID().equals(taskID)) {
	                task = t;
	                break;
	            }
	        }
	        return task;
	    }

	    /**
	     * Deletes a task based on the provided task ID.
	     * Reports to the console if the task ID is not found.
	     * @param taskID The ID of the task to delete.
	     */
	    public void deleteTask(String taskID) {
	        for (int counter = 0; counter < taskList.size(); counter++) {
	            if (taskList.get(counter).getTaskID().equals(taskID)) {
	                taskList.remove(counter);
	                break;
	            }
	            if (counter == taskList.size() - 1) {
	                System.out.println("Task ID: " + taskID + " not found.");
	            }
	        }
	    }

	    /**
	     * Updates the name of a task based on the provided task ID.
	     * Reports to the console if the task ID is not found.
	     * @param updatedString The new task name.
	     * @param taskID The ID of the task to update.
	     */
	    public void updateTaskName(String updatedString, String taskID) {
	        for (int counter = 0; counter < taskList.size(); counter++) {
	            if (taskList.get(counter).getTaskID().equals(taskID)) {
	                taskList.get(counter).setTaskName(updatedString);
	                break;
	            }
	            if (counter == taskList.size() - 1) {
	                System.out.println("Task ID: " + taskID + " not found.");
	            }
	        }
	    }

	    /**
	     * Updates the description of a task based on the provided task ID.
	     * Reports to the console if the task ID is not found.
	     * @param updatedString The new task description.
	     * @param taskID The ID of the task to update.
	     */
	    public void updateTaskDesc(String updatedString, String taskID) {
	        for (int counter = 0; counter < taskList.size(); counter++) {
	            if (taskList.get(counter).getTaskID().equals(taskID)) {
	                taskList.get(counter).setTaskDesc(updatedString);
	                break;
	            }
	            if (counter == taskList.size() - 1) {
	                System.out.println("Task ID: " + taskID + " not found.");
	            }
	        }
	    }
	}