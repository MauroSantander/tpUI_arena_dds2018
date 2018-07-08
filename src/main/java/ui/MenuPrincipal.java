package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.UnModel;

public class MenuPrincipal extends Dialog<UnViewModel>  {
	
	  public MenuPrincipal(WindowOwner owner) {
		    super(owner, new UnViewModel(new UnModel()));
		  }
	  
	  
	  @Override
	  public void createFormPanel(Panel menu) {
		  
		  new Button (menu).setCaption("Ver Notas");
		  new Button (menu).setCaption("Actualizar datos").onClick(this::abrirPantallaEdicion);
		  
	  }
	  
	  
		public void abrirPantallaEdicion() {
			Dialog<?> dialog = new EditarDatosWindow(this);
			dialog.open();
			dialog.onAccept(() -> {});
		}

}
