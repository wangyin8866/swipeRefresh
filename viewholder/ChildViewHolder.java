package com.sljr.sl.happybank.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sljr.sl.happybank.R;


public class ChildViewHolder extends BaseViewHolder {

    public TextView text;
    public ImageView image;

    public ChildViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.text);
        image = (ImageView) itemView.findViewById(R.id.image);
    }

    public void bindView(String str, int position) {
        text.setText(str);
    }

}
