package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f16323f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private int f16324g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private Intent f16325h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) Intent intent) {
        this.f16323f = i2;
        this.f16324g = i3;
        this.f16325h = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.f16324g == 0) {
            return Status.f10556f;
        }
        return Status.f10560j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f16323f);
        SafeParcelWriter.i(parcel, 2, this.f16324g);
        SafeParcelWriter.o(parcel, 3, this.f16325h, i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i2, Intent intent) {
        this(2, 0, null);
    }
}
