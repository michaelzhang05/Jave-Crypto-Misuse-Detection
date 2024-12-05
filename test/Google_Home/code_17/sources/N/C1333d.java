package N;

import Q.AbstractC1398n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: N.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1333d extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1333d> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    private final String f7460a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7461b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7462c;

    public C1333d(String str, int i8, long j8) {
        this.f7460a = str;
        this.f7461b = i8;
        this.f7462c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1333d) {
            C1333d c1333d = (C1333d) obj;
            if (((p() != null && p().equals(c1333d.p())) || (p() == null && c1333d.p() == null)) && u() == c1333d.u()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1398n.b(p(), Long.valueOf(u()));
    }

    public String p() {
        return this.f7460a;
    }

    public final String toString() {
        AbstractC1398n.a c8 = AbstractC1398n.c(this);
        c8.a("name", p());
        c8.a("version", Long.valueOf(u()));
        return c8.toString();
    }

    public long u() {
        long j8 = this.f7462c;
        if (j8 == -1) {
            return this.f7461b;
        }
        return j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 1, p(), false);
        R.c.k(parcel, 2, this.f7461b);
        R.c.n(parcel, 3, u());
        R.c.b(parcel, a8);
    }

    public C1333d(String str, long j8) {
        this.f7460a = str;
        this.f7462c = j8;
        this.f7461b = -1;
    }
}
