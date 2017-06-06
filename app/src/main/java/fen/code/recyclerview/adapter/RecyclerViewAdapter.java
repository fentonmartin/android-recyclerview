package fen.code.recyclerview.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fen.code.recyclerview.R;
import fen.code.recyclerview.entity.ViewItem;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<ViewItem> tutorialItems;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ViewItem> news) {
        this.tutorialItems = news;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, null);
        return new RecyclerViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        try {
            holder.imageView.setImageResource(tutorialItems.get(position).getImage());
            holder.textView.setText(tutorialItems.get(position).getDescription());
        } catch (NullPointerException | Resources.NotFoundException ignored) {
        }
    }

    @Override
    public int getItemCount() {
        return tutorialItems.size();
    }


    class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        RecyclerViewHolder(View view) {
            super(view);

            textView = (TextView) view.findViewById(R.id.item_text);
            imageView = (ImageView) view.findViewById(R.id.item_image);
        }
    }

}
