package car;
import car_tyre.*;
public class brand_audi implements mycar {
	
	//here i will perform setter injection
	
	private tyre tyr;
public String brand()
{
	return "This is Audi";
	
}

public void setTyre(tyre tyr) {
	this.tyr=tyr;
	
}


@Override
public String tyre() {
	// TODO Auto-generated method stub
	return tyr.tyre_brand();
}
}
