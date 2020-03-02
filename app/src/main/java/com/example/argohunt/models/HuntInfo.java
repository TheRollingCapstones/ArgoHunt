package com.example.argohunt.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HuntInfo
{
    private static HuntInfo sHunt;
    private List<ArgoHunt> mHunts;

    public static HuntInfo get(Context context)
    {
        if(sHunt == null)
        {
            sHunt = new HuntInfo(context);
        }

        return sHunt;
    }

    private HuntInfo(Context context)
    {
        mHunts = new ArrayList<>();

    }

    public List<ArgoHunt> getmHunts()
    {
        return mHunts;
    }

    public ArgoHunt getHunt(UUID id)
    {
        for(ArgoHunt Hunt: mHunts)
        {
            if(Hunt.getmId().equals(id))
            {
                return Hunt;
            }
        }

        return null;
    }
}
