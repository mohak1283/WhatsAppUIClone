package com.example.manikgupta.whatsappuiclone;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatsFragmentAdapter extends RecyclerView.Adapter<ChatsFragmentAdapter.MyViewHolder> {

    private int mNumberOfItems;

    public ChatsFragmentAdapter(int numberOfItems) {
        super();
        mNumberOfItems = numberOfItems;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chats_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.circularImageView.setImageResource(R.drawable.image);
        holder.nameTextView.setText(R.string.nameTextView);
        holder.dateTextView.setText(R.string.dateTextView);
        holder.doubleTickImageView.setImageResource(R.drawable.double_tick);
        holder.messageTextView.setText(R.string.messageTextView);
    }

    @Override
    public int getItemCount() {
        return mNumberOfItems;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView circularImageView;
         TextView nameTextView;
         TextView dateTextView;
         ImageView doubleTickImageView;
         TextView messageTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            circularImageView = itemView.findViewById(R.id.circular_image);
            nameTextView = itemView.findViewById(R.id.name);
            dateTextView = itemView.findViewById(R.id.date);
            doubleTickImageView = itemView.findViewById(R.id.double_tick);
            messageTextView = itemView.findViewById(R.id.messageText);

        }






    }
}
