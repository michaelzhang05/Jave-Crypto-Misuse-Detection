package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new zzye();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f15810f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f15811g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f15812h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f15813i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f15814j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f15815k;

    @SafeParcelable.Field
    public final zzyd[] l;

    @SafeParcelable.Field
    public final boolean m;

    @SafeParcelable.Field
    public final boolean n;

    @SafeParcelable.Field
    public boolean o;

    public zzyd() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    private static int D(DisplayMetrics displayMetrics) {
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public static zzyd J(Context context) {
        return new zzyd("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static zzyd L() {
        return new zzyd("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public static int w(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int z(DisplayMetrics displayMetrics) {
        return (int) (D(displayMetrics) * displayMetrics.density);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f15810f, false);
        SafeParcelWriter.i(parcel, 3, this.f15811g);
        SafeParcelWriter.i(parcel, 4, this.f15812h);
        SafeParcelWriter.c(parcel, 5, this.f15813i);
        SafeParcelWriter.i(parcel, 6, this.f15814j);
        SafeParcelWriter.i(parcel, 7, this.f15815k);
        SafeParcelWriter.t(parcel, 8, this.l, i2, false);
        SafeParcelWriter.c(parcel, 9, this.m);
        SafeParcelWriter.c(parcel, 10, this.n);
        SafeParcelWriter.c(parcel, 11, this.o);
        SafeParcelWriter.b(parcel, a);
    }

    public zzyd(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzyd(android.content.Context r14, com.google.android.gms.ads.AdSize[] r15) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzyd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i4, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) zzyd[] zzydVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4) {
        this.f15810f = str;
        this.f15811g = i2;
        this.f15812h = i3;
        this.f15813i = z;
        this.f15814j = i4;
        this.f15815k = i5;
        this.l = zzydVarArr;
        this.m = z2;
        this.n = z3;
        this.o = z4;
    }
}
