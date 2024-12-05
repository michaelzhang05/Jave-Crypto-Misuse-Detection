package s1;

import android.os.Parcel;
import android.os.Parcelable;
import v1.m;

/* loaded from: classes.dex */
public class c extends w1.a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    private final String f9214a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9215b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9216c;

    public c(String str, int i6, long j6) {
        this.f9214a = str;
        this.f9215b = i6;
        this.f9216c = j6;
    }

    public String a() {
        return this.f9214a;
    }

    public long b() {
        long j6 = this.f9216c;
        return j6 == -1 ? this.f9215b : j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((a() != null && a().equals(cVar.a())) || (a() == null && cVar.a() == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v1.m.b(a(), Long.valueOf(b()));
    }

    public final String toString() {
        m.a c6 = v1.m.c(this);
        c6.a("name", a());
        c6.a("version", Long.valueOf(b()));
        return c6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.j(parcel, 1, a(), false);
        w1.c.f(parcel, 2, this.f9215b);
        w1.c.h(parcel, 3, b());
        w1.c.b(parcel, a6);
    }

    public c(String str, long j6) {
        this.f9214a = str;
        this.f9216c = j6;
        this.f9215b = -1;
    }
}
