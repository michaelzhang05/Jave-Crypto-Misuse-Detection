package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r0 implements zabs {

    /* renamed from: f, reason: collision with root package name */
    private final Context f10652f;

    /* renamed from: g, reason: collision with root package name */
    private final zaaw f10653g;

    /* renamed from: h, reason: collision with root package name */
    private final Looper f10654h;

    /* renamed from: i, reason: collision with root package name */
    private final zabe f10655i;

    /* renamed from: j, reason: collision with root package name */
    private final zabe f10656j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<Api.AnyClientKey<?>, zabe> f10657k;
    private final Api.Client m;
    private Bundle n;
    private final Lock r;
    private final Set<SignInConnectionListener> l = Collections.newSetFromMap(new WeakHashMap());
    private ConnectionResult o = null;
    private ConnectionResult p = null;
    private boolean q = false;
    private int s = 0;

    private r0(Context context, zaaw zaawVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.f10652f = context;
        this.f10653g = zaawVar;
        this.r = lock;
        this.f10654h = looper;
        this.m = client;
        this.f10655i = new zabe(context, zaawVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new t0(this, null));
        this.f10656j = new zabe(context, zaawVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new u0(this, null));
        c.e.a aVar = new c.e.a();
        Iterator<Api.AnyClientKey<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put(it.next(), this.f10655i);
        }
        Iterator<Api.AnyClientKey<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put(it2.next(), this.f10656j);
        }
        this.f10657k = Collections.unmodifiableMap(aVar);
    }

    private final boolean A() {
        ConnectionResult connectionResult = this.p;
        return connectionResult != null && connectionResult.w() == 4;
    }

    public static r0 h(Context context, zaaw zaawVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        c.e.a aVar = new c.e.a();
        c.e.a aVar2 = new c.e.a();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                aVar.put(entry.getKey(), value);
            } else {
                aVar2.put(entry.getKey(), value);
            }
        }
        Preconditions.m(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        c.e.a aVar3 = new c.e.a();
        c.e.a aVar4 = new c.e.a();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> a = api.a();
            if (aVar.containsKey(a)) {
                aVar3.put(api, map2.get(api));
            } else if (aVar2.containsKey(a)) {
                aVar4.put(api, map2.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaq zaqVar = arrayList.get(i2);
            i2++;
            zaq zaqVar2 = zaqVar;
            if (aVar3.containsKey(zaqVar2.f10745f)) {
                arrayList2.add(zaqVar2);
            } else if (aVar4.containsKey(zaqVar2.f10745f)) {
                arrayList3.add(zaqVar2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new r0(context, zaawVar, lock, looper, googleApiAvailabilityLight, aVar, aVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, aVar3, aVar4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(int i2, boolean z) {
        this.f10653g.c(i2, z);
        this.p = null;
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 == null) {
            this.n = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private final void l(ConnectionResult connectionResult) {
        int i2 = this.s;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.s = 0;
            }
            this.f10653g.a(connectionResult);
        }
        z();
        this.s = 0;
    }

    private final boolean o(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> u = apiMethodImpl.u();
        Preconditions.b(this.f10657k.containsKey(u), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f10657k.get(u).equals(this.f10656j);
    }

    private final PendingIntent q() {
        if (this.m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f10652f, System.identityHashCode(this.f10653g), this.m.getSignInIntent(), 134217728);
    }

    private static boolean t(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        ConnectionResult connectionResult;
        if (t(this.o)) {
            if (!t(this.p) && !A()) {
                ConnectionResult connectionResult2 = this.p;
                if (connectionResult2 != null) {
                    if (this.s == 1) {
                        z();
                        return;
                    } else {
                        l(connectionResult2);
                        this.f10655i.disconnect();
                        return;
                    }
                }
                return;
            }
            int i2 = this.s;
            if (i2 != 1) {
                if (i2 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    this.s = 0;
                    return;
                }
                this.f10653g.b(this.n);
            }
            z();
            this.s = 0;
            return;
        }
        if (this.o != null && t(this.p)) {
            this.f10656j.disconnect();
            l(this.o);
            return;
        }
        ConnectionResult connectionResult3 = this.o;
        if (connectionResult3 == null || (connectionResult = this.p) == null) {
            return;
        }
        if (this.f10656j.r < this.f10655i.r) {
            connectionResult3 = connectionResult;
        }
        l(connectionResult3);
    }

    private final void z() {
        Iterator<SignInConnectionListener> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.l.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T S(T t) {
        if (o(t)) {
            if (A()) {
                t.y(new Status(4, null, q()));
                return t;
            }
            return (T) this.f10656j.S(t);
        }
        return (T) this.f10655i.S(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T T(T t) {
        if (o(t)) {
            if (A()) {
                t.y(new Status(4, null, q()));
                return t;
            }
            return (T) this.f10656j.T(t);
        }
        return (T) this.f10655i.T(t);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void a() {
        this.s = 2;
        this.q = false;
        this.p = null;
        this.o = null;
        this.f10655i.a();
        this.f10656j.a();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final boolean b(SignInConnectionListener signInConnectionListener) {
        this.r.lock();
        try {
            if ((f() || isConnected()) && !this.f10656j.isConnected()) {
                this.l.add(signInConnectionListener);
                if (this.s == 0) {
                    this.s = 1;
                }
                this.p = null;
                this.f10656j.a();
                return true;
            }
            this.r.unlock();
            return false;
        } finally {
            this.r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void c() {
        this.f10655i.c();
        this.f10656j.c();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void d() {
        this.r.lock();
        try {
            boolean f2 = f();
            this.f10656j.disconnect();
            this.p = new ConnectionResult(4);
            if (f2) {
                new zap(this.f10654h).post(new s0(this));
            } else {
                z();
            }
        } finally {
            this.r.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void disconnect() {
        this.p = null;
        this.o = null;
        this.s = 0;
        this.f10655i.disconnect();
        this.f10656j.disconnect();
        z();
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f10656j.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f10655i.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zabs
    public final ConnectionResult e() {
        throw new UnsupportedOperationException();
    }

    public final boolean f() {
        this.r.lock();
        try {
            return this.s == 2;
        } finally {
            this.r.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r2.s == 1) goto L13;
     */
    @Override // com.google.android.gms.common.api.internal.zabs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isConnected() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.r
            r0.lock()
            com.google.android.gms.common.api.internal.zabe r0 = r2.f10655i     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.zabe r0 = r2.f10656j     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            boolean r0 = r2.A()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            int r0 = r2.s     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.util.concurrent.locks.Lock r0 = r2.r
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.r
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.r0.isConnected():boolean");
    }
}
