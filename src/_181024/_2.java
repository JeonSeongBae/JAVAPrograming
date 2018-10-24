package _181024;

public class _2 {

	public static void main(String[] args) {

	}

	public class _2Date {
		public int year;
		public int month;
		public int date;

		public void setDate(int year, int month, int date) {
			this.year = year;
			this.month = month;
			this.date = date;
		}

		public Object getDate() {
			return this.year + this.month + this.date;
		}
	}
}
