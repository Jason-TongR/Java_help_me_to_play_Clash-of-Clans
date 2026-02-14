import java.awt.*;

public class skill{
    private tools tool;
    
    private Robot robot;
    
    
    public skill(){
        tool = new tools();
        try{    
        robot = new Robot();
        }
        catch(AWTException e){
            System.out.println("fails to create robot");
        }
    }
    
    public void release_green_liqid(){
        tool.move_click_release_mouse_left_tms( 300 , 500 , tool.generate_random_number_human_click() );   
        
        tool.generate_random_human_short();
        
        tool.move_click_release_mouse_left_tms( 800 , 200 , tool.generate_random_number_human_click() );
        
        tool.generate_random_human_short();
        
        tool.move_click_release_mouse_left_tms( 500 , 400 , tool.generate_random_number_human_click() );
        
        tool.generate_random_human_short();
        
        tool.move_click_release_mouse_left_tms( 600 , 300 , tool.generate_random_number_human_click() );
    }
    
    
    public boolean distinguish_whether_jinbi_enough(){
        Color jinbi_enough_piexl = robot.getPixelColor(1514,92);  //(1514,92) is the enough space.
        System.out.println(jinbi_enough_piexl.getRed());
        System.out.println(jinbi_enough_piexl.getGreen());
        System.out.println(jinbi_enough_piexl.getBlue());
        
        return ( tool.compare_color( jinbi_enough_piexl , 244 , 220 , 114 ) );
    }
    
    
    /**
     * still need TO DO !!!
     */
    public boolean try_find_piexl( int red , int green , int blue ){        //parameter are the color of th chengjiang you need to shua.
        for( int i = 200 ; i < 1920 ; i+=5 ){
            for( int j = 150 ; j < 950 ; j+=5 ){
                robot.mouseMove(i,j);
                Color pixel = robot.getPixelColor(i,j);
                if( tool.compare_color(pixel , red , green , blue) ){
                    tool.move_click_release_mouse_left_tms( i , j , tool.generate_random_number_human_click() );
                    System.out.println("found!");
                    return true;    //found!
                }
                else{
                    System.out.println( i+" " +j+ "is not correct");
                }
            }
        }
        
        return false;       // not found!
    }
}