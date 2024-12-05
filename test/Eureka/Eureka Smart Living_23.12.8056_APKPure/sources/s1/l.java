package s1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class l extends androidx.fragment.app.e {

    /* renamed from: s0, reason: collision with root package name */
    private Dialog f9230s0;

    /* renamed from: t0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f9231t0;

    /* renamed from: u0, reason: collision with root package name */
    private Dialog f9232u0;

    public static l W1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) v1.n.i(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f9230s0 = dialog2;
        if (onCancelListener != null) {
            lVar.f9231t0 = onCancelListener;
        }
        return lVar;
    }

    @Override // androidx.fragment.app.e
    public Dialog O1(Bundle bundle) {
        Dialog dialog = this.f9230s0;
        if (dialog != null) {
            return dialog;
        }
        T1(false);
        if (this.f9232u0 == null) {
            this.f9232u0 = new AlertDialog.Builder((Context) v1.n.h(u())).create();
        }
        return this.f9232u0;
    }

    @Override // androidx.fragment.app.e
    public void V1(androidx.fragment.app.w wVar, String str) {
        super.V1(wVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f9231t0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
