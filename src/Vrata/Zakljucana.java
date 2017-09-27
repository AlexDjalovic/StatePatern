package Vrata;

public class Zakljucana implements State {

	private Vrata vr;
	public Zakljucana(Vrata vrata) {
		vr=vrata;
	}

	@Override
	public void otvori() {
		System.out.println("prvo se moraju otkljucati");

	}

	@Override
	public void zatvori() {
		System.out.println("vec su zatvorena");

	}

	@Override
	public void otkljucaj() {
		System.out.println("otkljucavaju se vrata");
		vr.setState(new Otkljucana(vr));

	}

	@Override
	public void zakljucaj() {
		System.out.println("vec su zakljucana");

	}

}
