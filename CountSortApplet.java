import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;


public class CountSortApplet extends Applet{
  CommandListener controls;
  MainForm main_form;

  public void init(){
  setLayout(new BorderLayout());
  main_form = new MainForm();
  add("Center", main_form);
  add("South", controls = new CommandListener(main_form));
  main_form.initialization();
}

public void start() {
  controls.setEnabled(true);
  controls.start();
}

public static void main(String args[]) {
  Frame f = new Frame("         Count_Sort       ");
  CountSortApplet cs_applet = new CountSortApplet();

  cs_applet.init();
  cs_applet.start();

  f.add("Center", cs_applet);
  f.setSize(300, 200);
  f.show();
}
}
