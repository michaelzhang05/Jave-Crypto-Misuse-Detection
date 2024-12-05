package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1987f0 extends P implements InterfaceC2005h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1987f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void beginAdUnitExposure(String str, long j8) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeLong(j8);
        l(23, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        S.d(i8, bundle);
        l(9, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void endAdUnitExposure(String str, long j8) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeLong(j8);
        l(24, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void generateEventId(InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        S.e(i8, interfaceC2029k0);
        l(22, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getCachedAppInstanceId(InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        S.e(i8, interfaceC2029k0);
        l(19, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        S.e(i8, interfaceC2029k0);
        l(10, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getCurrentScreenClass(InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        S.e(i8, interfaceC2029k0);
        l(17, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getCurrentScreenName(InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        S.e(i8, interfaceC2029k0);
        l(16, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getGmpAppId(InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        S.e(i8, interfaceC2029k0);
        l(21, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getMaxUserProperties(String str, InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        i8.writeString(str);
        S.e(i8, interfaceC2029k0);
        l(6, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void getUserProperties(String str, String str2, boolean z8, InterfaceC2029k0 interfaceC2029k0) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        int i9 = S.f15543b;
        i8.writeInt(z8 ? 1 : 0);
        S.e(i8, interfaceC2029k0);
        l(5, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void initialize(Z.a aVar, C2077q0 c2077q0, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        S.d(i8, c2077q0);
        i8.writeLong(j8);
        l(1, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z9, long j8) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        S.d(i8, bundle);
        i8.writeInt(z8 ? 1 : 0);
        i8.writeInt(z9 ? 1 : 0);
        i8.writeLong(j8);
        l(2, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void logHealthData(int i8, String str, Z.a aVar, Z.a aVar2, Z.a aVar3) {
        Parcel i9 = i();
        i9.writeInt(5);
        i9.writeString(str);
        S.e(i9, aVar);
        S.e(i9, aVar2);
        S.e(i9, aVar3);
        l(33, i9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivityCreated(Z.a aVar, Bundle bundle, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        S.d(i8, bundle);
        i8.writeLong(j8);
        l(27, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivityDestroyed(Z.a aVar, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        i8.writeLong(j8);
        l(28, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivityPaused(Z.a aVar, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        i8.writeLong(j8);
        l(29, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivityResumed(Z.a aVar, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        i8.writeLong(j8);
        l(30, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivitySaveInstanceState(Z.a aVar, InterfaceC2029k0 interfaceC2029k0, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        S.e(i8, interfaceC2029k0);
        i8.writeLong(j8);
        l(31, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivityStarted(Z.a aVar, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        i8.writeLong(j8);
        l(25, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void onActivityStopped(Z.a aVar, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        i8.writeLong(j8);
        l(26, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void registerOnMeasurementEventListener(InterfaceC2053n0 interfaceC2053n0) {
        Parcel i8 = i();
        S.e(i8, interfaceC2053n0);
        l(35, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void setConditionalUserProperty(Bundle bundle, long j8) {
        Parcel i8 = i();
        S.d(i8, bundle);
        i8.writeLong(j8);
        l(8, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void setCurrentScreen(Z.a aVar, String str, String str2, long j8) {
        Parcel i8 = i();
        S.e(i8, aVar);
        i8.writeString(str);
        i8.writeString(str2);
        i8.writeLong(j8);
        l(15, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void setDataCollectionEnabled(boolean z8) {
        Parcel i8 = i();
        int i9 = S.f15543b;
        i8.writeInt(z8 ? 1 : 0);
        l(39, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2005h0
    public final void setUserProperty(String str, String str2, Z.a aVar, boolean z8, long j8) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        S.e(i8, aVar);
        i8.writeInt(z8 ? 1 : 0);
        i8.writeLong(j8);
        l(4, i8);
    }
}
