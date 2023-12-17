package taskAppServices;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;
public class Task {
	 private final String taskID;
	    private String taskName;
	    private String taskDesc;
	    private static AtomicLong idGenerator = new AtomicLong();

	    // CONSTRUCTORS
	    /**
	     * Creates a task with the provided name and description.
	     * Task ID is automatically generated and set as a final variable.
	     * If the task name or description is null or empty, "NULL" is used as a placeholder.
	     * The task name is truncated to a maximum of 20 characters, and the description to 50 characters.
	     */
	    public Task(String taskName, String taskDesc) {
	        this.taskID = String.valueOf(idGenerator.getAndIncrement());

	        this.taskName = (taskName == null || taskName.isEmpty()) ? "NULL" :
	                        (taskName.length() > 20) ? taskName.substring(0, 20) : taskName;

	        this.taskDesc = (taskDesc == null || taskDesc.isEmpty()) ? "NULL" :
	                        (taskDesc.length() > 50) ? taskDesc.substring(0, 50) : taskDesc;
	    }

	    // GETTERS
	    /**
	     * Retrieves the unique task ID.
	     * @return The task ID.
	     */
	    public String getTaskID() {
	        return taskID;
	    }

	    /**
	     * Retrieves the task name.
	     * @return The task name.
	     */
	    public String getTaskName() {
	        return taskName;
	    }

	    /**
	     * Retrieves the task description.
	     * @return The task description.
	     */
	    public String getTaskDesc() {
	        return taskDesc;
	    }

	    // SETTERS
	    /**
	     * Sets the task name, following the same rules as the constructor.
	     * @param taskName The new task name.
	     */
	    public void setTaskName(String taskName) {
	        this.taskName = (taskName == null || taskName.isEmpty()) ? "NULL" :
	                        (taskName.length() > 20) ? taskName.substring(0, 20) : taskName;
	    }

	    /**
	     * Sets the task description, following the same rules as the constructor.
	     * @param taskDesc The new task description.
	     */
	    public void setTaskDesc(String taskDesc) {
	        this.taskDesc = (taskDesc == null || taskDesc.isEmpty()) ? "NULL" :
	                        (taskDesc.length() > 50) ? taskDesc.substring(0, 50) : taskDesc;
	    }
	}