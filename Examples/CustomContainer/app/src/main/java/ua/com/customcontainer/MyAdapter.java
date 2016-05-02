package ua.com.customcontainer;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wwwmu on 24.01.2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private Entity[] entities;

    public MyAdapter(Entity[] entities){
        this.entities = entities;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_element_of_list, null);

        MyHolder holder = new MyHolder(itemView,entities);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

                holder.textView.setText(entities[position].getTitle());

    }


    @Override
    public int getItemCount() {
        return entities.length;
    }
}


class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView textView;
    AppCompatButton addbutton, minusbutton;
    Entity[] entities;

    public MyHolder(View itemView, Entity[] entities) {
        super(itemView);
        itemView.setOnClickListener(this);
        this.entities = entities;
        textView = (TextView) itemView.findViewById(R.id.item_title);
        addbutton = (AppCompatButton) itemView.findViewById(R.id.addbtn);
        minusbutton = (AppCompatButton) itemView.findViewById(R.id.minusbtn);

        minusbutton.setOnClickListener(this);
        addbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.addbtn:
                addmethod();
                break;

            case R.id.minusbtn:
                minusmethod();
                break;
        }

    }

    private void minusmethod() {

        int count = entities[getAdapterPosition()].getCount();
        count--;
        entities[getAdapterPosition()].setCount(count);
        if (count == 0) {
            minusbutton.setEnabled(false);
            minusbutton.setVisibility(View.INVISIBLE);
            addbutton.setText("+");
        }
        else{
            addbutton.setText(String.valueOf(count));
            }
    }

    private void addmethod() {
        int count = entities[getAdapterPosition()].getCount();

        if (count == 0) {
            minusbutton.setEnabled(true);
            minusbutton.setVisibility(View.VISIBLE);
        }
        count++;
        entities[getAdapterPosition()].setCount(count);
        addbutton.setText(String.valueOf(count));
    }
    };




