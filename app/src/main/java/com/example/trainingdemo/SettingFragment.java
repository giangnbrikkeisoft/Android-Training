package com.example.trainingdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SettingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settingfragment, container, false);

        List<Setting> settings = new ArrayList<Setting>();
        settings.add(new Setting(R.drawable.ico1, "My Profile"));
        settings.add(new Setting(R.drawable.ico2, "Message"));
        settings.add(new Setting(R.drawable.ico3, "Following"));
        settings.add(new Setting(R.drawable.ico4, "Albums"));
        settings.add(new Setting(R.drawable.ico5, "Saved Posts"));
        settings.add(new Setting(R.drawable.ico6, "Groups"));
        settings.add(new Setting(R.drawable.ico7, "Pages"));
        settings.add(new Setting(R.drawable.ico8, "Blogs"));
        settings.add(new Setting(R.drawable.ico9, "Marketplace"));
        settings.add(new Setting(R.drawable.ico10, "Events"));

        SettingAdapter adapter = new SettingAdapter(getActivity(),settings);

        ListView listView = (ListView) view.findViewById(R.id.setting_list);
        listView.setAdapter(adapter);

        return view;
    }
}
