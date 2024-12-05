package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzps extends zzpv {
    public static final Parcelable.Creator<zzps> CREATOR = new w20();

    /* renamed from: g, reason: collision with root package name */
    private final String f15416g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15417h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15418i;

    public zzps(String str, String str2, String str3) {
        super("COMM");
        this.f15416g = str;
        this.f15417h = str2;
        this.f15418i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzps.class == obj.getClass()) {
            zzps zzpsVar = (zzps) obj;
            if (zzsy.g(this.f15417h, zzpsVar.f15417h) && zzsy.g(this.f15416g, zzpsVar.f15416g) && zzsy.g(this.f15418i, zzpsVar.f15418i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15416g;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f15417h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15418i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f15419f);
        parcel.writeString(this.f15416g);
        parcel.writeString(this.f15418i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzps(Parcel parcel) {
        super("COMM");
        this.f15416g = parcel.readString();
        this.f15417h = parcel.readString();
        this.f15418i = parcel.readString();
    }
}
