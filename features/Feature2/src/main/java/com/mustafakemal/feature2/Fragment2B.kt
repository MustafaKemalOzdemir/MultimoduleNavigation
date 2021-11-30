package com.mustafakemal.feature2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mustafakemal.feature2.databinding.Fragment2bBinding

/**
 * Created by Mustafa Kemal Özdemir on 11/29/2021.
 */
class Fragment2B: Fragment() {

    private lateinit var binding: Fragment2bBinding
    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = Fragment2bBinding.bind(view)

        with(binding) {
            arguments?.getString("argument")?.let { argument ->
                if(argument.isNotBlank()) {
                    pageArgument.text = argument
                }
            }
            buttonGoBack.setOnClickListener {
                navController.popBackStack()
            }
        }
    }

}