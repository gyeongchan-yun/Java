public class ExceptionTest {
    public void say(String nick){
        try {
            if ("fool".equals(nick)) {
                // return;
                throw new FoolException();
            }

            System.out.println("nick is " + nick);
        }catch(FoolException e) {
            System.err.println("FoolException happens");
        }
    }

    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        test.say("fool");
        test.say("genious");
    }
}