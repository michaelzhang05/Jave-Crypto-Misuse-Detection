package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zza();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10554f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10555g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public Scope(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str) {
        Preconditions.h(str, "scopeUri must not be null or empty");
        this.f10554f = i2;
        this.f10555g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f10555g.equals(((Scope) obj).f10555g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10555g.hashCode();
    }

    public final String toString() {
        return this.f10555g;
    }

    @KeepForSdk
    public final String w() {
        return this.f10555g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10554f);
        SafeParcelWriter.q(parcel, 2, w(), false);
        SafeParcelWriter.b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
