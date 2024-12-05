package rx;

/* compiled from: Notification.java */
/* loaded from: classes2.dex */
public final class d<T> {
    private static final d<Void> a = new d<>(a.OnCompleted, null, null);

    /* renamed from: b, reason: collision with root package name */
    private final a f22447b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f22448c;

    /* renamed from: d, reason: collision with root package name */
    private final T f22449d;

    /* compiled from: Notification.java */
    /* loaded from: classes2.dex */
    public enum a {
        OnNext,
        OnError,
        OnCompleted
    }

    private d(a aVar, T t, Throwable th) {
        this.f22449d = t;
        this.f22448c = th;
        this.f22447b = aVar;
    }

    public static <T> d<T> a() {
        return (d<T>) a;
    }

    public static <T> d<T> b(Throwable th) {
        return new d<>(a.OnError, null, th);
    }

    public static <T> d<T> c(T t) {
        return new d<>(a.OnNext, t, null);
    }

    public a d() {
        return this.f22447b;
    }

    public Throwable e() {
        return this.f22448c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != d.class) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.d() != d()) {
            return false;
        }
        T t = this.f22449d;
        T t2 = dVar.f22449d;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f22448c;
        Throwable th2 = dVar.f22448c;
        return th == th2 || (th != null && th.equals(th2));
    }

    public T f() {
        return this.f22449d;
    }

    public boolean g() {
        return j() && this.f22448c != null;
    }

    public boolean h() {
        return k() && this.f22449d != null;
    }

    public int hashCode() {
        int hashCode = d().hashCode();
        if (h()) {
            hashCode = (hashCode * 31) + f().hashCode();
        }
        return g() ? (hashCode * 31) + e().hashCode() : hashCode;
    }

    public boolean i() {
        return d() == a.OnCompleted;
    }

    public boolean j() {
        return d() == a.OnError;
    }

    public boolean k() {
        return d() == a.OnNext;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(d());
        if (h()) {
            sb.append(' ');
            sb.append(f());
        }
        if (g()) {
            sb.append(' ');
            sb.append(e().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
}
