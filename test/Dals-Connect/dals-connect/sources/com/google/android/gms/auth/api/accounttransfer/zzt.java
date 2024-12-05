package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f10366f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Indicator
    private final Set<Integer> f10367g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10368h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10369i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private int f10370j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private byte[] f10371k;

    @SafeParcelable.Field
    private PendingIntent l;

    @SafeParcelable.Field
    private DeviceMetaData m;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f10366f = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.L("accountType", 2));
        hashMap.put("status", FastJsonResponse.Field.J("status", 3));
        hashMap.put("transferBytes", FastJsonResponse.Field.w("transferBytes", 4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) PendingIntent pendingIntent, @SafeParcelable.Param(id = 6) DeviceMetaData deviceMetaData) {
        this.f10367g = set;
        this.f10368h = i2;
        this.f10369i = str;
        this.f10370j = i3;
        this.f10371k = bArr;
        this.l = pendingIntent;
        this.m = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public /* synthetic */ Map a() {
        return f10366f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object b(FastJsonResponse.Field field) {
        int Y = field.Y();
        if (Y == 1) {
            return Integer.valueOf(this.f10368h);
        }
        if (Y == 2) {
            return this.f10369i;
        }
        if (Y == 3) {
            return Integer.valueOf(this.f10370j);
        }
        if (Y == 4) {
            return this.f10371k;
        }
        int Y2 = field.Y();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(Y2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean d(FastJsonResponse.Field field) {
        return this.f10367g.contains(Integer.valueOf(field.Y()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        Set<Integer> set = this.f10367g;
        if (set.contains(1)) {
            SafeParcelWriter.i(parcel, 1, this.f10368h);
        }
        if (set.contains(2)) {
            SafeParcelWriter.q(parcel, 2, this.f10369i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.i(parcel, 3, this.f10370j);
        }
        if (set.contains(4)) {
            SafeParcelWriter.e(parcel, 4, this.f10371k, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.o(parcel, 5, this.l, i2, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.o(parcel, 6, this.m, i2, true);
        }
        SafeParcelWriter.b(parcel, a);
    }

    public zzt() {
        this.f10367g = new c.e.b(3);
        this.f10368h = 1;
    }
}
