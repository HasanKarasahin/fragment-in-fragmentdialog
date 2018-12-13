package com.example.hasan.fragment_in_fragmentdialog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment extends Fragment implements CustomFragmentDialog.OnInputSelected {


    Button btOpenDialog;
    TextView tvResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        btOpenDialog = v.findViewById(R.id.btOpenDialog);
        tvResult = v.findViewById(R.id.tvResult);


        final CustomFragmentDialog dialog = new CustomFragmentDialog();
        btOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Butona Basıldı", Toast.LENGTH_SHORT).show();
                if (dialog != null) {
                    dialog.setTargetFragment(MainFragment.this, 1);
                    dialog.show(getFragmentManager(), "Hasan");
                } else {
                    Toast.makeText(getContext(), "Fatal Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return v;
    }

    @Override
    public void sendInput(String input) {
        Toast.makeText(getContext(), "Aldım : " + input, Toast.LENGTH_SHORT).show();
    }
}
