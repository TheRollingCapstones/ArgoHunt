package com.example.argohunt

import androidx.fragment.app.Fragment


class MainActivity : SingleFragmentActivity()
{

    override fun createFragment(): Fragment?
    {
        return ArgoHuntFragment.newInstance()
    }
}
