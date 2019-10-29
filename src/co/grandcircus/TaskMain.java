package co.grandcircus;
//@Jack Hagen

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskMain {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Task Manager!");
		int userInput;
		String teamMember = "";
		String taskDescription = "";
		String dueDate = "";
		String listTasks = "1. List tasks";
		String addTask = "2. Add task";
		String deleteTask = "3. Delete task";
		String taskCompleted = "4. Mark task completed";
		String quit = "5. Quit";
		String backToMain = "yes";
		int userTaskToComplete = 0;
		boolean userFinished = false;
		List<String> menuOptions = new ArrayList<>();
		menuOptions.add(listTasks);
		menuOptions.add(addTask);
		menuOptions.add(deleteTask);
		menuOptions.add(taskCompleted);
		menuOptions.add(quit);
		LinkedList<Task> taskList = new LinkedList<>();	
		{
        do {
            for (int i = 0; i < menuOptions.size(); i++) {
                System.out.println((i + 1) + ". " + menuOptions.get(i));
            }

    	userInput = Validator.getInt(scnr, "What would you like to do?");
    		System.out.println();
    		
    	System.out.println(menuOptions.get(userInput - 1));

                
		System.out.println();
		System.out.println(listTasks);
		System.out.println(addTask);
		System.out.println(deleteTask);
		System.out.println(taskCompleted);
		System.out.println(quit);System.out.println();

	if(userInput==1)
	{
		System.out.println("LIST TASKS");
		System.out.println();
		userInput = Validator.getInt(scnr, "What would you like to do?");
		System.out.println(taskList);
	}

	if(userInput==2)
	{
		System.out.println("ADD TASK");
		System.out.println();
		System.out.println("Team Member Name: ");
		teamMember = scnr.nextLine();
		System.out.println();
		System.out.println("Task Description: ");
		taskDescription = scnr.nextLine();
		System.out.println();
		System.out.println("Due Date (MM/DD/YY): ");
		dueDate = scnr.nextLine();
		System.out.println("Task entered!");
		userInput = Validator.getInt(scnr, "What would you like to do?");
	}

	if(userInput==3) { 

        
	if(userInput==4)
	{

	}

	if(userInput==5)
	{
		System.out.println("Have a great day!");
		}
	}
        }