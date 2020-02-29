package com.example.argohunt;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.argohunt.models.ArgoHunt;

public class ArgoHuntFragment extends Fragment
{
    private ArgoHunt mArgoHunt;

    public static ArgoHuntFragment newInstance()
    {
        return new ArgoHuntFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
}
