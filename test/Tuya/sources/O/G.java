package O;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class G extends S.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7635a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7636b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7637c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7638d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(boolean z8, String str, int i8, int i9) {
        this.f7635a = z8;
        this.f7636b = str;
        this.f7637c = O.a(i8) - 1;
        this.f7638d = t.a(i9) - 1;
    }

    public final int G() {
        return O.a(this.f7637c);
    }

    public final String s() {
        return this.f7636b;
    }

    public final boolean u() {
        return this.f7635a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.c(parcel, 1, this.f7635a);
        S.c.q(parcel, 2, this.f7636b, false);
        S.c.k(parcel, 3, this.f7637c);
        S.c.k(parcel, 4, this.f7638d);
        S.c.b(parcel, a8);
    }

    public final int z() {
        return t.a(this.f7638d);
    }
}
