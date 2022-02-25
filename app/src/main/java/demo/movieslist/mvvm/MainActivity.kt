package demo.movieslist.mvvm

import MainRepository
import MyViewModelFactory
import RetrofitService
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import demo.movieslist.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    private val adapter = MovieAdapter()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val retrofitService = RetrofitService.getInstance()
        val mainRepository = MainRepository(retrofitService)

        val myRecyclerView: RecyclerView = binding.recyclerview


        viewModel = ViewModelProvider(this, MyViewModelFactory(mainRepository))
            .get(MainViewModel::class.java)

//        viewModel.movieList.observe(this) {
//
//
//            adapter.setMovies(it)
//
////            binding.recyclerview.layoutManager = linearLayoutManager
//
//        }

        viewModel.movieList.observe(this) {

            adapter.setMovies(it)

            myRecyclerView.adapter = adapter

            myRecyclerView.layoutManager = GridLayoutManager(this, 2)
        }


        viewModel.errorMessage.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }

        viewModel.loading.observe(this, Observer {

            if (it) {

                binding.progressDialog.visibility = View.VISIBLE
            } else {

                binding.progressDialog.visibility = View.GONE


            }
        })

        viewModel.getAllMovies()

    }

}
