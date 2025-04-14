class CommandLineException extends Exception {
    public CommandLineException(String message) {
        super(message);
    }
}

public class p4q1 {
    public static void main(String args[]) throws CommandLineException {
        int l;
        l=args.length;
        if(l!=2) {
            CommandLineException e=new CommandLineException("You should put exactly two arguments");
            throw e;
        } else {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
    }
}
