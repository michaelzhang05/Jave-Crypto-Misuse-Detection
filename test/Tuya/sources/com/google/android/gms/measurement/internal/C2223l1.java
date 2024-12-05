package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import m0.InterfaceC3391d;

/* renamed from: com.google.android.gms.measurement.internal.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2223l1 extends com.google.android.gms.internal.measurement.P implements InterfaceC3391d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2223l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // m0.InterfaceC3391d
    public final void C(C2270v c2270v, D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, c2270v);
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(1, i8);
    }

    @Override // m0.InterfaceC3391d
    public final List D(String str, String str2, String str3) {
        Parcel i8 = i();
        i8.writeString(null);
        i8.writeString(str2);
        i8.writeString(str3);
        Parcel j8 = j(17, i8);
        ArrayList createTypedArrayList = j8.createTypedArrayList(C2173d.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    @Override // m0.InterfaceC3391d
    public final void M(D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(4, i8);
    }

    @Override // m0.InterfaceC3391d
    public final List P(String str, String str2, D4 d42) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        Parcel j8 = j(16, i8);
        ArrayList createTypedArrayList = j8.createTypedArrayList(C2173d.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    @Override // m0.InterfaceC3391d
    public final void S(long j8, String str, String str2, String str3) {
        Parcel i8 = i();
        i8.writeLong(j8);
        i8.writeString(str);
        i8.writeString(str2);
        i8.writeString(str3);
        l(10, i8);
    }

    @Override // m0.InterfaceC3391d
    public final void V(D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(20, i8);
    }

    @Override // m0.InterfaceC3391d
    public final List W(String str, String str2, boolean z8, D4 d42) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        int i9 = com.google.android.gms.internal.measurement.S.f15543b;
        i8.writeInt(z8 ? 1 : 0);
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        Parcel j8 = j(14, i8);
        ArrayList createTypedArrayList = j8.createTypedArrayList(u4.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    @Override // m0.InterfaceC3391d
    public final void c0(D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(18, i8);
    }

    @Override // m0.InterfaceC3391d
    public final void e0(C2173d c2173d, D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, c2173d);
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(12, i8);
    }

    @Override // m0.InterfaceC3391d
    public final byte[] g0(C2270v c2270v, String str) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, c2270v);
        i8.writeString(str);
        Parcel j8 = j(9, i8);
        byte[] createByteArray = j8.createByteArray();
        j8.recycle();
        return createByteArray;
    }

    @Override // m0.InterfaceC3391d
    public final void h0(u4 u4Var, D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, u4Var);
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(2, i8);
    }

    @Override // m0.InterfaceC3391d
    public final void o(D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(6, i8);
    }

    @Override // m0.InterfaceC3391d
    public final void s(Bundle bundle, D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, bundle);
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        l(19, i8);
    }

    @Override // m0.InterfaceC3391d
    public final List t(String str, String str2, String str3, boolean z8) {
        Parcel i8 = i();
        i8.writeString(null);
        i8.writeString(str2);
        i8.writeString(str3);
        int i9 = com.google.android.gms.internal.measurement.S.f15543b;
        i8.writeInt(z8 ? 1 : 0);
        Parcel j8 = j(15, i8);
        ArrayList createTypedArrayList = j8.createTypedArrayList(u4.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    @Override // m0.InterfaceC3391d
    public final String z(D4 d42) {
        Parcel i8 = i();
        com.google.android.gms.internal.measurement.S.d(i8, d42);
        Parcel j8 = j(11, i8);
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }
}
