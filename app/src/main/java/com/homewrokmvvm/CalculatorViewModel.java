package com.homewrokmvvm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CalculatorViewModel extends ViewModel
{

    MutableLiveData<Integer> mutableLiveDataPlus = new MutableLiveData<>();
    MutableLiveData<Integer> mutableLiveDataMultiplication = new MutableLiveData<>();
    MutableLiveData<Integer> mutableLiveDataDivision = new MutableLiveData<>();

    private CalculatorModel dataBaseResult()
    {
        return new CalculatorModel(4, 2);
    }

    public void getPlusResult()
    {
        int plusRes = dataBaseResult().getNumberFour() + dataBaseResult().getNumberTwo();
        mutableLiveDataPlus.postValue(plusRes);
    }

    public void getMultiplicationResult()
    {
        int multiplicationRes = dataBaseResult().getNumberFour() * dataBaseResult().getNumberTwo();
        mutableLiveDataMultiplication.postValue(multiplicationRes);
    }

    public void getDivisionResult()
    {
        int divisionRes = dataBaseResult().getNumberFour() / dataBaseResult().getNumberTwo();
        mutableLiveDataDivision.postValue(divisionRes);
    }

}
