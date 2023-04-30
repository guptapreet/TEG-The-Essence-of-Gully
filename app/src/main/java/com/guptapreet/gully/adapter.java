package com.guptapreet.gully;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.Viewholder> {

    private List<modelclass> userList;

    public adapter (List<modelclass>userList)
    {
        this.userList=userList;

    }
    @NonNull
    @Override
    public adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycleract,parent,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        int image=userList.get(position).getPic();
        Double text=userList.get(position).getFee();
        String text1=userList.get(position).getDescription();
        String text2=userList.get(position).getTitle();
        holder.setData(text2,image,text1,text);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public  class  Viewholder extends RecyclerView.ViewHolder {

        private TextView title ;
        private TextView fee;
        private ImageView pic;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            fee=itemView.findViewById(R.id.fee);
            pic=itemView.findViewById(R.id.pic);
        }

        public void setData(String text2,int image ,String text1,Double text) {


            pic.setImageResource(image);
            title.setText(text2);

        }
    }
}

