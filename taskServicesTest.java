package taskAppServices;

import static org.junit.jupiter.api.Assertions.*;	
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import Task.Task;
import Task.taskServices;

import org.junit.jupiter.api.Test;

class taskServicesTest {

	@Test
	@DisplayName("Test to Update task name")
	@Order(1)
	void testUpdateTaskName() {
		taskServices service = new taskServices();
		service.addTask("Task Name", "Description");
		service.updateTaskName("Updated Task Name", "3");
		service.displayTaskList();
		assertEquals("Updated Task Name", service.getTask("3").getTaskName(), "Task name was not updated.");
	}

	@Test
	@DisplayName("Test to Update task description.")
	@Order(2)
	void testUpdateTaskDesc() {
		taskServices service = new taskServices();
		service.addTask("Task Name", "Description");
		service.updateTaskDesc("Updated Description", "1");
		service.displayTaskList();
		assertEquals("Updated Description", service.getTask("1").getTaskDesc(), "Task description was not updated.");
	}

	@Test
	@DisplayName("Test to ensure that service correctly deletes tasks.")
	@Order(5)
	void testDeleteContact() {
		taskServices service = new taskServices();
		service.addTask("Task Name", "Description");
		service.deleteTask("0");
		// Ensure that the contactList is now empty by creating a new empty contactList to compare it with
		ArrayList<Task> taskListEmpty = new ArrayList<Task>();
		service.displayTaskList();
		assertEquals(service.taskList, taskListEmpty, "The contact was not deleted.");
	}

	@Test
	@DisplayName("Test to ensure that service can add a task.")
	@Order(6)
	void testAddContact() {
		taskServices service = new taskServices();
		service.addTask("Task Name", "Description");
		service.displayTaskList();
		assertNotNull(service.getTask("0"), "Task was not added correctly.");
	}
}
