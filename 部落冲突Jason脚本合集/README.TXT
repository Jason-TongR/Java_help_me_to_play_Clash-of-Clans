------------------------------------------------------------------------
这是我制作的一个在部落冲突夜世界可以自动刷圣水+自动收取圣水的脚本。
------------------------------------------------------------------------

工程名：部落冲突脚本插件（jason 自制）
工程的目标：狂刷圣水，是为了得到六农而写的
版本或者日期：
如何启动这个工程：需要配合安卓模拟器的键位设定即可（可能要设置一下屏幕分辨率，或者改一下代码里的坐标，但是无关紧要）
作者：Jason
使用指南：设置好键位位置后，在plug_start类中执行相应的的方法即可


plug_start类中已有（可使用）：
1.start_receving_water_night_countryside( int time )                                               用于夜世界自动刷圣水+自动收取圣水，parameter是用户想刷取的次数（刷time个对手）
2.start_receving_water_money_day_countryside( int time )                                           用于主世界自动刷圣水，金币，黑油，  parameter是用户想刷取的次数（刷time个对手）
3.start_receving_water_money_day_countryside_infini_times_unti_jinbi_full_and_shuaqiang()          用于主世界自动刷满金币之后会自动把你刷墙（需要把城墙摆放到指定位置，可用但是很粗糙） //MAYBE STILL NEED TO DO STH !!!
4.start_receving_water_money_day_countryside_infini_times_unti_jinbi_full()                        用于主世界刷资源，刷资源直到金币仓库爆满停止（后续可以更新同时检测圣水，金币，黑油都爆满才停止）


最新的版本：2026.2.15 (也即 分手纪念日后的12天)
