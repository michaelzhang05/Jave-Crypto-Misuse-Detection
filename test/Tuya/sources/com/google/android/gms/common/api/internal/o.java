package com.google.android.gms.common.api.internal;

import O.C1260d;
import Q.C1301b;
import R.AbstractC1317n;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final C1301b f15181a;

    /* renamed from: b, reason: collision with root package name */
    private final C1260d f15182b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(C1301b c1301b, C1260d c1260d, Q.p pVar) {
        this.f15181a = c1301b;
        this.f15182b = c1260d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o)) {
            o oVar = (o) obj;
            if (AbstractC1317n.a(this.f15181a, oVar.f15181a) && AbstractC1317n.a(this.f15182b, oVar.f15182b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1317n.b(this.f15181a, this.f15182b);
    }

    public final String toString() {
        return AbstractC1317n.c(this).a(LeanbackPreferenceDialogFragment.ARG_KEY, this.f15181a).a("feature", this.f15182b).toString();
    }
}
