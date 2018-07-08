package ui;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import domain.UnModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<UnViewModel> {

  public UnaView() {
    super(new UnViewModel(new UnModel()));
  }

  @Override
  public void createContents(Panel mainPanel) {
  }

  public static void main(String[] args) {
    new UnaView().startApplication();
  }
}
