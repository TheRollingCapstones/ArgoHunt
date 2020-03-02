package com.example.argohunt;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.argohunt.models.ArgoHunt;

public class ArgoHuntFragment extends Fragment
{
    private ArgoHunt mArgoHunt;
    private Button mHunt_1;

    public static ArgoHuntFragment newInstance()
    {
        return new ArgoHuntFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_hunt, container,false);

        mHunt_1 = v.findViewById(R.id.hunt_1);

        return v;
    }
}
