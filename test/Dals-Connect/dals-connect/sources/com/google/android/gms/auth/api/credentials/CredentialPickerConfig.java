package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zze();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10378f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10379g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final boolean f10380h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private final boolean f10381i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10382j;

    /* loaded from: classes2.dex */
    public static class Builder {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f10383b = true;

        /* renamed from: c, reason: collision with root package name */
        private int f10384c = 1;

        public CredentialPickerConfig a() {
            return new CredentialPickerConfig(this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Prompt {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z2, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) int i3) {
        this.f10378f = i2;
        this.f10379g = z;
        this.f10380h = z2;
        if (i2 < 2) {
            this.f10381i = z3;
            this.f10382j = z3 ? 3 : 1;
        } else {
            this.f10381i = i3 == 3;
            this.f10382j = i3;
        }
    }

    public final boolean D() {
        return this.f10380h;
    }

    @Deprecated
    public final boolean w() {
        return this.f10382j == 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, z());
        SafeParcelWriter.c(parcel, 2, D());
        SafeParcelWriter.c(parcel, 3, w());
        SafeParcelWriter.i(parcel, 4, this.f10382j);
        SafeParcelWriter.i(parcel, 1000, this.f10378f);
        SafeParcelWriter.b(parcel, a);
    }

    public final boolean z() {
        return this.f10379g;
    }

    private CredentialPickerConfig(Builder builder) {
        this(2, builder.a, builder.f10383b, false, builder.f10384c);
    }
}
