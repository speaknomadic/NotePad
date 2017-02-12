package lesson20hwk;

public class ElectronicSecuredNotepadWrapper implements IElectronicDevice {
	
	private SecuredNotepad scpNotepad;
	private boolean isStarted;
	
	private ElectronicSecuredNotepadWrapper(SecuredNotepad notepad)
	{	
		this.scpNotepad = notepad;
	}
	
	public static ElectronicSecuredNotepadWrapper createInstance(String password)
	{
		if(SecuredNotepad.validatePassword(password))
		{
			SecuredNotepad tmp = SecuredNotepad.createInstance(password);
			return new ElectronicSecuredNotepadWrapper(tmp);
		}
		return null;
	}
	

	public void replaceTextToPageByIdx(String text, int index) {
		if (isStarted()) {
			scpNotepad.replaceTextToPageByIdx(text, index);
		}
	}

	public void addTextToPageByIdx(String text, int index) {
		if (isStarted()) {
			scpNotepad.addTextToPageByIdx(text, index);
		}
	}

	public void previewAllPages() {
		if (isStarted()) {
			scpNotepad.previewAllPages();
		}
		else
		{
			System.out.println("Device is not powerd on");
		}
	}

	public void removeTextOfPageByIdx(int index) {
		if (isStarted()) {
			scpNotepad.removeTextOfPageByIdx(index);
		}
	}

	@Override
	public void start() {
		isStarted = true;

	}

	@Override
	public void stop() {
		this.isStarted = false;

	}

	@Override
	public boolean isStarted() {
		// TODO Auto-generated method stub
		return isStarted;
	}

}
