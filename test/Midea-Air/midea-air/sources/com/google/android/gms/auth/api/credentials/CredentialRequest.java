package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zzg();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10385f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10386g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String[] f10387h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final CredentialPickerConfig f10388i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final CredentialPickerConfig f10389j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10390k;

    @SafeParcelable.Field
    private final String l;

    @SafeParcelable.Field
    private final String m;

    @SafeParcelable.Field
    private final boolean n;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f10391b = false;

        /* renamed from: c, reason: collision with root package name */
        private String f10392c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param(id = 4) CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z3) {
        this.f10385f = i2;
        this.f10386g = z;
        this.f10387h = (String[]) Preconditions.j(strArr);
        this.f10388i = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().a() : credentialPickerConfig;
        this.f10389j = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().a() : credentialPickerConfig2;
        if (i2 < 3) {
            this.f10390k = true;
            this.l = null;
            this.m = null;
        } else {
            this.f10390k = z2;
            this.l = str;
            this.m = str2;
        }
        this.n = z3;
    }

    public final CredentialPickerConfig D() {
        return this.f10388i;
    }

    public final String J() {
        return this.m;
    }

    public final String L() {
        return this.l;
    }

    public final boolean P() {
        return this.f10390k;
    }

    public final boolean Y() {
        return this.f10386g;
    }

    public final String[] w() {
        return this.f10387h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, Y());
        SafeParcelWriter.r(parcel, 2, w(), false);
        SafeParcelWriter.o(parcel, 3, D(), i2, false);
        SafeParcelWriter.o(parcel, 4, z(), i2, false);
        SafeParcelWriter.c(parcel, 5, P());
        SafeParcelWriter.q(parcel, 6, L(), false);
        SafeParcelWriter.q(parcel, 7, J(), false);
        SafeParcelWriter.i(parcel, 1000, this.f10385f);
        SafeParcelWriter.c(parcel, 8, this.n);
        SafeParcelWriter.b(parcel, a);
    }

    public final CredentialPickerConfig z() {
        return this.f10389j;
    }
}
