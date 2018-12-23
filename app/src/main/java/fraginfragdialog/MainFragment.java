package fraginfragdialog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hasan.fragment_in_fragmentdialog.R;

public class MainFragment extends Fragment {


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
        dialog.callBack(new CustomFragmentDialog.OnInputSelected() {
            @Override
            public void sendInput(String input) {
                Toast.makeText(getContext(), ":" + input, Toast.LENGTH_SHORT).show();
            }
        });
        btOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Butona Basıldı", Toast.LENGTH_SHORT).show();
                if (dialog != null) {
                    dialog.show(getFragmentManager(), "dialogTag");
                } else {
                    Toast.makeText(getContext(), "Fatal Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return v;
    }
}
