package c1;

import java.util.List;

/* loaded from: classes.dex */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final List f3923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f3923a = list;
    }

    @Override // c1.j
    public List c() {
        return this.f3923a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f3923a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f3923a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3923a + "}";
    }
}
