package b3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import b3.o;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.C3948h;
import x6.n0;
import x6.r0;

@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class p implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14529a;

    /* renamed from: b, reason: collision with root package name */
    private final o f14530b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14531c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14532d;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<p> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14533a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f14534b;

        static {
            a aVar = new a();
            f14533a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.model.ConsumerSessionLookup", aVar, 4);
            c3944e0.k("exists", false);
            c3944e0.k("consumer_session", true);
            c3944e0.k("error_message", true);
            c3944e0.k("publishable_key", true);
            f14534b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f14534b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b p8 = AbstractC3808a.p(o.a.f14504a);
            r0 r0Var = r0.f39600a;
            return new t6.b[]{C3948h.f39572a, p8, AbstractC3808a.p(r0Var), AbstractC3808a.p(r0Var)};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p c(w6.e decoder) {
            boolean z8;
            int i8;
            o oVar;
            String str;
            String str2;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            if (d8.z()) {
                boolean j8 = d8.j(a8, 0);
                o oVar2 = (o) d8.y(a8, 1, o.a.f14504a, null);
                r0 r0Var = r0.f39600a;
                String str3 = (String) d8.y(a8, 2, r0Var, null);
                z8 = j8;
                str2 = (String) d8.y(a8, 3, r0Var, null);
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
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 != 2) {
                                    if (p8 == 3) {
                                        str5 = (String) d8.y(a8, 3, r0.f39600a, str5);
                                        i9 |= 8;
                                    } else {
                                        throw new t6.l(p8);
                                    }
                                } else {
                                    str4 = (String) d8.y(a8, 2, r0.f39600a, str4);
                                    i9 |= 4;
                                }
                            } else {
                                oVar3 = (o) d8.y(a8, 1, o.a.f14504a, oVar3);
                                i9 |= 2;
                            }
                        } else {
                            z9 = d8.j(a8, 0);
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
            d8.a(a8);
            return new p(i8, z8, oVar, str, str2, (n0) null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, p value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            p.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f14533a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
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
            AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3942d0.a(i8, 1, a.f14533a.a());
        }
        this.f14529a = z8;
        if ((i8 & 2) == 0) {
            this.f14530b = null;
        } else {
            this.f14530b = oVar;
        }
        if ((i8 & 4) == 0) {
            this.f14531c = null;
        } else {
            this.f14531c = str;
        }
        if ((i8 & 8) == 0) {
            this.f14532d = null;
        } else {
            this.f14532d = str2;
        }
    }

    public static final /* synthetic */ void e(p pVar, w6.d dVar, v6.f fVar) {
        dVar.o(fVar, 0, pVar.f14529a);
        if (dVar.i(fVar, 1) || pVar.f14530b != null) {
            dVar.u(fVar, 1, o.a.f14504a, pVar.f14530b);
        }
        if (dVar.i(fVar, 2) || pVar.f14531c != null) {
            dVar.u(fVar, 2, r0.f39600a, pVar.f14531c);
        }
        if (dVar.i(fVar, 3) || pVar.f14532d != null) {
            dVar.u(fVar, 3, r0.f39600a, pVar.f14532d);
        }
    }

    public final o b() {
        return this.f14530b;
    }

    public final String c() {
        return this.f14532d;
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
        if (this.f14529a == pVar.f14529a && AbstractC3159y.d(this.f14530b, pVar.f14530b) && AbstractC3159y.d(this.f14531c, pVar.f14531c) && AbstractC3159y.d(this.f14532d, pVar.f14532d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a8 = androidx.compose.foundation.a.a(this.f14529a) * 31;
        o oVar = this.f14530b;
        int i8 = 0;
        if (oVar == null) {
            hashCode = 0;
        } else {
            hashCode = oVar.hashCode();
        }
        int i9 = (a8 + hashCode) * 31;
        String str = this.f14531c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f14532d;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "ConsumerSessionLookup(exists=" + this.f14529a + ", consumerSession=" + this.f14530b + ", errorMessage=" + this.f14531c + ", publishableKey=" + this.f14532d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeInt(this.f14529a ? 1 : 0);
        o oVar = this.f14530b;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        out.writeString(this.f14531c);
        out.writeString(this.f14532d);
    }

    public p(boolean z8, o oVar, String str, String str2) {
        this.f14529a = z8;
        this.f14530b = oVar;
        this.f14531c = str;
        this.f14532d = str2;
    }

    public /* synthetic */ p(boolean z8, o oVar, String str, String str2, int i8, AbstractC3151p abstractC3151p) {
        this(z8, (i8 & 2) != 0 ? null : oVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2);
    }
}
