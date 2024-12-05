package L3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f6073a;

        public a(Function0 onComplete) {
            AbstractC3255y.i(onComplete, "onComplete");
            this.f6073a = onComplete;
        }

        public final Function0 a() {
            return this.f6073a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final B2.b f6074a;

        public b(B2.b bVar) {
            this.f6074a = bVar;
        }

        public final B2.b a() {
            return this.f6074a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3255y.d(this.f6074a, ((b) obj).f6074a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            B2.b bVar = this.f6074a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.f6074a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6075a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -295978178;
        }

        public String toString() {
            return "Processing";
        }
    }
}
