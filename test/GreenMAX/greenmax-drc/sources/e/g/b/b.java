package e.g.b;

import java.io.Serializable;
import rx.f;

/* compiled from: NotificationLite.java */
/* loaded from: classes2.dex */
final class b {
    private static final Object a = new a();

    /* compiled from: NotificationLite.java */
    /* loaded from: classes2.dex */
    static class a implements Serializable {
        a() {
        }

        public String toString() {
            return "Notification=>NULL";
        }
    }

    public static <T> boolean a(f<? super T> fVar, Object obj) {
        if (obj == a) {
            fVar.onNext(null);
            return false;
        }
        if (obj != null) {
            fVar.onNext(obj);
            return false;
        }
        throw new IllegalArgumentException("The lite notification can not be null");
    }

    public static <T> Object b(T t) {
        return t == null ? a : t;
    }
}
