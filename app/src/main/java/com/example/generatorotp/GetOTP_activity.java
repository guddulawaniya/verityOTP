package com.example.generatorotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.generatorotp.databinding.ActivityGetOtpBinding;

public class GetOTP_activity extends AppCompatActivity {

    ActivityGetOtpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityGetOtpBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.progressBar.setVisibility(View.GONE);



        binding.getOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.progressBar.setVisibility(View.VISIBLE);
                binding.getOTP.setVisibility(View.GONE);
                if(!binding.inputnumber.getText().toString().trim().isEmpty())
                {

                    if(binding.inputnumber.getText().toString().trim().length()==10)
                    {
                        Intent intent = new Intent(GetOTP_activity.this,verifyOTP.class);
                        intent.putExtra("mobile",binding.inputnumber.getText().toString());
                        startActivity(intent);
                        finish();



                    }
                    else {

                        Toast.makeText(GetOTP_activity.this, "Enter Correct Number", Toast.LENGTH_SHORT).show();

                    }

                }
                else
                {
                    Toast.makeText(GetOTP_activity.this, "Please Enter the Number", Toast.LENGTH_SHORT).show();
                }


                binding.progressBar.setVisibility(View.GONE);
                binding.getOTP.setVisibility(View.VISIBLE);
            }
        });
    }
}