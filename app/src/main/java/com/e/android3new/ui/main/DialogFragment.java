package com.e.android3new.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;

public class DialogFragment extends androidx.fragment.app.DialogFragment {
    private DialogCallback callback;

    private void setText(){
        callback.sendCity("qwerty");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        callback = (DialogCallback) context;
    }
}
