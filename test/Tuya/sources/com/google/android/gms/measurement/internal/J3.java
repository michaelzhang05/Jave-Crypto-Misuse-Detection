package com.google.android.gms.measurement.internal;

import O.C1258b;
import R.AbstractC1306c;
import R.AbstractC1319p;
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
import m0.InterfaceC3391d;

/* loaded from: classes3.dex */
public final class J3 implements ServiceConnection, AbstractC1306c.a, AbstractC1306c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f16183a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C2248q1 f16184b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K3 f16185c;

    /* JADX INFO: Access modifiers changed from: protected */
    public J3(K3 k32) {
        this.f16185c = k32;
    }

    public final void b(Intent intent) {
        J3 j32;
        this.f16185c.h();
        Context c8 = this.f16185c.f16777a.c();
        V.b b8 = V.b.b();
        synchronized (this) {
            try {
                if (this.f16183a) {
                    this.f16185c.f16777a.d().v().a("Connection attempt already in progress");
                    return;
                }
                this.f16185c.f16777a.d().v().a("Using local app measurement service");
                this.f16183a = true;
                j32 = this.f16185c.f16201c;
                b8.a(c8, intent, j32, TsExtractor.TS_STREAM_TYPE_AC3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.f16185c.h();
        Context c8 = this.f16185c.f16777a.c();
        synchronized (this) {
            try {
                if (this.f16183a) {
                    this.f16185c.f16777a.d().v().a("Connection attempt already in progress");
                    return;
                }
                if (this.f16184b != null && (this.f16184b.e() || this.f16184b.g())) {
                    this.f16185c.f16777a.d().v().a("Already awaiting connection attempt");
                    return;
                }
                this.f16184b = new C2248q1(c8, Looper.getMainLooper(), this, this);
                this.f16185c.f16777a.d().v().a("Connecting to remote service");
                this.f16183a = true;
                AbstractC1319p.l(this.f16184b);
                this.f16184b.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f16184b != null && (this.f16184b.g() || this.f16184b.e())) {
            this.f16184b.b();
        }
        this.f16184b = null;
    }

    @Override // R.AbstractC1306c.a
    public final void i(int i8) {
        AbstractC1319p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f16185c.f16777a.d().q().a("Service connection suspended");
        this.f16185c.f16777a.f().z(new H3(this));
    }

    @Override // R.AbstractC1306c.b
    public final void j(C1258b c1258b) {
        AbstractC1319p.e("MeasurementServiceConnection.onConnectionFailed");
        C2267u1 E8 = this.f16185c.f16777a.E();
        if (E8 != null) {
            E8.w().b("Service connection failed", c1258b);
        }
        synchronized (this) {
            this.f16183a = false;
            this.f16184b = null;
        }
        this.f16185c.f16777a.f().z(new I3(this));
    }

    @Override // R.AbstractC1306c.a
    public final void l(Bundle bundle) {
        AbstractC1319p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC1319p.l(this.f16184b);
                this.f16185c.f16777a.f().z(new G3(this, (InterfaceC3391d) this.f16184b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f16184b = null;
                this.f16183a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        J3 j32;
        InterfaceC3391d c2223l1;
        AbstractC1319p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f16183a = false;
                this.f16185c.f16777a.d().r().a("Service connected with null binder");
                return;
            }
            InterfaceC3391d interfaceC3391d = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC3391d) {
                        c2223l1 = (InterfaceC3391d) queryLocalInterface;
                    } else {
                        c2223l1 = new C2223l1(iBinder);
                    }
                    interfaceC3391d = c2223l1;
                    this.f16185c.f16777a.d().v().a("Bound to IMeasurementService interface");
                } else {
                    this.f16185c.f16777a.d().r().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f16185c.f16777a.d().r().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC3391d == null) {
                this.f16183a = false;
                try {
                    V.b b8 = V.b.b();
                    Context c8 = this.f16185c.f16777a.c();
                    j32 = this.f16185c.f16201c;
                    b8.c(c8, j32);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f16185c.f16777a.f().z(new E3(this, interfaceC3391d));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1319p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f16185c.f16777a.d().q().a("Service disconnected");
        this.f16185c.f16777a.f().z(new F3(this, componentName));
    }
}
