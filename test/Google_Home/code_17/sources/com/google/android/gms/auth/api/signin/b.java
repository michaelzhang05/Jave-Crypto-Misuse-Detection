package com.google.android.gms.auth.api.signin;

import K.o;
import N.AbstractC1341l;
import N.C1336g;
import O.e;
import P.C1356a;
import Q.AbstractC1399o;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public class b extends O.e {

    /* renamed from: k, reason: collision with root package name */
    private static final f f15873k = new f(null);

    /* renamed from: l, reason: collision with root package name */
    static int f15874l = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, H.a.f3445b, googleSignInOptions, new e.a.C0145a().b(new C1356a()).a());
    }

    private final synchronized int v() {
        int i8;
        try {
            i8 = f15874l;
            if (i8 == 1) {
                Context k8 = k();
                C1336g n8 = C1336g.n();
                int h8 = n8.h(k8, AbstractC1341l.f7472a);
                if (h8 == 0) {
                    i8 = 4;
                    f15874l = 4;
                } else if (n8.b(k8, h8, null) == null && DynamiteModule.a(k8, "com.google.android.gms.auth.api.fallback") != 0) {
                    i8 = 3;
                    f15874l = 3;
                } else {
                    i8 = 2;
                    f15874l = 2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i8;
    }

    public Intent s() {
        Context k8 = k();
        int v8 = v();
        int i8 = v8 - 1;
        if (v8 != 0) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return o.b(k8, (GoogleSignInOptions) j());
                }
                return o.c(k8, (GoogleSignInOptions) j());
            }
            return o.a(k8, (GoogleSignInOptions) j());
        }
        throw null;
    }

    public Task t() {
        boolean z8;
        O.f b8 = b();
        Context k8 = k();
        if (v() == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        return AbstractC1399o.b(o.e(b8, k8, z8));
    }

    public Task u() {
        boolean z8;
        O.f b8 = b();
        Context k8 = k();
        if (v() == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        return AbstractC1399o.b(o.f(b8, k8, z8));
    }
}
