public class skill{
    private tools tool;
    
    
    public skill(){
            tool = new tools();
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
}