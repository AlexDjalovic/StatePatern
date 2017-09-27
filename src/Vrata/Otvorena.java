package Vrata;

public class Otvorena implements State {

	private Vrata vr;
	public Otvorena(Vrata vrata) {
		vr=vrata;
	}

	@Override
	public void otvori() {
		System.out.println("vrata su bila vec otvorena");

	}

	@Override
	public void zatvori() {
		System.out.println("vrata se zatvaraju");
		vr.setState(new Otkljucana(vr));

	}

	@Override
	public void otkljucaj() {
	
		System.out.println("vrata su bila otkljucana i otvorena");

	}

	@Override
	public void zakljucaj() {
		System.out.println("ne mogu zakljucati otvorena vrata");

	}

}
