package com.squorpikkor.app.magazassistant3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class OrderListAdapter extends ArrayAdapter<Prod> {


    private LayoutInflater inflater;
    private int layout;
    private List<Prod> sourceList;

    OrderListAdapter(Context context, int resource, List<Prod> sourceList) {
        super(context, resource, sourceList);
        this.sourceList = sourceList;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View view = inflater.inflate(this.layout, parent, false);

        TextView nameView = view.findViewById(R.id.prod_name_view);
        TextView activityView = view.findViewById(R.id.prod_price);
        TextView elementView = view.findViewById(R.id.prod_count);

        Prod state = sourceList.get(position);

        nameView.setText(state.getProd_name());
        nameView.setText(String.valueOf(state.getProd_price()));
        nameView.setText(String.valueOf(state.getProd_count()));
//        activityView.setText(String.format("%.5f", state.getActivity()) + " кБк");
        //activityView.setText(String.valueOf(state.getActivity()));
//        elementView.setText(state.getElement());

        return view;
    }

}
