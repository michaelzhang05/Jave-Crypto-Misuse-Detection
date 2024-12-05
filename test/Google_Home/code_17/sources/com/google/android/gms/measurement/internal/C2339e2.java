package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC2066a0;
import java.util.ArrayList;
import java.util.List;
import l0.C3266a;
import l0.InterfaceC3272g;

/* renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2339e2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC3272g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2339e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // l0.InterfaceC3272g
    public final void B(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(4, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void D(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(18, h8);
    }

    @Override // l0.InterfaceC3272g
    public final C3266a G(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        Parcel i8 = i(21, h8);
        C3266a c3266a = (C3266a) AbstractC2066a0.a(i8, C3266a.CREATOR);
        i8.recycle();
        return c3266a;
    }

    @Override // l0.InterfaceC3272g
    public final void L(long j8, String str, String str2, String str3) {
        Parcel h8 = h();
        h8.writeLong(j8);
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeString(str3);
        k(10, h8);
    }

    @Override // l0.InterfaceC3272g
    public final List N(b6 b6Var, Bundle bundle) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        AbstractC2066a0.d(h8, bundle);
        Parcel i8 = i(24, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(C2481y5.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3272g
    public final void O(C2350g c2350g) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, c2350g);
        k(13, h8);
    }

    @Override // l0.InterfaceC3272g
    public final String S(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        Parcel i8 = i(11, h8);
        String readString = i8.readString();
        i8.recycle();
        return readString;
    }

    @Override // l0.InterfaceC3272g
    public final List T(String str, String str2, String str3) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeString(str3);
        Parcel i8 = i(17, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(C2350g.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3272g
    public final void U(Bundle bundle, b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, bundle);
        AbstractC2066a0.d(h8, b6Var);
        k(28, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void d0(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(6, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void h0(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(25, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void k0(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(20, h8);
    }

    @Override // l0.InterfaceC3272g
    public final List l0(String str, String str2, boolean z8, b6 b6Var) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2066a0.e(h8, z8);
        AbstractC2066a0.d(h8, b6Var);
        Parcel i8 = i(14, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(V5.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3272g
    public final void m(G g8, String str, String str2) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, g8);
        h8.writeString(str);
        h8.writeString(str2);
        k(5, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void m0(V5 v52, b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, v52);
        AbstractC2066a0.d(h8, b6Var);
        k(2, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void n(Bundle bundle, b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, bundle);
        AbstractC2066a0.d(h8, b6Var);
        k(19, h8);
    }

    @Override // l0.InterfaceC3272g
    public final byte[] o(G g8, String str) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, g8);
        h8.writeString(str);
        Parcel i8 = i(9, h8);
        byte[] createByteArray = i8.createByteArray();
        i8.recycle();
        return createByteArray;
    }

    @Override // l0.InterfaceC3272g
    public final void o0(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(26, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void p(G g8, b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, g8);
        AbstractC2066a0.d(h8, b6Var);
        k(1, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void r(b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, b6Var);
        k(27, h8);
    }

    @Override // l0.InterfaceC3272g
    public final void t(C2350g c2350g, b6 b6Var) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, c2350g);
        AbstractC2066a0.d(h8, b6Var);
        k(12, h8);
    }

    @Override // l0.InterfaceC3272g
    public final List u(String str, String str2, b6 b6Var) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2066a0.d(h8, b6Var);
        Parcel i8 = i(16, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(C2350g.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }

    @Override // l0.InterfaceC3272g
    public final List z(String str, String str2, String str3, boolean z8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        h8.writeString(str3);
        AbstractC2066a0.e(h8, z8);
        Parcel i8 = i(15, h8);
        ArrayList createTypedArrayList = i8.createTypedArrayList(V5.CREATOR);
        i8.recycle();
        return createTypedArrayList;
    }
}
