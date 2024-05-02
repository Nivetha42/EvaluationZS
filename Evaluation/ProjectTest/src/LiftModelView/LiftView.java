package LiftModelView;

import java.util.Scanner;

public class LiftView {
	LiftModel liftModel;
	public LiftView()
	{
		liftModel=new LiftModel(this);
	}
	public void init()
	{
		liftModel.initValues();
		liftModel.getListFloor();
		while(true)
		{
		assignLift();
		}
		
	}
	public void assignLift()
	{
		Scanner sc=new Scanner(System.in);
		int currentFloor=sc.nextInt();
		int destFloor=sc.nextInt();
		liftModel.assignLift(currentFloor,destFloor);
	}
	public void alertText(String alertText)
	{
		System.out.println(alertText);
	}
	public void printDetails(String l, Integer floor) {
		System.out.println(l+" "+floor);
		
	}
}
