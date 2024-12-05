package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.f0;
import com.google.firebase.messaging.m;
import java.util.concurrent.ExecutionException;
import l2.l;
import r1.a;
import r1.b;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // r1.b
    protected int b(Context context, a aVar) {
        try {
            return ((Integer) l.a(new m(context).i(aVar.a()))).intValue();
        } catch (InterruptedException | ExecutionException e6) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e6);
            return 500;
        }
    }

    @Override // r1.b
    protected void c(Context context, Bundle bundle) {
        Intent g6 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (f0.A(g6)) {
            f0.s(g6);
        }
    }
}
