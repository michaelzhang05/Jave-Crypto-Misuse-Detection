package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zaah implements zabd {
    private final zabe a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10673b = false;

    public zaah(zabe zabeVar) {
        this.a = zabeVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void C(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void R(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T S(T t) {
        try {
            this.a.s.y.b(t);
            zaaw zaawVar = this.a.s;
            Api.Client client = zaawVar.p.get(t.u());
            Preconditions.k(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && this.a.l.containsKey(t.u())) {
                t.y(new Status(17));
            } else {
                boolean z = client instanceof SimpleClientAdapter;
                A a = client;
                if (z) {
                    a = ((SimpleClientAdapter) client).k();
                }
                t.w(a);
            }
        } catch (DeadObjectException unused) {
            this.a.h(new e(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T T(T t) {
        return (T) S(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void a() {
        if (this.f10673b) {
            this.f10673b = false;
            this.a.h(new f(this, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f10673b) {
            this.f10673b = false;
            this.a.s.y.a();
            disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        if (this.f10673b) {
            return false;
        }
        if (this.a.s.F()) {
            this.f10673b = true;
            Iterator<zacm> it = this.a.s.x.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            return false;
        }
        this.a.m(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void u(int i2) {
        this.a.m(null);
        this.a.t.c(i2, this.f10673b);
    }
}
