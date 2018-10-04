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
	
	public void escribirDatos() {
		 this.getModelObject().guardarAlumnoEditado();
		 this.close();		
	}
	
	@Override
	public void createFormPanel(Panel mainPanel) {

		this.setTitle("Editar datos de alumno");
		
		Panel form = new Panel(mainPanel);

		form.setLayout(new ColumnLayout(2));

		new Label(form).setText("Apellido:");
		new TextBox(form).setWidth(250).bindValueToProperty("alumnoEditado.last_name");

		new Label(form).setText("Nombre:");
		new TextBox(form).setWidth(250).bindValueToProperty("alumnoEditado.first_name");

		new Label(form).setText("Legajo:");
		NumericField legajo = new NumericField(form);
		legajo.bindValueToProperty("alumnoEditado.code");

		new Label(form).setText("Usuario GitHub:");
		new TextBox(form).setWidth(250).bindValueToProperty("alumnoEditado.github_user");
		
		new Button(form).setCaption("Guardar").onClick(this::escribirDatos);
		new Button(form).setCaption("Cancelar").onClick(this::cancel);

	}
	
}
