package car;
import  car_tyre.*;
public class brand_bmw implements mycar {

//here m gonna create constructor dependency.
	private tyre tyr;
	brand_bmw(tyre tyr){
		this.tyr=tyr;
	}
	
	
	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "This is BMW";
	}

	@Override
	public String tyre() {
		// TODO Auto-generated method stub
		return tyr.tyre_brand();
	}

}
