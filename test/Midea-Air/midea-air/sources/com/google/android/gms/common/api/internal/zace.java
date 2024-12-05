package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zace extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f, reason: collision with root package name */
    private static Api.AbstractClientBuilder<? extends zad, SignInOptions> f10706f = com.google.android.gms.signin.zaa.f16332c;

    /* renamed from: g, reason: collision with root package name */
    private final Context f10707g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f10708h;

    /* renamed from: i, reason: collision with root package name */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f10709i;

    /* renamed from: j, reason: collision with root package name */
    private Set<Scope> f10710j;

    /* renamed from: k, reason: collision with root package name */
    private ClientSettings f10711k;
    private zad l;
    private zach m;

    public zace(Context context, Handler handler, ClientSettings clientSettings) {
        this(context, handler, clientSettings, f10706f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O5(com.google.android.gms.signin.internal.zaj zajVar) {
        ConnectionResult w = zajVar.w();
        if (w.L()) {
            ResolveAccountResponse z = zajVar.z();
            ConnectionResult z2 = z.z();
            if (!z2.L()) {
                String valueOf = String.valueOf(z2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.m.c(z2);
                this.l.disconnect();
                return;
            }
            this.m.b(z.w(), this.f10710j);
        } else {
            this.m.c(w);
        }
        this.l.disconnect();
    }

    public final void B5() {
        zad zadVar = this.l;
        if (zadVar != null) {
            zadVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void C(Bundle bundle) {
        this.l.e(this);
    }

    public final void a5(zach zachVar) {
        zad zadVar = this.l;
        if (zadVar != null) {
            zadVar.disconnect();
        }
        this.f10711k.n(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.f10709i;
        Context context = this.f10707g;
        Looper looper = this.f10708h.getLooper();
        ClientSettings clientSettings = this.f10711k;
        this.l = abstractClientBuilder.c(context, looper, clientSettings, clientSettings.l(), this, this);
        this.m = zachVar;
        Set<Scope> set = this.f10710j;
        if (set != null && !set.isEmpty()) {
            this.l.a();
        } else {
            this.f10708h.post(new f0(this));
        }
    }

    public final zad g5() {
        return this.l;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        this.m.c(connectionResult);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zad
    public final void k1(com.google.android.gms.signin.internal.zaj zajVar) {
        this.f10708h.post(new g0(this, zajVar));
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void u(int i2) {
        this.l.disconnect();
    }

    public zace(Context context, Handler handler, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        this.f10707g = context;
        this.f10708h = handler;
        this.f10711k = (ClientSettings) Preconditions.k(clientSettings, "ClientSettings must not be null");
        this.f10710j = clientSettings.k();
        this.f10709i = abstractClientBuilder;
    }
}
