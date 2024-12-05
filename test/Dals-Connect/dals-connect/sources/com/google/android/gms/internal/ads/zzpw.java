package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzpw extends zzpv {
    public static final Parcelable.Creator<zzpw> CREATOR = new x20();

    /* renamed from: g, reason: collision with root package name */
    private final String f15420g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15421h;

    public zzpw(String str, String str2, String str3) {
        super(str);
        this.f15420g = null;
        this.f15421h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpw.class == obj.getClass()) {
            zzpw zzpwVar = (zzpw) obj;
            if (this.f15419f.equals(zzpwVar.f15419f) && zzsy.g(this.f15420g, zzpwVar.f15420g) && zzsy.g(this.f15421h, zzpwVar.f15421h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f15419f.hashCode() + 527) * 31;
        String str = this.f15420g;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15421h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f15419f);
        parcel.writeString(this.f15420g);
        parcel.writeString(this.f15421h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpw(Parcel parcel) {
        super(parcel.readString());
        this.f15420g = parcel.readString();
        this.f15421h = parcel.readString();
    }
}
