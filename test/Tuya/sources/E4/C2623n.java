package e4;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.G;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: e4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2623n extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30758a;

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30759b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.G f30760c;
    private static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f30757d = m4.G.f35073d;
    public static final Parcelable.Creator<C2623n> CREATOR = new c();

    /* renamed from: e4.n$a */
    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30761a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30762b;

        static {
            a aVar = new a();
            f30761a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.BacsDebitBankAccountSpec", aVar, 3);
            c3944e0.k("sortCodeIdentifier", true);
            c3944e0.k("accountNumberIdentifier", true);
            c3944e0.k("apiPath", true);
            f30762b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30762b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            G.a aVar = G.a.f35099a;
            return new t6.b[]{aVar, aVar, aVar};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2623n c(w6.e decoder) {
            int i8;
            m4.G g8;
            m4.G g9;
            m4.G g10;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            m4.G g11 = null;
            if (d8.z()) {
                G.a aVar = G.a.f35099a;
                m4.G g12 = (m4.G) d8.r(a8, 0, aVar, null);
                m4.G g13 = (m4.G) d8.r(a8, 1, aVar, null);
                g10 = (m4.G) d8.r(a8, 2, aVar, null);
                g9 = g13;
                g8 = g12;
                i8 = 7;
            } else {
                m4.G g14 = null;
                m4.G g15 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 == 2) {
                                    g15 = (m4.G) d8.r(a8, 2, G.a.f35099a, g15);
                                    i9 |= 4;
                                } else {
                                    throw new t6.l(p8);
                                }
                            } else {
                                g14 = (m4.G) d8.r(a8, 1, G.a.f35099a, g14);
                                i9 |= 2;
                            }
                        } else {
                            g11 = (m4.G) d8.r(a8, 0, G.a.f35099a, g11);
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
            d8.a(a8);
            return new C2623n(i8, g8, g9, g10, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C2623n value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C2623n.j(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: e4.n$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30761a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.n$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2623n createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            parcel.readInt();
            return new C2623n();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2623n[] newArray(int i8) {
            return new C2623n[i8];
        }
    }

    public /* synthetic */ C2623n(int i8, m4.G g8, m4.G g9, m4.G g10, x6.n0 n0Var) {
        super(null);
        this.f30758a = (i8 & 1) == 0 ? m4.G.Companion.a("bacs_debit[sort_code]") : g8;
        if ((i8 & 2) == 0) {
            this.f30759b = m4.G.Companion.a("bacs_debit[account_number]");
        } else {
            this.f30759b = g9;
        }
        if ((i8 & 4) == 0) {
            this.f30760c = new m4.G();
        } else {
            this.f30760c = g10;
        }
    }

    public static final /* synthetic */ void j(C2623n c2623n, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(c2623n.f30758a, m4.G.Companion.a("bacs_debit[sort_code]"))) {
            dVar.A(fVar, 0, G.a.f35099a, c2623n.f30758a);
        }
        if (dVar.i(fVar, 1) || !AbstractC3159y.d(c2623n.f30759b, m4.G.Companion.a("bacs_debit[account_number]"))) {
            dVar.A(fVar, 1, G.a.f35099a, c2623n.f30759b);
        }
        if (dVar.i(fVar, 2) || !AbstractC3159y.d(c2623n.f(), new m4.G())) {
            dVar.A(fVar, 2, G.a.f35099a, c2623n.f());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public m4.G f() {
        return this.f30760c;
    }

    public final m4.h0 i(Map initialValues) {
        AbstractC3159y.i(initialValues, "initialValues");
        return b(AbstractC1246t.p(new m4.q0(this.f30758a, new m4.s0(new C2627p(), false, (String) initialValues.get(this.f30758a), 2, null)), new m4.q0(this.f30759b, new m4.s0(new C2621m(), false, (String) initialValues.get(this.f30759b), 2, null))), Integer.valueOf(b4.n.f14724f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(1);
    }

    public C2623n() {
        super(null);
        G.b bVar = m4.G.Companion;
        this.f30758a = bVar.a("bacs_debit[sort_code]");
        this.f30759b = bVar.a("bacs_debit[account_number]");
        this.f30760c = new m4.G();
    }
}
