package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class zabe implements zabs, zar {

    /* renamed from: f, reason: collision with root package name */
    private final Lock f10694f;

    /* renamed from: g, reason: collision with root package name */
    private final Condition f10695g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f10696h;

    /* renamed from: i, reason: collision with root package name */
    private final GoogleApiAvailabilityLight f10697i;

    /* renamed from: j, reason: collision with root package name */
    private final x f10698j;

    /* renamed from: k, reason: collision with root package name */
    final Map<Api.AnyClientKey<?>, Api.Client> f10699k;
    private final ClientSettings m;
    private final Map<Api<?>, Boolean> n;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> o;
    private volatile zabd p;
    int r;
    final zaaw s;
    final zabt t;
    final Map<Api.AnyClientKey<?>, ConnectionResult> l = new HashMap();
    private ConnectionResult q = null;

    public zabe(Context context, zaaw zaawVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabt zabtVar) {
        this.f10696h = context;
        this.f10694f = lock;
        this.f10697i = googleApiAvailabilityLight;
        this.f10699k = map;
        this.m = clientSettings;
        this.n = map2;
        this.o = abstractClientBuilder;
        this.s = zaawVar;
        this.t = zabtVar;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaqVar = arrayList.get(i2);
            i2++;
            zaqVar.a(this);
        }
        this.f10698j = new x(this, looper);
        this.f10695g = lock.newCondition();
        this.p = new zaav(this);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void C(Bundle bundle) {
        this.f10694f.lock();
        try {
            this.p.C(bundle);
        } finally {
            this.f10694f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zar
    public final void R(ConnectionResult connectionResult, Api<?> api, boolean z) {
        this.f10694f.lock();
        try {
            this.p.R(connectionResult, api, z);
        } finally {
            this.f10694f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T S(T t) {
        t.r();
        return (T) this.p.S(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T T(T t) {
        t.r();
        return (T) this.p.T(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void a() {
        this.p.a();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean b(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void c() {
        if (isConnected()) {
            ((zaah) this.p).c();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void disconnect() {
        if (this.p.disconnect()) {
            this.l.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.p);
        for (Api<?> api : this.n.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.b()).println(":");
            this.f10699k.get(api.a()).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final ConnectionResult e() {
        a();
        while (f()) {
            try {
                this.f10695g.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f10493f;
        }
        ConnectionResult connectionResult = this.q;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    public final boolean f() {
        return this.p instanceof zaak;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(w wVar) {
        this.f10698j.sendMessage(this.f10698j.obtainMessage(1, wVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.f10694f.lock();
        try {
            this.p = new zaak(this, this.m, this.n, this.f10697i, this.o, this.f10694f, this.f10696h);
            this.p.d();
            this.f10695g.signalAll();
        } finally {
            this.f10694f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean isConnected() {
        return this.p instanceof zaah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(RuntimeException runtimeException) {
        this.f10698j.sendMessage(this.f10698j.obtainMessage(2, runtimeException));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.f10694f.lock();
        try {
            this.s.E();
            this.p = new zaah(this);
            this.p.d();
            this.f10695g.signalAll();
        } finally {
            this.f10694f.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ConnectionResult connectionResult) {
        this.f10694f.lock();
        try {
            this.q = connectionResult;
            this.p = new zaav(this);
            this.p.d();
            this.f10695g.signalAll();
        } finally {
            this.f10694f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void u(int i2) {
        this.f10694f.lock();
        try {
            this.p.u(i2);
        } finally {
            this.f10694f.unlock();
        }
    }
}
