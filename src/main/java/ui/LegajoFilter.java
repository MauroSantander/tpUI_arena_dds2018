package ui;

public class LegajoFilter extends RegexFilter {
	protected String Regex() {
		return "[0-9]{0,3}|[0-9]{3}\\.[0-9]{0,3}|[0-9]{3}\\.[0-9]{3}-[0-9]{0,1}|[0-9]{0,7}";
	};
}
