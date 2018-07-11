package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;

public class ErrorDialog extends Dialog<Object> {
	private static final long serialVersionUID = 1L;
	String msg;
	Action onClick;

	public ErrorDialog(WindowOwner owner, Object model, String msg) {
		this(owner, model, msg, () -> {
		});
	}

	public ErrorDialog(WindowOwner owner, Object model, String msg, Action onClick) {
		super(owner, model);
		this.msg = msg;
		this.onClick = onClick;
	}

	@Override
	protected void createFormPanel(Panel panel) {
		this.setTitle("Lector de Notas");
		new Label(panel).setText(msg);
		new Button(panel).setCaption("Aceptar").onClick(() -> {
			close();
			onClick.execute();
		});
	}

}
