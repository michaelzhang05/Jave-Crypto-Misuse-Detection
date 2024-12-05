package C3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1184a;

    /* renamed from: b, reason: collision with root package name */
    private final C0015a f1185b;

    /* renamed from: C3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0015a {

        /* renamed from: a, reason: collision with root package name */
        private final B2.b f1186a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1187b;

        public C0015a(B2.b label, boolean z8) {
            AbstractC3255y.i(label, "label");
            this.f1186a = label;
            this.f1187b = z8;
        }

        public final B2.b a() {
            return this.f1186a;
        }

        public final boolean b() {
            return this.f1187b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0015a)) {
                return false;
            }
            C0015a c0015a = (C0015a) obj;
            if (AbstractC3255y.d(this.f1186a, c0015a.f1186a) && this.f1187b == c0015a.f1187b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f1186a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f1187b);
        }

        public String toString() {
            return "BuyButtonOverride(label=" + this.f1186a + ", lockEnabled=" + this.f1187b + ")";
        }
    }

    public a(boolean z8, C0015a c0015a) {
        this.f1184a = z8;
        this.f1185b = c0015a;
    }

    public final C0015a a() {
        return this.f1185b;
    }

    public final boolean b() {
        return this.f1184a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1184a == aVar.f1184a && AbstractC3255y.d(this.f1185b, aVar.f1185b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a8 = androidx.compose.foundation.a.a(this.f1184a) * 31;
        C0015a c0015a = this.f1185b;
        if (c0015a == null) {
            hashCode = 0;
        } else {
            hashCode = c0015a.hashCode();
        }
        return a8 + hashCode;
    }

    public String toString() {
        return "BuyButtonState(visible=" + this.f1184a + ", buyButtonOverride=" + this.f1185b + ")";
    }

    public /* synthetic */ a(boolean z8, C0015a c0015a, int i8, AbstractC3247p abstractC3247p) {
        this(z8, (i8 & 2) != 0 ? null : c0015a);
    }
}
