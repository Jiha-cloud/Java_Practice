package java_20210510;

public class Calendar {
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;
	private int year;
	private int month;
	private int day;
	
	public Calendar(int year) {
		this(year,0,0);
	}
	public Calendar(int year, int month) {
		this(year,month,0);
	}
	public Calendar(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day= day;
	}

	private void change(int year) {
		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
	}

	public boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private int leapYear(int year) {
		return (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
	}

	private int getCount(int year, int month, int day) {
		int leapYear = leapYear(year);
		boolean isLeafYear = isLeafYear(year);
		change(year);
		int numOfDay = (year - 1) * 365 + leapYear;
		for (int i = 0; i < month - 1; i++) {
			numOfDay += monthArray[i];
		}
		numOfDay += day;
		return numOfDay;
	}

	// ��,��,���� ������ ������ �˷��ִ� �޼���
	public void printDay() {
		change(year);
		int numOfDay = getCount(year, month, day);
		int dayOfWeek = numOfDay % 7;
		String message = "";

		if (dayOfWeek == Calendar.MONDAY) {
			message = "������";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			message = "ȭ����";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			message = "������";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "�����";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			message = "�ݿ���";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "�����";
		} else if (dayOfWeek == Calendar.SUNDAY) {
			message = "�Ͽ���";
		}
		System.out.printf("%d�� %d�� %d���� %s�Դϴ�.\n", year, month, day,message);
	}
	
	public void print() {
		if(year != 0 && month != 0 && day != 0) {
			printDay();
		}else if(year !=0 && month != 0 && day ==0) {
			print(year,month);
		}else if(year !=0&& month ==0 && day==0) {
			printYear();
		}
	}

	// ��, ���� ������ �ش� ���� �޷��� ������ �޼���
	public void print(int year, int month) {
		System.out.print(year + "��" + month + "��\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		boolean isLeafYear = isLeafYear(year);
		change(year);
		int numOfDays = getCount(year, month, 1);
		int rest = numOfDays % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= monthArray[month - 1]; i++) {
			System.out.print(i + "\t");
			if (rest % 7 == 6) {
				System.out.println();
			}
			rest++;
		}
		System.out.println();
		System.out.println();
	}

	// ���� ������ �ش� ���� ��ü �޷��� ������ �޼���
	public void printYear() {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
			System.out.println();
			System.out.println();
		}
	}

}
