package l5;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3338z {

    /* renamed from: l5.z$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3338z {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34550a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: l5.z$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3338z {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34551a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: l5.z$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3338z {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34552a = new c();

        private c() {
            super(null);
        }
    }

    /* renamed from: l5.z$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC3338z {

        /* renamed from: a, reason: collision with root package name */
        private final Object f34553a;

        public d(Object obj) {
            super(null);
            this.f34553a = obj;
        }

        public final Object a() {
            return this.f34553a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3159y.d(this.f34553a, ((d) obj).f34553a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f34553a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f34553a + ')';
        }
    }

    private AbstractC3338z() {
    }

    public /* synthetic */ AbstractC3338z(AbstractC3151p abstractC3151p) {
        this();
    }
}
