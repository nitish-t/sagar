package com.app.roadzdriver.modules.PreviousRequests;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.roadzdriver.R;
import com.app.roadzdriver.model.TOrder;
import com.app.roadzdriver.recyclerview.ViewBinder;

import org.androidannotations.annotations.EView;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.ViewById;


@EView
public class PreviousRequestsListRow extends LinearLayout implements ViewBinder<Object>, View.OnClickListener {

    @SystemService
    LayoutInflater mLayoutInflater;

    @ViewById(R.id.tv_req)
    protected TextView tv_req;

    @ViewById(R.id.tv_name)
    protected TextView tv_name;

    @ViewById(R.id.tv_number)
    protected TextView tv_number;

    @ViewById(R.id.tv_breakdown_services)
    protected TextView tv_breakdown_services;

    @ViewById(R.id.tv_plate)
    protected TextView tv_plate;

    @ViewById(R.id.tv_car_model)
    protected TextView tv_car_model;


    Context context;
    TOrder object;
    int itemCount;


    public PreviousRequestsListRow(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        Init();
    }

    public PreviousRequestsListRow(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        Init();
    }

    private void Init() {
        this.setOnClickListener(this);
    }


    @Override
    public void bindViews(Object obj, int position, RecyclerView recyclerView) {
        this.object = (TOrder) obj;
        if (object == null) return;

        tv_req.setText(object.getId() + "");
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            itemCount = recyclerView.getAdapter().getItemCount();
        }

        if (object.getCustomer() != null) {
            tv_name.setText(object.getCustomer().getFullName());
            tv_number.setText(object.getCustomer().getMobile());
        } else {
            tv_name.setText("");
            tv_number.setText("");
        }

        if (object.getService() != null) {
            tv_breakdown_services.setText(object.getService().getTitle());
        } else {
            tv_breakdown_services.setText("");
        }

        if (object.getSubscription() != null && object.getSubscription().getCar() != null) {
            tv_plate.setText(object.getSubscription().getCar().getPlateNumber());
            tv_car_model.setText(object.getSubscription().getCar().getCarName());
        } else {
            tv_plate.setText("");
            tv_car_model.setText("");
        }
    }

    @Override
    public void onClick(View v) {

    }


}
