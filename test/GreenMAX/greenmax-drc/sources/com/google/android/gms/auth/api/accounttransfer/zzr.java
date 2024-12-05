package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.pt.database.room.RoomInstalled;
import cm.aptoide.pt.downloadmanager.Constants;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f10360f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Indicator
    private final Set<Integer> f10361g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10362h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private zzt f10363i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10364j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private String f10365k;

    @SafeParcelable.Field
    private String l;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f10360f = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.z("authenticatorInfo", 2, zzt.class));
        hashMap.put(RoomInstalled.SIGNATURE, FastJsonResponse.Field.L(RoomInstalled.SIGNATURE, 3));
        hashMap.put(Constants.PACKAGE, FastJsonResponse.Field.L(Constants.PACKAGE, 4));
    }

    public zzr() {
        this.f10361g = new HashSet(3);
        this.f10362h = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public /* synthetic */ Map a() {
        return f10360f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object b(FastJsonResponse.Field field) {
        int Y = field.Y();
        if (Y == 1) {
            return Integer.valueOf(this.f10362h);
        }
        if (Y == 2) {
            return this.f10363i;
        }
        if (Y == 3) {
            return this.f10364j;
        }
        if (Y == 4) {
            return this.f10365k;
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
        return this.f10361g.contains(Integer.valueOf(field.Y()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        Set<Integer> set = this.f10361g;
        if (set.contains(1)) {
            SafeParcelWriter.i(parcel, 1, this.f10362h);
        }
        if (set.contains(2)) {
            SafeParcelWriter.o(parcel, 2, this.f10363i, i2, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.q(parcel, 3, this.f10364j, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.q(parcel, 4, this.f10365k, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.q(parcel, 5, this.l, true);
        }
        SafeParcelWriter.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) zzt zztVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3) {
        this.f10361g = set;
        this.f10362h = i2;
        this.f10363i = zztVar;
        this.f10364j = str;
        this.f10365k = str2;
        this.l = str3;
    }
}
