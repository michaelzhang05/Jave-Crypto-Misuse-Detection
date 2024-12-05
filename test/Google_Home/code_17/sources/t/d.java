package t;

import java.util.List;

/* loaded from: classes3.dex */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final List f39416a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List list) {
        if (list != null) {
            this.f39416a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // t.n
    public List c() {
        return this.f39416a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f39416a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f39416a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f39416a + "}";
    }
}
