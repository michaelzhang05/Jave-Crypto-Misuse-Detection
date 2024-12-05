package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Q0 extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(R0 r02);

    void getAppInstanceId(R0 r02);

    void getCachedAppInstanceId(R0 r02);

    void getConditionalUserProperties(String str, String str2, R0 r02);

    void getCurrentScreenClass(R0 r02);

    void getCurrentScreenName(R0 r02);

    void getGmpAppId(R0 r02);

    void getMaxUserProperties(String str, R0 r02);

    void getSessionId(R0 r02);

    void getTestFlag(R0 r02, int i8);

    void getUserProperties(String str, String str2, boolean z8, R0 r02);

    void initForTests(Map map);

    void initialize(Y.a aVar, Z0 z02, long j8);

    void isDataCollectionEnabled(R0 r02);

    void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, R0 r02, long j8);

    void logHealthData(int i8, String str, Y.a aVar, Y.a aVar2, Y.a aVar3);

    void onActivityCreated(Y.a aVar, Bundle bundle, long j8);

    void onActivityDestroyed(Y.a aVar, long j8);

    void onActivityPaused(Y.a aVar, long j8);

    void onActivityResumed(Y.a aVar, long j8);

    void onActivitySaveInstanceState(Y.a aVar, R0 r02, long j8);

    void onActivityStarted(Y.a aVar, long j8);

    void onActivityStopped(Y.a aVar, long j8);

    void performAction(Bundle bundle, R0 r02, long j8);

    void registerOnMeasurementEventListener(W0 w02);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(Y.a aVar, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z8);

    void setDefaultEventParameters(Bundle bundle);

    void setDefaultEventParametersWithBackfill(Bundle bundle);

    void setEventInterceptor(W0 w02);

    void setInstanceIdProvider(X0 x02);

    void setMeasurementEnabled(boolean z8, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, Y.a aVar, boolean z8, long j8);

    void unregisterOnMeasurementEventListener(W0 w02);
}
