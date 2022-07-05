package com.example.navigation2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.navigation2.databinding.FragmentInitBinding


class initFragment : Fragment() {
    private var _b: FragmentInitBinding? = null
    private val b get() = _b!!
    var cont = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentInitBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return b.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b.btnFragment1.setOnClickListener {
            val bundle = bundleOf("contador" to cont.toString()) //PARA PASAR DATOS SIN SAFE ARGS
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment, bundle)

        }
        b.btnFragment2.setOnClickListener {

            val action = initFragmentDirections.actionInitFragmentToSecondFragment(myName = "Marcos", myContador = cont) //PARA PASAR ARGUMENTOS CON SAFE ARGS
            view.findNavController().navigate(action)
        }
        b.tvContador.setOnClickListener{
            cont++
            b.tvContador.setText(cont.toString())

        }



    }
}
