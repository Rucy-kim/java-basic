package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS응 발송합니다: " + message);
    }
}
