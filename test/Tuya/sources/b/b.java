package B;

import java.util.Map;

/* loaded from: classes3.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final E.a f518a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(E.a aVar, Map map) {
        if (aVar != null) {
            this.f518a = aVar;
            if (map != null) {
                this.f519b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // B.f
    E.a e() {
        return this.f518a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f518a.equals(fVar.e()) && this.f519b.equals(fVar.h())) {
            return true;
        }
        return false;
    }

    @Override // B.f
    Map h() {
        return this.f519b;
    }

    public int hashCode() {
        return ((this.f518a.hashCode() ^ 1000003) * 1000003) ^ this.f519b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f518a + ", values=" + this.f519b + "}";
    }
}
