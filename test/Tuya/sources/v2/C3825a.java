package v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.g;
import t6.l;
import v2.C3826b;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.n0;
import x6.r0;

@g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3825a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C3826b f38774a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38775b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C3825a> CREATOR = new c();

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0892a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0892a f38776a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f38777b;

        static {
            C0892a c0892a = new C0892a();
            f38776a = c0892a;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.core.model.Country", c0892a, 2);
            c3944e0.k("code", false);
            c3944e0.k("name", false);
            f38777b = c3944e0;
        }

        private C0892a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f38777b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{C3826b.a.f38782a, r0.f39600a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3825a c(w6.e decoder) {
            C3826b c3826b;
            String str;
            int i8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            n0 n0Var = null;
            if (d8.z()) {
                c3826b = (C3826b) d8.r(a8, 0, C3826b.a.f38782a, null);
                str = d8.q(a8, 1);
                i8 = 3;
            } else {
                c3826b = null;
                String str2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 == 1) {
                                str2 = d8.q(a8, 1);
                                i9 |= 2;
                            } else {
                                throw new l(p8);
                            }
                        } else {
                            c3826b = (C3826b) d8.r(a8, 0, C3826b.a.f38782a, c3826b);
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
            return new C3825a(i8, c3826b, str, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C3825a value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C3825a.f(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: v2.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return C0892a.f38776a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: v2.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3825a createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3825a(C3826b.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3825a[] newArray(int i8) {
            return new C3825a[i8];
        }
    }

    public /* synthetic */ C3825a(int i8, C3826b c3826b, String str, n0 n0Var) {
        if (3 != (i8 & 3)) {
            AbstractC3942d0.a(i8, 3, C0892a.f38776a.a());
        }
        this.f38774a = c3826b;
        this.f38775b = str;
    }

    public static final /* synthetic */ void f(C3825a c3825a, w6.d dVar, v6.f fVar) {
        dVar.A(fVar, 0, C3826b.a.f38782a, c3825a.f38774a);
        dVar.y(fVar, 1, c3825a.f38775b);
    }

    public final C3826b b() {
        return this.f38774a;
    }

    public final C3826b c() {
        return this.f38774a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f38775b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3825a)) {
            return false;
        }
        C3825a c3825a = (C3825a) obj;
        if (AbstractC3159y.d(this.f38774a, c3825a.f38774a) && AbstractC3159y.d(this.f38775b, c3825a.f38775b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38774a.hashCode() * 31) + this.f38775b.hashCode();
    }

    public String toString() {
        return this.f38775b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        this.f38774a.writeToParcel(out, i8);
        out.writeString(this.f38775b);
    }

    public C3825a(C3826b code, String name) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(name, "name");
        this.f38774a = code;
        this.f38775b = name;
    }
}
