package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdkWithMembers
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10411f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f10412g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    public final PendingIntent f10413h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    public final int f10414i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final Bundle f10415j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    public final byte[] f10416k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ProxyResponse(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) byte[] bArr) {
        this.f10411f = i2;
        this.f10412g = i3;
        this.f10414i = i4;
        this.f10415j = bundle;
        this.f10416k = bArr;
        this.f10413h = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10412g);
        SafeParcelWriter.o(parcel, 2, this.f10413h, i2, false);
        SafeParcelWriter.i(parcel, 3, this.f10414i);
        SafeParcelWriter.d(parcel, 4, this.f10415j, false);
        SafeParcelWriter.e(parcel, 5, this.f10416k, false);
        SafeParcelWriter.i(parcel, 1000, this.f10411f);
        SafeParcelWriter.b(parcel, a);
    }
}
