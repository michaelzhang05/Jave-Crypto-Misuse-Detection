package a3;

import b3.InterfaceC1968b;
import com.stripe.android.model.o;
import h4.H0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import t3.w;

/* renamed from: a3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1625g {

    /* renamed from: a, reason: collision with root package name */
    private final String f13848a;

    /* renamed from: b, reason: collision with root package name */
    private final B2.b f13849b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13850c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13851d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13852e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13853f;

    /* renamed from: g, reason: collision with root package name */
    private final B2.b f13854g;

    public C1625g(String code, B2.b displayName, int i8, String str, String str2, boolean z8, B2.b bVar) {
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(displayName, "displayName");
        this.f13848a = code;
        this.f13849b = displayName;
        this.f13850c = i8;
        this.f13851d = str;
        this.f13852e = str2;
        this.f13853f = z8;
        this.f13854g = bVar;
    }

    private static final boolean b(List list, C1625g c1625g, o.p pVar) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((o) it.next()).f25467e == pVar) {
                    if (AbstractC3255y.d(c1625g.f13848a, pVar.f25605a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final O3.e a(List customerSavedPaymentMethods, Function0 onClick) {
        B2.b bVar;
        AbstractC3255y.i(customerSavedPaymentMethods, "customerSavedPaymentMethods");
        AbstractC3255y.i(onClick, "onClick");
        if (b(customerSavedPaymentMethods, this, o.p.f25587i)) {
            bVar = B2.c.a(w.f39759M);
        } else {
            bVar = this.f13849b;
        }
        return new O3.e(this.f13848a, bVar, this.f13850c, this.f13851d, this.f13852e, this.f13853f, this.f13854g, onClick);
    }

    public final Z2.a c() {
        return new Z2.a(this.f13849b, true, this.f13850c, this.f13851d, this.f13852e, this.f13853f);
    }

    public final String d() {
        return this.f13848a;
    }

    public final String e() {
        return this.f13852e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1625g)) {
            return false;
        }
        C1625g c1625g = (C1625g) obj;
        if (AbstractC3255y.d(this.f13848a, c1625g.f13848a) && AbstractC3255y.d(this.f13849b, c1625g.f13849b) && this.f13850c == c1625g.f13850c && AbstractC3255y.d(this.f13851d, c1625g.f13851d) && AbstractC3255y.d(this.f13852e, c1625g.f13852e) && this.f13853f == c1625g.f13853f && AbstractC3255y.d(this.f13854g, c1625g.f13854g)) {
            return true;
        }
        return false;
    }

    public final B2.b f() {
        return this.f13849b;
    }

    public final boolean g() {
        return this.f13853f;
    }

    public final int h() {
        return this.f13850c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f13848a.hashCode() * 31) + this.f13849b.hashCode()) * 31) + this.f13850c) * 31;
        String str = this.f13851d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f13852e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f13853f)) * 31;
        B2.b bVar = this.f13854g;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return a8 + i8;
    }

    public final String i() {
        return this.f13851d;
    }

    public String toString() {
        return "SupportedPaymentMethod(code=" + this.f13848a + ", displayName=" + this.f13849b + ", iconResource=" + this.f13850c + ", lightThemeIconUrl=" + this.f13851d + ", darkThemeIconUrl=" + this.f13852e + ", iconRequiresTinting=" + this.f13853f + ", subtitle=" + this.f13854g + ")";
    }

    public /* synthetic */ C1625g(String str, B2.b bVar, int i8, String str2, String str3, boolean z8, B2.b bVar2, int i9, AbstractC3247p abstractC3247p) {
        this(str, bVar, i8, str2, str3, z8, (i9 & 64) != 0 ? null : bVar2);
    }

    public /* synthetic */ C1625g(InterfaceC1968b interfaceC1968b, H0 h02, int i8, int i9, boolean z8, B2.b bVar, int i10, AbstractC3247p abstractC3247p) {
        this(interfaceC1968b, (i10 & 2) != 0 ? null : h02, i8, i9, (i10 & 16) != 0 ? false : z8, (i10 & 32) != 0 ? null : bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1625g(b3.InterfaceC1968b r9, h4.H0 r10, int r11, int r12, boolean r13, B2.b r14) {
        /*
            r8 = this;
            java.lang.String r0 = "paymentMethodDefinition"
            kotlin.jvm.internal.AbstractC3255y.i(r9, r0)
            com.stripe.android.model.o$p r9 = r9.getType()
            java.lang.String r1 = r9.f25605a
            B2.b r2 = B2.c.a(r11)
            r9 = 0
            if (r10 == 0) goto L1e
            h4.F0 r11 = r10.g()
            if (r11 == 0) goto L1e
            java.lang.String r11 = r11.b()
            r4 = r11
            goto L1f
        L1e:
            r4 = r9
        L1f:
            if (r10 == 0) goto L2b
            h4.F0 r10 = r10.g()
            if (r10 == 0) goto L2b
            java.lang.String r9 = r10.a()
        L2b:
            r5 = r9
            r0 = r8
            r3 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C1625g.<init>(b3.b, h4.H0, int, int, boolean, B2.b):void");
    }

    public /* synthetic */ C1625g(String str, int i8, int i9, boolean z8, String str2, String str3, B2.b bVar, int i10, AbstractC3247p abstractC3247p) {
        this(str, i8, i9, (i10 & 8) != 0 ? false : z8, str2, str3, (i10 & 64) != 0 ? null : bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1625g(String code, int i8, int i9, boolean z8, String str, String str2, B2.b bVar) {
        this(code, B2.c.a(i8), i9, str, str2, z8, bVar);
        AbstractC3255y.i(code, "code");
    }
}
