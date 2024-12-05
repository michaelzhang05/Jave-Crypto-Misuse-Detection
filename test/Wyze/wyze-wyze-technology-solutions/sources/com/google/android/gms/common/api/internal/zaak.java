package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
public final class zaak implements zabd {
    private final zabe a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f10674b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10675c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleApiAvailabilityLight f10676d;

    /* renamed from: e, reason: collision with root package name */
    private ConnectionResult f10677e;

    /* renamed from: f, reason: collision with root package name */
    private int f10678f;

    /* renamed from: h, reason: collision with root package name */
    private int f10680h;

    /* renamed from: k, reason: collision with root package name */
    private zad f10683k;
    private boolean l;
    private boolean m;
    private boolean n;
    private IAccountAccessor o;
    private boolean p;
    private boolean q;
    private final ClientSettings r;
    private final Map<Api<?>, Boolean> s;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> t;

    /* renamed from: g, reason: collision with root package name */
    private int f10679g = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f10681i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    private final Set<Api.AnyClientKey> f10682j = new HashSet();
    private ArrayList<Future<?>> u = new ArrayList<>();

    public zaak(zabe zabeVar, ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.a = zabeVar;
        this.r = clientSettings;
        this.s = map;
        this.f10676d = googleApiAvailabilityLight;
        this.t = abstractClientBuilder;
        this.f10674b = lock;
        this.f10675c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(com.google.android.gms.signin.internal.zaj zajVar) {
        if (t(0)) {
            ConnectionResult w = zajVar.w();
            if (w.L()) {
                ResolveAccountResponse z = zajVar.z();
                ConnectionResult z2 = z.z();
                if (!z2.L()) {
                    String valueOf = String.valueOf(z2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    y(z2);
                    return;
                }
                this.n = true;
                this.o = z.w();
                this.p = z.D();
                this.q = z.J();
                j();
                return;
            }
            if (x(w)) {
                l();
                j();
            } else {
                y(w);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        int i2 = this.f10680h - 1;
        this.f10680h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GoogleApiClientConnecting", this.a.s.G());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            y(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f10677e;
        if (connectionResult == null) {
            return true;
        }
        this.a.r = this.f10678f;
        y(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        if (this.f10680h != 0) {
            return;
        }
        if (!this.m || this.n) {
            ArrayList arrayList = new ArrayList();
            this.f10679g = 1;
            this.f10680h = this.a.f10699k.size();
            for (Api.AnyClientKey<?> anyClientKey : this.a.f10699k.keySet()) {
                if (this.a.l.containsKey(anyClientKey)) {
                    if (i()) {
                        k();
                    }
                } else {
                    arrayList.add(this.a.f10699k.get(anyClientKey));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.u.add(zabh.a().submit(new l(this, arrayList)));
        }
    }

    private final void k() {
        this.a.l();
        zabh.a().execute(new g(this));
        zad zadVar = this.f10683k;
        if (zadVar != null) {
            if (this.p) {
                zadVar.b(this.o, this.q);
            }
            q(false);
        }
        Iterator<Api.AnyClientKey<?>> it = this.a.l.keySet().iterator();
        while (it.hasNext()) {
            this.a.f10699k.get(it.next()).disconnect();
        }
        this.a.t.b(this.f10681i.isEmpty() ? null : this.f10681i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        this.m = false;
        this.a.s.q = Collections.emptySet();
        for (Api.AnyClientKey<?> anyClientKey : this.f10682j) {
            if (!this.a.l.containsKey(anyClientKey)) {
                this.a.l.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    private final void m() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Scope> n() {
        if (this.r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.r.k());
        Map<Api<?>, ClientSettings.OptionalApiSettings> h2 = this.r.h();
        for (Api<?> api : h2.keySet()) {
            if (!this.a.l.containsKey(api.a())) {
                hashSet.addAll(h2.get(api).a);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r5.J() || r4.f10676d.c(r5.w()) != null) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r6.c()
            int r0 = r0.b()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L24
            boolean r7 = r5.J()
            if (r7 == 0) goto L14
        L12:
            r7 = 1
            goto L22
        L14:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.f10676d
            int r3 = r5.w()
            android.content.Intent r7 = r7.c(r3)
            if (r7 == 0) goto L21
            goto L12
        L21:
            r7 = 0
        L22:
            if (r7 == 0) goto L2d
        L24:
            com.google.android.gms.common.ConnectionResult r7 = r4.f10677e
            if (r7 == 0) goto L2c
            int r7 = r4.f10678f
            if (r0 >= r7) goto L2d
        L2c:
            r1 = 1
        L2d:
            if (r1 == 0) goto L33
            r4.f10677e = r5
            r4.f10678f = r0
        L33:
            com.google.android.gms.common.api.internal.zabe r7 = r4.a
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.l
            com.google.android.gms.common.api.Api$AnyClientKey r6 = r6.a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaak.p(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    private final void q(boolean z) {
        zad zadVar = this.f10683k;
        if (zadVar != null) {
            if (zadVar.isConnected() && z) {
                this.f10683k.c();
            }
            this.f10683k.disconnect();
            if (this.r.m()) {
                this.f10683k = null;
            }
            this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(int i2) {
        if (this.f10679g == i2) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.a.s.G());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i3 = this.f10680h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String w = w(this.f10679g);
        String w2 = w(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(w).length() + 70 + String.valueOf(w2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(w);
        sb3.append(" but received callback for step ");
        sb3.append(w2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        y(new ConnectionResult(8, null));
        return false;
    }

    private static String w(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x(ConnectionResult connectionResult) {
        return this.l && !connectionResult.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ConnectionResult connectionResult) {
        m();
        q(!connectionResult.J());
        this.a.m(connectionResult);
        this.a.t.a(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void C(Bundle bundle) {
        if (t(1)) {
            if (bundle != null) {
                this.f10681i.putAll(bundle);
            }
            if (i()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void R(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (t(1)) {
            p(connectionResult, api, z);
            if (i()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T S(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T T(T t) {
        this.a.s.f10691i.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void d() {
        this.a.l.clear();
        this.m = false;
        g gVar = null;
        this.f10677e = null;
        this.f10679g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api<?> api : this.s.keySet()) {
            Api.Client client = this.a.f10699k.get(api.a());
            z |= api.c().b() == 1;
            boolean booleanValue = this.s.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.m = true;
                if (booleanValue) {
                    this.f10682j.add(api.a());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(client, new h(this, api, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            this.r.n(Integer.valueOf(System.identityHashCode(this.a.s)));
            o oVar = new o(this, gVar);
            Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.t;
            Context context = this.f10675c;
            Looper o = this.a.s.o();
            ClientSettings clientSettings = this.r;
            this.f10683k = abstractClientBuilder.c(context, o, clientSettings, clientSettings.l(), oVar, oVar);
        }
        this.f10680h = this.a.f10699k.size();
        this.u.add(zabh.a().submit(new i(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final boolean disconnect() {
        m();
        q(true);
        this.a.m(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zabd
    public final void u(int i2) {
        y(new ConnectionResult(8, null));
    }
}
