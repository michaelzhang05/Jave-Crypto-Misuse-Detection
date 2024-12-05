package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.Field
    private final List<String> f16279f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final PendingIntent f16280g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final String f16281h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) List<String> list, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 3) String str) {
        this.f16279f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f16280g = pendingIntent;
        this.f16281h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.s(parcel, 1, this.f16279f, false);
        SafeParcelWriter.o(parcel, 2, this.f16280g, i2, false);
        SafeParcelWriter.q(parcel, 3, this.f16281h, false);
        SafeParcelWriter.b(parcel, a);
    }
}
