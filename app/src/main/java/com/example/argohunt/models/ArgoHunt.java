package com.example.argohunt.models;

import java.util.Date;
import java.util.UUID;

public class ArgoHunt
{
    private UUID mId;
    private String mHuntTitle;
    private Date mDate;
    private boolean mLocationFound;

    public ArgoHunt()
    {
        this.mId = UUID.randomUUID();
        this.mDate = new Date();

    }

    public UUID getmId()
    {
        return mId;
    }

    public String getmHuntTitle()
    {
        return mHuntTitle;
    }

    public void setmHuntTitle(String mHuntTitle)
    {
        this.mHuntTitle = mHuntTitle;
    }

    public Date getmDate()
    {
        return mDate;
    }

    public void setmDate(Date mDate)
    {
        this.mDate = mDate;
    }

    public boolean ismLocationFound()
    {
        return mLocationFound;
    }

    public void setmLocationFound(boolean mLocationFound)
    {
        this.mLocationFound = mLocationFound;
    }
}
