class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return Math.abs(toSeconds(endTime)-toSeconds(startTime));
    }
    private int toSeconds(String time){
        String[] parts=time.split(":");
        int hours=Integer.parseInt(parts[0]);
        int min=Integer.parseInt(parts[1]);
        int sec=Integer.parseInt(parts[2]);
        return hours*3600+min*60+sec;
    }
}