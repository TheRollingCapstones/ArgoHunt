package com.example.argohunt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.argohunt.models.ArgoHunt

class ArgoHuntFragment : Fragment()
{
    private val mArgoHunt: ArgoHunt? = null
    private var mHunt_1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_hunt, container, false)
        mHunt_1 = v.findViewById(R.id.hunt_1)
        return v
    }

    companion object {
        fun newInstance(): ArgoHuntFragment {
            return ArgoHuntFragment()
        }
    }
}