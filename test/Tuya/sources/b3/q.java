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
import x6.n0;
import x6.r0;

@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class q implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f14535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14536b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<q> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14537a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f14538b;

        static {
            a aVar = new a();
            f14537a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.model.ConsumerSessionSignup", aVar, 2);
            c3944e0.k("consumer_session", false);
            c3944e0.k("publishable_key", true);
            f14538b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f14538b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{o.a.f14504a, AbstractC3808a.p(r0.f39600a)};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q c(w6.e decoder) {
            o oVar;
            String str;
            int i8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            n0 n0Var = null;
            if (d8.z()) {
                oVar = (o) d8.r(a8, 0, o.a.f14504a, null);
                str = (String) d8.y(a8, 1, r0.f39600a, null);
                i8 = 3;
            } else {
                oVar = null;
                String str2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                str2 = (String) d8.y(a8, 1, r0.f39600a, str2);
                                i9 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            oVar = (o) d8.r(a8, 0, o.a.f14504a, oVar);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                str = str2;
                i8 = i9;
            }
            d8.a(a8);
            return new q(i8, oVar, str, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, q value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            q.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f14537a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new q(o.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q[] newArray(int i8) {
            return new q[i8];
        }
    }

    public /* synthetic */ q(int i8, o oVar, String str, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC3942d0.a(i8, 1, a.f14537a.a());
        }
        this.f14535a = oVar;
        if ((i8 & 2) == 0) {
            this.f14536b = null;
        } else {
            this.f14536b = str;
        }
    }

    public static final /* synthetic */ void e(q qVar, w6.d dVar, v6.f fVar) {
        dVar.A(fVar, 0, o.a.f14504a, qVar.f14535a);
        if (dVar.i(fVar, 1) || qVar.f14536b != null) {
            dVar.u(fVar, 1, r0.f39600a, qVar.f14536b);
        }
    }

    public final o b() {
        return this.f14535a;
    }

    public final String c() {
        return this.f14536b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3159y.d(this.f14535a, qVar.f14535a) && AbstractC3159y.d(this.f14536b, qVar.f14536b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f14535a.hashCode() * 31;
        String str = this.f14536b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.f14535a + ", publishableKey=" + this.f14536b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f14535a.writeToParcel(out, i8);
        out.writeString(this.f14536b);
    }

    public q(o consumerSession, String str) {
        AbstractC3159y.i(consumerSession, "consumerSession");
        this.f14535a = consumerSession;
        this.f14536b = str;
    }
}
