package N;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class G extends R.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7437b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7438c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7439d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(boolean z8, String str, int i8, int i9) {
        this.f7436a = z8;
        this.f7437b = str;
        this.f7438c = O.a(i8) - 1;
        this.f7439d = t.a(i9) - 1;
    }

    public final String p() {
        return this.f7437b;
    }

    public final boolean u() {
        return this.f7436a;
    }

    public final int v() {
        return t.a(this.f7439d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.c(parcel, 1, this.f7436a);
        R.c.q(parcel, 2, this.f7437b, false);
        R.c.k(parcel, 3, this.f7438c);
        R.c.k(parcel, 4, this.f7439d);
        R.c.b(parcel, a8);
    }

    public final int y() {
        return O.a(this.f7438c);
    }
}
