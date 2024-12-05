package e3;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
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
public final class q implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final o f31541a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31542b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<q> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31543a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f31544b;

        static {
            a aVar = new a();
            f31543a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.model.ConsumerSessionSignup", aVar, 2);
            c0985e0.k("consumer_session", false);
            c0985e0.k("publishable_key", true);
            f31544b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f31544b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{o.a.f31510a, AbstractC4193a.p(r0.f595a)};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q b(z6.e decoder) {
            o oVar;
            String str;
            int i8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            n0 n0Var = null;
            if (d8.w()) {
                oVar = (o) d8.x(a8, 0, o.a.f31510a, null);
                str = (String) d8.q(a8, 1, r0.f595a, null);
                i8 = 3;
            } else {
                oVar = null;
                String str2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 == 1) {
                                str2 = (String) d8.q(a8, 1, r0.f595a, str2);
                                i9 |= 2;
                            } else {
                                throw new w6.l(g8);
                            }
                        } else {
                            oVar = (o) d8.x(a8, 0, o.a.f31510a, oVar);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                str = str2;
                i8 = i9;
            }
            d8.b(a8);
            return new q(i8, oVar, str, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, q value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            q.g(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f31543a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
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
            AbstractC0983d0.a(i8, 1, a.f31543a.a());
        }
        this.f31541a = oVar;
        if ((i8 & 2) == 0) {
            this.f31542b = null;
        } else {
            this.f31542b = str;
        }
    }

    public static final /* synthetic */ void g(q qVar, z6.d dVar, y6.f fVar) {
        dVar.C(fVar, 0, o.a.f31510a, qVar.f31541a);
        if (dVar.p(fVar, 1) || qVar.f31542b != null) {
            dVar.x(fVar, 1, r0.f595a, qVar.f31542b);
        }
    }

    public final o a() {
        return this.f31541a;
    }

    public final String b() {
        return this.f31542b;
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
        if (AbstractC3255y.d(this.f31541a, qVar.f31541a) && AbstractC3255y.d(this.f31542b, qVar.f31542b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f31541a.hashCode() * 31;
        String str = this.f31542b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.f31541a + ", publishableKey=" + this.f31542b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f31541a.writeToParcel(out, i8);
        out.writeString(this.f31542b);
    }

    public q(o consumerSession, String str) {
        AbstractC3255y.i(consumerSession, "consumerSession");
        this.f31541a = consumerSession;
        this.f31542b = str;
    }
}
