public enum Direction {
    N("N"),
    E("E"),
    S("S"),
    W("W");

    private final String value;

    // 构造函数
    Direction(String value) {
        this.value = value;
    }

    // 获取字符串表示
    public String getValue() {
        return value;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return value;
    }
}
