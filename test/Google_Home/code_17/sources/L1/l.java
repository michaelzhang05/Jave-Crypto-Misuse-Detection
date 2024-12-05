package l1;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f34343a;

    public l(String str) {
        this.f34343a = str;
    }

    public final String a() {
        return this.f34343a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && AbstractC3255y.d(this.f34343a, ((l) obj).f34343a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f34343a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f34343a + ')';
    }
}
