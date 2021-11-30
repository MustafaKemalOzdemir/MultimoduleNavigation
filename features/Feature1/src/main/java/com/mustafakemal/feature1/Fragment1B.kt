package com.mustafakemal.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mustafakemal.core.navigation.AppRoutes
import com.mustafakemal.feature1.databinding.Fragment1bBinding

/**
 * Created by Mustafa Kemal Özdemir on 11/28/2021.
 */
class Fragment1B: Fragment() {

    private lateinit var binding: Fragment1bBinding
    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = Fragment1bBinding.bind(view)

        with(binding) {
            buttonFeature2.setOnClickListener {
                navController.navigate(AppRoutes.Feature2.Entry)
            }
            buttonFragment2a.setOnClickListener {
                navController.navigate(AppRoutes.Feature2.Deeplink.FRAGMENT_2A)
            }
            buttonFragment2b.setOnClickListener {
                navController.navigate(AppRoutes.Feature2.Deeplink.FRAGMENT_2B)
            }
            buttonGoBack.setOnClickListener {
                navController.popBackStack()
            }
        }
    }

}