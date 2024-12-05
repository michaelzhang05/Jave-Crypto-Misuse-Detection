package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> f10348f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Indicator
    private final Set<Integer> f10349g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10350h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private ArrayList<zzr> f10351i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private int f10352j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private zzo f10353k;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f10348f = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.D("authenticatorData", 2, zzr.class));
        hashMap.put("progress", FastJsonResponse.Field.z("progress", 4, zzo.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zzr> arrayList, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) zzo zzoVar) {
        this.f10349g = set;
        this.f10350h = i2;
        this.f10351i = arrayList;
        this.f10352j = i3;
        this.f10353k = zzoVar;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return f10348f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int Y = field.Y();
        if (Y == 1) {
            return Integer.valueOf(this.f10350h);
        }
        if (Y == 2) {
            return this.f10351i;
        }
        if (Y == 4) {
            return this.f10353k;
        }
        int Y2 = field.Y();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(Y2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return this.f10349g.contains(Integer.valueOf(field.Y()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        Set<Integer> set = this.f10349g;
        if (set.contains(1)) {
            SafeParcelWriter.i(parcel, 1, this.f10350h);
        }
        if (set.contains(2)) {
            SafeParcelWriter.u(parcel, 2, this.f10351i, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.i(parcel, 3, this.f10352j);
        }
        if (set.contains(4)) {
            SafeParcelWriter.o(parcel, 4, this.f10353k, i2, true);
        }
        SafeParcelWriter.b(parcel, a);
    }

    public zzl() {
        this.f10349g = new HashSet(1);
        this.f10350h = 1;
    }
}
