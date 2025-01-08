package Matrix;

public class StringBuilderPassing {
    public static void updateStringBuilder(StringBuilder sb) {
        sb.append(" - Updated");
        System.out.println("Inside updateStringBuilder method: " + sb);
    }

    public static void displayStringBuilder(StringBuilder sb) {
        System.out.println("StringBuilder value: " + sb);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Original Value");
        displayStringBuilder(sb);
        updateStringBuilder(sb);
        displayStringBuilder(sb);  // StringBuilder is modified
    }
}

