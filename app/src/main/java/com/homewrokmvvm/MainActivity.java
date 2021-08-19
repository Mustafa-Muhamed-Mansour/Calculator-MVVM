package com.homewrokmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.homewrokmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{

    CalculatorViewModel calculatorViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        calculatorViewModel = new ViewModelProvider(this).get(CalculatorViewModel.class);

        binding.btnPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorViewModel.getPlusResult();
            }
        });

        calculatorViewModel.mutableLiveDataPlus.observe(this, new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                binding.txtPlusResult.setText(integer + "");
            }
        });

        binding.btnMulti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorViewModel.getMultiplicationResult();
            }
        });

        calculatorViewModel.mutableLiveDataMultiplication.observe(this, new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                binding.txtMultiplicationResult.setText(integer + "");
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculatorViewModel.getDivisionResult();
            }
        });

        calculatorViewModel.mutableLiveDataDivision.observe(this, new Observer<Integer>()
        {
            @Override
            public void onChanged(Integer integer)
            {
                binding.txtDivisionResult.setText(integer + "");
            }
        });
    }
}