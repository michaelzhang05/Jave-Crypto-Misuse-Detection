package com.google.android.gms.measurement.internal;

import N.C1331b;
import Q.AbstractC1387c;
import Q.AbstractC1400p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import l0.InterfaceC3272g;

/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC2314a5 implements ServiceConnection, AbstractC1387c.a, AbstractC1387c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f17450a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C2374j2 f17451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ D4 f17452c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC2314a5(D4 d42) {
        this.f17452c = d42;
    }

    public final void a() {
        this.f17452c.k();
        Context w8 = this.f17452c.w();
        synchronized (this) {
            try {
                if (this.f17450a) {
                    this.f17452c.c().K().a("Connection attempt already in progress");
                    return;
                }
                if (this.f17451b != null && (this.f17451b.f() || this.f17451b.h())) {
                    this.f17452c.c().K().a("Already awaiting connection attempt");
                    return;
                }
                this.f17451b = new C2374j2(w8, Looper.getMainLooper(), this, this);
                this.f17452c.c().K().a("Connecting to remote service");
                this.f17450a = true;
                AbstractC1400p.l(this.f17451b);
                this.f17451b.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        ServiceConnectionC2314a5 serviceConnectionC2314a5;
        this.f17452c.k();
        Context w8 = this.f17452c.w();
        U.b b8 = U.b.b();
        synchronized (this) {
            try {
                if (this.f17450a) {
                    this.f17452c.c().K().a("Connection attempt already in progress");
                    return;
                }
                this.f17452c.c().K().a("Using local app measurement service");
                this.f17450a = true;
                serviceConnectionC2314a5 = this.f17452c.f17003c;
                b8.a(w8, intent, serviceConnectionC2314a5, TsExtractor.TS_STREAM_TYPE_AC3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f17451b != null && (this.f17451b.h() || this.f17451b.f())) {
            this.f17451b.b();
        }
        this.f17451b = null;
    }

    @Override // Q.AbstractC1387c.a
    public final void h(int i8) {
        AbstractC1400p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f17452c.c().F().a("Service connection suspended");
        this.f17452c.e().D(new RunnableC2342e5(this));
    }

    @Override // Q.AbstractC1387c.b
    public final void i(C1331b c1331b) {
        AbstractC1400p.e("MeasurementServiceConnection.onConnectionFailed");
        C2367i2 E8 = this.f17452c.f17844a.E();
        if (E8 != null) {
            E8.L().b("Service connection failed", c1331b);
        }
        synchronized (this) {
            this.f17450a = false;
            this.f17451b = null;
        }
        this.f17452c.e().D(new RunnableC2363h5(this));
    }

    @Override // Q.AbstractC1387c.a
    public final void k(Bundle bundle) {
        AbstractC1400p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC1400p.l(this.f17451b);
                this.f17452c.e().D(new RunnableC2349f5(this, (InterfaceC3272g) this.f17451b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f17451b = null;
                this.f17450a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC2314a5 serviceConnectionC2314a5;
        InterfaceC3272g c2339e2;
        AbstractC1400p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f17450a = false;
                this.f17452c.c().G().a("Service connected with null binder");
                return;
            }
            InterfaceC3272g interfaceC3272g = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC3272g) {
                        c2339e2 = (InterfaceC3272g) queryLocalInterface;
                    } else {
                        c2339e2 = new C2339e2(iBinder);
                    }
                    interfaceC3272g = c2339e2;
                    this.f17452c.c().K().a("Bound to IMeasurementService interface");
                } else {
                    this.f17452c.c().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f17452c.c().G().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC3272g == null) {
                this.f17450a = false;
                try {
                    U.b b8 = U.b.b();
                    Context w8 = this.f17452c.w();
                    serviceConnectionC2314a5 = this.f17452c.f17003c;
                    b8.c(w8, serviceConnectionC2314a5);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f17452c.e().D(new RunnableC2335d5(this, interfaceC3272g));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1400p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f17452c.c().F().a("Service disconnected");
        this.f17452c.e().D(new RunnableC2328c5(this, componentName));
    }
}
