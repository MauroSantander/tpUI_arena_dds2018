package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.Window;
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

		this.setTitle("Notas");

		// this.setMinHeight(400);
		// this.setMinWidth(400); comentado para que el tamaño de la ventana se ajuste a
		// la cantidad de columnas

		Table<Calificacion> notas = new Table<Calificacion>(pantallaNotas, Calificacion.class); // ver como darle el
																								// tamaño adecuado

		Column<Calificacion> columnaTipo = new Column<Calificacion>(notas);
		columnaTipo.setTitle("Tarea");
		columnaTipo.setFixedSize(200);
		columnaTipo.bindContentsToProperty("tarea");

		Column<Calificacion> columnaNota = new Column<Calificacion>(notas);
		columnaNota.setTitle("Nota");
		columnaNota.setFixedSize(200);
		columnaNota.bindContentsToProperty("nota");

		new Button(pantallaNotas).setCaption("Salir").onClick(this::close);

		notas.bindItemsToProperty("calificaciones");
	}

}
