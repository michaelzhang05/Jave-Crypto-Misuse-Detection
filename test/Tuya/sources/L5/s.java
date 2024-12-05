package L5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class s implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6511b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f6512a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f6513a;

        public b(Throwable exception) {
            AbstractC3159y.i(exception, "exception");
            this.f6513a = exception;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && AbstractC3159y.d(this.f6513a, ((b) obj).f6513a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f6513a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f6513a + ')';
        }
    }

    private /* synthetic */ s(Object obj) {
        this.f6512a = obj;
    }

    public static final /* synthetic */ s a(Object obj) {
        return new s(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        if (!(obj2 instanceof s) || !AbstractC3159y.d(obj, ((s) obj2).k())) {
            return false;
        }
        return true;
    }

    public static final boolean d(Object obj, Object obj2) {
        return AbstractC3159y.d(obj, obj2);
    }

    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f6513a;
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

    public static String j(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f6512a, obj);
    }

    public int hashCode() {
        return f(this.f6512a);
    }

    public final /* synthetic */ Object k() {
        return this.f6512a;
    }

    public String toString() {
        return j(this.f6512a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
