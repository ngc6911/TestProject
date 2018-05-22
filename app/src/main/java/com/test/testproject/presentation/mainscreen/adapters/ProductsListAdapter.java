package com.test.testproject.presentation.mainscreen.adapters;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.test.testproject.BR;
import com.test.testproject.R;
import com.test.testproject.databinding.ItemGoodsListBinding;
import com.test.testproject.presentation.model.RecordModel;

import java.util.List;

public class ProductsListAdapter extends RecyclerView.Adapter<ProductsListAdapter.Holder> {

    private List<RecordModel> recordModels;

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        ItemGoodsListBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.item_goods_list, parent, false);

        return new Holder(binding);
    }

    public void setRecordModels(List<RecordModel> recordModels) {
        this.recordModels = recordModels;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(recordModels.get(position));
    }

    @Override
    public int getItemCount() {
        return recordModels != null ? recordModels.size() : 0;
    }

    class Holder extends RecyclerView.ViewHolder {

        private ItemGoodsListBinding binding;

        public Holder(ItemGoodsListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(RecordModel recordModel){
            binding.setVariable(BR.record, recordModel);
            binding.executePendingBindings();
        }
    }
}
