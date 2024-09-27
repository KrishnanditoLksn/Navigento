package app.ditodev.nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import app.ditodev.nav.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding :FragmentHomeBinding? = null
    private val binding  get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment2)
        )

        binding.btnProfile.setOnClickListener {
            view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity2)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}