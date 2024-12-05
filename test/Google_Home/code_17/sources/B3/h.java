package B3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final d f871a;

    /* loaded from: classes4.dex */
    public static final class a extends h {

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0 onComplete) {
            super(null, 1, 0 == true ? 1 : 0);
            AbstractC3255y.i(onComplete, "onComplete");
            this.f872b = onComplete;
        }

        public final Function0 b() {
            return this.f872b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3255y.d(this.f872b, ((a) obj).f872b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f872b.hashCode();
        }

        public String toString() {
            return "FinishProcessing(onComplete=" + this.f872b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends h {

        /* renamed from: b, reason: collision with root package name */
        private final d f873b;

        public /* synthetic */ b(d dVar, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : dVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f873b, ((b) obj).f873b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            d dVar = this.f873b;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Reset(message=" + this.f873b + ")";
        }

        public b(d dVar) {
            super(dVar, null);
            this.f873b = dVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {

        /* renamed from: b, reason: collision with root package name */
        public static final c f874b = new c();

        /* JADX WARN: Multi-variable type inference failed */
        private c() {
            super(null, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1787228877;
        }

        public String toString() {
            return "StartProcessing";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final B2.b f875a;

        public d(B2.b message) {
            AbstractC3255y.i(message, "message");
            this.f875a = message;
        }

        public final B2.b a() {
            return this.f875a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && AbstractC3255y.d(this.f875a, ((d) obj).f875a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f875a.hashCode();
        }

        public String toString() {
            return "UserErrorMessage(message=" + this.f875a + ")";
        }
    }

    public /* synthetic */ h(d dVar, AbstractC3247p abstractC3247p) {
        this(dVar);
    }

    public final d a() {
        return this.f871a;
    }

    private h(d dVar) {
        this.f871a = dVar;
    }

    public /* synthetic */ h(d dVar, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : dVar, null);
    }
}
