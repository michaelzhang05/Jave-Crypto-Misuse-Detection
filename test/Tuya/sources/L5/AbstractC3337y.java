package l5;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3337y {

    /* renamed from: l5.y$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3337y {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34547a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: l5.y$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3337y {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34548a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: l5.y$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3337y {

        /* renamed from: a, reason: collision with root package name */
        private final Object f34549a;

        public c(Object obj) {
            super(null);
            this.f34549a = obj;
        }

        public final Object a() {
            return this.f34549a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f34549a, ((c) obj).f34549a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f34549a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f34549a + ')';
        }
    }

    private AbstractC3337y() {
    }

    public /* synthetic */ AbstractC3337y(AbstractC3151p abstractC3151p) {
        this();
    }
}
