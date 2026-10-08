// Участие в предметной олимпиаде
class Olympiad {
    private String subject;
    private String level;
    private int place;

    public Olympiad(String subject, String level, int place) {
        this.subject = subject;
        this.level = level;
        this.place = place;
    }

    public String getLevel() {
        return level;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return subject + " (" + level + ") - " + (place == 0 ? "участие" : place + " место");
    }
}
