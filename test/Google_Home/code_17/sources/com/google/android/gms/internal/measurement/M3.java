package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class M3 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public M3(K3 k32, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        R3.m();
    }
}
