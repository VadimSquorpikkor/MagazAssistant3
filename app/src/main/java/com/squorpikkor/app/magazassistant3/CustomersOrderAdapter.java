package com.squorpikkor.app.magazassistant3;


import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class  CustomersOrderAdapter extends ArrayAdapter<Customer> {

    private LayoutInflater inflater;
    private int layout;
    private List<Customer> sourceList;
    private OrderListAdapter orderListAdapter;
    private Context adapterContext;

    CustomersOrderAdapter(Context context, int resource, List<Customer> sourceList) {
        super(context, resource, sourceList);
        this.sourceList = sourceList;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
        adapterContext = context;

    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View view = inflater.inflate(this.layout, parent, false);

        TextView nameView = view.findViewById(R.id.customer_name);
        TextView activityView = view.findViewById(R.id.total_price);
        ListView elementView = view.findViewById(R.id.customers_order_list_view);

        Customer state = sourceList.get(position);

        nameView.setText(state.getCustomerName());
//        activityView.setText(String.format("%.5f" , state.getActivity()) + " кБк");
        activityView.setText(String.valueOf(state.totalPrice()));

        orderListAdapter = new OrderListAdapter(adapterContext, R.layout.customer_order_list_item, state.getProdsList());
        elementView.setAdapter(orderListAdapter); //
        // ;setText(state.getElement());

        return view;
    }
}
