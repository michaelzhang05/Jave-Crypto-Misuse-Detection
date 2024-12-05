package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class v extends androidx.fragment.app.e {
    @Override // androidx.fragment.app.e
    public Dialog O1(Bundle bundle) {
        return new u(u(), N1());
    }

    @Override // androidx.fragment.app.e
    public void U1(Dialog dialog, int i6) {
        if (!(dialog instanceof u)) {
            super.U1(dialog, i6);
            return;
        }
        u uVar = (u) dialog;
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        uVar.j(1);
    }
}
