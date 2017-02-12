package lesson20hwk;

public interface INotepad {

	void addTextToPageByIdx(String text, int index);

	void replaceTextToPageByIdx(String text, int index);

	void removeTextOfPageByIdx(int index);

	void previewAllPages();
	
	boolean searchWord(String word);
	
	void printAllPagesWithDigits();
}
