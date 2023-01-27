package com.rd.myfamily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.rd.myfamily.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var adapter: MyFamilyAdapter
    lateinit var data:ArrayList<model>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        data= arrayListOf()

        data.add(model("Sumita"))
        data.add(model("Ravi"))
        data.add(model("Hetal"))
        data.add(model("Kajal"))
        data.add(model("Dipika"))
        data.add(model("Kamavali"))

        adapter= MyFamilyAdapter(data)

        binding.rec.layoutManager=LinearLayoutManager(requireContext())
        binding.rec.adapter=adapter




        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}