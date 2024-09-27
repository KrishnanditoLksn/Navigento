package app.ditodev.nav

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import app.ditodev.nav.databinding.FragmentDetailCategoryBinding


class DetailCategoryFragment : Fragment() {
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name =DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val desc = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock
        binding.tvCategoryName.text = name
        binding.tvCategoryDescription.text = "Stock : $desc"

        binding.btnBackToHome.setOnClickListener {
            view.findNavController().navigate(R.id.action_detailCategoryFragment_to_homeFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}