package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final a f33053b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    private final ZoneId f33054a;

    static {
        System.currentTimeMillis();
        f33053b = new a(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ZoneId zoneId) {
        this.f33054a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.b
    public final long a() {
        return System.currentTimeMillis();
    }

    public final ZoneId c() {
        return this.f33054a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f33054a.equals(((a) obj).f33054a);
    }

    public final int hashCode() {
        return this.f33054a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f33054a + "]";
    }
}
