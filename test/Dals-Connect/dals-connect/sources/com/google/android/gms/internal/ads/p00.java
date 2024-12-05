package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class p00 extends Handler {
    private final /* synthetic */ o00 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p00(o00 o00Var, Looper looper) {
        super(looper);
        this.a = o00Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.n(message);
    }
}
