import java.awt.Component;


    class NextThread extends Thread {
      public NextThread() {
    	  
      }

      public void run() {
        while (true) {

          boolean next = false;
		if (next) {
        	  MainForm main_form = null;
			main_form.MakeStep();
                if (main_form.state == 5) {
                  next = false;
                  Component buttonNext = null;
				buttonNext.setEnabled(false);
                }
          }
        }
      }
    }
