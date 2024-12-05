package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzawc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzawc> CREATOR = new zzawd();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f13021f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f13022g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final zzyd f13023h;

    @SafeParcelable.Constructor
    public zzawc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) zzyd zzydVar) {
        this.f13021f = str;
        this.f13022g = str2;
        this.f13023h = zzydVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 1, this.f13021f, false);
        SafeParcelWriter.q(parcel, 2, this.f13022g, false);
        SafeParcelWriter.o(parcel, 3, this.f13023h, i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
