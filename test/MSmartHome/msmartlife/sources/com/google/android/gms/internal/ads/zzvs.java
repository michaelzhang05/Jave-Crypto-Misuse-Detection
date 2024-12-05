package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzvs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvs> CREATOR = new zzvt();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private ParcelFileDescriptor f15685f;

    public zzvs() {
        this(null);
    }

    private final synchronized ParcelFileDescriptor D() {
        return this.f15685f;
    }

    public final synchronized boolean w() {
        return this.f15685f != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 2, D(), i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public final synchronized InputStream z() {
        if (this.f15685f == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f15685f);
        this.f15685f = null;
        return autoCloseInputStream;
    }

    @SafeParcelable.Constructor
    public zzvs(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f15685f = parcelFileDescriptor;
    }
}
