package com.example.brain_traning_v2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalActivity extends Activity {

    private TextView tvTitle, tvResult, tvBestResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_layout);
        tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        tvBestResult = findViewById(R.id.tvBestResult);
        //принимаем
        Intent i = getIntent();
        String textResult = i.getStringExtra("number_res");
       //Выводим результат
        tvResult.setText(textResult);
    }
    public void onClickFinish(View view)
    {
        Intent i = new Intent(FinalActivity.this,StartActivity.class);
        startActivity(i);
    }
    private void setTvResult()
    {

    }
}