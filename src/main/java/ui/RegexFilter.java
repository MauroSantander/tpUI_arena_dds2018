package ui;

import org.uqbar.arena.filters.TextFilter;
import org.uqbar.arena.widgets.TextInputEvent;

public abstract class RegexFilter implements TextFilter {
	protected abstract String Regex();
	
	@Override
	public boolean accept(TextInputEvent input) {
		return input.getPotentialTextResult().matches(Regex());
	}
}
