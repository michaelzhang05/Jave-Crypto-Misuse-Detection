package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
final class yy extends Handler {
    private final /* synthetic */ xy a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yy(xy xyVar) {
        this.a = xyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.m(message);
    }
}
