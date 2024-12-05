package com.google.firebase.iid;

import N.AbstractC1254b;
import N.C1253a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C2389n;
import com.google.firebase.messaging.F;
import java.util.concurrent.ExecutionException;
import r0.l;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1254b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // N.AbstractC1254b
    protected int b(Context context, C1253a c1253a) {
        try {
            return ((Integer) l.a(new C2389n(context).k(c1253a.s()))).intValue();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e8);
            return 500;
        }
    }

    @Override // N.AbstractC1254b
    protected void c(Context context, Bundle bundle) {
        Intent g8 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (F.A(g8)) {
            F.s(g8);
        }
    }
}
