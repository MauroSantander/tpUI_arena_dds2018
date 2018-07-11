package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.Tarea;
import domain.UnModel;

public class NotasWindow extends Dialog<UnViewModel> {

	public NotasWindow(WindowOwner owner) {
		super(owner, new UnViewModel(new UnModel()));
	}

	@Override
	public void createFormPanel(Panel pantallaNotas) {

		// new Label().setText(nombre Y apellido);

		this.setMinHeight(500);
		this.setMinWidth(500);

		Table<Tarea> notas = new Table<>(pantallaNotas, Tarea.class); // ver como darle el tamaño adecuado

		Column<Tarea> columnaTipo = new Column<Tarea>(notas);
		columnaTipo.setTitle("Tipo");

		Column<Tarea> columnaFecha = new Column<Tarea>(notas);
		columnaFecha.setTitle("Fecha");

		Column<Tarea> columnaCalificacion = new Column<Tarea>(notas);
		columnaCalificacion.setTitle("Calificacion");

		new Button(pantallaNotas).setCaption("Salir").onClick(this::close);

		notas.setHeight(400);
		notas.setWidth(400);

	}

}
