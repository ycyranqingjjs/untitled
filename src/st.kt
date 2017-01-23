/**
 * Created by  on .
 * --------------------------
 *  版   权 ：
 *
 *  作   者 ：X230
 *  文件名 ：
 *
 *  创建于：2016/11/13 14:08
 *  概  述:
 */
open class st constructor(one:Int,two:Double){
    open var a:Int = 0

    private constructor(one: Int, two: Double,three:Int) : this(one,two){
        a = one
    }

    open fun getMin(a:Int, b:Double): Int {
        return if(a<b) a else b.toInt();
    }

    open fun getMax(a:Int,b:Double) = if(a>b) a else b
}