package h4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.C0989h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class L0 extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32359a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32360b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2959z f32361c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC2944n0 f32362d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32363e;
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f32357f = p4.G.f37099d;
    public static final Parcelable.Creator<L0> CREATOR = new c();

    /* renamed from: g, reason: collision with root package name */
    private static final w6.b[] f32358g = {null, null, EnumC2959z.Companion.serializer(), EnumC2944n0.Companion.serializer(), null};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32364a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32365b;

        static {
            a aVar = new a();
            f32364a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.SimpleTextSpec", aVar, 5);
            c0985e0.k("api_path", false);
            c0985e0.k("label", false);
            c0985e0.k("capitalization", true);
            c0985e0.k("keyboard_type", true);
            c0985e0.k("show_optional_label", true);
            f32365b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32365b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = L0.f32358g;
            return new w6.b[]{G.a.f37125a, A6.H.f513a, bVarArr[2], bVarArr[3], C0989h.f567a};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public L0 b(z6.e decoder) {
            boolean z8;
            int i8;
            int i9;
            p4.G g8;
            EnumC2959z enumC2959z;
            EnumC2944n0 enumC2944n0;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = L0.f32358g;
            if (d8.w()) {
                p4.G g9 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                int p8 = d8.p(a8, 1);
                EnumC2959z enumC2959z2 = (EnumC2959z) d8.x(a8, 2, bVarArr[2], null);
                enumC2944n0 = (EnumC2944n0) d8.x(a8, 3, bVarArr[3], null);
                g8 = g9;
                z8 = d8.f(a8, 4);
                enumC2959z = enumC2959z2;
                i9 = p8;
                i8 = 31;
            } else {
                p4.G g10 = null;
                EnumC2959z enumC2959z3 = null;
                EnumC2944n0 enumC2944n02 = null;
                boolean z9 = false;
                int i10 = 0;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int g11 = d8.g(a8);
                    if (g11 != -1) {
                        if (g11 != 0) {
                            if (g11 != 1) {
                                if (g11 != 2) {
                                    if (g11 != 3) {
                                        if (g11 == 4) {
                                            z9 = d8.f(a8, 4);
                                            i10 |= 16;
                                        } else {
                                            throw new w6.l(g11);
                                        }
                                    } else {
                                        enumC2944n02 = (EnumC2944n0) d8.x(a8, 3, bVarArr[3], enumC2944n02);
                                        i10 |= 8;
                                    }
                                } else {
                                    enumC2959z3 = (EnumC2959z) d8.x(a8, 2, bVarArr[2], enumC2959z3);
                                    i10 |= 4;
                                }
                            } else {
                                i11 = d8.p(a8, 1);
                                i10 |= 2;
                            }
                        } else {
                            g10 = (p4.G) d8.x(a8, 0, G.a.f37125a, g10);
                            i10 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i10;
                i9 = i11;
                g8 = g10;
                enumC2959z = enumC2959z3;
                enumC2944n0 = enumC2944n02;
            }
            d8.b(a8);
            return new L0(i8, g8, i9, enumC2959z, enumC2944n0, z8, (A6.n0) null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, L0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            L0.p(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32364a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L0 createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3255y.i(parcel, "parcel");
            p4.G g8 = (p4.G) parcel.readParcelable(L0.class.getClassLoader());
            int readInt = parcel.readInt();
            EnumC2959z valueOf = EnumC2959z.valueOf(parcel.readString());
            EnumC2944n0 valueOf2 = EnumC2944n0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new L0(g8, readInt, valueOf, valueOf2, z8);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L0[] newArray(int i8) {
            return new L0[i8];
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32366a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32367b;

        static {
            int[] iArr = new int[EnumC2959z.values().length];
            try {
                iArr[EnumC2959z.f32807b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2959z.f32808c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2959z.f32809d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2959z.f32810e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f32366a = iArr;
            int[] iArr2 = new int[EnumC2944n0.values().length];
            try {
                iArr2[EnumC2944n0.f32685b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2944n0.f32686c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC2944n0.f32687d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC2944n0.f32688e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC2944n0.f32689f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC2944n0.f32690g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC2944n0.f32691h.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC2944n0.f32692i.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            f32367b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L0(int i8, p4.G g8, int i9, EnumC2959z enumC2959z, EnumC2944n0 enumC2944n0, boolean z8, A6.n0 n0Var) {
        super(null);
        if (3 != (i8 & 3)) {
            AbstractC0983d0.a(i8, 3, a.f32364a.a());
        }
        this.f32359a = g8;
        this.f32360b = i9;
        if ((i8 & 4) == 0) {
            this.f32361c = EnumC2959z.f32807b;
        } else {
            this.f32361c = enumC2959z;
        }
        if ((i8 & 8) == 0) {
            this.f32362d = EnumC2944n0.f32686c;
        } else {
            this.f32362d = enumC2944n0;
        }
        if ((i8 & 16) == 0) {
            this.f32363e = false;
        } else {
            this.f32363e = z8;
        }
    }

    public static final /* synthetic */ void p(L0 l02, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32358g;
        dVar.C(fVar, 0, G.a.f37125a, l02.i());
        dVar.q(fVar, 1, l02.f32360b);
        if (dVar.p(fVar, 2) || l02.f32361c != EnumC2959z.f32807b) {
            dVar.C(fVar, 2, bVarArr[2], l02.f32361c);
        }
        if (dVar.p(fVar, 3) || l02.f32362d != EnumC2944n0.f32686c) {
            dVar.C(fVar, 3, bVarArr[3], l02.f32362d);
        }
        if (dVar.p(fVar, 4) || l02.f32363e) {
            dVar.s(fVar, 4, l02.f32363e);
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
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (AbstractC3255y.d(this.f32359a, l02.f32359a) && this.f32360b == l02.f32360b && this.f32361c == l02.f32361c && this.f32362d == l02.f32362d && this.f32363e == l02.f32363e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f32359a.hashCode() * 31) + this.f32360b) * 31) + this.f32361c.hashCode()) * 31) + this.f32362d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f32363e);
    }

    public p4.G i() {
        return this.f32359a;
    }

    public final p4.h0 l(Map initialValues) {
        int m4901getNoneIUNYP9k;
        int m4927getTextPjHm6EE;
        AbstractC3255y.i(initialValues, "initialValues");
        p4.G i8 = i();
        Integer valueOf = Integer.valueOf(this.f32360b);
        int i9 = d.f32366a[this.f32361c.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        m4901getNoneIUNYP9k = KeyboardCapitalization.Companion.m4902getSentencesIUNYP9k();
                    } else {
                        throw new O5.p();
                    }
                } else {
                    m4901getNoneIUNYP9k = KeyboardCapitalization.Companion.m4903getWordsIUNYP9k();
                }
            } else {
                m4901getNoneIUNYP9k = KeyboardCapitalization.Companion.m4900getCharactersIUNYP9k();
            }
        } else {
            m4901getNoneIUNYP9k = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();
        }
        int i10 = m4901getNoneIUNYP9k;
        switch (d.f32367b[this.f32362d.ordinal()]) {
            case 1:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4927getTextPjHm6EE();
                break;
            case 2:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4920getAsciiPjHm6EE();
                break;
            case 3:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4923getNumberPjHm6EE();
                break;
            case 4:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4926getPhonePjHm6EE();
                break;
            case 5:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4928getUriPjHm6EE();
                break;
            case 6:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4922getEmailPjHm6EE();
                break;
            case 7:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4925getPasswordPjHm6EE();
                break;
            case 8:
                m4927getTextPjHm6EE = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();
                break;
            default:
                throw new O5.p();
        }
        return AbstractC2928f0.g(this, new p4.q0(i8, new p4.s0(new p4.r0(valueOf, i10, m4927getTextPjHm6EE, null, 8, null), this.f32363e, (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "SimpleTextSpec(apiPath=" + this.f32359a + ", label=" + this.f32360b + ", capitalization=" + this.f32361c + ", keyboardType=" + this.f32362d + ", showOptionalLabel=" + this.f32363e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32359a, i8);
        out.writeInt(this.f32360b);
        out.writeString(this.f32361c.name());
        out.writeString(this.f32362d.name());
        out.writeInt(this.f32363e ? 1 : 0);
    }

    public /* synthetic */ L0(p4.G g8, int i8, EnumC2959z enumC2959z, EnumC2944n0 enumC2944n0, boolean z8, int i9, AbstractC3247p abstractC3247p) {
        this(g8, i8, (i9 & 4) != 0 ? EnumC2959z.f32807b : enumC2959z, (i9 & 8) != 0 ? EnumC2944n0.f32686c : enumC2944n0, (i9 & 16) != 0 ? false : z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(p4.G apiPath, int i8, EnumC2959z capitalization, EnumC2944n0 keyboardType, boolean z8) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(capitalization, "capitalization");
        AbstractC3255y.i(keyboardType, "keyboardType");
        this.f32359a = apiPath;
        this.f32360b = i8;
        this.f32361c = capitalization;
        this.f32362d = keyboardType;
        this.f32363e = z8;
    }
}
