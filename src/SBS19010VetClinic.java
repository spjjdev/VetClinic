import java.util.ArrayList;

import staff.TraineeVet;
import staff.Vet;

public class SBS19010VetClinic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data = new Data ();
		ArrayList <TraineeVet> vets = new ArrayList <>();
        vets = data.buildTraineeVet(vets);
        System.out.println(vets);
        
	}

}
