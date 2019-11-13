@file:Suppress("unused")

package moe.aoramd.lookinglass.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * 方形 FrameLayout
 * <p>控件将根据宽高之间的较小值适配大小
 *
 * @constructor
 * 默认构造器
 *
 * @param context context
 * @param attrs 属性
 * @param defStyleAttr 默认主题属性
 */
class SquareFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val measureSpec =
            if (MeasureSpec.getSize(widthMeasureSpec) <= MeasureSpec.getSize(heightMeasureSpec))
                widthMeasureSpec
            else
                heightMeasureSpec
        super.onMeasure(measureSpec, measureSpec)
    }
}