package com.test.testproject.presentation.binders;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import com.test.testproject.presentation.mainscreen.adapters.ProductsListAdapter;
import com.test.testproject.presentation.model.RecordModel;

import java.util.List;

public class AdapterBinder {

    @BindingAdapter("binding:items")
    public static void setItems(RecyclerView listView, List<RecordModel> items) {
        ProductsListAdapter adapter = (ProductsListAdapter) listView.getAdapter();
        if (adapter != null)
        {
            adapter.setRecordModels(items);
        }
    }
}
