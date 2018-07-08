package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import domain.UnModel;

public class EditarDatosWindow extends Dialog<UnViewModel> {
	
	
	  public EditarDatosWindow(WindowOwner owner) {
		    super(owner, new UnViewModel(new UnModel()));
		  }
	  
	  
	  @Override
	  public void createFormPanel(Panel pantallaEdicion) {
		  
		  new Button (pantallaEdicion).setCaption("Guardar");
		  new Button (pantallaEdicion).setCaption("Cancelar").onClick(this::close);
		  
	  }


}
