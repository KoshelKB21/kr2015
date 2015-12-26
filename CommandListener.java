import java.awt.Button;
import java.awt.Component;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CommandListener extends Panel
                  implements ActionListener {

	MainForm main_form;

    private boolean next = false;
    private Thread nextThread = (Thread) new NextThread();

    Button buttonNext;
    Button buttonRestart;

    public CommandListener(MainForm main_form) {
        this.main_form = main_form;

        buttonNext = new Button("Ñëåäóþùèé øàã");
        buttonRestart = new Button("Ðåñòàðò");
     
        buttonNext.addActionListener(this);
        buttonRestart.addActionListener(this);
      

        buttonNext.setSize(50,20);

        add(buttonNext);
        add(buttonRestart);
      
    }

    public void start(){
      nextThread.start();
    }


    public void actionPerformed(ActionEvent ev) {
        Object source = ev.getSource();
       
        if (source == buttonNext){
        	main_form.MakeStep();
        }

        if (source == buttonRestart) {
          if (main_form.state == 5){
            buttonNext.setEnabled(true);
          }
          main_form.restart();
        }

      
        }

   }


   

