package com.example.generatorotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.generatorotp.databinding.ActivityMainBinding;
import com.example.generatorotp.databinding.ActivityVerifyOtpBinding;

public class verifyOTP extends AppCompatActivity {
    ActivityVerifyOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityVerifyOtpBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.progressBar.setVisibility(View.GONE);

        binding.changeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(verifyOTP.this,GetOTP_activity.class);
                startActivity(intent);
                finish();
            }
        });


        binding.shownumber.setText(String.format("+91-"+getIntent().getStringExtra("mobile")+" Change number "));


        binding.verifyotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!binding.input1.getText().toString().trim().isEmpty() && !binding.input2.getText().toString().trim().isEmpty() &&
                        !binding.input3.getText().toString().trim().isEmpty()  && !binding.input4.getText().toString().trim().isEmpty() &&
                        !binding.input5.getText().toString().trim().isEmpty() && !binding.input6.getText().toString().trim().isEmpty() )
                {
                    Toast.makeText(verifyOTP.this, "OTP Verify ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(verifyOTP.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }
                else
                {
                    Toast.makeText(verifyOTP.this, "please Enter All number", Toast.LENGTH_SHORT).show();
                }

            }
        });
        numberotpmove();
    }

    private void numberotpmove() {

        binding.input1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty()){
                    binding.input2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.input2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty()){
                    binding.input3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.input3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty()){
                    binding.input4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.input4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty()){
                    binding.input5.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.input5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if (!s.toString().trim().isEmpty()){
                    binding.input6.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


}