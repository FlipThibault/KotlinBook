package forecastlist

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.widget.AutoCompleteTextView
import com.flip.kotlinbook.R

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListView(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : ConstraintLayout(context, attrs, defStyle) {

    val forecastList: RecyclerView
    val forecastAutoComplete: AutoCompleteTextView

    init {
        inflate(context, R.layout.forecast_list_view, this)

        forecastList = findViewById(R.id.forecast_list)
        forecastAutoComplete = findViewById(R.id.forecast_autocomplete)
    }

}