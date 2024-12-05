package r0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3901i extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3901i> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    String f38503a;

    /* renamed from: b, reason: collision with root package name */
    C3894b f38504b;

    /* renamed from: c, reason: collision with root package name */
    UserAddress f38505c;

    /* renamed from: d, reason: collision with root package name */
    C3903k f38506d;

    /* renamed from: e, reason: collision with root package name */
    String f38507e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f38508f;

    /* renamed from: g, reason: collision with root package name */
    String f38509g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f38510h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3901i(String str, C3894b c3894b, UserAddress userAddress, C3903k c3903k, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f38503a = str;
        this.f38504b = c3894b;
        this.f38505c = userAddress;
        this.f38506d = c3903k;
        this.f38507e = str2;
        this.f38508f = bundle;
        this.f38509g = str3;
        this.f38510h = bundle2;
    }

    public static C3901i p(Intent intent) {
        return (C3901i) R.e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String u() {
        return this.f38509g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f38503a, false);
        R.c.p(parcel, 2, this.f38504b, i8, false);
        R.c.p(parcel, 3, this.f38505c, i8, false);
        R.c.p(parcel, 4, this.f38506d, i8, false);
        R.c.q(parcel, 5, this.f38507e, false);
        R.c.e(parcel, 6, this.f38508f, false);
        R.c.q(parcel, 7, this.f38509g, false);
        R.c.e(parcel, 8, this.f38510h, false);
        R.c.b(parcel, a8);
    }
}
