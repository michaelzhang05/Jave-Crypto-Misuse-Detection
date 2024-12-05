package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16275f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16276g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f16277h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f16278i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) long j3) {
        this.f16275f = i2;
        this.f16276g = i3;
        this.f16277h = j2;
        this.f16278i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzajVar = (zzaj) obj;
            if (this.f16275f == zzajVar.f16275f && this.f16276g == zzajVar.f16276g && this.f16277h == zzajVar.f16277h && this.f16278i == zzajVar.f16278i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.f16276g), Integer.valueOf(this.f16275f), Long.valueOf(this.f16278i), Long.valueOf(this.f16277h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f16275f + " Cell status: " + this.f16276g + " elapsed time NS: " + this.f16278i + " system time ms: " + this.f16277h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16275f);
        SafeParcelWriter.i(parcel, 2, this.f16276g);
        SafeParcelWriter.l(parcel, 3, this.f16277h);
        SafeParcelWriter.l(parcel, 4, this.f16278i);
        SafeParcelWriter.b(parcel, a);
    }
}
