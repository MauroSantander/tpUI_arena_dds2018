package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;

import domain.Fixture;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class SeleccionAlumno extends MainWindow<SeleccionAlumnoViewModel> {

	private static final long serialVersionUID = 1L;

	public SeleccionAlumno() {
		super(new SeleccionAlumnoViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {

		Panel form = new Panel(mainPanel);

		//this.setMinHeight(300);
		//this.setMinWidth(300);
		this.setTitle("Lector de Notas");

		new Label(form).setText("Ingrese su token: ");
		TextBox token = new TextBox(form);
		//legajo.withFilter(new LegajoFilter()); //le damos formato de legajo
		token.bindValueToProperty("token"); //decia inputLegajo

		new Button(form).setCaption("Ingresar").onClick(this::ingresar);

		new Button(form).setCaption("Salir").onClick(this::close);

	}

	public static void main(String[] args) {
//		Fixture.initialize();
		new SeleccionAlumno().startApplication();
	}

	public void ingresar() {
		boolean registrado = this.getModelObject().registrarLegajo();
		if(registrado)
			this.abrirMenu();
		else
			new ErrorDialog(this, this.getModelObject(), "Legajo incorrecto").open();
	}

	public void abrirMenu() {
		Dialog<?> dialog = new MenuPrincipal(this, this.getModelObject());
		dialog.open();
		dialog.onAccept(() -> {
		});
	}

}
