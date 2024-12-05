package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.h;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public class SupportErrorDialogFragment extends androidx.fragment.app.b {

    /* renamed from: f, reason: collision with root package name */
    private Dialog f10516f = null;

    /* renamed from: g, reason: collision with root package name */
    private DialogInterface.OnCancelListener f10517g = null;

    public static SupportErrorDialogFragment d(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f10516f = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f10517g = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.b, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10517g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.b
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f10516f == null) {
            setShowsDialog(false);
        }
        return this.f10516f;
    }

    @Override // androidx.fragment.app.b
    public void show(h hVar, String str) {
        super.show(hVar, str);
    }
}
