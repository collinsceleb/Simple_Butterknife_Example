package com.example.collinsceleb.butterknifeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.lbl_title)
    TextView lblTitle;
    @BindView(R.id.input_name)
    EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btn_enter)
    public void onButtonClick(View view) {
        Toast.makeText(getApplicationContext(), "You have entered:" + inputName.getText().toString(), Toast.LENGTH_SHORT).show();
    }


}
