package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.Calificacion;
import domain.Tarea;
import domain.UnModel;

public class NotasWindow extends Dialog<SeleccionAlumnoViewModel> {

	public NotasWindow(WindowOwner owner, SeleccionAlumnoViewModel model) {
		super(owner, model);
	}

	@Override
	public void createFormPanel(Panel pantallaNotas) {

		// new Label().setText(nombre Y apellido);

		this.setMinHeight(500);
		this.setMinWidth(500);

		Table<Calificacion> notas = new Table<Calificacion>(pantallaNotas, Calificacion.class); // ver como darle el tamaño adecuado

		Column<Calificacion> columnaTipo = new Column<Calificacion>(notas);
		columnaTipo.setTitle("Tarea");
		columnaTipo.setFixedSize(100);
		columnaTipo.bindContentsToProperty("tarea");

		Column<Calificacion> columnaNota = new Column<Calificacion>(notas);
		columnaNota.setTitle("Nota");
		columnaNota.setFixedSize(100);
		columnaNota.bindContentsToProperty("nota");
		
		
		new Button(pantallaNotas).setCaption("Salir").onClick(this::close);

		notas.setHeight(400);
		notas.setWidth(400);

		notas.bindItemsToProperty("calificaciones");
	}

}
