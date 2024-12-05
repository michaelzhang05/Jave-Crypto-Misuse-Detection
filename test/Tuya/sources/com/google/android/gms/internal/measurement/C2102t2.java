package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2102t2 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2102t2(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = AbstractC2118v2.f15925e;
        atomicBoolean.set(true);
    }
}
