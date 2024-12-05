package h4;

import A6.C;
import A6.C0985e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

@StabilityInferred(parameters = 1)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class F0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32275a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32276b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<F0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32277a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32278b;

        static {
            a aVar = new a();
            f32277a = aVar;
            C0985e0 c0985e0 = new C0985e0("next_action_spec", aVar, 2);
            c0985e0.k("light_theme_png", true);
            c0985e0.k("dark_theme_png", true);
            f32278b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32278b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            A6.r0 r0Var = A6.r0.f595a;
            return new w6.b[]{AbstractC4193a.p(r0Var), AbstractC4193a.p(r0Var)};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public F0 b(z6.e decoder) {
            String str;
            int i8;
            String str2;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            A6.n0 n0Var = null;
            if (d8.w()) {
                A6.r0 r0Var = A6.r0.f595a;
                str2 = (String) d8.q(a8, 0, r0Var, null);
                str = (String) d8.q(a8, 1, r0Var, null);
                i8 = 3;
            } else {
                str = null;
                String str3 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 == 1) {
                                str = (String) d8.q(a8, 1, A6.r0.f595a, str);
                                i9 |= 2;
                            } else {
                                throw new w6.l(g8);
                            }
                        } else {
                            str3 = (String) d8.q(a8, 0, A6.r0.f595a, str3);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str2 = str3;
            }
            d8.b(a8);
            return new F0(i8, str2, str, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, F0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            F0.g(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32277a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new F0(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F0[] newArray(int i8) {
            return new F0[i8];
        }
    }

    public /* synthetic */ F0(int i8, String str, String str2, A6.n0 n0Var) {
        if ((i8 & 1) == 0) {
            this.f32275a = null;
        } else {
            this.f32275a = str;
        }
        if ((i8 & 2) == 0) {
            this.f32276b = null;
        } else {
            this.f32276b = str2;
        }
    }

    public static final /* synthetic */ void g(F0 f02, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || f02.f32275a != null) {
            dVar.x(fVar, 0, A6.r0.f595a, f02.f32275a);
        }
        if (dVar.p(fVar, 1) || f02.f32276b != null) {
            dVar.x(fVar, 1, A6.r0.f595a, f02.f32276b);
        }
    }

    public final String a() {
        return this.f32276b;
    }

    public final String b() {
        return this.f32275a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (AbstractC3255y.d(this.f32275a, f02.f32275a) && AbstractC3255y.d(this.f32276b, f02.f32276b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f32275a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f32276b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "SelectorIcon(lightThemePng=" + this.f32275a + ", darkThemePng=" + this.f32276b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f32275a);
        out.writeString(this.f32276b);
    }

    public F0(String str, String str2) {
        this.f32275a = str;
        this.f32276b = str2;
    }
}
