package Practice;

public class EncryptionOfMessage {
	public static void main(String args[]) {
		Encryption obj = new Encryption();
		System.out.println(obj.decodeMessage("oriGinal MessAge"));
		System.out.println(obj.encodeMessage("QWRT cvbN MnKL"));
	}
}

class Encryption {
	public String decodeMessage(String message) {
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u') {
				if (i == 0) {
					message = message.substring(i + 1);
				} else if (i == 1) {
					message = message.charAt(0) + message.substring(i + 1);
				} else {
					message = message.substring(0, i) + message.substring(i + 1);
				}
			}
		}
		return message;
	}

	public String encodeMessage(String message) {
		return null;
	}
}