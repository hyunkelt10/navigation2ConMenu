package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigation2.databinding.FragmentSecondBinding
import com.example.navigation2.databinding.FragmentThirdBinding


class thirdFragment : Fragment() {
    private var _b: FragmentThirdBinding? = null
    private val b get() = _b!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentThirdBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.btnBackThird.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFragment_to_initFragment)
        }

        b.btnNextThird.setOnClickListener {
            view.findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }
}
