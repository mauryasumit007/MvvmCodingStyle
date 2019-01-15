package com.example.kamal.myapplication;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kamal.myapplication.ui.movielist.MovieListFragment;
/**
 * Created by kamal on 8/2/18.
 */
public class MovieList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_list_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MovieListFragment.newInstance())
                    .commitNow();
        }
    }
}
