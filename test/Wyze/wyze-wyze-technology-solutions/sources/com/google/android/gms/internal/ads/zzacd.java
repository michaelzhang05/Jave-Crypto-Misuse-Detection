package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzacd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzacd> CREATOR = new zzace();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12609f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12610g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final boolean f12611h;

    public zzacd(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 2, this.f12609f);
        SafeParcelWriter.c(parcel, 3, this.f12610g);
        SafeParcelWriter.c(parcel, 4, this.f12611h);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzacd(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) boolean z3) {
        this.f12609f = z;
        this.f12610g = z2;
        this.f12611h = z3;
    }
}
