package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.Alumno;
import domain.AlumnosRepository;
import domain.UnModel;

public class MenuPrincipal extends Dialog<SeleccionAlumnoViewModel> {

	public MenuPrincipal(WindowOwner owner, SeleccionAlumnoViewModel unaView) {
		super(owner, unaView);
	}

	@Override
	public void createFormPanel(Panel menu) {

		this.setTitle("Menu");
	//	this.setMinHeight(300);
	//	this.setMinWidth(300);

		new Button(menu).setCaption("Ver Notas").onClick(this::abrirPantallaNotas);
		new Button(menu).setCaption("Actualizar datos").onClick(this::abrirPantallaEdicion);
		new Button(menu).setCaption("Salir").onClick(this::close);

	}

	public void abrirPantallaEdicion() {
		Alumno al = this.getModelObject().getAlumnoSeleccionado();
		this.getModelObject().setAlumnoSeleccionado(al);
		this.getModelObject().crearAlumnoParaEditado();
		Dialog<?> dialog = new EditarDatosWindow(this, this.getModelObject());
		dialog.open();
		dialog.onAccept(() -> {
		});
	}

	public void abrirPantallaNotas() {
		Dialog<?> dialog = new NotasWindow(this, this.getModelObject());
		dialog.open();
		dialog.onAccept(() -> {
		});
	}

}
