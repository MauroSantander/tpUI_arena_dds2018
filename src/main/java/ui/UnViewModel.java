package ui;

import org.uqbar.commons.model.annotations.Observable;

import domain.UnModel;

@Observable
public class UnViewModel {

  private UnModel unModel;

  public UnViewModel(UnModel unModel) {
    this.unModel = unModel;
  }

}
