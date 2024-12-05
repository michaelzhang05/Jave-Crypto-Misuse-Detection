package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new zaa();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10804f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private final IBinder f10805g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final Scope[] f10806h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private Integer f10807i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private Integer f10808j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private Account f10809k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AuthAccountRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) Scope[] scopeArr, @SafeParcelable.Param(id = 4) Integer num, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) Account account) {
        this.f10804f = i2;
        this.f10805g = iBinder;
        this.f10806h = scopeArr;
        this.f10807i = num;
        this.f10808j = num2;
        this.f10809k = account;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10804f);
        SafeParcelWriter.h(parcel, 2, this.f10805g, false);
        SafeParcelWriter.t(parcel, 3, this.f10806h, i2, false);
        SafeParcelWriter.k(parcel, 4, this.f10807i, false);
        SafeParcelWriter.k(parcel, 5, this.f10808j, false);
        SafeParcelWriter.o(parcel, 6, this.f10809k, i2, false);
        SafeParcelWriter.b(parcel, a);
    }
}
