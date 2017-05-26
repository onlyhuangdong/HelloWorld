package com.example.administrator.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.bt1)
    Button bt1;

    private String imageUrl = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
    private OkHttpClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        client = new OkHttpClient();
    }

    @OnClick(R.id.bt1)
    public void onViewClicked() {

    }
}
