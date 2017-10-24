package base

/**
 * Created by pthibau1 on 2017-10-18.
 *
 */
class BasicListInfoCellViewModel(val id: String, val text: String = "") : ListItemViewModel, Identifiable<String> {

    override fun getIdentifier(): String {
        return id
    }

}