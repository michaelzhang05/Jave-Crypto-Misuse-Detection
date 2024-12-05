package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f15858f = 1;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f15859g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final PendingIntent f15860h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.f15859g = (String) Preconditions.j(str);
        this.f15860h = (PendingIntent) Preconditions.j(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f15858f);
        SafeParcelWriter.q(parcel, 2, this.f15859g, false);
        SafeParcelWriter.o(parcel, 3, this.f15860h, i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
