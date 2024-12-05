package N;

import Q.AbstractC1400p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: N.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class DialogFragmentC1332c extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f7457a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f7458b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f7459c;

    public static DialogFragmentC1332c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1332c dialogFragmentC1332c = new DialogFragmentC1332c();
        Dialog dialog2 = (Dialog) AbstractC1400p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1332c.f7457a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1332c.f7458b = onCancelListener;
        }
        return dialogFragmentC1332c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7458b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7457a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f7459c == null) {
                this.f7459c = new AlertDialog.Builder((Context) AbstractC1400p.l(getActivity())).create();
            }
            return this.f7459c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
