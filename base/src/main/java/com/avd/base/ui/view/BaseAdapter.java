package com.avd.base.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public abstract class BaseAdapter<T, VH extends BaseViewHolder<T>>
        extends RecyclerView.Adapter<VH> {

    private List<T> mElements = new ArrayList<>();

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(
                getItemLayoutId(), parent, false);

        return getViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.bind(mElements.get(position));
    }

    @Override
    public int getItemCount() {
        return mElements.size();
    }

    public void setElements(List<T> elements) {
        mElements = elements;
    }

    protected abstract int getItemLayoutId();

    protected abstract VH getViewHolder(View itemView);
}
