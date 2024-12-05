package s0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3719i extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3719i> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    String f37768a;

    /* renamed from: b, reason: collision with root package name */
    C3712b f37769b;

    /* renamed from: c, reason: collision with root package name */
    UserAddress f37770c;

    /* renamed from: d, reason: collision with root package name */
    C3721k f37771d;

    /* renamed from: e, reason: collision with root package name */
    String f37772e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f37773f;

    /* renamed from: g, reason: collision with root package name */
    String f37774g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f37775h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3719i(String str, C3712b c3712b, UserAddress userAddress, C3721k c3721k, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f37768a = str;
        this.f37769b = c3712b;
        this.f37770c = userAddress;
        this.f37771d = c3721k;
        this.f37772e = str2;
        this.f37773f = bundle;
        this.f37774g = str3;
        this.f37775h = bundle2;
    }

    public static C3719i s(Intent intent) {
        return (C3719i) S.e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String u() {
        return this.f37774g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, this.f37768a, false);
        S.c.p(parcel, 2, this.f37769b, i8, false);
        S.c.p(parcel, 3, this.f37770c, i8, false);
        S.c.p(parcel, 4, this.f37771d, i8, false);
        S.c.q(parcel, 5, this.f37772e, false);
        S.c.e(parcel, 6, this.f37773f, false);
        S.c.q(parcel, 7, this.f37774g, false);
        S.c.e(parcel, 8, this.f37775h, false);
        S.c.b(parcel, a8);
    }
}
