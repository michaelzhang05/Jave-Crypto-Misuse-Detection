package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class GmsClientEventManager implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private final GmsClientEventState f10853f;
    private final Handler m;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f10854g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f10855h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> f10856i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f10857j = false;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f10858k = new AtomicInteger(0);
    private boolean l = false;
    private final Object n = new Object();

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsClientEventState) {
        this.f10853f = gmsClientEventState;
        this.m = new zap(looper, this);
    }

    public final void a() {
        this.f10857j = false;
        this.f10858k.incrementAndGet();
    }

    public final void b() {
        this.f10857j = true;
    }

    @VisibleForTesting
    public final void c(ConnectionResult connectionResult) {
        Preconditions.e(this.m, "onConnectionFailure must only be called on the Handler thread");
        this.m.removeMessages(1);
        synchronized (this.n) {
            ArrayList arrayList = new ArrayList(this.f10856i);
            int i2 = this.f10858k.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener) obj;
                if (this.f10857j && this.f10858k.get() == i2) {
                    if (this.f10856i.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.i0(connectionResult);
                    }
                }
                return;
            }
        }
    }

    @VisibleForTesting
    public final void d(Bundle bundle) {
        Preconditions.e(this.m, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.n) {
            boolean z = true;
            Preconditions.l(!this.l);
            this.m.removeMessages(1);
            this.l = true;
            if (this.f10855h.size() != 0) {
                z = false;
            }
            Preconditions.l(z);
            ArrayList arrayList = new ArrayList(this.f10854g);
            int i2 = this.f10858k.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f10857j || !this.f10853f.isConnected() || this.f10858k.get() != i2) {
                    break;
                } else if (!this.f10855h.contains(connectionCallbacks)) {
                    connectionCallbacks.C(bundle);
                }
            }
            this.f10855h.clear();
            this.l = false;
        }
    }

    @VisibleForTesting
    public final void e(int i2) {
        Preconditions.e(this.m, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.m.removeMessages(1);
        synchronized (this.n) {
            this.l = true;
            ArrayList arrayList = new ArrayList(this.f10854g);
            int i3 = this.f10858k.get();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f10857j || this.f10858k.get() != i3) {
                    break;
                } else if (this.f10854g.contains(connectionCallbacks)) {
                    connectionCallbacks.u(i2);
                }
            }
            this.f10855h.clear();
            this.l = false;
        }
    }

    public final void f(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.j(connectionCallbacks);
        synchronized (this.n) {
            if (this.f10854g.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f10854g.add(connectionCallbacks);
            }
        }
        if (this.f10853f.isConnected()) {
            Handler handler = this.m;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void g(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.j(onConnectionFailedListener);
        synchronized (this.n) {
            if (this.f10856i.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f10856i.add(onConnectionFailedListener);
            }
        }
    }

    public final void h(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.j(onConnectionFailedListener);
        synchronized (this.n) {
            if (!this.f10856i.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.n) {
                if (this.f10857j && this.f10853f.isConnected() && this.f10854g.contains(connectionCallbacks)) {
                    connectionCallbacks.C(this.f10853f.getConnectionHint());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
