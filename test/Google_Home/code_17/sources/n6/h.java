package n6;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final b f35606b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f35607c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f35608a;

    /* loaded from: classes5.dex */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f35609a;

        public a(Throwable th) {
            this.f35609a = th;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof a) && AbstractC3255y.d(this.f35609a, ((a) obj).f35609a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.f35609a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // n6.h.c
        public String toString() {
            return "Closed(" + this.f35609a + ')';
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final Object b() {
            return h.c(h.f35607c);
        }

        public final Object c(Object obj) {
            return h.c(obj);
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f35608a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        if (!(obj2 instanceof h) || !AbstractC3255y.d(obj, ((h) obj2).k())) {
            return false;
        }
        return true;
    }

    public static final Throwable e(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f35609a;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f35608a, obj);
    }

    public int hashCode() {
        return g(this.f35608a);
    }

    public final /* synthetic */ Object k() {
        return this.f35608a;
    }

    public String toString() {
        return j(this.f35608a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
