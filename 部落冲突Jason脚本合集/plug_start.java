/**
 * NOTATION:
 * 1.this is the plugs class.
 * 2.in this class,each method is one plug.
 * 3.you can start using the plug by using the method that you want.
 */


import java.awt.*;                  //class "Robot" is inside it
import java.awt.event.KeyEvent;     //we need to use keyboard
import java.awt.event.InputEvent;   //we need to use mouse
import java.util.Random;            //we need to use random function

public class plug_start{
    private Robot robot;
    
    private Random random;
    
    private tools tool;
    
    private skill skill;
    
    public plug_start(){
        try{
            robot = new Robot();
            
            random = new Random();
            
            tool = new tools();
            
            skill = new skill();
        }
        catch(AWTException e){
            System.out.println("fail to create robot");
        }
    }
    
    
    /**
     *  在使用这个插件前，先对好按键
     *  parameter times 是你需要刷的次数
     */
    public void start_receving_water_night_countryside( int time ){
        assert time >=1 : "刷的次数必须大于等于1";
        
        int t = random.nextInt(10000);
        System.out.println("wait " + (3000 + t)  + "ms to start!");
        robot.delay( 3000+t );//this delay is to wait user to open the game.
        
        for(int i= 0 ; i < time ; i++){
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
                
            tool.press_release_Q_tms(tool.generate_random_number_human_click());    //quit the cart
            
            robot.delay(tool.generate_random_human_short());
        }
        
        System.out.println(time + " times over!!");
    }
    
    
    /**
     * 在使用这个插件前，务必先自己设置好全部哥布林配兵
     * parameter times 是你需要刷的次数
     */
    public void start_receving_water_money_day_countryside( int time ){
        assert time >=1 : "刷的次数必须大于等于1";
        
        
        int t = random.nextInt(10000);
        
        int time_release_all_GOBOLIN = 40000;   //40000ms
        System.out.println("wait " + (3000 + t)  + "ms to start!");
        robot.delay( 3000 + t );//this delay is to wait user to open the game.
        
        
        for(int i = 0 ; i < time ; i++){
            tool.press_release_W_tms(tool.generate_random_number_human_click());    //attack
        
            robot.delay(tool.generate_random_human_short());
        
            tool.press_release_R_tms(tool.generate_random_number_human_click());    //search fish
        
            robot.delay(tool.generate_random_human_short());
        
            tool.press_release_O_tms(tool.generate_random_number_human_click());    //begin
        
            robot.delay(tool.generate_random_human_wait());
                    
            tool.press_release_P_tms(tool.generate_random_number_human_click());    //choose the car
            
            tool.move_click_release_mouse_left_tms( 100 , 200 , tool.generate_random_number_human_click() );    //release the car
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_A_tms(tool.generate_random_number_human_click());    //choose the "tan tiao yao shui"
            
            skill.release_green_liqid();
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_W_tms(tool.generate_random_number_human_click());    //choose GOBOLIN
        
            tool.move_click_release_mouse_left_tms( 100 , 200 , time_release_all_GOBOLIN + random.nextInt(1000) );  // release all GOBOLIN . 40000 is enough,but we need add random to be safe.
        
            tool.press_release_R_tms(tool.generate_random_number_human_click());    //quit the attack
            
            robot.delay(tool.generate_random_human_wait());
            
            tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
            
            robot.delay(tool.generate_random_human_short());
                
            tool.press_release_Y_tms(tool.generate_random_number_human_click());    //back to country
            
            robot.delay(tool.generate_random_human_wait());
            
            tool.press_release_Q_tms(tool.generate_random_number_human_click());
            
            robot.delay(tool.generate_random_human_short());
        }
        
        System.out.println(time + " times over!!");
    }
}
