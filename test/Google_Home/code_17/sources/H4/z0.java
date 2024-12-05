package h4;

import A6.AbstractC1005y;
import A6.C;
import A6.C0985e0;
import O5.InterfaceC1355k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class z0 extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32816a;

    /* renamed from: b, reason: collision with root package name */
    private final d f32817b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32814c = p4.G.f37099d;
    public static final Parcelable.Creator<z0> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final w6.b[] f32815d = {null, d.Companion.serializer()};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32818a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32819b;

        static {
            a aVar = new a();
            f32818a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.PlaceholderSpec", aVar, 2);
            c0985e0.k("api_path", true);
            c0985e0.k("for", true);
            f32819b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32819b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{G.a.f37125a, z0.f32815d[1]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public z0 b(z6.e decoder) {
            d dVar;
            p4.G g8;
            int i8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = z0.f32815d;
            A6.n0 n0Var = null;
            if (d8.w()) {
                g8 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                dVar = (d) d8.x(a8, 1, bVarArr[1], null);
                i8 = 3;
            } else {
                d dVar2 = null;
                p4.G g9 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g10 = d8.g(a8);
                    if (g10 != -1) {
                        if (g10 != 0) {
                            if (g10 == 1) {
                                dVar2 = (d) d8.x(a8, 1, bVarArr[1], dVar2);
                                i9 |= 2;
                            } else {
                                throw new w6.l(g10);
                            }
                        } else {
                            g9 = (p4.G) d8.x(a8, 0, G.a.f37125a, g9);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                dVar = dVar2;
                g8 = g9;
                i8 = i9;
            }
            d8.b(a8);
            return new z0(i8, g8, dVar, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, z0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            z0.p(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32818a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new z0((p4.G) parcel.readParcelable(z0.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z0[] newArray(int i8) {
            return new z0[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @w6.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static final class d {
        public static final b Companion;

        /* renamed from: a, reason: collision with root package name */
        private static final InterfaceC1355k f32820a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f32821b = new d("Name", 0);

        /* renamed from: c, reason: collision with root package name */
        public static final d f32822c = new d("Email", 1);

        /* renamed from: d, reason: collision with root package name */
        public static final d f32823d = new d("Phone", 2);

        /* renamed from: e, reason: collision with root package name */
        public static final d f32824e = new d("BillingAddress", 3);

        /* renamed from: f, reason: collision with root package name */
        public static final d f32825f = new d("BillingAddressWithoutCountry", 4);

        /* renamed from: g, reason: collision with root package name */
        public static final d f32826g = new d("SepaMandate", 5);

        /* renamed from: h, reason: collision with root package name */
        public static final d f32827h = new d("Unknown", 6);

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ d[] f32828i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ U5.a f32829j;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f32830a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w6.b invoke() {
                return AbstractC1005y.a("com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField", d.values(), new String[]{"name", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PHONE, "billing_address", "billing_address_without_country", "sepa_mandate", EnvironmentCompat.MEDIA_UNKNOWN}, new Annotation[][]{null, null, null, null, null, null, null}, null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            private final /* synthetic */ w6.b a() {
                return (w6.b) d.f32820a.getValue();
            }

            public final w6.b serializer() {
                return a();
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            d[] a8 = a();
            f32828i = a8;
            f32829j = U5.b.a(a8);
            Companion = new b(null);
            f32820a = O5.l.a(O5.o.f8296b, a.f32830a);
        }

        private d(String str, int i8) {
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f32821b, f32822c, f32823d, f32824e, f32825f, f32826g, f32827h};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f32828i.clone();
        }
    }

    public /* synthetic */ z0(int i8, p4.G g8, d dVar, A6.n0 n0Var) {
        super(null);
        this.f32816a = (i8 & 1) == 0 ? p4.G.Companion.a("placeholder") : g8;
        if ((i8 & 2) == 0) {
            this.f32817b = d.f32827h;
        } else {
            this.f32817b = dVar;
        }
    }

    public static final /* synthetic */ void p(z0 z0Var, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32815d;
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(z0Var.i(), p4.G.Companion.a("placeholder"))) {
            dVar.C(fVar, 0, G.a.f37125a, z0Var.i());
        }
        if (dVar.p(fVar, 1) || z0Var.f32817b != d.f32827h) {
            dVar.C(fVar, 1, bVarArr[1], z0Var.f32817b);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (AbstractC3255y.d(this.f32816a, z0Var.f32816a) && this.f32817b == z0Var.f32817b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32816a.hashCode() * 31) + this.f32817b.hashCode();
    }

    public p4.G i() {
        return this.f32816a;
    }

    public final d l() {
        return this.f32817b;
    }

    public String toString() {
        return "PlaceholderSpec(apiPath=" + this.f32816a + ", field=" + this.f32817b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32816a, i8);
        out.writeString(this.f32817b.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p4.G apiPath, d field) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(field, "field");
        this.f32816a = apiPath;
        this.f32817b = field;
    }
}
