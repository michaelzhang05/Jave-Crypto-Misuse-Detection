package N;

import Q.AbstractC1400p;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: N.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1344o extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f7481a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f7482b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f7483c;

    public static C1344o h(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1344o c1344o = new C1344o();
        Dialog dialog2 = (Dialog) AbstractC1400p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1344o.f7481a = dialog2;
        if (onCancelListener != null) {
            c1344o.f7482b = onCancelListener;
        }
        return c1344o;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7482b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7481a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f7483c == null) {
                this.f7483c = new AlertDialog.Builder((Context) AbstractC1400p.l(getContext())).create();
            }
            return this.f7483c;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
