package fraginfragdialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hasan.fragment_in_fragmentdialog.R;

public class CustomFragmentDialog extends DialogFragment {

    public interface OnInputSelected {
        void sendInput(String input);
    }

    public OnInputSelected mOnInputSelected;

    TextView tvLabel;

    public void callBack(OnInputSelected inputSelected) {
        this.mOnInputSelected = inputSelected;
    }

    @Override
    public View onCreateView(LayoutInflater i, ViewGroup c, Bundle s) {
        View v = i.inflate(R.layout.custom_dialog_fragment, null, false);
        tvLabel = v.findViewById(R.id.tvLabel);

        tvLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnInputSelected.sendInput("Msj");
                getDialog().dismiss();
            }
        });

        return v;
    }
}
