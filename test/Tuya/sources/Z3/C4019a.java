package z3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4019a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40066a;

    /* renamed from: b, reason: collision with root package name */
    private final C0922a f40067b;

    /* renamed from: z3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0922a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3983b f40068a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f40069b;

        public C0922a(InterfaceC3983b label, boolean z8) {
            AbstractC3159y.i(label, "label");
            this.f40068a = label;
            this.f40069b = z8;
        }

        public final InterfaceC3983b a() {
            return this.f40068a;
        }

        public final boolean b() {
            return this.f40069b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0922a)) {
                return false;
            }
            C0922a c0922a = (C0922a) obj;
            if (AbstractC3159y.d(this.f40068a, c0922a.f40068a) && this.f40069b == c0922a.f40069b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f40068a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f40069b);
        }

        public String toString() {
            return "BuyButtonOverride(label=" + this.f40068a + ", lockEnabled=" + this.f40069b + ")";
        }
    }

    public C4019a(boolean z8, C0922a c0922a) {
        this.f40066a = z8;
        this.f40067b = c0922a;
    }

    public final C0922a a() {
        return this.f40067b;
    }

    public final boolean b() {
        return this.f40066a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4019a)) {
            return false;
        }
        C4019a c4019a = (C4019a) obj;
        if (this.f40066a == c4019a.f40066a && AbstractC3159y.d(this.f40067b, c4019a.f40067b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a8 = androidx.compose.foundation.a.a(this.f40066a) * 31;
        C0922a c0922a = this.f40067b;
        if (c0922a == null) {
            hashCode = 0;
        } else {
            hashCode = c0922a.hashCode();
        }
        return a8 + hashCode;
    }

    public String toString() {
        return "BuyButtonState(visible=" + this.f40066a + ", buyButtonOverride=" + this.f40067b + ")";
    }

    public /* synthetic */ C4019a(boolean z8, C0922a c0922a, int i8, AbstractC3151p abstractC3151p) {
        this(z8, (i8 & 2) != 0 ? null : c0922a);
    }
}
