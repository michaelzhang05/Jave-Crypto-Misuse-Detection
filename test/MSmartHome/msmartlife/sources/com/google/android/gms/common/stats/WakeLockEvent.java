package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import okhttp3.HttpUrl;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10984f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f10985g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private int f10986h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10987i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10988j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f10989k;

    @SafeParcelable.Field
    private final int l;

    @SafeParcelable.Field
    private final List<String> m;

    @SafeParcelable.Field
    private final String n;

    @SafeParcelable.Field
    private final long o;

    @SafeParcelable.Field
    private int p;

    @SafeParcelable.Field
    private final String q;

    @SafeParcelable.Field
    private final float r;

    @SafeParcelable.Field
    private final long s;

    @SafeParcelable.Field
    private final boolean t;
    private long u = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 11) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i4, @SafeParcelable.Param(id = 6) List<String> list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f2, @SafeParcelable.Param(id = 16) long j4, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f10984f = i2;
        this.f10985g = j2;
        this.f10986h = i3;
        this.f10987i = str;
        this.f10988j = str3;
        this.f10989k = str5;
        this.l = i4;
        this.m = list;
        this.n = str2;
        this.o = j3;
        this.p = i5;
        this.q = str4;
        this.r = f2;
        this.s = j4;
        this.t = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long D() {
        return this.u;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String J() {
        String str = this.f10987i;
        int i2 = this.l;
        List<String> list = this.m;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String join = list == null ? HttpUrl.FRAGMENT_ENCODE_SET : TextUtils.join(",", list);
        int i3 = this.p;
        String str3 = this.f10988j;
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = this.q;
        if (str4 == null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        float f2 = this.r;
        String str5 = this.f10989k;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int w() {
        return this.f10986h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10984f);
        SafeParcelWriter.l(parcel, 2, z());
        SafeParcelWriter.q(parcel, 4, this.f10987i, false);
        SafeParcelWriter.i(parcel, 5, this.l);
        SafeParcelWriter.s(parcel, 6, this.m, false);
        SafeParcelWriter.l(parcel, 8, this.o);
        SafeParcelWriter.q(parcel, 10, this.f10988j, false);
        SafeParcelWriter.i(parcel, 11, w());
        SafeParcelWriter.q(parcel, 12, this.n, false);
        SafeParcelWriter.q(parcel, 13, this.q, false);
        SafeParcelWriter.i(parcel, 14, this.p);
        SafeParcelWriter.g(parcel, 15, this.r);
        SafeParcelWriter.l(parcel, 16, this.s);
        SafeParcelWriter.q(parcel, 17, this.f10989k, false);
        SafeParcelWriter.c(parcel, 18, this.t);
        SafeParcelWriter.b(parcel, a);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long z() {
        return this.f10985g;
    }
}
