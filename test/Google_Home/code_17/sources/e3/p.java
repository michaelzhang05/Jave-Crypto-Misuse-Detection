package e3;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.C0989h;
import A6.n0;
import A6.r0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import e3.o;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class p implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31535a;

    /* renamed from: b, reason: collision with root package name */
    private final o f31536b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31537c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31538d;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<p> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31539a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f31540b;

        static {
            a aVar = new a();
            f31539a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.model.ConsumerSessionLookup", aVar, 4);
            c0985e0.k("exists", false);
            c0985e0.k("consumer_session", true);
            c0985e0.k("error_message", true);
            c0985e0.k("publishable_key", true);
            f31540b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f31540b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b p8 = AbstractC4193a.p(o.a.f31510a);
            r0 r0Var = r0.f595a;
            return new w6.b[]{C0989h.f567a, p8, AbstractC4193a.p(r0Var), AbstractC4193a.p(r0Var)};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p b(z6.e decoder) {
            boolean z8;
            int i8;
            o oVar;
            String str;
            String str2;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            if (d8.w()) {
                boolean f8 = d8.f(a8, 0);
                o oVar2 = (o) d8.q(a8, 1, o.a.f31510a, null);
                r0 r0Var = r0.f595a;
                String str3 = (String) d8.q(a8, 2, r0Var, null);
                z8 = f8;
                str2 = (String) d8.q(a8, 3, r0Var, null);
                str = str3;
                oVar = oVar2;
                i8 = 15;
            } else {
                o oVar3 = null;
                String str4 = null;
                String str5 = null;
                boolean z9 = false;
                int i9 = 0;
                boolean z10 = true;
                while (z10) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 != 2) {
                                    if (g8 == 3) {
                                        str5 = (String) d8.q(a8, 3, r0.f595a, str5);
                                        i9 |= 8;
                                    } else {
                                        throw new w6.l(g8);
                                    }
                                } else {
                                    str4 = (String) d8.q(a8, 2, r0.f595a, str4);
                                    i9 |= 4;
                                }
                            } else {
                                oVar3 = (o) d8.q(a8, 1, o.a.f31510a, oVar3);
                                i9 |= 2;
                            }
                        } else {
                            z9 = d8.f(a8, 0);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                z8 = z9;
                i8 = i9;
                oVar = oVar3;
                str = str4;
                str2 = str5;
            }
            d8.b(a8);
            return new p(i8, z8, oVar, str, str2, (n0) null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, p value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            p.g(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f31539a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p createFromParcel(Parcel parcel) {
            boolean z8;
            o createFromParcel;
            AbstractC3255y.i(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = o.CREATOR.createFromParcel(parcel);
            }
            return new p(z8, createFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p[] newArray(int i8) {
            return new p[i8];
        }
    }

    public /* synthetic */ p(int i8, boolean z8, o oVar, String str, String str2, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC0983d0.a(i8, 1, a.f31539a.a());
        }
        this.f31535a = z8;
        if ((i8 & 2) == 0) {
            this.f31536b = null;
        } else {
            this.f31536b = oVar;
        }
        if ((i8 & 4) == 0) {
            this.f31537c = null;
        } else {
            this.f31537c = str;
        }
        if ((i8 & 8) == 0) {
            this.f31538d = null;
        } else {
            this.f31538d = str2;
        }
    }

    public static final /* synthetic */ void g(p pVar, z6.d dVar, y6.f fVar) {
        dVar.s(fVar, 0, pVar.f31535a);
        if (dVar.p(fVar, 1) || pVar.f31536b != null) {
            dVar.x(fVar, 1, o.a.f31510a, pVar.f31536b);
        }
        if (dVar.p(fVar, 2) || pVar.f31537c != null) {
            dVar.x(fVar, 2, r0.f595a, pVar.f31537c);
        }
        if (dVar.p(fVar, 3) || pVar.f31538d != null) {
            dVar.x(fVar, 3, r0.f595a, pVar.f31538d);
        }
    }

    public final o a() {
        return this.f31536b;
    }

    public final String b() {
        return this.f31538d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f31535a == pVar.f31535a && AbstractC3255y.d(this.f31536b, pVar.f31536b) && AbstractC3255y.d(this.f31537c, pVar.f31537c) && AbstractC3255y.d(this.f31538d, pVar.f31538d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a8 = androidx.compose.foundation.a.a(this.f31535a) * 31;
        o oVar = this.f31536b;
        int i8 = 0;
        if (oVar == null) {
            hashCode = 0;
        } else {
            hashCode = oVar.hashCode();
        }
        int i9 = (a8 + hashCode) * 31;
        String str = this.f31537c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31538d;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "ConsumerSessionLookup(exists=" + this.f31535a + ", consumerSession=" + this.f31536b + ", errorMessage=" + this.f31537c + ", publishableKey=" + this.f31538d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeInt(this.f31535a ? 1 : 0);
        o oVar = this.f31536b;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f31537c);
        out.writeString(this.f31538d);
    }

    public p(boolean z8, o oVar, String str, String str2) {
        this.f31535a = z8;
        this.f31536b = oVar;
        this.f31537c = str;
        this.f31538d = str2;
    }

    public /* synthetic */ p(boolean z8, o oVar, String str, String str2, int i8, AbstractC3247p abstractC3247p) {
        this(z8, (i8 & 2) != 0 ? null : oVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2);
    }
}
