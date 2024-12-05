package com.google.firebase.iid;

import M.AbstractC1299b;
import M.C1298a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C2583n;
import com.google.firebase.messaging.H;
import java.util.concurrent.ExecutionException;
import q0.AbstractC3828l;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1299b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // M.AbstractC1299b
    protected int b(Context context, C1298a c1298a) {
        try {
            return ((Integer) AbstractC3828l.a(new C2583n(context).k(c1298a.p()))).intValue();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e8);
            return 500;
        }
    }

    @Override // M.AbstractC1299b
    protected void c(Context context, Bundle bundle) {
        Intent f8 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (H.A(f8)) {
            H.s(f8);
        }
    }
}
