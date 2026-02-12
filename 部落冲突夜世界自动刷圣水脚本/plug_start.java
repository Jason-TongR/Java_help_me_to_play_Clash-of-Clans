import java.awt.*;                  //class "Robot" is inside it
import java.awt.event.KeyEvent;     //we need to use keyboard
import java.awt.event.InputEvent;   //we need to use mouse
import java.util.Random;            //we need to use random function

public class plug_start{
    private Robot robot;
    
    private Random random;
    
    private tools tool;
    
    public plug_start(){
        try{
            robot = new Robot();
            
            random = new Random();
            
            tool = new tools();
        }
        catch(AWTException e){
            System.out.println("fail to create robot");
        }
    }
    
    
    public void start(){
        int t = random.nextInt(10000);
        System.out.println("wait " + t  + "ms to start!");
        robot.delay( t );//this delay is to wait user to open the game.
        
        while(true){
            tool.press_release_W_tms(tool.generate_random_number_human_click());    //atack
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_E_tms(tool.generate_random_number_human_click());    //search
            
            robot.delay(tool.generate_random_human_wait());
            
            tool.press_release_W_tms(tool.generate_random_number_human_click());
            
            robot.delay(tool.generate_random_human_short());
            
            tool.move_click_release_mouse_left_tms( 300 , 450 , tool.generate_random_human_short() );
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_R_tms(tool.generate_random_number_human_click());    //quit the attack
            
            robot.delay(tool.generate_random_human_wait());
            
            tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_Y_tms(tool.generate_random_number_human_click());    //back to country
            
            robot.delay(tool.generate_random_human_wait());
            
            tool.press_release_Q_tms(tool.generate_random_number_human_click());    //open the water cart
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_U_tms(tool.generate_random_number_human_click());    //get the water
            
            robot.delay(tool.generate_random_human_short());
                
            tool.press_release_I_tms(tool.generate_random_number_human_click());    //quit the cart
            
            robot.delay(tool.generate_random_human_short());
        }
    }
}
