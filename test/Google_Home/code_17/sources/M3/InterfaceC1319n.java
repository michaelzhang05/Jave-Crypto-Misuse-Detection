package M3;

import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;

/* renamed from: M3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1319n {

    /* renamed from: M3.n$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: M3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0131a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC2791e f7047a;

            public C0131a(EnumC2791e enumC2791e) {
                this.f7047a = enumC2791e;
            }

            public final EnumC2791e a() {
                return this.f7047a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0131a) && this.f7047a == ((C0131a) obj).f7047a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                EnumC2791e enumC2791e = this.f7047a;
                if (enumC2791e == null) {
                    return 0;
                }
                return enumC2791e.hashCode();
            }

            public String toString() {
                return "HideBrands(brand=" + this.f7047a + ")";
            }
        }

        /* renamed from: M3.n$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC2791e f7048a;

            public b(EnumC2791e brand) {
                AbstractC3255y.i(brand, "brand");
                this.f7048a = brand;
            }

            public final EnumC2791e a() {
                return this.f7048a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f7048a == ((b) obj).f7048a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f7048a.hashCode();
            }

            public String toString() {
                return "ShowBrands(brand=" + this.f7048a + ")";
            }
        }
    }

    InterfaceC3698L a();

    void b(InterfaceC1318m interfaceC1318m);
}
