package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final a f31859b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    private final ZoneId f31860a;

    static {
        System.currentTimeMillis();
        f31859b = new a(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ZoneId zoneId) {
        this.f31860a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.b
    public final long a() {
        return System.currentTimeMillis();
    }

    public final ZoneId c() {
        return this.f31860a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f31860a.equals(((a) obj).f31860a);
    }

    public final int hashCode() {
        return this.f31860a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f31860a + "]";
    }
}
