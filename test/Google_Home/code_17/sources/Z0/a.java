package Z0;

import java.util.List;

/* loaded from: classes3.dex */
final class a extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f13590a;

    /* renamed from: b, reason: collision with root package name */
    private final List f13591b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List list) {
        if (str != null) {
            this.f13590a = str;
            if (list != null) {
                this.f13591b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // Z0.l
    public List b() {
        return this.f13591b;
    }

    @Override // Z0.l
    public String c() {
        return this.f13590a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f13590a.equals(lVar.c()) && this.f13591b.equals(lVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13590a.hashCode() ^ 1000003) * 1000003) ^ this.f13591b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f13590a + ", usedDates=" + this.f13591b + "}";
    }
}
