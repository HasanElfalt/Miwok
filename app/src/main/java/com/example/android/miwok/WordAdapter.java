package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by hassan on 10/03/18.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int backgroundColor ;

    public WordAdapter(Activity context , ArrayList<Word> Words, int color){

        super(context,0,Words);
        backgroundColor = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView ResourceId = (ImageView) listItemView.findViewById(R.id.Image);

        if(currentWord.hasImage()) {
            ResourceId.setImageResource(currentWord.getmImagResourceID());
            ResourceId.setVisibility(View.VISIBLE);
        }
        else{
            ResourceId.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),backgroundColor);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
