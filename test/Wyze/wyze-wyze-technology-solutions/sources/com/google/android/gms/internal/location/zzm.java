package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private zzj f15918h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private List<ClientIdentity> f15919i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private String f15920j;

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    static final List<ClientIdentity> f15916f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    static final zzj f15917g = new zzj();
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 1) zzj zzjVar, @SafeParcelable.Param(id = 2) List<ClientIdentity> list, @SafeParcelable.Param(id = 3) String str) {
        this.f15918h = zzjVar;
        this.f15919i = list;
        this.f15920j = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return Objects.a(this.f15918h, zzmVar.f15918h) && Objects.a(this.f15919i, zzmVar.f15919i) && Objects.a(this.f15920j, zzmVar.f15920j);
    }

    public final int hashCode() {
        return this.f15918h.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 1, this.f15918h, i2, false);
        SafeParcelWriter.u(parcel, 2, this.f15919i, false);
        SafeParcelWriter.q(parcel, 3, this.f15920j, false);
        SafeParcelWriter.b(parcel, a);
    }
}
