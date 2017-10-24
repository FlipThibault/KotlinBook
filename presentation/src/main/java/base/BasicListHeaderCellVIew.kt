package base

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.widget.TextView
import com.flip.kotlinbook.R

/**
 * Created by pthibau1 on 2017-10-19.
 */
class BasicListHeaderCellVIew(context: Context?, attrs: AttributeSet? = null, defStyle: Int = 0) : ConstraintLayout(context, attrs, defStyle) {

    val text : TextView?

    init {
        inflate(context, R.layout.basic_list_header_cell, this)

        text = findViewById(R.id.forcast_list_header_cell_text_view)
    }

}