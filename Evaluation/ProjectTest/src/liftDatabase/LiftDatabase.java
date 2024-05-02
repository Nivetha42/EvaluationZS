package liftDatabase;

import java.util.HashMap;

public class LiftDatabase {
	HashMap<String,Integer> liftFloors=new HashMap();
	private static LiftDatabase lb;
	public static LiftDatabase getInstance()
	{
		if(lb==null)
		{
			lb=new LiftDatabase();
			return lb;
		}
		return lb;
	}
	public void initValues()
	{
		 liftFloors.put("L1",0);
		 liftFloors.put("L2", 0);
		 liftFloors.put("L3",0);
		 liftFloors.put("L4", 0);
		 liftFloors.put("L5",0);
	}
	public HashMap<String,Integer> getLiftDetails()
	{
		return liftFloors;
	}
}
