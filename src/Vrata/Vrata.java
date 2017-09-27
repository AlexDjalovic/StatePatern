package Vrata;

public class Vrata {
	
	State current;
	State zakljucana;
	State otkljucana;
	State otvorena;
	
	public Vrata(){
		zakljucana=new Zakljucana(this);
		otkljucana=new Otkljucana(this);
		otvorena=new Otvorena(this);
		
		current=zakljucana;
	}
	public void setState(State newState){
		current=newState;
	}

	public void otvori(){
		current.otvori();
	}
	public void otkljucaj(){
		current.otkljucaj();
	}
	public void zatvori(){
		current.zatvori();
	}
	public void zakljucaj(){
		current.zakljucaj();
	}
}
