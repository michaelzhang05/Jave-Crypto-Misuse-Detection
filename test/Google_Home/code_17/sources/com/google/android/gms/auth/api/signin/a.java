package com.google.android.gms.auth.api.signin;

import K.o;
import Q.AbstractC1386b;
import Q.AbstractC1400p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import q0.AbstractC3828l;

/* loaded from: classes3.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC1400p.l(googleSignInOptions));
    }

    public static Task b(Intent intent) {
        J.b d8 = o.d(intent);
        GoogleSignInAccount a8 = d8.a();
        if (d8.getStatus().H() && a8 != null) {
            return AbstractC3828l.e(a8);
        }
        return AbstractC3828l.d(AbstractC1386b.a(d8.getStatus()));
    }
}
