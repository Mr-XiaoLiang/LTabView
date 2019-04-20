package liang.lollipop.ltabview

import androidx.annotation.FloatRange


/**
 * @date: 2019/04/17 19:43
 * @author: lollipop
 * Tab的item
 */
interface LTabItem {

    val miniSize: Int

    /**
     * 0：收起
     * 1：展开
     * Item展开状态控制
     */
    fun schedule(@FloatRange(from=0.0,to=1.0) progress: Float)

    /**
     * 点击事件
     */
    fun onTabClick(listener: (LTabItem) -> Unit)

}