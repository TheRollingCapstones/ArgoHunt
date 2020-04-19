package com.example.argohunt.models

import android.content.Context
import java.util.*

class HuntInfo private constructor(context: Context)
{
    private val mHunts: List<ArgoHunt>

    fun getmHunts(): List<ArgoHunt>
    {
        return mHunts
    }

    fun getHunt(id: UUID): ArgoHunt?
    {
        for (Hunt in mHunts)
        {
            if (Hunt.getmId() == id)
            {
                return Hunt
            }
        }
        return null
    }

    companion object
    {
        private var sHunt: HuntInfo? = null
        operator fun get(context: Context): HuntInfo?
        {
            if (sHunt == null)
            {
                sHunt = HuntInfo(context)
            }
            return sHunt
        }
    }

    init
    {
        mHunts = ArrayList()
    }
}