package hw4.src.mytime;

public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public MyTime() {

	}

	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			System.out.println("Not valid hour's value");
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("Not valid minute's value");
		}
		this.minute = minute;

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("Not valid second's value");
		}
		this.second = second;

	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);

	}

    public MyTime nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return this;
        }
        if (minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
            return this;
        }
        if (second == 59) {
            minute++;
            second = 0;
            return this;
        }
        second++;
        return this;
    }

    public MyTime nextMinute() {
        if (hour == 23 && minute == 59) {
            hour = 0;
            minute = 0;
            return this;
        }
        if (minute == 59) {
            hour++;
            minute = 0;
            return this;
        }
        minute++;
        return this;
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
            return this;
        }
        hour++;
        return this;
    }

    public MyTime previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return this;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return this;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return this;
        }
        second--;
        return this;
    }

    public MyTime previousMinute() {
        if (hour == 0 && minute == 0) {
            hour = 23;
            minute = 59;
            return this;
        }
        if (minute == 0) {
            hour--;
            minute = 59;
            return this;
        }
        minute--;
        return this;
    }

    public MyTime previousHour() {
        if (hour == 0) {
            hour = 23;
            return this;
        }
        hour--;
        return this;
    }

	public String toString() {
		return String.format("%1$02d:%2$02d:%3$02d", hour, minute, second);
	}

}
