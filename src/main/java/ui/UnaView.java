package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;

import domain.UnModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<UnViewModel> {

  public UnaView() {
    super(new UnViewModel(new UnModel()));
  }

  @Override
  public void createContents(Panel mainPanel) {
	  
	  this.setMinHeight(300);
	  this.setMinWidth(300);
	  this.setTitle("Lector de Notas");
	  
	  new Label(mainPanel).setText("Ingrese su nro. de legajo: ");
	  NumericField legajo = new NumericField(mainPanel);
	  legajo.alignLeft();
	  
	  new Button(mainPanel).setCaption("Ingresar").onClick(this::abrirMenu);
	  	  
	  new Button(mainPanel)
	  .setCaption("Salir")
	  .onClick(this::close);
	  
	  

  }

  public static void main(String[] args) {
    new UnaView().startApplication();
  }
  
	public void abrirMenu() {
		Dialog<?> dialog = new MenuPrincipal(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}

  
}
