package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation2.databinding.FragmentFirstBinding
import com.example.navigation2.databinding.FragmentSecondBinding


class secondFragment : Fragment() {
    private var _b: FragmentSecondBinding? = null
    private val b get() = _b!!
    private val args: secondFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentSecondBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recogidaDeContador = args.myContador
        b.tvSafeSecond.text = recogidaDeContador.toString()

        b.btnBackSecond.setOnClickListener {



            view.findNavController().navigate(R.id.action_secondFragment_to_initFragment2)
        }
        b.btnNextSecond.setOnClickListener {




            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }
}