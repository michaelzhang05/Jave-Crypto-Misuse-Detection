package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new zzj();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10394f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final CredentialPickerConfig f10395g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10396h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10397i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final String[] f10398j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10399k;

    @SafeParcelable.Field
    private final String l;

    @SafeParcelable.Field
    private final String m;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private CredentialPickerConfig a = new CredentialPickerConfig.Builder().a();

        /* renamed from: b, reason: collision with root package name */
        private boolean f10400b = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2) {
        this.f10394f = i2;
        this.f10395g = (CredentialPickerConfig) Preconditions.j(credentialPickerConfig);
        this.f10396h = z;
        this.f10397i = z2;
        this.f10398j = (String[]) Preconditions.j(strArr);
        if (i2 < 2) {
            this.f10399k = true;
            this.l = null;
            this.m = null;
        } else {
            this.f10399k = z3;
            this.l = str;
            this.m = str2;
        }
    }

    public final String D() {
        return this.m;
    }

    public final String J() {
        return this.l;
    }

    public final boolean L() {
        return this.f10396h;
    }

    public final boolean P() {
        return this.f10399k;
    }

    public final String[] w() {
        return this.f10398j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 1, z(), i2, false);
        SafeParcelWriter.c(parcel, 2, L());
        SafeParcelWriter.c(parcel, 3, this.f10397i);
        SafeParcelWriter.r(parcel, 4, w(), false);
        SafeParcelWriter.c(parcel, 5, P());
        SafeParcelWriter.q(parcel, 6, J(), false);
        SafeParcelWriter.q(parcel, 7, D(), false);
        SafeParcelWriter.i(parcel, 1000, this.f10394f);
        SafeParcelWriter.b(parcel, a);
    }

    public final CredentialPickerConfig z() {
        return this.f10395g;
    }
}
