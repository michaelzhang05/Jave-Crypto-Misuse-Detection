package h4;

import A6.C;
import A6.C0985e0;
import P5.AbstractC1378t;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: h4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2943n extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32679a;

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32680b;

    /* renamed from: c, reason: collision with root package name */
    private final p4.G f32681c;
    private static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32678d = p4.G.f37099d;
    public static final Parcelable.Creator<C2943n> CREATOR = new c();

    /* renamed from: h4.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32682a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32683b;

        static {
            a aVar = new a();
            f32682a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.BacsDebitBankAccountSpec", aVar, 3);
            c0985e0.k("sortCodeIdentifier", true);
            c0985e0.k("accountNumberIdentifier", true);
            c0985e0.k("apiPath", true);
            f32683b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32683b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            G.a aVar = G.a.f37125a;
            return new w6.b[]{aVar, aVar, aVar};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2943n b(z6.e decoder) {
            int i8;
            p4.G g8;
            p4.G g9;
            p4.G g10;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            p4.G g11 = null;
            if (d8.w()) {
                G.a aVar = G.a.f37125a;
                p4.G g12 = (p4.G) d8.x(a8, 0, aVar, null);
                p4.G g13 = (p4.G) d8.x(a8, 1, aVar, null);
                g10 = (p4.G) d8.x(a8, 2, aVar, null);
                g9 = g13;
                g8 = g12;
                i8 = 7;
            } else {
                p4.G g14 = null;
                p4.G g15 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g16 = d8.g(a8);
                    if (g16 != -1) {
                        if (g16 != 0) {
                            if (g16 != 1) {
                                if (g16 == 2) {
                                    g15 = (p4.G) d8.x(a8, 2, G.a.f37125a, g15);
                                    i9 |= 4;
                                } else {
                                    throw new w6.l(g16);
                                }
                            } else {
                                g14 = (p4.G) d8.x(a8, 1, G.a.f37125a, g14);
                                i9 |= 2;
                            }
                        } else {
                            g11 = (p4.G) d8.x(a8, 0, G.a.f37125a, g11);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                g8 = g11;
                g9 = g14;
                g10 = g15;
            }
            d8.b(a8);
            return new C2943n(i8, g8, g9, g10, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C2943n value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C2943n.l(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: h4.n$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32682a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h4.n$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2943n createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            parcel.readInt();
            return new C2943n();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2943n[] newArray(int i8) {
            return new C2943n[i8];
        }
    }

    public /* synthetic */ C2943n(int i8, p4.G g8, p4.G g9, p4.G g10, A6.n0 n0Var) {
        super(null);
        this.f32679a = (i8 & 1) == 0 ? p4.G.Companion.a("bacs_debit[sort_code]") : g8;
        if ((i8 & 2) == 0) {
            this.f32680b = p4.G.Companion.a("bacs_debit[account_number]");
        } else {
            this.f32680b = g9;
        }
        if ((i8 & 4) == 0) {
            this.f32681c = new p4.G();
        } else {
            this.f32681c = g10;
        }
    }

    public static final /* synthetic */ void l(C2943n c2943n, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(c2943n.f32679a, p4.G.Companion.a("bacs_debit[sort_code]"))) {
            dVar.C(fVar, 0, G.a.f37125a, c2943n.f32679a);
        }
        if (dVar.p(fVar, 1) || !AbstractC3255y.d(c2943n.f32680b, p4.G.Companion.a("bacs_debit[account_number]"))) {
            dVar.C(fVar, 1, G.a.f37125a, c2943n.f32680b);
        }
        if (dVar.p(fVar, 2) || !AbstractC3255y.d(c2943n.h(), new p4.G())) {
            dVar.C(fVar, 2, G.a.f37125a, c2943n.h());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public p4.G h() {
        return this.f32681c;
    }

    public final p4.h0 i(Map initialValues) {
        AbstractC3255y.i(initialValues, "initialValues");
        return a(AbstractC1378t.p(new p4.q0(this.f32679a, new p4.s0(new C2947p(), false, (String) initialValues.get(this.f32679a), 2, null)), new p4.q0(this.f32680b, new p4.s0(new C2941m(), false, (String) initialValues.get(this.f32680b), 2, null))), Integer.valueOf(e4.n.f31730f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeInt(1);
    }

    public C2943n() {
        super(null);
        G.b bVar = p4.G.Companion;
        this.f32679a = bVar.a("bacs_debit[sort_code]");
        this.f32680b = bVar.a("bacs_debit[account_number]");
        this.f32681c = new p4.G();
    }
}
