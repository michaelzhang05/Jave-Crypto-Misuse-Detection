package e4;

import b3.EnumC1870e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e4.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2588B {

    /* renamed from: e4.B$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2588B {

        /* renamed from: a, reason: collision with root package name */
        private final List f30275a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC1870e f30276b;

        public a(List preferredBrands, EnumC1870e enumC1870e) {
            AbstractC3159y.i(preferredBrands, "preferredBrands");
            this.f30275a = preferredBrands;
            this.f30276b = enumC1870e;
        }

        public final EnumC1870e a() {
            return this.f30276b;
        }

        public final List b() {
            return this.f30275a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f30275a, aVar.f30275a) && this.f30276b == aVar.f30276b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f30275a.hashCode() * 31;
            EnumC1870e enumC1870e = this.f30276b;
            if (enumC1870e == null) {
                hashCode = 0;
            } else {
                hashCode = enumC1870e.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Eligible(preferredBrands=" + this.f30275a + ", initialBrand=" + this.f30276b + ")";
        }
    }

    /* renamed from: e4.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2588B {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30277a = new b();

        private b() {
        }
    }
}
