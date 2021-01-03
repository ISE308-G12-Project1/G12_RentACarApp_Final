package ise308.polat.utku.g12rentacarapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import ise308.polat.utku.g12rentacarapp.MainActivity
import ise308.polat.utku.g12rentacarapp.R

class RentCarFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):
            View? {
        val view = inflater.inflate(R.layout.menu_rent_car, container, false)
        val btn: Button = view.findViewById(R.id.btn_rent)

        btn.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_rent -> {
                val callingActivity = activity as MainActivity
                val editTextCarModel = view?.findViewById<EditText>(R.id.et_rent_car_model)
                val searchedKey = editTextCarModel?.text.toString()
                callingActivity.rentCar(searchedKey)

            }
            else -> {
            }
        }
    }
}