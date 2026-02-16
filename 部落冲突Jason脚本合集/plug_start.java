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
    public void start_receving_source_day_countryside( int time ){
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
    
    
    /**
     * 在使用这个插件前，务必先自己设置好全部哥布林配兵
     * 这是主世界无限次刷资源的方法直到金幣和圣水滿
     */
    public void start_receving_source_day_countryside_infini_times_unti_jinbi_shengshui_full(){
        int t = random.nextInt(10000);
        
        int time_release_all_GOBOLIN = 40000;   //40000ms
        System.out.println("wait " + (3000 + t)  + "ms to start!");
        robot.delay( 3000 + t );//this delay is to wait user to open the game.
        
        boolean full = ( skill.distinguish_whether_jinbi_enough() && skill.distinguish_whether_shengshui_enough() );
        
        
        while(!full){
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
            
            full = ( skill.distinguish_whether_jinbi_enough() && skill.distinguish_whether_shengshui_enough() );
        }
    }
    
    /**
     * 这个方法可以刷满金币和圣水，然后自动帮你刷预设好的城墙阵型
     */
    public void start_receving_source_day_countryside_infini_times_unti_source_full_and_shuaqiang(){
        int t = random.nextInt(10000);
        
        int time_release_all_GOBOLIN = 40000;   //40000ms
        System.out.println("wait " + (3000 + t)  + "ms to start!");
        robot.delay( 3000 + t );//this delay is to wait user to open the game.
        
        boolean full = ( skill.distinguish_whether_jinbi_enough() && skill.distinguish_whether_shengshui_enough() );
        
        int shua_times = 0;
        
        while(shua_times < 14){
        
            while(!full){
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
            
                full = ( skill.distinguish_whether_jinbi_enough() && skill.distinguish_whether_shengshui_enough() );
            }
        
            if(shua_times == 0){
                //用金币刷第一排城墙

                tool.press_release_Z_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
            
                robot.delay(tool.generate_random_human_short());
            
                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
            
                robot.delay(tool.generate_random_human_short());
            
                tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                
                robot.delay(tool.generate_random_human_short());
            
                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
            
                robot.delay(tool.generate_random_human_short());
            
                shua_times++;
                
                //用圣水刷第二排城墙
                
                tool.press_release_X_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                robot.delay(tool.generate_random_human_short());
                
                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                
                robot.delay(tool.generate_random_human_short());
                    
                tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                    
                robot.delay(tool.generate_random_human_short());
                    
                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                    
                robot.delay(tool.generate_random_human_short());
                    
                shua_times++;
            }
            else{        
                    if(shua_times == 2){
                        //第一排
                        tool.press_release_C_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                        
                        robot.delay(tool.generate_random_human_short());
                        
                        tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                        
                        robot.delay(tool.generate_random_human_short());
                        
                        tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                        
                        robot.delay(tool.generate_random_human_short());
                        
                        tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                        
                        robot.delay(tool.generate_random_human_short());
                        
                        shua_times++;
                        //第二排
                        tool.press_release_V_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                        robot.delay(tool.generate_random_human_short());
                
                        tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                
                        robot.delay(tool.generate_random_human_short());
                    
                        tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                    
                        robot.delay(tool.generate_random_human_short());
                    
                        tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                    
                        robot.delay(tool.generate_random_human_short());
                    
                        shua_times++;
                    }
                    else{
                            if(shua_times == 4){
                                //第一排
                                tool.press_release_B_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                                
                                robot.delay(tool.generate_random_human_short());
                                
                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                
                                robot.delay(tool.generate_random_human_short());
                                
                                tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                                
                                robot.delay(tool.generate_random_human_short());
                                
                                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                
                                robot.delay(tool.generate_random_human_short());
                                
                                shua_times++;
                                //第二排
                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                                robot.delay(tool.generate_random_human_short());
                            
                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                            
                                robot.delay(tool.generate_random_human_short());
                                
                                tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                                
                                robot.delay(tool.generate_random_human_short());
                                
                                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                
                                robot.delay(tool.generate_random_human_short());
                                
                                shua_times++;
                            }
                            else{
                                    if(shua_times == 6){
                                        //第一排
                                        tool.press_release_M_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                                        
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                        
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                                        
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                        
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        shua_times++;
                                        //第二排
                                        tool.press_release_S_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                                        robot.delay(tool.generate_random_human_short());
                                    
                                        tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                    
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                                        
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                        
                                        robot.delay(tool.generate_random_human_short());
                                        
                                        shua_times++;
                                    }
                                    else{
                                            if(shua_times == 8){
                                                //第一排
                                                tool.press_release_D_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                                                
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                                
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                                                
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                                
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                shua_times++;
                                                //第二排
                                                tool.press_release_F_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                                                robot.delay(tool.generate_random_human_short());
                                            
                                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                            
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                                                
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                                
                                                robot.delay(tool.generate_random_human_short());
                                                
                                                shua_times++;
                                            }
                                            else{
                                                    if(shua_times == 10){
                                                        //第一排
                                                        tool.press_release_G_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                                                        
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                                        
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                                                        
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                                        
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        shua_times++;
                                                        //第二排
                                                        tool.press_release_H_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                                                        robot.delay(tool.generate_random_human_short());
                                                    
                                                        tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                                    
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                                                        
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                                        
                                                        robot.delay(tool.generate_random_human_short());
                                                        
                                                        shua_times++;
                                                    }
                                                    else{
                                                            if(shua_times == 12){
                                                                //第一排
                                                                tool.press_release_A_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                                                                
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                                                
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                tool.press_release_K_tms(tool.generate_random_number_human_click());    //shengji
                                                                
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                                                
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                shua_times++;
                                                                //第二排
                                                                tool.press_release_J_tms(tool.generate_random_number_human_click());    //choose the chengqiang.
                    
                                                                robot.delay(tool.generate_random_human_short());
                                                            
                                                                tool.press_release_N_tms(tool.generate_random_number_human_click());    //choose zhenghang.
                                                            
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                tool.press_release_Y_tms(tool.generate_random_number_human_click());    //shengji
                                                                
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                tool.press_release_T_tms(tool.generate_random_number_human_click());    //concern
                                                                
                                                                robot.delay(tool.generate_random_human_short());
                                                                
                                                                shua_times++;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
            
            
            full = ( skill.distinguish_whether_jinbi_enough() && skill.distinguish_whether_shengshui_enough() );
        }
        
        System.out.println("finish shuaqiang!");
    }
    
    /**
     * stiil NEED TO DO!!!
     */
    public void day_countryside_shuaqiang( int red , int green , int blue ){
        System.out.println("5s");
        robot.delay(5000);
        
        
        boolean found = skill.try_find_piexl( red , green , blue );
    
        if( !found ){
            System.out.println("we didn't find the chengqiang");
            return;
        }
        else{
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_Y_tms(tool.generate_random_number_human_click());
            
            robot.delay(tool.generate_random_human_short());
            
            tool.press_release_U_tms(tool.generate_random_number_human_click());
        }
    }
}
