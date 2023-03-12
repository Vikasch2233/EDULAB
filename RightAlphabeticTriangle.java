public class RightAlphabeticTriangle {
    public static void main(String[] args) {
        int n = 5;  // number of rows
        
        for (int i = 0; i < n; i++) {
            char c = 'A';  // starting alphabet
            
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c++;  // move to the next alphabet
            }
            
            System.out.println();  // move to the next line
        }
    }
}
