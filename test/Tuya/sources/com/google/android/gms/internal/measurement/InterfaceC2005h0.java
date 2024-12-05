package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2005h0 extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(InterfaceC2029k0 interfaceC2029k0);

    void getAppInstanceId(InterfaceC2029k0 interfaceC2029k0);

    void getCachedAppInstanceId(InterfaceC2029k0 interfaceC2029k0);

    void getConditionalUserProperties(String str, String str2, InterfaceC2029k0 interfaceC2029k0);

    void getCurrentScreenClass(InterfaceC2029k0 interfaceC2029k0);

    void getCurrentScreenName(InterfaceC2029k0 interfaceC2029k0);

    void getGmpAppId(InterfaceC2029k0 interfaceC2029k0);

    void getMaxUserProperties(String str, InterfaceC2029k0 interfaceC2029k0);

    void getSessionId(InterfaceC2029k0 interfaceC2029k0);

    void getTestFlag(InterfaceC2029k0 interfaceC2029k0, int i8);

    void getUserProperties(String str, String str2, boolean z8, InterfaceC2029k0 interfaceC2029k0);

    void initForTests(Map map);

    void initialize(Z.a aVar, C2077q0 c2077q0, long j8);

    void isDataCollectionEnabled(InterfaceC2029k0 interfaceC2029k0);

    void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2029k0 interfaceC2029k0, long j8);

    void logHealthData(int i8, String str, Z.a aVar, Z.a aVar2, Z.a aVar3);

    void onActivityCreated(Z.a aVar, Bundle bundle, long j8);

    void onActivityDestroyed(Z.a aVar, long j8);

    void onActivityPaused(Z.a aVar, long j8);

    void onActivityResumed(Z.a aVar, long j8);

    void onActivitySaveInstanceState(Z.a aVar, InterfaceC2029k0 interfaceC2029k0, long j8);

    void onActivityStarted(Z.a aVar, long j8);

    void onActivityStopped(Z.a aVar, long j8);

    void performAction(Bundle bundle, InterfaceC2029k0 interfaceC2029k0, long j8);

    void registerOnMeasurementEventListener(InterfaceC2053n0 interfaceC2053n0);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(Z.a aVar, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z8);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC2053n0 interfaceC2053n0);

    void setInstanceIdProvider(InterfaceC2069p0 interfaceC2069p0);

    void setMeasurementEnabled(boolean z8, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, Z.a aVar, boolean z8, long j8);

    void unregisterOnMeasurementEventListener(InterfaceC2053n0 interfaceC2053n0);
}
