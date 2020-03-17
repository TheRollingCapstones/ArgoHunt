package com.example.argohunt.models

import java.util.*

class ArgoHunt
{
    private val mId: UUID
    private var mHuntTitle: String? = null
    private var mDate: Date
    private var mLocationFound = false

    fun getmId(): UUID
    {
        return mId
    }

    fun getmHuntTitle(): String?
    {
        return mHuntTitle
    }

    fun setmHuntTitle(mHuntTitle: String?)
    {
        this.mHuntTitle = mHuntTitle
    }

    fun getmDate(): Date
    {
        return mDate
    }

    fun setmDate(mDate: Date)
    {
        this.mDate = mDate
    }

    fun ismLocationFound(): Boolean
    {
        return mLocationFound
    }

    fun setmLocationFound(mLocationFound: Boolean)
    {
        this.mLocationFound = mLocationFound
    }

    init
    {
        mId = UUID.randomUUID()
        mDate = Date()
    }
}