package lesson20hwk;

public class Page {

	private String title;
	private String text;

	public Page() {
		this.title = "";
		this.text = "";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null) {
			throw new RuntimeException("Null pointer compare.");
		}
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text == null) {
			throw new RuntimeException("Null pointer compare.");
		}
		this.text = text;
	}

	public void adText(String textToAdd) {
		if (text == null) {
			throw new RuntimeException("Null pointer compare.");
		}
		this.text += textToAdd;
	}

	public void removeText() {
		this.text = "";
	}

	@Override
	public String toString() {
		return "The title of the page is: " + this.title + "\n" + "The text is: " + this.text;
	}

	public boolean containsDigit() {
		for (int i = 0; i < this.text.length(); i++) {
			if (Character.isDigit(this.text.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public boolean searchWord(String word) {
		if (word == null) {
			throw new RuntimeException("Null pointer.");
		}
		return this.text.contains(word);
	}
}
