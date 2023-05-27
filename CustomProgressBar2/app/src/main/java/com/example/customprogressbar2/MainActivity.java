package com.example.customprogressbar2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Pulse;
import com.github.ybq.android.spinkit.style.RotatingCircle;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.github.ybq.android.spinkit.style.WanderingCubes;
import com.github.ybq.android.spinkit.style.Wave;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar progressBar1=findViewById(R.id.progress_bar_1);
        ProgressBar progressBar2=findViewById(R.id.progress_bar_2);
        ProgressBar progressBar3=findViewById(R.id.progress_bar_3);
        ProgressBar progressBar4=findViewById(R.id.progress_bar_4);
        ProgressBar progressBar5=findViewById(R.id.progress_bar_5);
        ProgressBar progressBar6=findViewById(R.id.progress_bar_6);
        ProgressBar progressBar7=findViewById(R.id.progress_bar_7);
        ProgressBar progressBar8=findViewById(R.id.progress_bar_8);
        ProgressBar progressBar9=findViewById(R.id.progress_bar_9);
        ProgressBar progressBar10=findViewById(R.id.progress_bar_10);
        ProgressBar progressBar11=findViewById(R.id.progress_bar_11);
        ProgressBar progressBar12=findViewById(R.id.progress_bar_12);

        progressBar1.setIndeterminateDrawable(new RotatingPlane());
        progressBar2.setIndeterminateDrawable(new DoubleBounce());
        progressBar3.setIndeterminateDrawable(new Wave());
        progressBar4.setIndeterminateDrawable(new WanderingCubes());
        progressBar5.setIndeterminateDrawable(new Pulse());
        progressBar6.setIndeterminateDrawable(new ChasingDots());
        progressBar7.setIndeterminateDrawable(new ThreeBounce());
        progressBar8.setIndeterminateDrawable(new Circle());
        progressBar9.setIndeterminateDrawable(new CubeGrid());
        progressBar10.setIndeterminateDrawable(new FadingCircle());
        progressBar11.setIndeterminateDrawable(new FoldingCube());
        progressBar12.setIndeterminateDrawable(new RotatingCircle());
    }
}