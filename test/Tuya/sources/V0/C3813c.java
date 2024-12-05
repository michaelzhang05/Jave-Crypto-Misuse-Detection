package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3813c extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3813c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    String f38612a;

    /* renamed from: b, reason: collision with root package name */
    C3814d f38613b;

    /* renamed from: c, reason: collision with root package name */
    C3816f f38614c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3813c(String str, C3814d c3814d, C3816f c3816f) {
        this.f38612a = str;
        this.f38613b = c3814d;
        this.f38614c = c3816f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f38612a, false);
        S.c.p(parcel, 3, this.f38613b, i8, false);
        S.c.p(parcel, 5, this.f38614c, i8, false);
        S.c.b(parcel, a8);
    }
}
