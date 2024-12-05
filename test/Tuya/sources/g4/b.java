package g4;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.l;
import u6.AbstractC3808a;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3943e;
import x6.C3944e0;
import x6.n0;
import x6.r0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class b {
    public static final C0750b Companion = new C0750b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f31218d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f31219e = {null, null, new C3943e(r0.f39600a)};

    /* renamed from: a, reason: collision with root package name */
    private final String f31220a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31221b;

    /* renamed from: c, reason: collision with root package name */
    private final List f31222c;

    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31223a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f31224b;

        static {
            a aVar = new a();
            f31223a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent", aVar, 3);
            c3944e0.k("short_name", false);
            c3944e0.k("long_name", false);
            c3944e0.k("types", false);
            f31224b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f31224b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = b.f31219e;
            r0 r0Var = r0.f39600a;
            return new t6.b[]{AbstractC3808a.p(r0Var), r0Var, bVarArr[2]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b c(w6.e decoder) {
            int i8;
            String str;
            String str2;
            List list;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = b.f31219e;
            String str3 = null;
            if (d8.z()) {
                String str4 = (String) d8.y(a8, 0, r0.f39600a, null);
                String q8 = d8.q(a8, 1);
                list = (List) d8.r(a8, 2, bVarArr[2], null);
                str = str4;
                str2 = q8;
                i8 = 7;
            } else {
                String str5 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 == 2) {
                                    list2 = (List) d8.r(a8, 2, bVarArr[2], list2);
                                    i9 |= 4;
                                } else {
                                    throw new l(p8);
                                }
                            } else {
                                str5 = d8.q(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str3 = (String) d8.y(a8, 0, r0.f39600a, str3);
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
            d8.a(a8);
            return new b(i8, str, str2, list, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, b value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            b.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: g4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0750b {
        private C0750b() {
        }

        public final t6.b serializer() {
            return a.f31223a;
        }

        public /* synthetic */ C0750b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ b(int i8, String str, String str2, List list, n0 n0Var) {
        if (7 != (i8 & 7)) {
            AbstractC3942d0.a(i8, 7, a.f31223a.a());
        }
        this.f31220a = str;
        this.f31221b = str2;
        this.f31222c = list;
    }

    public static final /* synthetic */ void e(b bVar, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f31219e;
        dVar.u(fVar, 0, r0.f39600a, bVar.f31220a);
        dVar.y(fVar, 1, bVar.f31221b);
        dVar.A(fVar, 2, bVarArr[2], bVar.f31222c);
    }

    public final String b() {
        return this.f31221b;
    }

    public final String c() {
        return this.f31220a;
    }

    public final List d() {
        return this.f31222c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3159y.d(this.f31220a, bVar.f31220a) && AbstractC3159y.d(this.f31221b, bVar.f31221b) && AbstractC3159y.d(this.f31222c, bVar.f31222c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f31220a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.f31221b.hashCode()) * 31) + this.f31222c.hashCode();
    }

    public String toString() {
        return "AddressComponent(shortName=" + this.f31220a + ", longName=" + this.f31221b + ", types=" + this.f31222c + ")";
    }

    public b(String str, String longName, List types) {
        AbstractC3159y.i(longName, "longName");
        AbstractC3159y.i(types, "types");
        this.f31220a = str;
        this.f31221b = longName;
        this.f31222c = types;
    }
}
