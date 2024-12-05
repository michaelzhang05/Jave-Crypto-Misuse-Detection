package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f15855f = 1;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f15856g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final byte[] f15857h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzaf(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.f15856g = (String) Preconditions.j(str);
        this.f15857h = (byte[]) Preconditions.j(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f15855f);
        SafeParcelWriter.q(parcel, 2, this.f15856g, false);
        SafeParcelWriter.e(parcel, 3, this.f15857h, false);
        SafeParcelWriter.b(parcel, a);
    }
}
