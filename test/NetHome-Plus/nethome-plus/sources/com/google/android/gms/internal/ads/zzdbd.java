package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbp;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzdbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdbd> CREATOR = new zzdbe();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f14677f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private zzbp.zza f14678g = null;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f14679h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzdbd(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f14677f = i2;
        this.f14679h = bArr;
        z();
    }

    private final void z() {
        zzbp.zza zzaVar = this.f14678g;
        if (zzaVar != null || this.f14679h == null) {
            if (zzaVar == null || this.f14679h != null) {
                if (zzaVar != null && this.f14679h != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaVar == null && this.f14679h == null) {
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Impossible");
            }
        }
    }

    public final zzbp.zza w() {
        if (!(this.f14678g != null)) {
            try {
                this.f14678g = zzbp.zza.p0(this.f14679h, zzdno.e());
                this.f14679h = null;
            } catch (zzdok e2) {
                throw new IllegalStateException(e2);
            }
        }
        z();
        return this.f14678g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f14677f);
        byte[] bArr = this.f14679h;
        if (bArr == null) {
            bArr = this.f14678g.g();
        }
        SafeParcelWriter.e(parcel, 2, bArr, false);
        SafeParcelWriter.b(parcel, a);
    }
}
