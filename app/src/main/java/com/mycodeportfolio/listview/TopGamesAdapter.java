package com.mycodeportfolio.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopGamesAdapter extends ArrayAdapter<Game> {

    public TopGamesAdapter(Context context, ArrayList<Game> games){
        super(context, 0, games);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.game_item, parent, false);
        }
        Game currentGame = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentGame.getRank().toString());

        TextView gameName = listItemView.findViewById(R.id.game_name);
        gameName.setText(currentGame.getGameName());

        TextView category = listItemView.findViewById(R.id.category);
        category.setText(currentGame.getCategory());

        return listItemView;
    }





}
