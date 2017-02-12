package lesson20hwk;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStarted;

	public ElectronicSecuredNotepad(String password) {
		super.createInstance(password);
	}

	@Override
	public void start() {
		this.isStarted = true;
	}

	@Override
	public void replaceTextToPageByIdx(String text, int index) {
		if (isStarted()) {
			super.replaceTextToPageByIdx(text, index);
		}
	}

	@Override
	public void addTextToPageByIdx(String text, int index) {
		if (isStarted()) {
			super.addTextToPageByIdx(text, index);
		}
	}

	@Override
	public void previewAllPages() {
		if (isStarted()) {
			super.previewAllPages();
		}
	}

	@Override
	public void removeTextOfPageByIdx(int index) {
		if (isStarted()) {
			super.removeTextOfPageByIdx(index);
		}
	}

	@Override
	public void stop() {
		this.isStarted = false;

	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

}
