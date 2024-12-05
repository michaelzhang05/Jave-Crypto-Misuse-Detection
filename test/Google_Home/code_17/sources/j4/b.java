package j4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0984e;
import A6.C0985e0;
import A6.n0;
import A6.r0;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.l;
import x6.AbstractC4193a;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class b {
    public static final C0775b Companion = new C0775b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f33945d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f33946e = {null, null, new C0984e(r0.f595a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f33947a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33948b;

    /* renamed from: c, reason: collision with root package name */
    private final List f33949c;

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33950a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f33951b;

        static {
            a aVar = new a();
            f33950a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent", aVar, 3);
            c0985e0.k("short_name", false);
            c0985e0.k("long_name", false);
            c0985e0.k("types", false);
            f33951b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f33951b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = b.f33946e;
            r0 r0Var = r0.f595a;
            return new w6.b[]{AbstractC4193a.p(r0Var), r0Var, bVarArr[2]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b(z6.e decoder) {
            int i8;
            String str;
            String str2;
            List list;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = b.f33946e;
            String str3 = null;
            if (d8.w()) {
                String str4 = (String) d8.q(a8, 0, r0.f595a, null);
                String e8 = d8.e(a8, 1);
                list = (List) d8.x(a8, 2, bVarArr[2], null);
                str = str4;
                str2 = e8;
                i8 = 7;
            } else {
                String str5 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 == 2) {
                                    list2 = (List) d8.x(a8, 2, bVarArr[2], list2);
                                    i9 |= 4;
                                } else {
                                    throw new l(g8);
                                }
                            } else {
                                str5 = d8.e(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str3 = (String) d8.q(a8, 0, r0.f595a, str3);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str3;
                str2 = str5;
                list = list2;
            }
            d8.b(a8);
            return new b(i8, str, str2, list, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, b value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            b.e(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: j4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0775b {
        private C0775b() {
        }

        public final w6.b serializer() {
            return a.f33950a;
        }

        public /* synthetic */ C0775b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ b(int i8, String str, String str2, List list, n0 n0Var) {
        if (7 != (i8 & 7)) {
            AbstractC0983d0.a(i8, 7, a.f33950a.a());
        }
        this.f33947a = str;
        this.f33948b = str2;
        this.f33949c = list;
    }

    public static final /* synthetic */ void e(b bVar, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f33946e;
        dVar.x(fVar, 0, r0.f595a, bVar.f33947a);
        dVar.e(fVar, 1, bVar.f33948b);
        dVar.C(fVar, 2, bVarArr[2], bVar.f33949c);
    }

    public final String b() {
        return this.f33948b;
    }

    public final String c() {
        return this.f33947a;
    }

    public final List d() {
        return this.f33949c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3255y.d(this.f33947a, bVar.f33947a) && AbstractC3255y.d(this.f33948b, bVar.f33948b) && AbstractC3255y.d(this.f33949c, bVar.f33949c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f33947a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.f33948b.hashCode()) * 31) + this.f33949c.hashCode();
    }

    public String toString() {
        return "AddressComponent(shortName=" + this.f33947a + ", longName=" + this.f33948b + ", types=" + this.f33949c + ")";
    }

    public b(String str, String longName, List types) {
        AbstractC3255y.i(longName, "longName");
        AbstractC3255y.i(types, "types");
        this.f33947a = str;
        this.f33948b = longName;
        this.f33949c = types;
    }
}
