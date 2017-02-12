package lesson20hwk;

//В класа Demo да се демонстрира употребата на ElectronicSecuredNotepad. 

public class SecuredNotepadDemo {
	public static void main(String[] args) {

		SecuredNotepad scpNotepad2 = SecuredNotepad.createInstance("asd");
		ElectronicSecuredNotepadWrapper elScNtWrapper2 = 
				ElectronicSecuredNotepadWrapper.createInstance("asdF");
		
		SecuredNotepad scpNotepad = SecuredNotepad.createInstance("asdF4");
		ElectronicSecuredNotepadWrapper elScNtWrapper = 
				ElectronicSecuredNotepadWrapper.createInstance("asdF4");
		
		
		
		elScNtWrapper.previewAllPages();	
		elScNtWrapper.start();
	//	elScNtWrapper.previewAllPages();
		elScNtWrapper.stop();
		elScNtWrapper.previewAllPages();
		

	}
}
