package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3894b extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3894b> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    String f38457a;

    /* renamed from: b, reason: collision with root package name */
    String f38458b;

    /* renamed from: c, reason: collision with root package name */
    String f38459c;

    /* renamed from: d, reason: collision with root package name */
    int f38460d;

    /* renamed from: e, reason: collision with root package name */
    UserAddress f38461e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3894b(String str, String str2, String str3, int i8, UserAddress userAddress) {
        this.f38457a = str;
        this.f38458b = str2;
        this.f38459c = str3;
        this.f38460d = i8;
        this.f38461e = userAddress;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f38457a, false);
        R.c.q(parcel, 2, this.f38458b, false);
        R.c.q(parcel, 3, this.f38459c, false);
        R.c.k(parcel, 4, this.f38460d);
        R.c.p(parcel, 5, this.f38461e, i8, false);
        R.c.b(parcel, a8);
    }
}
