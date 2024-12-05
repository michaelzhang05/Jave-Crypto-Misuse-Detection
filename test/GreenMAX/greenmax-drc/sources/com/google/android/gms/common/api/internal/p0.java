package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes2.dex */
final class p0 extends zabr {
    private final /* synthetic */ Dialog a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ o0 f10648b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(o0 o0Var, Dialog dialog) {
        this.f10648b = o0Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void a() {
        this.f10648b.f10646g.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
