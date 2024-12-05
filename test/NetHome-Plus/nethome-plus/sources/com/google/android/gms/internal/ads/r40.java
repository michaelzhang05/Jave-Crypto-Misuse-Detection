package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r40 implements ValueCallback<String> {
    private final /* synthetic */ q40 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r40(q40 q40Var) {
        this.a = q40Var;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        q40 q40Var = this.a;
        q40Var.f12044j.c(q40Var.f12041g, q40Var.f12042h, str, q40Var.f12043i);
    }
}
