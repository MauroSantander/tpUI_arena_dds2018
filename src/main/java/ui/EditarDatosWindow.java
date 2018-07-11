package ui;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.Alumno;
import domain.UnModel;

public class EditarDatosWindow extends Dialog<SeleccionAlumnoViewModel> {

	public EditarDatosWindow(WindowOwner owner, SeleccionAlumnoViewModel unaView) {
		super(owner, unaView); // pasar el Alumno con el legajo q se pone al principio de la app
	}

	@Override
	public void createFormPanel(Panel mainPanel) {

		Panel form = new Panel(mainPanel);

		form.setLayout(new ColumnLayout(2));

		new Label(form).setText("Apellido:");
		new TextBox(form).setWidth(250).bindValueToProperty("alumnoSeleccionado.apellido");

		new Label(form).setText("Nombre:");
		new TextBox(form).setWidth(250).bindValueToProperty("alumnoSeleccionado.nombre");

		new Label(form).setText("Legajo:");
		NumericField legajo = new NumericField(form);
		legajo.bindValueToProperty("alumnoSeleccionado.legajo");

		new Label(form).setText("Usuario GitHub:");
		new TextBox(form).setWidth(250).bindValueToProperty("alumnoSeleccionado.usuarioGitHub");

		new Button(form).setCaption("Guardar").onClick(this::accept);
		new Button(form).setCaption("Cancelar").onClick(this::close);

	}

}
