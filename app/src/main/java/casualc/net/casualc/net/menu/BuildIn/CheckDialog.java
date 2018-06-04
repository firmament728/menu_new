package casualc.net.menu.BuildIn;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import casualc.net.menu.R;

public class CheckDialog extends AppCompatDialogFragment {
    private EditText editTextUrl;
    private EditText editTextId;
    private ExampleDialogListener listener;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_base,null);
        builder.setView(view)
                .setTitle("Setting")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String this_url = editTextUrl.getText().toString();
                        String this_id = editTextId.getText().toString();
                        listener.applyTexts(this_url,this_id);
                    }
                });
        editTextUrl = view.findViewById(R.id.baseurl);
        editTextId = view.findViewById(R.id.app);
        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement Listener");
        }
    }

    public interface ExampleDialogListener{
        void applyTexts(String field1, String field2);
    }
}
