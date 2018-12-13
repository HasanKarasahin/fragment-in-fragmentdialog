package com.example.hasan.fragment_in_fragmentdialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CustomFragmentDialog extends DialogFragment {

    public static final String TAG = "Dialog Fragment";

    TextView tvLabel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.custom_dialog_fragment, container, false);
        tvLabel = v.findViewById(R.id.tvLabel);

        tvLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Tiklandı", Toast.LENGTH_SHORT).show();
                getDialog().dismiss();
            }
        });

        return v;
    }
}
