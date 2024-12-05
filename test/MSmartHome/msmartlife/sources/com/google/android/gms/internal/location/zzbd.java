package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbd extends AbstractSafeParcelable {

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private LocationRequest f15897g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private List<ClientIdentity> f15898h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private String f15899i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f15900j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private boolean f15901k;

    @SafeParcelable.Field
    private boolean l;

    @SafeParcelable.Field
    private String m;
    private boolean n = true;

    /* renamed from: f, reason: collision with root package name */
    static final List<ClientIdentity> f15896f = Collections.emptyList();
    public static final Parcelable.Creator<zzbd> CREATOR = new zzbe();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbd(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.Param(id = 5) List<ClientIdentity> list, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) String str2) {
        this.f15897g = locationRequest;
        this.f15898h = list;
        this.f15899i = str;
        this.f15900j = z;
        this.f15901k = z2;
        this.l = z3;
        this.m = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        return Objects.a(this.f15897g, zzbdVar.f15897g) && Objects.a(this.f15898h, zzbdVar.f15898h) && Objects.a(this.f15899i, zzbdVar.f15899i) && this.f15900j == zzbdVar.f15900j && this.f15901k == zzbdVar.f15901k && this.l == zzbdVar.l && Objects.a(this.m, zzbdVar.m);
    }

    public final int hashCode() {
        return this.f15897g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15897g);
        if (this.f15899i != null) {
            sb.append(" tag=");
            sb.append(this.f15899i);
        }
        if (this.m != null) {
            sb.append(" moduleId=");
            sb.append(this.m);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f15900j);
        sb.append(" clients=");
        sb.append(this.f15898h);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f15901k);
        if (this.l) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.o(parcel, 1, this.f15897g, i2, false);
        SafeParcelWriter.u(parcel, 5, this.f15898h, false);
        SafeParcelWriter.q(parcel, 6, this.f15899i, false);
        SafeParcelWriter.c(parcel, 7, this.f15900j);
        SafeParcelWriter.c(parcel, 8, this.f15901k);
        SafeParcelWriter.c(parcel, 9, this.l);
        SafeParcelWriter.q(parcel, 10, this.m, false);
        SafeParcelWriter.b(parcel, a);
    }
}
