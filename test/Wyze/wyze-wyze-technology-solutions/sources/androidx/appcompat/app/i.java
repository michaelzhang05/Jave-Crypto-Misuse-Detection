package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class i extends androidx.fragment.app.b {
    @Override // androidx.fragment.app.b
    public Dialog onCreateDialog(Bundle bundle) {
        throw null;
    }

    @Override // androidx.fragment.app.b
    public void setupDialog(Dialog dialog, int i2) {
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            hVar.d(1);
            return;
        }
        super.setupDialog(dialog, i2);
    }
}
