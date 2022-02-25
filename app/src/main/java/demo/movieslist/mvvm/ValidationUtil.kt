import android.util.Log
import demo.movieslist.mvvm.Movie

object ValidationUtil {
    fun validateMovie(movie: Movie): Boolean {
        Log.e("ValidationUtil", " validating movie")

        if (movie.name.isNotEmpty() && movie.category.isNotEmpty()) {
            return true
        }
        return false
    }
}