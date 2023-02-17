public class Exercise1 {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Invalid expression");
            return ;
        };
        double a = Double.parseDouble(args[0]);
        String opera = args[1];
        double b = Double.parseDouble(args[2]);
        Double result = 0.0;
        switch(opera) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "x":
                result = a * b;
                System.out.println(result);
                break;
            case "/":
                result = a / b;
                System.out.println(result);
                break;
            case "^":
                result = Math.pow(a,b);
                System.out.println(result);
                break;
            default:
                System.out.println("Unsupported operator");
                return;
        }

    }


}
