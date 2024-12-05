package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzami extends zzbjg {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f12790f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    private final AppMeasurementSdk f12791g;

    private zzami(AppMeasurementSdk appMeasurementSdk) {
        this.f12791g = appMeasurementSdk;
    }

    public static void H7(final Context context, final String str) {
        if (f12790f.compareAndSet(false, true)) {
            new Thread(new Runnable(context, str) { // from class: com.google.android.gms.internal.ads.q2

                /* renamed from: f, reason: collision with root package name */
                private final Context f12035f;

                /* renamed from: g, reason: collision with root package name */
                private final String f12036g;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12035f = context;
                    this.f12036g = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzami.I7(this.f12035f, this.f12036g);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void I7(Context context, String str) {
        boolean z;
        zzacu.a(context);
        try {
            if (!((Boolean) zzyt.e().c(zzacu.H0)).booleanValue()) {
                if (!((Boolean) zzyt.e().c(zzacu.G0)).booleanValue()) {
                    z = false;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", z);
                    ((zzbjh) zzbae.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", r2.a)).p1(new zzami(AppMeasurementSdk.k(context, "Ads", "am", str, bundle)));
                    return;
                }
            }
            ((zzbjh) zzbae.a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", r2.a)).p1(new zzami(AppMeasurementSdk.k(context, "Ads", "am", str, bundle)));
            return;
        } catch (RemoteException | zzbag | NullPointerException e2) {
            zzbad.f("#007 Could not call remote method.", e2);
            return;
        }
        z = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("measurementEnabled", z);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void F4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f12791g.r(iObjectWrapper != null ? (Activity) ObjectWrapper.R(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final int G3(String str) throws RemoteException {
        return this.f12791g.l(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void K0(Bundle bundle) throws RemoteException {
        this.f12791g.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final List T4(String str, String str2) throws RemoteException {
        return this.f12791g.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final String W4() throws RemoteException {
        return this.f12791g.h();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final String Y1() throws RemoteException {
        return this.f12791g.f();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void Y4(Bundle bundle) throws RemoteException {
        this.f12791g.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void Z(String str, String str2, Bundle bundle) throws RemoteException {
        this.f12791g.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final Map a4(String str, String str2, boolean z) throws RemoteException {
        return this.f12791g.m(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void e6(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f12791g.s(str, str2, iObjectWrapper != null ? ObjectWrapper.R(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void f6(String str) throws RemoteException {
        this.f12791g.a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final Bundle i2(Bundle bundle) throws RemoteException {
        return this.f12791g.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final String l4() throws RemoteException {
        return this.f12791g.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final String p4() throws RemoteException {
        return this.f12791g.j();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final long r2() throws RemoteException {
        return this.f12791g.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void w3(String str, String str2, Bundle bundle) throws RemoteException {
        this.f12791g.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final void w7(String str) throws RemoteException {
        this.f12791g.c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjf
    public final String z2() throws RemoteException {
        return this.f12791g.i();
    }
}
