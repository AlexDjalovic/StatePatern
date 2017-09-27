package Vrata;

public class Otkljucana implements State {

	private Vrata vr;
	public Otkljucana(Vrata vrata) {
		vr=vrata;
	}

	@Override
	public void otvori() {
		System.out.println("vrata se otvaraju");
		vr.setState(new Otvorena(vr));

	}

	@Override
	public void zatvori() {
		System.out.println("vrata su zatvorena i otkljucana");

	}

	@Override
	public void otkljucaj() {
		System.out.println("ne mogu ,otkljucana su");

	}

	@Override
	public void zakljucaj() {
		System.out.println("vrata se zakljucavaju");
		vr.setState(new Zakljucana(vr));

	}

}
