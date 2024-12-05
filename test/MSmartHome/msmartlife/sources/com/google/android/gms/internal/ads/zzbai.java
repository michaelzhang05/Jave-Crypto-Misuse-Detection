package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbai> CREATOR = new zzbaj();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public String f13150f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public int f13151g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public int f13152h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public boolean f13153i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f13154j;

    public zzbai(int i2, int i3, boolean z) {
        this(i2, i3, z, false, false);
    }

    public static zzbai w() {
        return new zzbai(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f13150f, false);
        SafeParcelWriter.i(parcel, 3, this.f13151g);
        SafeParcelWriter.i(parcel, 4, this.f13152h);
        SafeParcelWriter.c(parcel, 5, this.f13153i);
        SafeParcelWriter.c(parcel, 6, this.f13154j);
        SafeParcelWriter.b(parcel, a);
    }

    public zzbai(int i2, int i3, boolean z, boolean z2) {
        this(i2, i3, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzbai(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbai.<init>(int, int, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbai(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.f13150f = str;
        this.f13151g = i2;
        this.f13152h = i3;
        this.f13153i = z;
        this.f13154j = z2;
    }
}
