package Services;

public class BrazilianInterestService implements InterestService {

	private Double interest;

	public BrazilianInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public Double getInterest() {
		return interest;
	}

}
