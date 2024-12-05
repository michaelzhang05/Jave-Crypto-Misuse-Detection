package O5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class s implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8302b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f8303a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f8304a;

        public b(Throwable exception) {
            AbstractC3255y.i(exception, "exception");
            this.f8304a = exception;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && AbstractC3255y.d(this.f8304a, ((b) obj).f8304a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f8304a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f8304a + ')';
        }
    }

    private /* synthetic */ s(Object obj) {
        this.f8303a = obj;
    }

    public static final /* synthetic */ s a(Object obj) {
        return new s(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if (!(obj2 instanceof s) || !AbstractC3255y.d(obj, ((s) obj2).j())) {
            return false;
        }
        return true;
    }

    public static final boolean d(Object obj, Object obj2) {
        return AbstractC3255y.d(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f8304a;
        }
        return null;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof b;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof b);
    }

    public static String i(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f8303a, obj);
    }

    public int hashCode() {
        return f(this.f8303a);
    }

    public final /* synthetic */ Object j() {
        return this.f8303a;
    }

    public String toString() {
        return i(this.f8303a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
