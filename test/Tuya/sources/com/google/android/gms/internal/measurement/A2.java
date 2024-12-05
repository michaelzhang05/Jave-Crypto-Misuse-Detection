package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class A2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B2 f15249a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(B2 b22, Handler handler) {
        super(null);
        this.f15249a = b22;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        this.f15249a.f();
    }
}
