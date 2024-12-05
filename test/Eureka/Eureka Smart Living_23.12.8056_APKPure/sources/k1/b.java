package k1;

import java.util.Map;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final n1.a f7096a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7097b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(n1.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f7096a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f7097b = map;
    }

    @Override // k1.f
    n1.a e() {
        return this.f7096a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7096a.equals(fVar.e()) && this.f7097b.equals(fVar.h());
    }

    @Override // k1.f
    Map h() {
        return this.f7097b;
    }

    public int hashCode() {
        return ((this.f7096a.hashCode() ^ 1000003) * 1000003) ^ this.f7097b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f7096a + ", values=" + this.f7097b + "}";
    }
}
