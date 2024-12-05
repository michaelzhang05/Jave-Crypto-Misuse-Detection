package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import l0.InterfaceC3283r;
import l0.InterfaceC3285t;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.P0 {

    /* renamed from: a, reason: collision with root package name */
    R2 f16967a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16968b = new ArrayMap();

    /* loaded from: classes3.dex */
    class a implements InterfaceC3285t {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.W0 f16969a;

        a(com.google.android.gms.internal.measurement.W0 w02) {
            this.f16969a = w02;
        }

        @Override // l0.InterfaceC3285t
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f16969a.c0(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                R2 r22 = AppMeasurementDynamiteService.this.f16967a;
                if (r22 != null) {
                    r22.c().L().b("Event listener threw exception", e8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC3283r {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.W0 f16971a;

        b(com.google.android.gms.internal.measurement.W0 w02) {
            this.f16971a = w02;
        }

        @Override // l0.InterfaceC3283r
        public final void a(String str, String str2, Bundle bundle, long j8) {
            try {
                this.f16971a.c0(str, str2, bundle, j8);
            } catch (RemoteException e8) {
                R2 r22 = AppMeasurementDynamiteService.this.f16967a;
                if (r22 != null) {
                    r22.c().L().b("Event interceptor threw exception", e8);
                }
            }
        }
    }

    private final void i() {
        if (this.f16967a != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void k(com.google.android.gms.internal.measurement.R0 r02, String str) {
        i();
        this.f16967a.L().S(r02, str);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void beginAdUnitExposure(@NonNull String str, long j8) throws RemoteException {
        i();
        this.f16967a.v().z(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        i();
        this.f16967a.H().f0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void clearMeasurementEnabled(long j8) throws RemoteException {
        i();
        this.f16967a.H().Z(null);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void endAdUnitExposure(@NonNull String str, long j8) throws RemoteException {
        i();
        this.f16967a.v().D(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void generateEventId(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        long R02 = this.f16967a.L().R0();
        i();
        this.f16967a.L().Q(r02, R02);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        this.f16967a.e().D(new RunnableC2458v3(this, r02));
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        k(r02, this.f16967a.H().v0());
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        this.f16967a.e().D(new RunnableC2405n5(this, r02, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        k(r02, this.f16967a.H().w0());
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        k(r02, this.f16967a.H().x0());
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getGmpAppId(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        k(r02, this.f16967a.H().y0());
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        this.f16967a.H();
        A3.E(str);
        i();
        this.f16967a.L().P(r02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getSessionId(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        this.f16967a.H().P(r02);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getTestFlag(com.google.android.gms.internal.measurement.R0 r02, int i8) throws RemoteException {
        i();
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            this.f16967a.L().U(r02, this.f16967a.H().r0().booleanValue());
                            return;
                        }
                        return;
                    }
                    this.f16967a.L().P(r02, this.f16967a.H().t0().intValue());
                    return;
                }
                a6 L8 = this.f16967a.L();
                double doubleValue = this.f16967a.H().s0().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(CampaignEx.JSON_KEY_AD_R, doubleValue);
                try {
                    r02.e(bundle);
                    return;
                } catch (RemoteException e8) {
                    L8.f17844a.c().L().b("Error returning double value to wrapper", e8);
                    return;
                }
            }
            this.f16967a.L().Q(r02, this.f16967a.H().u0().longValue());
            return;
        }
        this.f16967a.L().S(r02, this.f16967a.H().z0());
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void getUserProperties(String str, String str2, boolean z8, com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        this.f16967a.e().D(new RunnableC2411o4(this, r02, str, str2, z8));
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void initForTests(@NonNull Map map) throws RemoteException {
        i();
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void initialize(Y.a aVar, com.google.android.gms.internal.measurement.Z0 z02, long j8) throws RemoteException {
        R2 r22 = this.f16967a;
        if (r22 == null) {
            this.f16967a = R2.a((Context) AbstractC1400p.l((Context) Y.b.k(aVar)), z02, Long.valueOf(j8));
        } else {
            r22.c().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.R0 r02) throws RemoteException {
        i();
        this.f16967a.e().D(new N4(this, r02));
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z8, boolean z9, long j8) throws RemoteException {
        i();
        this.f16967a.H().h0(str, str2, bundle, z8, z9, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.R0 r02, long j8) throws RemoteException {
        Bundle bundle2;
        i();
        AbstractC1400p.f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        this.f16967a.e().D(new V2(this, r02, new G(str2, new C(bundle), MBridgeConstans.DYNAMIC_VIEW_WX_APP, j8), str));
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void logHealthData(int i8, @NonNull String str, @NonNull Y.a aVar, @NonNull Y.a aVar2, @NonNull Y.a aVar3) throws RemoteException {
        Object k8;
        Object k9;
        i();
        Object obj = null;
        if (aVar == null) {
            k8 = null;
        } else {
            k8 = Y.b.k(aVar);
        }
        if (aVar2 == null) {
            k9 = null;
        } else {
            k9 = Y.b.k(aVar2);
        }
        if (aVar3 != null) {
            obj = Y.b.k(aVar3);
        }
        this.f16967a.c().z(i8, true, false, str, k8, k9, obj);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivityCreated(@NonNull Y.a aVar, @NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivityCreated((Activity) Y.b.k(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivityDestroyed(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivityDestroyed((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivityPaused(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivityPaused((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivityResumed(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivityResumed((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivitySaveInstanceState(Y.a aVar, com.google.android.gms.internal.measurement.R0 r02, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        Bundle bundle = new Bundle();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivitySaveInstanceState((Activity) Y.b.k(aVar), bundle);
        }
        try {
            r02.e(bundle);
        } catch (RemoteException e8) {
            this.f16967a.c().L().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivityStarted(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivityStarted((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void onActivityStopped(@NonNull Y.a aVar, long j8) throws RemoteException {
        i();
        Application.ActivityLifecycleCallbacks p02 = this.f16967a.H().p0();
        if (p02 != null) {
            this.f16967a.H().D0();
            p02.onActivityStopped((Activity) Y.b.k(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.R0 r02, long j8) throws RemoteException {
        i();
        r02.e(null);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.W0 w02) throws RemoteException {
        InterfaceC3285t interfaceC3285t;
        i();
        synchronized (this.f16968b) {
            try {
                interfaceC3285t = (InterfaceC3285t) this.f16968b.get(Integer.valueOf(w02.w()));
                if (interfaceC3285t == null) {
                    interfaceC3285t = new a(w02);
                    this.f16968b.put(Integer.valueOf(w02.w()), interfaceC3285t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16967a.H().o0(interfaceC3285t);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void resetAnalyticsData(long j8) throws RemoteException {
        i();
        this.f16967a.H().I(j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        if (bundle == null) {
            this.f16967a.c().G().a("Conditional user property must not be null");
        } else {
            this.f16967a.H().O0(bundle, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setConsent(@NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        this.f16967a.H().Y0(bundle, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j8) throws RemoteException {
        i();
        this.f16967a.H().e1(bundle, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setCurrentScreen(@NonNull Y.a aVar, @NonNull String str, @NonNull String str2, long j8) throws RemoteException {
        i();
        this.f16967a.I().H((Activity) Y.b.k(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setDataCollectionEnabled(boolean z8) throws RemoteException {
        i();
        this.f16967a.H().c1(z8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        i();
        this.f16967a.H().d1(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setDefaultEventParametersWithBackfill(@NonNull Bundle bundle) {
        i();
        this.f16967a.H().f1(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.W0 w02) throws RemoteException {
        i();
        b bVar = new b(w02);
        if (this.f16967a.e().J()) {
            this.f16967a.H().n0(bVar);
        } else {
            this.f16967a.e().D(new P3(this, bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.X0 x02) throws RemoteException {
        i();
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setMeasurementEnabled(boolean z8, long j8) throws RemoteException {
        i();
        this.f16967a.H().Z(Boolean.valueOf(z8));
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setMinimumSessionDuration(long j8) throws RemoteException {
        i();
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setSessionTimeoutDuration(long j8) throws RemoteException {
        i();
        this.f16967a.H().W0(j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setSgtmDebugInfo(@NonNull Intent intent) throws RemoteException {
        i();
        this.f16967a.H().K(intent);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setUserId(@NonNull String str, long j8) throws RemoteException {
        i();
        this.f16967a.H().b0(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Y.a aVar, boolean z8, long j8) throws RemoteException {
        i();
        this.f16967a.H().k0(str, str2, Y.b.k(aVar), z8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.Q0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.W0 w02) throws RemoteException {
        InterfaceC3285t interfaceC3285t;
        i();
        synchronized (this.f16968b) {
            interfaceC3285t = (InterfaceC3285t) this.f16968b.remove(Integer.valueOf(w02.w()));
        }
        if (interfaceC3285t == null) {
            interfaceC3285t = new a(w02);
        }
        this.f16967a.H().U0(interfaceC3285t);
    }
}
