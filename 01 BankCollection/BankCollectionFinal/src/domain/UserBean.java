package domain;

public class UserBean extends MemberBean {
	private String creditRating;

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	@Override
	public String toString() {
		return "UserBean [creditRating=" + creditRating + ", id=" + id + ", pw=" + pw + ", name=" + name + ", ssn="
				+ ssn + ", add=" + add + ", phone=" + phone + ", email=" + email + "]";
	}

}
