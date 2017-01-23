/**
 * Created by  on .
 * --------------------------
 *  版   权 ：
 *
 *  作   者 ：X230
 *  文件名 ：
 *
 *  创建于：2016/11/15 23:05
 *  概  述:
 */
class cls4 : cls() ,crs {
    override fun dododod(a: Int, b: Int) {
        throw UnsupportedOperationException()

    }

    override fun getMax(a: Int, b: Int): Int {
        return super.getMax(a, b)

    }



    //父类或者几口里面都有这个方法  则需要用supper<**>调用
    override fun ct() {
        super<cls>.ct()
        super<crs>.ct()
    }

}