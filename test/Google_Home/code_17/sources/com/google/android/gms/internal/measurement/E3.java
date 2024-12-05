package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class E3 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ D3 f16122a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(D3 d32, Handler handler) {
        super(null);
        this.f16122a = d32;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        this.f16122a.f();
    }
}
