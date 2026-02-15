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
    
    public void press_release_O_tms(int t){
        robot.keyPress(KeyEvent.VK_O);
        System.out.println("press O successfuly");
        
        System.out.println("wait " + t + " ms to release O");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_O);
        System.out.println("Release O successfully");
    }
    
    public void press_release_P_tms(int t){
        robot.keyPress(KeyEvent.VK_P);
        System.out.println("press P successfuly");
        
        System.out.println("wait " + t + " ms to release P");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_P);
        System.out.println("Release P successfully");
    }
    
    public void press_release_A_tms(int t){
        robot.keyPress(KeyEvent.VK_A);
        System.out.println("press A successfuly");
        
        System.out.println("wait " + t + " ms to release A");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_A);
        System.out.println("Release A successfully");
    }
    
    public void press_release_S_tms(int t){
        robot.keyPress(KeyEvent.VK_S);
        System.out.println("press S successfuly");
        
        System.out.println("wait " + t + " ms to release S");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_S);
        System.out.println("Release S successfully");
    }
    
    public void press_release_D_tms(int t){
        robot.keyPress(KeyEvent.VK_D);
        System.out.println("press D successfuly");
        
        System.out.println("wait " + t + " ms to release D");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_D);
        System.out.println("Release D successfully");
    }
    
    public void press_release_F_tms(int t){
        robot.keyPress(KeyEvent.VK_F);
        System.out.println("press F successfuly");
        
        System.out.println("wait " + t + " ms to release F");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_F);
        System.out.println("Release F successfully");
    }
    
    public void press_release_G_tms(int t){
        robot.keyPress(KeyEvent.VK_G);
        System.out.println("press G successfuly");
        
        System.out.println("wait " + t + " ms to release G");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_G);
        System.out.println("Release G successfully");
    }
    
    public void press_release_H_tms(int t){
        robot.keyPress(KeyEvent.VK_H);
        System.out.println("press H successfuly");
        
        System.out.println("wait " + t + " ms to release H");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_H);
        System.out.println("Release H successfully");
    }
    
    public void press_release_J_tms(int t){
        robot.keyPress(KeyEvent.VK_J);
        System.out.println("press J successfuly");
        
        System.out.println("wait " + t + " ms to release J");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_J);
        System.out.println("Release J successfully");
    }
    
    public void press_release_Z_tms(int t){
        robot.keyPress(KeyEvent.VK_Z);
        System.out.println("press Z successfuly");
        
        System.out.println("wait " + t + " ms to release Z");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_Z);
        System.out.println("Release Z successfully");
    }
    
    public void press_release_X_tms(int t){
        robot.keyPress(KeyEvent.VK_X);
        System.out.println("press X successfuly");
        
        System.out.println("wait " + t + " ms to release X");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_X);
        System.out.println("Release X successfully");
    }
    
    public void press_release_C_tms(int t){
        robot.keyPress(KeyEvent.VK_C);
        System.out.println("press C successfuly");
        
        System.out.println("wait " + t + " ms to release C");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_C);
        System.out.println("Release C successfully");
    }
    
    public void press_release_V_tms(int t){
        robot.keyPress(KeyEvent.VK_V);
        System.out.println("press V successfuly");
        
        System.out.println("wait " + t + " ms to release V");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_V);
        System.out.println("Release V successfully");
    }
    
    public void press_release_B_tms(int t){
        robot.keyPress(KeyEvent.VK_B);
        System.out.println("press B successfuly");
        
        System.out.println("wait " + t + " ms to release B");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_B);
        System.out.println("Release B successfully");
    }
    
    public void press_release_N_tms(int t){
        robot.keyPress(KeyEvent.VK_N);
        System.out.println("press N successfuly");
        
        System.out.println("wait " + t + " ms to release N");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_N);
        System.out.println("Release N successfully");
    }
    
    public void press_release_M_tms(int t){
        robot.keyPress(KeyEvent.VK_M);
        System.out.println("press M successfuly");
        
        System.out.println("wait " + t + " ms to release M");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_M);
        System.out.println("Release M successfully");
    }
    
    public void press_release_K_tms(int t){
        robot.keyPress(KeyEvent.VK_K);
        System.out.println("press K successfuly");
        
        System.out.println("wait " + t + " ms to release K");
        robot.delay(t);
        
        robot.keyRelease(KeyEvent.VK_K);
        System.out.println("Release K successfully");
    }
    
    /*
     * this method is move to (x,y) click and release .  e.g. click  -> t -> release  (ms)
     */
    public void move_click_release_mouse_left_tms( int x , int y , int t ){
        robot.mouseMove( x , y );
        
        robot.delay( generate_random_number_human_click() );
        
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
    
    public void get_Color_of_pixel( int x , int y ){
        assert x >= 0 && x <= 1920 : "basic on user screen";
        assert y >= 0 && y <= 1080 : "basic on user screen";
        Color pixelColor = robot.getPixelColor(x,y);
        System.out.println( "the color of " + "(" + x + "," + y + ") is:");
        System.out.println( "RED: " + pixelColor.getRed() );
        System.out.println( "GREEN: " + pixelColor.getGreen() );
        System.out.println( "BLUE: " + pixelColor.getBlue() );
    }
    
    public boolean compare_color( Color our_PixelColor , int aim_red , int aim_green , int aim_blue ){  //not exactly , is a range
        return ( ( our_PixelColor.getRed() >= aim_red - 5 && our_PixelColor.getRed() <= aim_red + 15 ) && ( our_PixelColor.getGreen() >= aim_green - 15 && our_PixelColor.getGreen() <= aim_green + 15 ) && ( our_PixelColor.getBlue() >= aim_blue - 15 && our_PixelColor.getBlue() <= aim_blue + 15 ) );
    } 
    
    public void get_current_mouse_coordinate_and_pixel(){
        while(true){
            PointerInfo pointerInfo = MouseInfo.getPointerInfo();
            
            Point point = pointerInfo.getLocation();
            
            get_Color_of_pixel(point.x , point.y);
            
        }
    }
}