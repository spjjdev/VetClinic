import java.util.ArrayList;

import staff.ITstaff;

public class Relations {
	
	ArrayList<ITstaff> ITteam ;
	Data data= new Data();
	
	public Relations (){
		ITteam = data.buildITstaff();
	}

}
