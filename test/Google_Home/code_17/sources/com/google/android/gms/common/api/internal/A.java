package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes3.dex */
final class A extends P.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f15900a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B f15901b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(B b8, Dialog dialog) {
        this.f15901b = b8;
        this.f15900a = dialog;
    }

    @Override // P.r
    public final void a() {
        this.f15901b.f15903b.o();
        if (this.f15900a.isShowing()) {
            this.f15900a.dismiss();
        }
    }
}
