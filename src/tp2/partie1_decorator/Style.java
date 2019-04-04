package tp2.partie1_decorator;

public enum Style {
    ACCOLADES("{", "|", "}"),
    CHEVRONS("<", "/", ">"),
    PARENTHESES("(", ";", ")");

    private final String left;
    private final String sep;
    private final String right;

    Style(String left, String sep, String right) {
        this.right = right;
        this.left = left;
        this.sep = sep;
    }

    public String getLeft() { return left; }
    public String getSep() { return sep; }
    public String getRight() { return right; }
}
