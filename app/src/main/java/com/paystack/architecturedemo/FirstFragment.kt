package com.paystack.architecturedemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.paystack.poscontract.Hardware
import com.paystack.poscontract.Processor
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(), Hardware.Callback, Processor.Callback {
lateinit var hardware: Hardware
    lateinit var processor: Processor
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        hardware = HardwareModule().getHardwareModule()
        processor = ProcessorModule().getProcessorModule()
        hardware.readCard(this)
    }

    override fun cardDetails(message: String) {
        textview_first.text = message
        processor.doTransaction(this)
    }

    override fun transactionDetails(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }
}
