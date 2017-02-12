package lesson20hwk;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;

	private SecuredNotepad(int size, String password) {
		super();
		this.password = password;
	}

	public static SecuredNotepad createInstance(String inputPassord) {
		if (validatePassword(inputPassord)) {
			return new SecuredNotepad(10, inputPassord);
		}
		return null;
	}

	public boolean validatePasword() {
		System.out.println("Enter pass");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input != null && (input.equals(this.password))) {
			return true;
		}
		System.out.println("Invalid password");
		return false;
	}

	@Override
	public void previewAllPages() {
		if (validatePasword()) {
			super.previewAllPages();
		}
	}

	@Override
	public void removeTextOfPageByIdx(int index) {
		if (validatePasword()) {
			super.removeTextOfPageByIdx(index);
		}
	}

	@Override
	public void addTextToPageByIdx(String text, int index) {
		if (validatePasword()) {
			super.addTextToPageByIdx(text, index);
		}
	}

	@Override
	public void replaceTextToPageByIdx(String text, int index) {
		if (validatePasword() == true) {
			super.replaceTextToPageByIdx(text, index);
		}
	}

	public static boolean validatePassword(String password) {
		if (password.length() < 5) {
			System.out.println("Too short password");
			return false;
		}
		boolean containsLowerCaseLetter = false;

		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				containsLowerCaseLetter = true;
				break;
			}
		}
		if (!containsLowerCaseLetter) {
			System.out.println("Password doesn't contain lower case letter");
			return false;
		}

		boolean containsUpperCaseLetter = false;

		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				containsUpperCaseLetter = true;
				break;
			}
		}
		if (!containsUpperCaseLetter) {
			System.out.println("Password doesn't contain upper case letter");
			return false;
		}

		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		System.out.println("Password doesn't contain digit");
		return false;
	}

}
