package com.mustafakemal.feature2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mustafakemal.core.navigation.AppRoutes
import com.mustafakemal.feature2.databinding.Fragment2aBinding

/**
 * Created by Mustafa Kemal Özdemir on 11/29/2021.
 */
class Fragment2A: Fragment() {

    private lateinit var binding: Fragment2aBinding
    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = Fragment2aBinding.bind(view)

        with(binding) {
            buttonFragment2b.setOnClickListener {
                val argument = bundleOf("argument" to argumentEdittext.text.toString())
                navController.navigate(R.id.action_fragment2A_to_fragment2B, argument)
            }
        }
    }

}