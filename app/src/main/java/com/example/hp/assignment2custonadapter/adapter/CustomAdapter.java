package com.example.hp.assignment2custonadapter.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.hp.assignment2custonadapter.R;
import com.example.hp.assignment2custonadapter.model.MyContacts;
import com.example.hp.assignment2custonadapter.model.User;

import java.util.List;

/**
 * Created by hp on 10/2/2017.
 */

public class CustomAdapter  extends ArrayAdapter<MyContacts> {

    class ViewHolder {
        TextView tvUsername;
        TextView tvRollNumber;
    }

    private static final String TAG = "MTAG";

    public CustomAdapter(@NonNull Context context, @NonNull List<MyContacts> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "convertview : " + convertView);
        View view = convertView;
        ViewHolder vh;
        MyContacts contact = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.my_custom_row, parent, false);

            TextView tvUsername = (TextView) view.findViewById(R.id.txt_name);
            TextView tvRollNumber = (TextView) view.findViewById(R.id.txt_phone);

            vh = new ViewHolder();
            vh.tvUsername = tvUsername;
            vh.tvRollNumber = tvRollNumber;
            view.setTag(vh);
        }

        vh = (ViewHolder) view.getTag();

        vh.tvUsername.setText(contact.getName());
        vh.tvRollNumber.setText(contact.getPhone());


        return view;

    }
}