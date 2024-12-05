package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new zao();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10880f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10881g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10882h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private final Scope[] f10883i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public SignInButtonConfig(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) Scope[] scopeArr) {
        this.f10880f = i2;
        this.f10881g = i3;
        this.f10882h = i4;
        this.f10883i = scopeArr;
    }

    @Deprecated
    public Scope[] D() {
        return this.f10883i;
    }

    public int w() {
        return this.f10881g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10880f);
        SafeParcelWriter.i(parcel, 2, w());
        SafeParcelWriter.i(parcel, 3, z());
        SafeParcelWriter.t(parcel, 4, D(), i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public int z() {
        return this.f10882h;
    }

    public SignInButtonConfig(int i2, int i3, Scope[] scopeArr) {
        this(1, i2, i3, null);
    }
}
