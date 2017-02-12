package lesson20hwk;

public class SimpleNotepad implements INotepad {

	protected Page listOfPages[] = {};
	protected int size = 100;

	public SimpleNotepad() {
		this.listOfPages = new Page[size];
		for (int i = 0; i < size; i++) {
			this.listOfPages[i] = new Page();
		}
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (validateInputsize(size)) {
			this.size = size;
		}
	}

	@Override
	public void addTextToPageByIdx(String text, int index) {
		if (!validateInputText(text)) {
			return;
		}
		if (validatePageIdx(index)) {
			this.listOfPages[index].adText(text);
		}
	}

	@Override
	public void replaceTextToPageByIdx(String text, int index) {
		if (validateInputText(text) && validatePageIdx(index)) {
			this.listOfPages[index].removeText();
			this.listOfPages[index].adText(text);
		}
	}

	private boolean validatePageIdx(int index) {
		if ((index < 0) || (index > this.listOfPages.length)) {
			System.out.println("Please enter a valid value for index");
			return false;
		}
		return true;
	}

	private boolean validateInputText(String text) {
		if (text == null) {
			System.out.println("Invalid value. Please enter a valid value for text");
			return false;
		}
		return true;
	}

	private boolean validateInputsize(int size) {
		if (size < 1) {
			System.out.println("Invalid value. Please enter a valid value for size");
			return false;
		}
		return true;
	}

	@Override
	public void removeTextOfPageByIdx(int index) {
		if (validatePageIdx(index) == true) {
			this.listOfPages[index].removeText();
		}
	}

	@Override
	public void previewAllPages() {
		for (int i = 0; i < this.listOfPages.length; i++) {
			System.out.println(listOfPages[i]);
		}
	}

	@Override
	public boolean searchWord(String word) {
		if (validateInputText(word)) {
			for (int i = 0; i < this.listOfPages.length; i++) {
				if (this.listOfPages[i].searchWord(word)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {

		for (int i = 0; i < this.listOfPages.length; i++) {
			if (this.listOfPages[i].containsDigit()) {
				System.out.println(this.listOfPages[i]);
			}
		}

	}
}
