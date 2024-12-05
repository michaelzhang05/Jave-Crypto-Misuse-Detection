package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1996g0;
import com.google.android.gms.internal.measurement.C2077q0;
import com.google.android.gms.internal.measurement.InterfaceC2029k0;
import com.google.android.gms.internal.measurement.InterfaceC2053n0;
import com.google.android.gms.internal.measurement.InterfaceC2069p0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC1996g0 {

    /* renamed from: a, reason: collision with root package name */
    Y1 f16009a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16010b = new ArrayMap();

    private final void j() {
        if (this.f16009a != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void l(InterfaceC2029k0 interfaceC2029k0, String str) {
        j();
        this.f16009a.N().K(interfaceC2029k0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void beginAdUnitExposure(@NonNull String str, long j8) throws RemoteException {
        j();
        this.f16009a.y().l(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        j();
        this.f16009a.I().o(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void clearMeasurementEnabled(long j8) throws RemoteException {
        j();
        this.f16009a.I().I(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void endAdUnitExposure(@NonNull String str, long j8) throws RemoteException {
        j();
        this.f16009a.y().m(str, j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void generateEventId(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        long t02 = this.f16009a.N().t0();
        j();
        this.f16009a.N().J(interfaceC2029k0, t02);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getAppInstanceId(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        this.f16009a.f().z(new N2(this, interfaceC2029k0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getCachedAppInstanceId(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        l(interfaceC2029k0, this.f16009a.I().V());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getConditionalUserProperties(String str, String str2, InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        this.f16009a.f().z(new z4(this, interfaceC2029k0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getCurrentScreenClass(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        l(interfaceC2029k0, this.f16009a.I().W());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getCurrentScreenName(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        l(interfaceC2029k0, this.f16009a.I().X());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getGmpAppId(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        String str;
        j();
        Y2 I8 = this.f16009a.I();
        if (I8.f16777a.O() != null) {
            str = I8.f16777a.O();
        } else {
            try {
                str = m0.w.b(I8.f16777a.c(), "google_app_id", I8.f16777a.R());
            } catch (IllegalStateException e8) {
                I8.f16777a.d().r().b("getGoogleAppId failed with exception", e8);
                str = null;
            }
        }
        l(interfaceC2029k0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getMaxUserProperties(String str, InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        this.f16009a.I().Q(str);
        j();
        this.f16009a.N().I(interfaceC2029k0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getSessionId(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        Y2 I8 = this.f16009a.I();
        I8.f16777a.f().z(new L2(I8, interfaceC2029k0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getTestFlag(InterfaceC2029k0 interfaceC2029k0, int i8) throws RemoteException {
        j();
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            return;
                        }
                        this.f16009a.N().E(interfaceC2029k0, this.f16009a.I().R().booleanValue());
                        return;
                    }
                    this.f16009a.N().I(interfaceC2029k0, this.f16009a.I().T().intValue());
                    return;
                }
                y4 N8 = this.f16009a.N();
                double doubleValue = this.f16009a.I().S().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble(CampaignEx.JSON_KEY_AD_R, doubleValue);
                try {
                    interfaceC2029k0.G(bundle);
                    return;
                } catch (RemoteException e8) {
                    N8.f16777a.d().w().b("Error returning double value to wrapper", e8);
                    return;
                }
            }
            this.f16009a.N().J(interfaceC2029k0, this.f16009a.I().U().longValue());
            return;
        }
        this.f16009a.N().K(interfaceC2029k0, this.f16009a.I().Y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void getUserProperties(String str, String str2, boolean z8, InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        this.f16009a.f().z(new L3(this, interfaceC2029k0, str, str2, z8));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void initForTests(@NonNull Map map) throws RemoteException {
        j();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void initialize(Z.a aVar, C2077q0 c2077q0, long j8) throws RemoteException {
        Y1 y12 = this.f16009a;
        if (y12 == null) {
            this.f16009a = Y1.H((Context) AbstractC1319p.l((Context) Z.b.l(aVar)), c2077q0, Long.valueOf(j8));
        } else {
            y12.d().w().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void isDataCollectionEnabled(InterfaceC2029k0 interfaceC2029k0) throws RemoteException {
        j();
        this.f16009a.f().z(new A4(this, interfaceC2029k0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z8, boolean z9, long j8) throws RemoteException {
        j();
        this.f16009a.I().s(str, str2, bundle, z8, z9, j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2029k0 interfaceC2029k0, long j8) throws RemoteException {
        Bundle bundle2;
        j();
        AbstractC1319p.f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        this.f16009a.f().z(new RunnableC2225l3(this, interfaceC2029k0, new C2270v(str2, new C2260t(bundle), MBridgeConstans.DYNAMIC_VIEW_WX_APP, j8), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void logHealthData(int i8, @NonNull String str, @NonNull Z.a aVar, @NonNull Z.a aVar2, @NonNull Z.a aVar3) throws RemoteException {
        Object l8;
        Object l9;
        j();
        Object obj = null;
        if (aVar == null) {
            l8 = null;
        } else {
            l8 = Z.b.l(aVar);
        }
        if (aVar2 == null) {
            l9 = null;
        } else {
            l9 = Z.b.l(aVar2);
        }
        if (aVar3 != null) {
            obj = Z.b.l(aVar3);
        }
        this.f16009a.d().G(i8, true, false, str, l8, l9, obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivityCreated(@NonNull Z.a aVar, @NonNull Bundle bundle, long j8) throws RemoteException {
        j();
        X2 x22 = this.f16009a.I().f16383c;
        if (x22 != null) {
            this.f16009a.I().p();
            x22.onActivityCreated((Activity) Z.b.l(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivityDestroyed(@NonNull Z.a aVar, long j8) throws RemoteException {
        j();
        X2 x22 = this.f16009a.I().f16383c;
        if (x22 != null) {
            this.f16009a.I().p();
            x22.onActivityDestroyed((Activity) Z.b.l(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivityPaused(@NonNull Z.a aVar, long j8) throws RemoteException {
        j();
        X2 x22 = this.f16009a.I().f16383c;
        if (x22 != null) {
            this.f16009a.I().p();
            x22.onActivityPaused((Activity) Z.b.l(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivityResumed(@NonNull Z.a aVar, long j8) throws RemoteException {
        j();
        X2 x22 = this.f16009a.I().f16383c;
        if (x22 != null) {
            this.f16009a.I().p();
            x22.onActivityResumed((Activity) Z.b.l(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivitySaveInstanceState(Z.a aVar, InterfaceC2029k0 interfaceC2029k0, long j8) throws RemoteException {
        j();
        X2 x22 = this.f16009a.I().f16383c;
        Bundle bundle = new Bundle();
        if (x22 != null) {
            this.f16009a.I().p();
            x22.onActivitySaveInstanceState((Activity) Z.b.l(aVar), bundle);
        }
        try {
            interfaceC2029k0.G(bundle);
        } catch (RemoteException e8) {
            this.f16009a.d().w().b("Error returning bundle value to wrapper", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivityStarted(@NonNull Z.a aVar, long j8) throws RemoteException {
        j();
        if (this.f16009a.I().f16383c != null) {
            this.f16009a.I().p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void onActivityStopped(@NonNull Z.a aVar, long j8) throws RemoteException {
        j();
        if (this.f16009a.I().f16383c != null) {
            this.f16009a.I().p();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void performAction(Bundle bundle, InterfaceC2029k0 interfaceC2029k0, long j8) throws RemoteException {
        j();
        interfaceC2029k0.G(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void registerOnMeasurementEventListener(InterfaceC2053n0 interfaceC2053n0) throws RemoteException {
        m0.u uVar;
        j();
        synchronized (this.f16010b) {
            try {
                uVar = (m0.u) this.f16010b.get(Integer.valueOf(interfaceC2053n0.d()));
                if (uVar == null) {
                    uVar = new C4(this, interfaceC2053n0);
                    this.f16010b.put(Integer.valueOf(interfaceC2053n0.d()), uVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16009a.I().x(uVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void resetAnalyticsData(long j8) throws RemoteException {
        j();
        this.f16009a.I().y(j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j8) throws RemoteException {
        j();
        if (bundle == null) {
            this.f16009a.d().r().a("Conditional user property must not be null");
        } else {
            this.f16009a.I().E(bundle, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setConsent(@NonNull final Bundle bundle, final long j8) throws RemoteException {
        j();
        final Y2 I8 = this.f16009a.I();
        I8.f16777a.f().A(new Runnable() { // from class: com.google.android.gms.measurement.internal.x2
            @Override // java.lang.Runnable
            public final void run() {
                Y2 y22 = Y2.this;
                Bundle bundle2 = bundle;
                long j9 = j8;
                if (TextUtils.isEmpty(y22.f16777a.B().t())) {
                    y22.G(bundle2, 0, j9);
                } else {
                    y22.f16777a.d().x().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setConsentThirdParty(@NonNull Bundle bundle, long j8) throws RemoteException {
        j();
        this.f16009a.I().G(bundle, -20, j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setCurrentScreen(@NonNull Z.a aVar, @NonNull String str, @NonNull String str2, long j8) throws RemoteException {
        j();
        this.f16009a.K().D((Activity) Z.b.l(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setDataCollectionEnabled(boolean z8) throws RemoteException {
        j();
        Y2 I8 = this.f16009a.I();
        I8.i();
        I8.f16777a.f().z(new V2(I8, z8));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        final Bundle bundle2;
        j();
        final Y2 I8 = this.f16009a.I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I8.f16777a.f().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.y2
            @Override // java.lang.Runnable
            public final void run() {
                Y2.this.q(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setEventInterceptor(InterfaceC2053n0 interfaceC2053n0) throws RemoteException {
        j();
        B4 b42 = new B4(this, interfaceC2053n0);
        if (this.f16009a.f().C()) {
            this.f16009a.I().H(b42);
        } else {
            this.f16009a.f().z(new l4(this, b42));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setInstanceIdProvider(InterfaceC2069p0 interfaceC2069p0) throws RemoteException {
        j();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setMeasurementEnabled(boolean z8, long j8) throws RemoteException {
        j();
        this.f16009a.I().I(Boolean.valueOf(z8));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setMinimumSessionDuration(long j8) throws RemoteException {
        j();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setSessionTimeoutDuration(long j8) throws RemoteException {
        j();
        Y2 I8 = this.f16009a.I();
        I8.f16777a.f().z(new C2(I8, j8));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setUserId(@NonNull final String str, long j8) throws RemoteException {
        j();
        final Y2 I8 = this.f16009a.I();
        if (str != null && TextUtils.isEmpty(str)) {
            I8.f16777a.d().w().a("User ID must be non-empty or null");
        } else {
            I8.f16777a.f().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.z2
                @Override // java.lang.Runnable
                public final void run() {
                    Y2 y22 = Y2.this;
                    if (y22.f16777a.B().w(str)) {
                        y22.f16777a.B().v();
                    }
                }
            });
            I8.L(null, "_id", str, true, j8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Z.a aVar, boolean z8, long j8) throws RemoteException {
        j();
        this.f16009a.I().L(str, str2, Z.b.l(aVar), z8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public void unregisterOnMeasurementEventListener(InterfaceC2053n0 interfaceC2053n0) throws RemoteException {
        m0.u uVar;
        j();
        synchronized (this.f16010b) {
            uVar = (m0.u) this.f16010b.remove(Integer.valueOf(interfaceC2053n0.d()));
        }
        if (uVar == null) {
            uVar = new C4(this, interfaceC2053n0);
        }
        this.f16009a.I().N(uVar);
    }
}
