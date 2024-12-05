package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzq();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<zzbh> f16230f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f16231g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16232h;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List<zzbh> a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f16233b = 5;

        /* renamed from: c, reason: collision with root package name */
        private String f16234c = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(id = 1) List<zzbh> list, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str) {
        this.f16230f = list;
        this.f16231g = i2;
        this.f16232h = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f16230f);
        int i2 = this.f16231g;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i2);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f16232h);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public int w() {
        return this.f16231g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.u(parcel, 1, this.f16230f, false);
        SafeParcelWriter.i(parcel, 2, w());
        SafeParcelWriter.q(parcel, 3, this.f16232h, false);
        SafeParcelWriter.b(parcel, a);
    }
}
