package lesson20hwk;

public class NotepadDemo {

	public static void main(String[] args) {

		Page contract = new Page();
		contract.adText("Dear,candidate, you are the right one 4 our company.");
		contract.setTitle("Contract_Java_Dev");

		// System.out.println(contract.searchWord("are"));
		// System.out.println(contract.searchWord("alabala"));
		// System.out.println(contract.searchWord("Dear"));
		// System.out.println(contract.searchWord("dear"));

		System.out.println(contract.containsDigit());
		contract.removeText();

		SimpleNotepad sNotePad = new SimpleNotepad();
		sNotePad.addTextToPageByIdx("You are so clever and skillfull ", 1);
		sNotePad.addTextToPageByIdx("You are so clever and skillfull 2", 5);
		sNotePad.addTextToPageByIdx("You are so clever and skillfull 3", 7);
		sNotePad.addTextToPageByIdx("You are so clever and skillfull ", 3);
		// sNotePad.printAllPagesWithDigits();

		// sNotePad.previewAllPages();
		//
		// sNotePad.replaceTextToPageByIdx("You are very responsible", 7);
		// sNotePad.previewAllPages();
		// sNotePad.replaceTextToPageByIdx("You are cool", 6);
		// sNotePad.previewAllPages();
		// sNotePad.removeTextOfPageByIdx(6);
		// sNotePad.previewAllPages();

		// SecuredNotepad secNotePad = new SecuredNotepad(10, "Ahi");
		// secNotePad.addTextToPageByIdx("You are so clever and skillfull", 1);
		// secNotePad.addTextToPageByIdx("You are so clever and skillfull", 5);
		// secNotePad.addTextToPageByIdx("You are so clever and skillfull", 7);
		// secNotePad.previewAllPages();
		//
		// secNotePad.replaceTextToPageByIdx("You are very responsible", 7);
		// secNotePad.previewAllPages();
		// secNotePad.replaceTextToPageByIdx("You are cool", 6);
		// secNotePad.previewAllPages();
		// secNotePad.removeTextOfPageByIdx(6);
		// secNotePad.previewAllPages();

		ElectronicSecuredNotepad escNotpade = new ElectronicSecuredNotepad("Alabala");

		System.out.println(escNotpade.validatePassword("asd"));
		System.out.println(escNotpade.validatePassword("asdfgh"));
		System.out.println(escNotpade.validatePassword("ASDFGH"));
		System.out.println(escNotpade.validatePassword("asdFg"));
		System.out.println(escNotpade.validatePassword("asdFg5"));

	}
}
