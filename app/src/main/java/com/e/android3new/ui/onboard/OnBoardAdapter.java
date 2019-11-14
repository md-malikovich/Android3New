package com.e.android3new.ui.onboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.e.android3new.R;
import com.e.android3new.data.entity.OnBoardEntity;
import java.util.ArrayList;

public class OnBoardAdapter extends PagerAdapter {

    private ArrayList<OnBoardEntity> resource;

    OnBoardAdapter(ArrayList<OnBoardEntity> resource) {
        this.resource = resource;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_view_pager, null);
        ImageView imageView = view.findViewById(R.id.imageView_pager);
        TextView textView = view.findViewById(R.id.textView_pager);

        imageView.setImageDrawable(container.getContext().getResources().getDrawable(resource.get(position).getImg()));
        textView.setText(resource.get(position).getTitle());

        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return resource.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return object == view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object view) {
        container.removeView((View) view);
    }
}
