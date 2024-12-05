package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 1)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class F0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f30354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30355b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<F0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30356a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30357b;

        static {
            a aVar = new a();
            f30356a = aVar;
            C3944e0 c3944e0 = new C3944e0("next_action_spec", aVar, 2);
            c3944e0.k("light_theme_png", true);
            c3944e0.k("dark_theme_png", true);
            f30357b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30357b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            x6.r0 r0Var = x6.r0.f39600a;
            return new t6.b[]{AbstractC3808a.p(r0Var), AbstractC3808a.p(r0Var)};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public F0 c(w6.e decoder) {
            String str;
            int i8;
            String str2;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            x6.n0 n0Var = null;
            if (d8.z()) {
                x6.r0 r0Var = x6.r0.f39600a;
                str2 = (String) d8.y(a8, 0, r0Var, null);
                str = (String) d8.y(a8, 1, r0Var, null);
                i8 = 3;
            } else {
                str = null;
                String str3 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                str = (String) d8.y(a8, 1, x6.r0.f39600a, str);
                                i9 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            str3 = (String) d8.y(a8, 0, x6.r0.f39600a, str3);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str2 = str3;
            }
            d8.a(a8);
            return new F0(i8, str2, str, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, F0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            F0.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30356a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new F0(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F0[] newArray(int i8) {
            return new F0[i8];
        }
    }

    public /* synthetic */ F0(int i8, String str, String str2, x6.n0 n0Var) {
        if ((i8 & 1) == 0) {
            this.f30354a = null;
        } else {
            this.f30354a = str;
        }
        if ((i8 & 2) == 0) {
            this.f30355b = null;
        } else {
            this.f30355b = str2;
        }
    }

    public static final /* synthetic */ void e(F0 f02, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || f02.f30354a != null) {
            dVar.u(fVar, 0, x6.r0.f39600a, f02.f30354a);
        }
        if (dVar.i(fVar, 1) || f02.f30355b != null) {
            dVar.u(fVar, 1, x6.r0.f39600a, f02.f30355b);
        }
    }

    public final String b() {
        return this.f30355b;
    }

    public final String c() {
        return this.f30354a;
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
        if (AbstractC3159y.d(this.f30354a, f02.f30354a) && AbstractC3159y.d(this.f30355b, f02.f30355b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f30354a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f30355b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "SelectorIcon(lightThemePng=" + this.f30354a + ", darkThemePng=" + this.f30355b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f30354a);
        out.writeString(this.f30355b);
    }

    public F0(String str, String str2) {
        this.f30354a = str;
        this.f30355b = str2;
    }
}
