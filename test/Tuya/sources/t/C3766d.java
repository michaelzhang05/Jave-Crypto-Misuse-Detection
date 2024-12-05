package t;

import java.util.List;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3766d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final List f38106a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3766d(List list) {
        if (list != null) {
            this.f38106a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // t.j
    public List c() {
        return this.f38106a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f38106a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f38106a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f38106a + "}";
    }
}
