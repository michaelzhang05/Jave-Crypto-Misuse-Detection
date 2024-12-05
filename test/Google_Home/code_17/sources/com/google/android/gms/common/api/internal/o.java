package com.google.android.gms.common.api.internal;

import N.C1333d;
import P.C1357b;
import Q.AbstractC1398n;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final C1357b f15982a;

    /* renamed from: b, reason: collision with root package name */
    private final C1333d f15983b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(C1357b c1357b, C1333d c1333d, P.p pVar) {
        this.f15982a = c1357b;
        this.f15983b = c1333d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o)) {
            o oVar = (o) obj;
            if (AbstractC1398n.a(this.f15982a, oVar.f15982a) && AbstractC1398n.a(this.f15983b, oVar.f15983b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1398n.b(this.f15982a, this.f15983b);
    }

    public final String toString() {
        return AbstractC1398n.c(this).a(LeanbackPreferenceDialogFragment.ARG_KEY, this.f15982a).a("feature", this.f15983b).toString();
    }
}
