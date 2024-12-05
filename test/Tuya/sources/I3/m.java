package I3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public interface m {

    /* loaded from: classes4.dex */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f4078a;

        public a(Function0 onComplete) {
            AbstractC3159y.i(onComplete, "onComplete");
            this.f4078a = onComplete;
        }

        public final Function0 a() {
            return this.f4078a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f4079a;

        public b(InterfaceC3983b interfaceC3983b) {
            this.f4079a = interfaceC3983b;
        }

        public final InterfaceC3983b a() {
            return this.f4079a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && AbstractC3159y.d(this.f4079a, ((b) obj).f4079a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            InterfaceC3983b interfaceC3983b = this.f4079a;
            if (interfaceC3983b == null) {
                return 0;
            }
            return interfaceC3983b.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.f4079a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements m {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4080a = new c();

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
