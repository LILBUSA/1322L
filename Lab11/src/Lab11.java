import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time1, time2;

        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time = scan.nextLine();
            time1 = milToSec(time);

            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            time = scan.nextLine();
            time2 = milToSec(time);

            System.out.println("Difference in seconds: " + (time2 - time1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int milToSec(String time) throws Exception {
//        for (int i = 0; i < time.length(); i++) {
//            char c = time.charAt(i);
//            if (Character.isDigit(c)) {
//                int val = c - '0';
//                if (i < 2) {
//                    if (val > 2) {
//                        if (i == 0) {
//                            throw new InvalidTimeException("Hour not valid");
//                        } else {
//                            if (val > 3) {
//                                throw new InvalidTimeException("Hour not valid");
//                            }
//                        }
//                    }
//                } else if (i > 2 && i < 5) {
//                    if (val > 5) {
//                        if (i == 3) {
//                            throw new InvalidTimeException("Minute not valid");
//                        } else {
//                            if (val > 9) {
//                                throw new InvalidTimeException("Minute not valid");
//                            }
//                        }
//                    }
//                } else if (i > 5) {
//                    if (val > 5) {
//                        if (i == 6) {
//                            throw new InvalidTimeException("Minute not valid");
//                        } else {
//                            if (val > 9) {
//                                throw new InvalidTimeException("Minute not valid");
//                            }
//                        }
//                    }
//                } else {
//                    throw new InvalidTimeException("Time format not valid");
//                }
//            } else {
//                if (i == 2 || i == 5) {
//                    if (c != ':') {
//                        throw new InvalidTimeException("Time format not valid");
//                    }
//                }
//            }
//        }
        String[] timeArr = time.split(":");
        if (timeArr.length != 3) {
            throw new InvalidTimeException("Enter a valid time");
        } else {
            try {
                Integer.parseInt(timeArr[0]);
                Integer.parseInt(timeArr[1]);
                Integer.parseInt(timeArr[2]);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid time");
            }

            int hrs = Integer.parseInt(timeArr[0]);
            int mins = Integer.parseInt(timeArr[1]);
            int secs = Integer.parseInt(timeArr[2]);

            if (hrs < 0 || hrs > 23) {
                throw new InvalidTimeException("Hour must be below 24");
            } else if (mins < 0 || mins > 59) {
                throw new InvalidTimeException("Minutes must be less than 60");
            } else if (secs < 0 || secs > 59) {
                throw new InvalidTimeException("Seconds must be less than 60");
            }

            return (((hrs*60)+mins)*60) + secs;
        }

    }
}

class InvalidTimeException extends Exception {
    public InvalidTimeException(String str) {
        super(str);
    }
}
