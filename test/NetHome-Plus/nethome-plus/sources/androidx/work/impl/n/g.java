package androidx.work.impl.n;

/* compiled from: SystemIdInfo.java */
/* loaded from: classes.dex */
public class g {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2008b;

    public g(String str, int i2) {
        this.a = str;
        this.f2008b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f2008b != gVar.f2008b) {
            return false;
        }
        return this.a.equals(gVar.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.f2008b;
    }
}
