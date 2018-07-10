package ui;

import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.ControlBuilder;

import domain.UnModel;
import domain.Fixture;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<AlumnoViewModel> {

  public UnaView() {
    super(new AlumnoViewModel());
  }

  @Override
  public void createContents(Panel mainPanel) {
	  
	  Panel form = new Panel(mainPanel);
	  
	  this.setMinHeight(300);
	  this.setMinWidth(300);
	  this.setTitle("Lector de Notas");
	  	
	  
	  new Label(form).setText("Ingrese su nro. de legajo: ");
	  NumericField legajo = new NumericField(form);
	  legajo.alignRight();
	  legajo.bindValueToProperty("legajo");
	  
	  new Button(form).setCaption("Ingresar").onClick(this::ingresar);
	  
	  
	  new Button(form)
	  	.setCaption("Salir")
	  	.onClick(this::close);
	  
	  

  }

  public static void main(String[] args) {
	  Fixture.initialize();
	  new UnaView().startApplication();
  }
  
  public void ingresar() {
	  this.getModelObject().registrarLegajo();
	  this.abrirMenu();
  }
  
	public void abrirMenu() {
		Dialog<?> dialog = new MenuPrincipal(this, this.getModelObject());
		dialog.open();
		dialog.onAccept(() -> {});
	}

}
