package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10305f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private int f10306g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    @Deprecated
    private String f10307h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private Account f10308i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AccountChangeEventsRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) Account account) {
        this.f10305f = i2;
        this.f10306g = i3;
        this.f10307h = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.f10308i = new Account(str, "com.google");
        } else {
            this.f10308i = account;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10305f);
        SafeParcelWriter.i(parcel, 2, this.f10306g);
        SafeParcelWriter.q(parcel, 3, this.f10307h, false);
        SafeParcelWriter.o(parcel, 4, this.f10308i, i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public AccountChangeEventsRequest() {
        this.f10305f = 1;
    }
}
