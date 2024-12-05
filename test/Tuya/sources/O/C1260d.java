package O;

import R.AbstractC1317n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: O.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1260d extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1260d> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    private final String f7659a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7660b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7661c;

    public C1260d(String str, int i8, long j8) {
        this.f7659a = str;
        this.f7660b = i8;
        this.f7661c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1260d) {
            C1260d c1260d = (C1260d) obj;
            if (((s() != null && s().equals(c1260d.s())) || (s() == null && c1260d.s() == null)) && u() == c1260d.u()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1317n.b(s(), Long.valueOf(u()));
    }

    public String s() {
        return this.f7659a;
    }

    public final String toString() {
        AbstractC1317n.a c8 = AbstractC1317n.c(this);
        c8.a("name", s());
        c8.a("version", Long.valueOf(u()));
        return c8.toString();
    }

    public long u() {
        long j8 = this.f7661c;
        if (j8 == -1) {
            return this.f7660b;
        }
        return j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, s(), false);
        S.c.k(parcel, 2, this.f7660b);
        S.c.n(parcel, 3, u());
        S.c.b(parcel, a8);
    }

    public C1260d(String str, long j8) {
        this.f7659a = str;
        this.f7661c = j8;
        this.f7660b = -1;
    }
}
