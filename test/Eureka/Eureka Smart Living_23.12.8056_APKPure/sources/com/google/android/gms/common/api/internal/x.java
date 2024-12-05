package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class x extends u1.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f4642a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f4643b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(y yVar, Dialog dialog) {
        this.f4643b = yVar;
        this.f4642a = dialog;
    }

    @Override // u1.o
    public final void a() {
        this.f4643b.f4645b.o();
        if (this.f4642a.isShowing()) {
            this.f4642a.dismiss();
        }
    }
}
