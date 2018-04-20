package com.example.manikgupta.whatsappuiclone;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CallsFragmentAdapter extends RecyclerView.Adapter<CallsFragmentAdapter.MyViewHolder> {

    private int mNumberOfItems;

    public CallsFragmentAdapter(int numberOfItems) {
        super();
        mNumberOfItems = numberOfItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calls_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.circularImageView.setImageResource(R.drawable.someone);
        holder.someOnenameTextView.setText(R.string.someone);
        holder.missed_callImageView.setImageResource(R.drawable.missed_call);
        holder.phoneImageView.setImageResource(R.drawable.phone_icon);
        holder.date_timeTextView.setText(R.string.date_time);

    }

    @Override
    public int getItemCount() {
        return mNumberOfItems;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView circularImageView;
        TextView someOnenameTextView;
        ImageView missed_callImageView;
        ImageView phoneImageView;
        TextView date_timeTextView;


        public MyViewHolder(View itemView) {
            super(itemView);
            circularImageView = itemView.findViewById(R.id.circular_image);
            someOnenameTextView = itemView.findViewById(R.id.someOne_name);
            missed_callImageView = itemView.findViewById(R.id.missed_call);
            phoneImageView = itemView.findViewById(R.id.phone_icon);
            date_timeTextView = itemView.findViewById(R.id.date_time);
        }
    }



}
