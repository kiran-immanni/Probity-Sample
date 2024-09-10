package com.srijan.empmgmt.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.srijan.empmgmt.MainActivity;
import com.srijan.empmgmt.R;

import br.com.simplepass.loadingbutton.customViews.CircularProgressImageButton;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private CardView addEmpCard;
    private CardView disEmpCard;
    private CardView editEmpCard;
    private CardView settingsCard;
    private CardView showLove;
    private CircularProgressImageButton addButtCard;
    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        addEmpCard=root.findViewById(R.id.addCard);
        addButtCard=root.findViewById(R.id.addButt);
        disEmpCard=root.findViewById(R.id.displayEmpCard);
        editEmpCard=root.findViewById(R.id.editCard);
        settingsCard =root.findViewById(R.id.search_bar_card);
        showLove=root.findViewById(R.id.showLoveCard);

        addEmpCard.setOnClickListener(v -> {
            MainActivity.allAccessNav.navigate(R.id.addEmp);
        });

        disEmpCard.setOnClickListener(v -> {
            MainActivity.allAccessNav.navigate(R.id.displayEmp);
        });
        settingsCard.setOnClickListener(v -> {
            MainActivity.allAccessNav.navigate(R.id.settingsPageF);
        });
        editEmpCard.setOnClickListener(v -> {
            MainActivity.allAccessNav.navigate(R.id.displayEmp);

        });
        showLove.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://srivastavasrijan.github.io/"));
            startActivity(browserIntent);
        });
        return root;
    }
}
