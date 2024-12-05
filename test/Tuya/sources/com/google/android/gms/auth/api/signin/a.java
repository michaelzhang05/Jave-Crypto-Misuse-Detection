package com.google.android.gms.auth.api.signin;

import L.o;
import R.AbstractC1305b;
import R.AbstractC1319p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import r0.l;

/* loaded from: classes3.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC1319p.l(googleSignInOptions));
    }

    public static Task b(Intent intent) {
        K.b d8 = o.d(intent);
        GoogleSignInAccount a8 = d8.a();
        if (d8.getStatus().L() && a8 != null) {
            return l.e(a8);
        }
        return l.d(AbstractC1305b.a(d8.getStatus()));
    }
}
