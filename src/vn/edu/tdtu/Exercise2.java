package vn.edu.tdtu;

public class Exercise2 {
        public static void main(String[] args) {
            int a[] = {12, 2, 24, 5, 6};
            ArrayOutput.print(a);
            int b[] = {2, 23, 4, 8, 12};
            ArrayOutput.print(b);
            int c[] = ArrayHandler.merge(a, b);
            ArrayOutput.print(c);
            ArrayHandler.sort(c);
            ArrayOutput.print(c);
            ArrayOutput.write(c, "output.txt");
        }
}
