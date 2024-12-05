package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    @SafeParcelable.VersionField
    private final int m;

    @SafeParcelable.Field
    private final int n;

    @SafeParcelable.Field
    private final String o;

    @SafeParcelable.Field
    private final PendingIntent p;

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    @KeepForSdk
    public static final Status f10556f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    @KeepForSdk
    public static final Status f10557g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    @KeepForSdk
    public static final Status f10558h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    @KeepForSdk
    public static final Status f10559i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    @KeepForSdk
    public static final Status f10560j = new Status(16);

    /* renamed from: k, reason: collision with root package name */
    private static final Status f10561k = new Status(17);

    @KeepForSdk
    public static final Status l = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new zzb();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    @KeepForSdk
    public Status(@SafeParcelable.Param(id = 1000) int i2, @SafeParcelable.Param(id = 1) int i3, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.m = i2;
        this.n = i3;
        this.o = str;
        this.p = pendingIntent;
    }

    @VisibleForTesting
    public final boolean D() {
        return this.p != null;
    }

    public final boolean J() {
        return this.n <= 0;
    }

    public final void L(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (D()) {
            activity.startIntentSenderForResult(this.p.getIntentSender(), i2, null, 0, 0, 0);
        }
    }

    public final String P() {
        String str = this.o;
        return str != null ? str : CommonStatusCodes.a(this.n);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.m == status.m && this.n == status.n && Objects.a(this.o, status.o) && Objects.a(this.p, status.p);
    }

    @Override // com.google.android.gms.common.api.Result
    @KeepForSdk
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Objects.b(Integer.valueOf(this.m), Integer.valueOf(this.n), this.o, this.p);
    }

    public final String toString() {
        return Objects.c(this).a("statusCode", P()).a("resolution", this.p).toString();
    }

    public final int w() {
        return this.n;
    }

    @Override // android.os.Parcelable
    @KeepForSdk
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, w());
        SafeParcelWriter.q(parcel, 2, z(), false);
        SafeParcelWriter.o(parcel, 3, this.p, i2, false);
        SafeParcelWriter.i(parcel, 1000, this.m);
        SafeParcelWriter.b(parcel, a);
    }

    public final String z() {
        return this.o;
    }

    @KeepForSdk
    public Status(int i2) {
        this(i2, null);
    }

    @KeepForSdk
    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    @KeepForSdk
    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }
}
