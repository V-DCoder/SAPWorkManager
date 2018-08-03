package com.sap.workmanager.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    ViewDataBinding binding;

    public BaseViewHolder(View view) {
        super(view);
        this.binding = DataBindingUtil.bind(view);
    }
}
