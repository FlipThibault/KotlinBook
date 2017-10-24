package base

/**
 * Created by pthibau1 on 2017-10-17.
 */
interface DataProvider<out T> {
    fun getData() : T
}