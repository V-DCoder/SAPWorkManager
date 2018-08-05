package com.sap.workmanager.adapters;

import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sap.workmanager.MainActivity;
import com.sap.workmanager.model.Sheet1;

public class BaseAdapter<V> extends RecyclerView.Adapter<BaseViewHolder> {


    private int layoutID;
    private int bindingVariable;
    private AppCompatActivity listner;
    private ObservableArrayList<V> mList;
    private int previousSelection = -1;


    public BaseAdapter(int layoutID, int bindingVariable, ObservableArrayList<V> mList, AppCompatActivity listener) {
        this.layoutID = layoutID;
        this.bindingVariable = bindingVariable;
        this.mList = mList;
        this.listner = listener;

    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new BaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(layoutID, parent, false));
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, int position) {
        holder.binding.setVariable(bindingVariable, mList.get(position));
        holder.binding.executePendingBindings();
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listner != null && listner instanceof MainActivity) {
                    if (previousSelection > -1) {
                        ((Sheet1) mList.get(previousSelection)).setSelected(false);
                        notifyItemChanged(previousSelection);
                    }

                    previousSelection = holder.getAdapterPosition();
                    Sheet1 sheet = (Sheet1) mList.get(holder.getAdapterPosition());
                    sheet.setSelected(true);
                    notifyItemChanged(holder.getAdapterPosition());
                    ((MainActivity) listner).onClick(sheet);
                }
            }
        });

    }

    public void onItemClick(Sheet1 sheet) {

    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


}
