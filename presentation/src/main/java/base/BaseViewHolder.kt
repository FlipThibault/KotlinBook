package base

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by pthibau1 on 2017-10-19.
 */
abstract class BaseViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindData(data: T)
}