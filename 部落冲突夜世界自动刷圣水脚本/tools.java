import java.awt.*;                  //class "Robot" is inside it
import java.awt.event.KeyEvent;     //we need to use keyboard
import java.awt.event.InputEvent;   //we need to use mouse
import java.util.Random;            //we need to use random function

public class tools{
    
    private Robot robot;
    
    private Random random;
    
    public tools(){
        try{
            robot = new Robot();    //create a robot object
            
            random = new Random();  //create a random object
        }
        catch(AWTException e){
            System.out.println("fail to create the robot");
        }
    }
    
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_Q_tms(int t){
        robot.keyPress(KeyEvent.VK_Q);
        System.out.println("press Q successfuly");
        
        System.out.println("wait " + t + " ms to release Q");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_Q);
        System.out.println("Release Q successfully");
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_W_tms(int t){
        robot.keyPress(KeyEvent.VK_W);
        System.out.println("press W successfuly");
        
        System.out.println("wait " + t + " ms to release W");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_W);
        System.out.println("Release W successfully");
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_E_tms(int t){
        robot.keyPress(KeyEvent.VK_E);
        System.out.println("press E successfuly");
        
        System.out.println("wait " + t + " ms to release E");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_E);
        System.out.println("Release E successfully");
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
   public void press_release_R_tms(int t){
        robot.keyPress(KeyEvent.VK_R);
        System.out.println("press R successfuly");
        
        System.out.println("wait " + t + " ms to release R");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_R);
        System.out.println("Release R successfully");
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_T_tms(int t){
        robot.keyPress(KeyEvent.VK_T);
        System.out.println("press T successfuly");
        
        System.out.println("wait " + t + " ms to release T");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_T);
        System.out.println("Release T successfully");;
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_Y_tms(int t){
        robot.keyPress(KeyEvent.VK_Y);
        System.out.println("press Y successfuly");
        
        System.out.println("wait " + t + " ms to release Y");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_Y);
        System.out.println("Release Y successfully");
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_U_tms(int t){
        robot.keyPress(KeyEvent.VK_U);
        System.out.println("press U successfuly");
        
        System.out.println("wait " + t + " ms to release U");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_U);
        System.out.println("Release U successfully");
    }
    
    /*
     * this method is to press and release .  e.g. press  -> t -> release  (ms)
     */
    public void press_release_I_tms(int t){
        robot.keyPress(KeyEvent.VK_I);
        System.out.println("press I successfuly");
        
        System.out.println("wait " + t + " ms to release I");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_I);
        System.out.println("Release I successfully");
    }
    
    /*
     * this method is move to (x,y) click and release .  e.g. click  -> t -> release  (ms)
     */
    public void move_click_release_mouse_left_tms( int x , int y , int t ){
        robot.mouseMove( x , y );
        
        robot.delay(t/2);
        
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("mouse succesfully click in " + "( " + x + " , " + y + " )");
        
        System.out.println("wait " + t + " ms to relese the mouse(left key)");
        robot.delay(t);
        
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        System.out.println("Release the mouse(left key) successfully");
    }
    
    
    public int generate_random_number_human_click(){
        return (int)(( ( ( ( random.nextDouble()*100 ) % 31 ) * 0.01 ) + 0.2 )*1000);
    }
    
    public int generate_random_human_wait(){
        return (int)(( ( ( ( random.nextDouble()*100 ) % 10 ) * 0.01 ) + 0.4 )*10000);
    }
    
    public int generate_random_human_short(){
        return (int)(( ( ( ( random.nextDouble()*100 ) % 10 ) * 0.01 ) + 0.1 )*10000);
    }
}