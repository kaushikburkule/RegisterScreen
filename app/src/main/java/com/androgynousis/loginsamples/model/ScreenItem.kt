package `in`.pongo.basic.model

data class ScreenItem(var title : String, var description : String, var screenImg : Int){
    override fun toString(): String {
        return "ScreenItem(title='$title', description='$description', screenImg=$screenImg)"
    }
}