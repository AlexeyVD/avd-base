package com.avd.base.ui.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item);
}
