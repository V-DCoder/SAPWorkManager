package com.sap.workmanager.adapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sap.workmanager.databinding.OperationsFragmentBinding;
import com.sap.workmanager.model.Operation;

/**
 * Created by Varun Karhadkar on 05/08/2018.
 */

public class OperationsFragment extends Fragment {

    private Operation mOperation;

    public void setData(Operation operation) {
        this.mOperation = operation;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        OperationsFragmentBinding binding = OperationsFragmentBinding.inflate(inflater, container, false);
        binding.setOperation(mOperation);
        return binding.getRoot();

    }
}
