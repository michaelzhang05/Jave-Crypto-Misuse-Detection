package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zztb implements Parcelable {
    public static final Parcelable.Creator<zztb> CREATOR = new q30();

    /* renamed from: f, reason: collision with root package name */
    public final int f15575f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15576g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15577h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f15578i;

    /* renamed from: j, reason: collision with root package name */
    private int f15579j;

    public zztb(int i2, int i3, int i4, byte[] bArr) {
        this.f15575f = i2;
        this.f15576g = i3;
        this.f15577h = i4;
        this.f15578i = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztb.class == obj.getClass()) {
            zztb zztbVar = (zztb) obj;
            if (this.f15575f == zztbVar.f15575f && this.f15576g == zztbVar.f15576g && this.f15577h == zztbVar.f15577h && Arrays.equals(this.f15578i, zztbVar.f15578i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15579j == 0) {
            this.f15579j = ((((((this.f15575f + 527) * 31) + this.f15576g) * 31) + this.f15577h) * 31) + Arrays.hashCode(this.f15578i);
        }
        return this.f15579j;
    }

    public final String toString() {
        int i2 = this.f15575f;
        int i3 = this.f15576g;
        int i4 = this.f15577h;
        boolean z = this.f15578i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f15575f);
        parcel.writeInt(this.f15576g);
        parcel.writeInt(this.f15577h);
        parcel.writeInt(this.f15578i != null ? 1 : 0);
        byte[] bArr = this.f15578i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztb(Parcel parcel) {
        this.f15575f = parcel.readInt();
        this.f15576g = parcel.readInt();
        this.f15577h = parcel.readInt();
        this.f15578i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
