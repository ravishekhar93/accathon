package frames;

import java.util.ArrayList;
import java.util.List;

public class TariffLogic {

	//Returns -1 if input is invalid for Single Tarrif
	static int getInitialTarrif(int distance, int maxFare, int baseDistance, int baseCost, int costMultiplier){
		int cost=-1;
		
		if(distance<=baseDistance){
			cost=baseCost;
		}else if(distance>baseDistance){
			cost=baseCost+((distance-baseDistance)*costMultiplier);
		}
		
		if(cost>maxFare){
			cost=maxFare;
		}
		
		return cost;
	}
	
	static int getDistance(int sourceID, int destinationID, List<Station> stations){
		int sourceIDX=-1;
		int destIDX=-1;
		for(int i=0;i<stations.size();i++){
			Station station = stations.get(i);
			if(station.getId()==sourceIDX){
				sourceIDX=i;
			}else if(station.getId()==destIDX){
				destIDX=i;
			}
		}			
		
		int res= sourceIDX-destIDX;
		return Math.abs(res);
	}
	
	static List<Station> getSortedStations(List<Station> stations){
		//Getting the starting station
		Station begStation=null;
		for(Station st:stations)
		{
			if(st.getBefore()==-1){
				begStation=st;
				break;
			}
		}
		List<Station> list = new ArrayList<>();
		
		list.add(begStation);
		
		while(begStation.getAfter()!=-1){
			for(Station st: stations){
				if(st.getId()==begStation.getAfter()){
					begStation=st;
					list.add(begStation);
				break;
				}
			}
		}
		
		return list;
	
	}
	
	
	public static void main(String[] args) {
		/*int distance=15;
		int maxFare=0;
		int baseDistance=0;
		int baseCost=0;
		int costMultiplier=0;
		
		int tarrif=getInitialTarrif(distance,maxFare,baseDistance, baseCost, costMultiplier);
		System.ou*/
			
		}
		
	}
