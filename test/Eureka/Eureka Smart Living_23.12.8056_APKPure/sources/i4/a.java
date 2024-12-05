package i4;

import java.util.List;

/* loaded from: classes.dex */
final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    private final String f6992a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6993b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6992a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f6993b = list;
    }

    @Override // i4.r
    public List b() {
        return this.f6993b;
    }

    @Override // i4.r
    public String c() {
        return this.f6992a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6992a.equals(rVar.c()) && this.f6993b.equals(rVar.b());
    }

    public int hashCode() {
        return ((this.f6992a.hashCode() ^ 1000003) * 1000003) ^ this.f6993b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f6992a + ", usedDates=" + this.f6993b + "}";
    }
}
