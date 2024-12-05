package o5;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3685y {

    /* renamed from: o5.y$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3685y {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36548a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o5.y$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3685y {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36549a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o5.y$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3685y {

        /* renamed from: a, reason: collision with root package name */
        private final Object f36550a;

        public c(Object obj) {
            super(null);
            this.f36550a = obj;
        }

        public final Object a() {
            return this.f36550a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f36550a, ((c) obj).f36550a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f36550a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f36550a + ')';
        }
    }

    private AbstractC3685y() {
    }

    public /* synthetic */ AbstractC3685y(AbstractC3247p abstractC3247p) {
        this();
    }
}
