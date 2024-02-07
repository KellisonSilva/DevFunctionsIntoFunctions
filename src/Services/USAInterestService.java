package Services;

public class USAInterestService implements InterestService {

	private Double Interest;

	public USAInterestService(Double Interest) {
		this.Interest = Interest;
	}

	@Override
	public Double getInterest() {
		return Interest;
	}

}
