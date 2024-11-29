package com.example.instacook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.instacook.R;
import com.example.instacook.util.DataProvider;
import com.example.instacook.util.DataRecipe;

import java.util.ArrayList;
import java.util.List;

public class FeedFragment extends Fragment {

    public FeedFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_feed, container, false);



        /*int[] imagens = {R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02,
                R.drawable.img_carbonara02, R.drawable.img_feijoada01, R.drawable.img_macarrao_bolonhesa01, R.drawable.img_feijoada02};

        int[] likes = {285, 358, 1544, 25, 15772, 873, 8548, 548};*/

        List<DataRecipe> recipes = DataProvider.getRecipes();

        int[] imagens = new int[recipes.size()];
        int[] likes = new int[recipes.size()];

        for(int i = 0; i < recipes.size(); i++) {

            imagens[i] = recipes.get(i).image;
            likes[i] = recipes.get(i).likes;

        }

        LinearLayout linlayFeed = view.findViewById(R.id.linlay_feed);

        for (int i = 0; i < imagens.length; i++) {

            View itemView = inflater.inflate(R.layout.post_feed, linlayFeed, false);

            ImageView imgReceita = itemView.findViewById(R.id.img_receita_feed);
            TextView tvLikes = itemView.findViewById(R.id.tv_likes);

            imgReceita.setImageResource(imagens[i]);

            String likesText = likes[i] + " curtidas";
            tvLikes.setText(likesText);

            linlayFeed.addView(itemView);

        }

        return view;

    }

}
