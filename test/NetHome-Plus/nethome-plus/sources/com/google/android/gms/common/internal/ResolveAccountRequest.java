package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new zam();

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.VersionField
    private final int f10871f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private final Account f10872g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private final int f10873h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private final GoogleSignInAccount f10874i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ResolveAccountRequest(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f10871f = i2;
        this.f10872g = account;
        this.f10873h = i3;
        this.f10874i = googleSignInAccount;
    }

    public Account getAccount() {
        return this.f10872g;
    }

    public int w() {
        return this.f10873h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.i(parcel, 1, this.f10871f);
        SafeParcelWriter.o(parcel, 2, getAccount(), i2, false);
        SafeParcelWriter.i(parcel, 3, w());
        SafeParcelWriter.o(parcel, 4, z(), i2, false);
        SafeParcelWriter.b(parcel, a);
    }

    public GoogleSignInAccount z() {
        return this.f10874i;
    }

    public ResolveAccountRequest(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }
}
