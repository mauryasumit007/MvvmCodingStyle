package com.example.kamal.myapplication.viewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.kamal.myapplication.model.MovieModel;
import com.example.kamal.myapplication.repository.MovieRepository;

/**
 * Created by kamal on 8/2/18.
 */

public class MovieListViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<MovieModel> data;
    private MovieRepository movieModel;

    public MovieListViewModel()
    {
        movieModel = new MovieRepository();
    }

    public void init() {
        if (this.data != null) {
            // ViewModel is created per Fragment so
            // we know the userId won't change
            return;
        }
        data = movieModel.getMovies();
    }

    public MutableLiveData<MovieModel> getMovies() {
        return this.data;
    }
}
