package com.test.testproject.presentation.mainscreen.fragments;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.test.testproject.data.Repository;
import com.test.testproject.presentation.base.BaseViewModel;
import com.test.testproject.presentation.model.RecordModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ProductsListViewModel extends BaseViewModel {

    private Repository repository;

    public ObservableList<RecordModel> recordModels = new ObservableArrayList<>();

    public ProductsListViewModel(Repository repository) {
        this.repository = repository;
        getRecords();
    }

    public void getRecords(){
        disposeOnClear(repository.getGoods()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(recordModel -> {
                    recordModels.clear();
                    recordModels.addAll(recordModel);}));
    }
}
