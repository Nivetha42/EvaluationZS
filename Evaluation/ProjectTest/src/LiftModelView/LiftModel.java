package LiftModelView;

import java.util.HashMap;

import liftDatabase.LiftDatabase;

public class LiftModel {
	public LiftView liftView;
	public LiftModel(LiftView liftView) {
		this.liftView=liftView;
	}
	public void initValues() {
		LiftDatabase.getInstance().initValues();
	}
	public void getListFloor()
	{
	HashMap<String,Integer>	lf=LiftDatabase.getInstance().getLiftDetails();
	for(String l:lf.keySet())
	{
		 liftView.printDetails(l,lf.get(l));
	}
	
	}
	public void assignLift(int currentFloor, int destFloor) {
		HashMap<String,Integer>	lf=LiftDatabase.getInstance().getLiftDetails();
		int flag=0;
		for(String l:lf.keySet())
		{
			if(lf.get(l)==0)
			{
				lf.put(l,destFloor);
				flag=1;
			}
			 if(flag==1)
			 {
				liftView.alertText(l+" is assigned");
				return;
			 }
		}
		String li1="";
		int min1=Integer.MAX_VALUE;
		
		String li2="";
		int min2=Integer.MAX_VALUE;
		String li3="";
		int min3=Integer.MAX_VALUE;
		
		for(String l:lf.keySet())
		{
			if(lf.get(l)!=-1)
			{
			
			if((destFloor>=1 && destFloor<=5)&& (l.equals("L1") && lf.get(l)!=-1 || l.equals("L2") ))
			{
			
			if(Math.abs(lf.get(l)-currentFloor)==min1)
			{
				if(lf.get(l)>destFloor && lf.get(l)>lf.get(li1))
				{
					li1=l;
					System.out.println(li1);
				}
				else
				{
					li1=li1;
				}
			}
			else if(Math.abs(lf.get(l)-currentFloor)<min1)
			{
				min1=Math.abs(lf.get(l)-currentFloor) ;
				li1=l;
			}
			}else if((destFloor>=6 && destFloor<=10)&& (l.equals("L3") || l.equals("L4")))
			{
				if(Math.abs(lf.get(l)-currentFloor)==min2)
				{
					if(lf.get(l)>destFloor && lf.get(l)>lf.get(li1))
					{
						li2=l;
						System.out.println(li2);
					}
					else
					{
						li2=li2;
					}
				}
				else if(Math.abs(lf.get(l)-currentFloor)<min2)
				{
					min2=Math.abs(lf.get(l)-currentFloor) ;
					li2=l;
				}
			}
			else if(l.equals("L5"))
			{
				if(Math.abs(lf.get(l)-currentFloor)<min3)
				{
					min3=Math.abs(lf.get(l)-currentFloor) ;
					li3=l;
				}
			}
			}
		}
		
		String li=min1<min2?(min2<min3?li2:li3):li1;
		lf.put(li1, destFloor);
		liftView.alertText(li1+" is assigned");
		getListFloor();
	}
	
}
