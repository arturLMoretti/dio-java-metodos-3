package com.example;

public class SmartTV {
  private boolean ligada = false;
  private int canal = 1;
  private int volume = 25;

  public boolean isLigada() {
    return ligada;
  }

  public void setLigada(boolean ligada) {
    this.ligada = ligada;
  }

  public int getCanal() {
    return canal;
  }

  public void setCanal(int canal) {
    this.canal = canal;
  }

  public int getVolume() {
    return volume;
  }

  public void riseVolume() {
    this.volume++;
  }

  public void lowVolume() {
    this.volume--;
  }

  public void changeCanal(int canal) {
    this.canal = canal;
  }

  public void riseCanal() {
    this.canal++;
  }
  
  public void lowCanal() {
    this.canal--;
  }

}