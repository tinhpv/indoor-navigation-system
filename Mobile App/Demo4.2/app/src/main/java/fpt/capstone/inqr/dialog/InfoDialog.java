package fpt.capstone.inqr.dialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import fpt.capstone.inqr.R;

public class InfoDialog extends DialogFragment {

    private String buildingName, description;
    private TextView tvName, tvDes;
    private Button btClose;

    public InfoDialog(String buildingName, String description) {
        this.buildingName = buildingName;
        this.description = description;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogStyle);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_info_modified, container, false);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        tvName = view.findViewById(R.id.tvName);
        tvDes = view.findViewById(R.id.tvDes);
        btClose = view.findViewById(R.id.bt_close);

        tvName.setText(buildingName);
        tvDes.setText(description);
        btClose.setOnClickListener(v -> dismiss());

        return view;
    }
}
