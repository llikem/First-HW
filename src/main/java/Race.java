public class Race {
    static String leader;
    static int distance = 0;

    public static String getLeader(int speed, String name) {
        int currentDistance = speed * 24;
        if (currentDistance > distance) {
            distance = currentDistance;
            leader = name;
        }
        return leader;
    }
}
