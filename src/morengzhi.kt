/**
 * Created by  on .
 * --------------------------
 *  版   权 ：
 *
 *  作   者 ：X230
 *  文件名 ：
 *
 *  创建于：2016/11/15 22:46
 *  概  述:
 */

//JVM中如果主构造器所有的参数都有了默认值
// 编译器将会产生一个无参构造器 这个无参构造器会使用默认参数值来调用既有的构造器
//有些库（如：Jackson  JPA）会使用无参构造器来创建对象的实例  这样kotlin就能很好的协调了
class morengzhi constructor(val cus:String = "hahaha") {

    fun dom() = System.out.print("doooooo")


}