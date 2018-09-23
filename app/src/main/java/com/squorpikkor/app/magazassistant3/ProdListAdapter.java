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

public class  ProdListAdapter extends ArrayAdapter<Prod> {

    private LayoutInflater inflater;
    private int layout;
    private List<Prod> ProdList;

    ProdListAdapter(Context context, int resource, List<Prod> sourceList) {
        super(context, resource, sourceList);
        this.ProdList = sourceList;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        @SuppressLint("ViewHolder")
        View view = inflater.inflate(this.layout, parent, false);

        TextView nameView = view.findViewById(R.id.prod_name);
        TextView priceView = view.findViewById(R.id.prod_price);
        TextView countView = view.findViewById(R.id.prod_count);

        Prod state = ProdList.get(position);

        nameView.setText(state.getProd_name());
        priceView.setText(String.valueOf(state.getProd_price()));
        countView.setText(String.valueOf(state.getProd_count()));

        return view;
    }
}
