package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzvv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    public final String f15686f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final long f15687g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f15688h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f15689i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f15690j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private final Bundle f15691k;

    @SafeParcelable.Field
    public final boolean l;

    @SafeParcelable.Field
    public long m;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzvv(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j3) {
        this.f15686f = str;
        this.f15687g = j2;
        this.f15688h = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        this.f15689i = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        this.f15690j = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        this.f15691k = bundle == null ? new Bundle() : bundle;
        this.l = z;
        this.m = j3;
    }

    public static zzvv w(String str) {
        return z(Uri.parse(str));
    }

    public static zzvv z(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzbad.i(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            zzk.zzli();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzvv(queryParameter, parseLong, host, str, str2, bundle, equals, 0L);
        } catch (NullPointerException | NumberFormatException e2) {
            zzbad.d("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.q(parcel, 2, this.f15686f, false);
        SafeParcelWriter.l(parcel, 3, this.f15687g);
        SafeParcelWriter.q(parcel, 4, this.f15688h, false);
        SafeParcelWriter.q(parcel, 5, this.f15689i, false);
        SafeParcelWriter.q(parcel, 6, this.f15690j, false);
        SafeParcelWriter.d(parcel, 7, this.f15691k, false);
        SafeParcelWriter.c(parcel, 8, this.l);
        SafeParcelWriter.l(parcel, 9, this.m);
        SafeParcelWriter.b(parcel, a);
    }
}
