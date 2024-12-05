package rx.n.a;

import java.io.Serializable;

/* compiled from: NotificationLite.java */
/* loaded from: classes3.dex */
public final class h {
    private static final Object a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f22607b = new b();

    /* compiled from: NotificationLite.java */
    /* loaded from: classes3.dex */
    static class a implements Serializable {
        a() {
        }

        public String toString() {
            return "Notification=>Completed";
        }
    }

    /* compiled from: NotificationLite.java */
    /* loaded from: classes3.dex */
    static class b implements Serializable {
        b() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    /* compiled from: NotificationLite.java */
    /* loaded from: classes3.dex */
    static final class c implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        final Throwable f22608f;

        public c(Throwable th) {
            this.f22608f = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f22608f;
        }
    }

    public static <T> boolean a(rx.f<? super T> fVar, Object obj) {
        if (obj == a) {
            fVar.onCompleted();
            return true;
        }
        if (obj == f22607b) {
            fVar.onNext(null);
            return false;
        }
        if (obj != null) {
            if (obj.getClass() == c.class) {
                fVar.onError(((c) obj).f22608f);
                return true;
            }
            fVar.onNext(obj);
            return false;
        }
        throw new IllegalArgumentException("The lite notification can not be null");
    }

    public static Object b() {
        return a;
    }

    public static Object c(Throwable th) {
        return new c(th);
    }

    public static Throwable d(Object obj) {
        return ((c) obj).f22608f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T e(Object obj) {
        if (obj == f22607b) {
            return null;
        }
        return obj;
    }

    public static boolean f(Object obj) {
        return obj == a;
    }

    public static <T> Object g(T t) {
        return t == null ? f22607b : t;
    }
}
