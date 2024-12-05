package J3;

import b3.EnumC1870e;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;

/* renamed from: J3.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1206n {

    /* renamed from: J3.n$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: J3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0106a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC1870e f5341a;

            public C0106a(EnumC1870e enumC1870e) {
                this.f5341a = enumC1870e;
            }

            public final EnumC1870e a() {
                return this.f5341a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0106a) && this.f5341a == ((C0106a) obj).f5341a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                EnumC1870e enumC1870e = this.f5341a;
                if (enumC1870e == null) {
                    return 0;
                }
                return enumC1870e.hashCode();
            }

            public String toString() {
                return "HideBrands(brand=" + this.f5341a + ")";
            }
        }

        /* renamed from: J3.n$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final EnumC1870e f5342a;

            public b(EnumC1870e brand) {
                AbstractC3159y.i(brand, "brand");
                this.f5342a = brand;
            }

            public final EnumC1870e a() {
                return this.f5342a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && this.f5342a == ((b) obj).f5342a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5342a.hashCode();
            }

            public String toString() {
                return "ShowBrands(brand=" + this.f5342a + ")";
            }
        }
    }

    InterfaceC3349K b();

    void c(InterfaceC1205m interfaceC1205m);
}
