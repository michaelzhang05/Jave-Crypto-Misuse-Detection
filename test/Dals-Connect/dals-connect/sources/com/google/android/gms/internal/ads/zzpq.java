package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzpq extends zzpv {
    public static final Parcelable.Creator<zzpq> CREATOR = new v20();

    /* renamed from: g, reason: collision with root package name */
    private final String f15412g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15413h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15414i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f15415j;

    public zzpq(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f15412g = str;
        this.f15413h = null;
        this.f15414i = 3;
        this.f15415j = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpq.class == obj.getClass()) {
            zzpq zzpqVar = (zzpq) obj;
            if (this.f15414i == zzpqVar.f15414i && zzsy.g(this.f15412g, zzpqVar.f15412g) && zzsy.g(this.f15413h, zzpqVar.f15413h) && Arrays.equals(this.f15415j, zzpqVar.f15415j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f15414i + 527) * 31;
        String str = this.f15412g;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15413h;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15415j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f15412g);
        parcel.writeString(this.f15413h);
        parcel.writeInt(this.f15414i);
        parcel.writeByteArray(this.f15415j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpq(Parcel parcel) {
        super("APIC");
        this.f15412g = parcel.readString();
        this.f15413h = parcel.readString();
        this.f15414i = parcel.readInt();
        this.f15415j = parcel.createByteArray();
    }
}
