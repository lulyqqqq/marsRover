public enum Direction {
    N("N"),
    E("E"),
    S("S"),
    W("W");

    private final String value;

    Direction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
