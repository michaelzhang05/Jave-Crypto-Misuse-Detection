package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class zaj extends zal {

    /* renamed from: k, reason: collision with root package name */
    private final SparseArray<a> f10732k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements GoogleApiClient.OnConnectionFailedListener {

        /* renamed from: f, reason: collision with root package name */
        public final int f10733f;

        /* renamed from: g, reason: collision with root package name */
        public final GoogleApiClient f10734g;

        /* renamed from: h, reason: collision with root package name */
        public final GoogleApiClient.OnConnectionFailedListener f10735h;

        public a(int i2, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.f10733f = i2;
            this.f10734g = googleApiClient;
            this.f10735h = onConnectionFailedListener;
            googleApiClient.t(this);
        }

        @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
        public final void i0(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            zaj.this.m(connectionResult, this.f10733f);
        }
    }

    private zaj(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f10732k = new SparseArray<>();
        this.f10603f.a("AutoManageHelper", this);
    }

    public static zaj p(LifecycleActivity lifecycleActivity) {
        LifecycleFragment c2 = LifecycleCallback.c(lifecycleActivity);
        zaj zajVar = (zaj) c2.b("AutoManageHelper", zaj.class);
        return zajVar != null ? zajVar : new zaj(c2);
    }

    private final a s(int i2) {
        if (this.f10732k.size() <= i2) {
            return null;
        }
        SparseArray<a> sparseArray = this.f10732k;
        return sparseArray.get(sparseArray.keyAt(i2));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i2 = 0; i2 < this.f10732k.size(); i2++) {
            a s = s(i2);
            if (s != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(s.f10733f);
                printWriter.println(":");
                s.f10734g.i(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        super.i();
        boolean z = this.f10741g;
        String valueOf = String.valueOf(this.f10732k);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f10742h.get() == null) {
            for (int i2 = 0; i2 < this.f10732k.size(); i2++) {
                a s = s(i2);
                if (s != null) {
                    s.f10734g.f();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal, com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        for (int i2 = 0; i2 < this.f10732k.size(); i2++) {
            a s = s(i2);
            if (s != null) {
                s.f10734g.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.zal
    public final void l(ConnectionResult connectionResult, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        a aVar = this.f10732k.get(i2);
        if (aVar != null) {
            q(i2);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = aVar.f10735h;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.i0(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zal
    protected final void n() {
        for (int i2 = 0; i2 < this.f10732k.size(); i2++) {
            a s = s(i2);
            if (s != null) {
                s.f10734g.f();
            }
        }
    }

    public final void q(int i2) {
        a aVar = this.f10732k.get(i2);
        this.f10732k.remove(i2);
        if (aVar != null) {
            aVar.f10734g.u(aVar);
            aVar.f10734g.h();
        }
    }

    public final void r(int i2, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.k(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.f10732k.indexOfKey(i2) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i2);
        Preconditions.m(z, sb.toString());
        n0 n0Var = this.f10742h.get();
        boolean z2 = this.f10741g;
        String valueOf = String.valueOf(n0Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i2);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f10732k.put(i2, new a(i2, googleApiClient, onConnectionFailedListener));
        if (this.f10741g && n0Var == null) {
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            googleApiClient.f();
        }
    }
}
