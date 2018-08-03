package com.sap.workmanager.adapters;

import android.databinding.ObservableArrayList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class BaseAdapter<V> extends RecyclerView.Adapter<BaseViewHolder> {


    private final int layoutID;
    private final int bindingVariable;

    public BaseAdapter(int layoutID, int bindingVariable, ObservableArrayList<V> mList) {
        this.layoutID = layoutID;
        this.bindingVariable = bindingVariable;
        this.mList = mList;
    }


    private ObservableArrayList<V> mList;


    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new BaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(layoutID, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.binding.setVariable(bindingVariable, mList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


}
