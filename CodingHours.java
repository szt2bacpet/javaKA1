public class CodingHours {
    public static void main(String[] args) {
        int daily = 6;
        int semesterW = 17;
        int workdaysW = 5;
        int avgWorkH = 52;

       int totalCoding = daily * workdaysW * semesterW;

        double percentCoding = ((double) totalCoding / (avgWorkH * semesterW)) * 100;

        System.out.println("Total coding hours in the semester: " + totalCoding + " hours");
        System.out.println("Percentage of coding hours in the semester: " + percentCoding + "%");
    }
}
