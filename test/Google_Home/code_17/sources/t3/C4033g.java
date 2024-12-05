package t3;

import com.stripe.android.model.o;
import e3.EnumC2791e;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* renamed from: t3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4033g {

    /* renamed from: a, reason: collision with root package name */
    private final B2.b f39656a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.o f39657b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39658c;

    /* renamed from: t3.g$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39659a;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25587i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25591m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25577O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39659a = iArr;
        }
    }

    public C4033g(B2.b displayName, com.stripe.android.model.o paymentMethod, boolean z8) {
        AbstractC3255y.i(displayName, "displayName");
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        this.f39656a = displayName;
        this.f39657b = paymentMethod;
        this.f39658c = z8;
    }

    public final B2.b a() {
        int i8;
        EnumC2791e enumC2791e;
        String str;
        String str2;
        String str3;
        o.p pVar = this.f39657b.f25467e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f39659a[pVar.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return B2.c.e("", new Object[0]);
                }
                int i9 = w.f39777c;
                o.r rVar = this.f39657b.f25480r;
                if (rVar != null) {
                    str3 = rVar.f25615e;
                } else {
                    str3 = null;
                }
                return B2.c.f(i9, new Object[]{str3}, null, 4, null);
            }
            int i10 = w.f39777c;
            o.n nVar = this.f39657b.f25474l;
            if (nVar != null) {
                str2 = nVar.f25561e;
            } else {
                str2 = null;
            }
            return B2.c.f(i10, new Object[]{str2}, null, 4, null);
        }
        int i11 = AbstractC3407E.f34843Z;
        o.g gVar = this.f39657b.f25470h;
        if (gVar != null) {
            enumC2791e = gVar.f25530a;
        } else {
            enumC2791e = null;
        }
        if (gVar != null) {
            str = gVar.f25537h;
        } else {
            str = null;
        }
        return B2.c.f(i11, new Object[]{enumC2791e, str}, null, 4, null);
    }

    public final B2.b b() {
        return this.f39656a;
    }

    public final B2.b c() {
        return B2.c.f(w.f39758L, new Object[]{a()}, null, 4, null);
    }

    public final com.stripe.android.model.o d() {
        return this.f39657b;
    }

    public final B2.b e() {
        return B2.c.f(w.f39771Y, new Object[]{a()}, null, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4033g)) {
            return false;
        }
        C4033g c4033g = (C4033g) obj;
        if (AbstractC3255y.d(this.f39656a, c4033g.f39656a) && AbstractC3255y.d(this.f39657b, c4033g.f39657b) && this.f39658c == c4033g.f39658c) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z8;
        o.g.c cVar;
        Set a8;
        o.g gVar = this.f39657b.f25470h;
        if (gVar != null && (cVar = gVar.f25540k) != null && (a8 = cVar.a()) != null && a8.size() > 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!this.f39658c || !z8) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f39656a.hashCode() * 31) + this.f39657b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f39658c);
    }

    public String toString() {
        return "DisplayableSavedPaymentMethod(displayName=" + this.f39656a + ", paymentMethod=" + this.f39657b + ", isCbcEligible=" + this.f39658c + ")";
    }
}
