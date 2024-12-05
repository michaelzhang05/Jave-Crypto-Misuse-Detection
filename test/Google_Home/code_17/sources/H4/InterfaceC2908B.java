package h4;

import e3.EnumC2791e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h4.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2908B {

    /* renamed from: h4.B$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2908B {

        /* renamed from: a, reason: collision with root package name */
        private final List f32196a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC2791e f32197b;

        public a(List preferredBrands, EnumC2791e enumC2791e) {
            AbstractC3255y.i(preferredBrands, "preferredBrands");
            this.f32196a = preferredBrands;
            this.f32197b = enumC2791e;
        }

        public final EnumC2791e a() {
            return this.f32197b;
        }

        public final List b() {
            return this.f32196a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f32196a, aVar.f32196a) && this.f32197b == aVar.f32197b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f32196a.hashCode() * 31;
            EnumC2791e enumC2791e = this.f32197b;
            if (enumC2791e == null) {
                hashCode = 0;
            } else {
                hashCode = enumC2791e.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Eligible(preferredBrands=" + this.f32196a + ", initialBrand=" + this.f32197b + ")";
        }
    }

    /* renamed from: h4.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2908B {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32198a = new b();

        private b() {
        }
    }
}
