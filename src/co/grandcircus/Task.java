package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {

	String teamMember;
	String memberDetails;
	String dueDate;
	boolean complete;

	public Task(String memberName, String memberDetails, String dueDate, boolean complete) {
		super();
		this.memberDetails = memberDetails;
		this.dueDate = dueDate;
		this.complete = complete;
	}

	public String getMemberName() {
		return teamMember;
	}

	public void setMemberName(String teamMember) {
		this.teamMember = teamMember;
	}

	public String getMemberDetails() {
		return memberDetails;
	}

	public void setMemberDetails(String memberDetails) {
		this.memberDetails = memberDetails;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public static void menu() {

	}

	public static ArrayList<String> listTasks(ArrayList<String> addItem) {

		Scanner scnr = new Scanner(System.in);
		ArrayList<String> taskList = new ArrayList<String>();
		String teamMember = scnr.nextLine();
		scnr.next();
		String taskDescription = scnr.nextLine();
		scnr.next();
		String dueDate = scnr.nextLine();
		scnr.next();

		taskList.add(teamMember);
		taskList.add(taskDescription);
		taskList.add(dueDate);

		return taskList;
	}
}
