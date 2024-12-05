package o5;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3686z {

    /* renamed from: o5.z$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3686z {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36551a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: o5.z$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3686z {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36552a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: o5.z$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3686z {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36553a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: o5.z$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3686z {

        /* renamed from: a, reason: collision with root package name */
        private final Object f36554a;

        public d(Object obj) {
            super(null);
            this.f36554a = obj;
        }

        public final Object a() {
            return this.f36554a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3255y.d(this.f36554a, ((d) obj).f36554a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f36554a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f36554a + ')';
        }
    }

    private AbstractC3686z() {
    }

    public /* synthetic */ AbstractC3686z(AbstractC3247p abstractC3247p) {
        this();
    }
}
