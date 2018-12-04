package _181128;

public class Graduate extends Student {
	String teachingType;
	int scholarshipRatio;

	public Graduate() {
		super();
	}

	public Graduate(String teachingType, int scholarshipRatio) {
		super();
		this.teachingType = teachingType;
		this.scholarshipRatio = scholarshipRatio;
	}

	public String getTeachingType() {
		return teachingType;
	}

	public void setTeachingType(String teachingType) {
		this.teachingType = teachingType;
	}

	public int getScholarshipRatio() {
		return scholarshipRatio;
	}

	public void setScholarshipRatio(int scholarshipRatio) {
		this.scholarshipRatio = scholarshipRatio;
	}

}
