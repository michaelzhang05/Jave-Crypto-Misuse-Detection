package y2;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.n0;
import A6.r0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.g;
import w6.l;
import y2.C4203b;

@g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4202a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C4203b f40905a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40906b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C4202a> CREATOR = new c();

    /* renamed from: y2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0929a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final C0929a f40907a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f40908b;

        static {
            C0929a c0929a = new C0929a();
            f40907a = c0929a;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.core.model.Country", c0929a, 2);
            c0985e0.k("code", false);
            c0985e0.k("name", false);
            f40908b = c0985e0;
        }

        private C0929a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f40908b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{C4203b.a.f40913a, r0.f595a};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C4202a b(z6.e decoder) {
            C4203b c4203b;
            String str;
            int i8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            n0 n0Var = null;
            if (d8.w()) {
                c4203b = (C4203b) d8.x(a8, 0, C4203b.a.f40913a, null);
                str = d8.e(a8, 1);
                i8 = 3;
            } else {
                c4203b = null;
                String str2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 == 1) {
                                str2 = d8.e(a8, 1);
                                i9 |= 2;
                            } else {
                                throw new l(g8);
                            }
                        } else {
                            c4203b = (C4203b) d8.x(a8, 0, C4203b.a.f40913a, c4203b);
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
            return new C4202a(i8, c4203b, str, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C4202a value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C4202a.h(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: y2.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return C0929a.f40907a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: y2.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4202a createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C4202a(C4203b.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4202a[] newArray(int i8) {
            return new C4202a[i8];
        }
    }

    public /* synthetic */ C4202a(int i8, C4203b c4203b, String str, n0 n0Var) {
        if (3 != (i8 & 3)) {
            AbstractC0983d0.a(i8, 3, C0929a.f40907a.a());
        }
        this.f40905a = c4203b;
        this.f40906b = str;
    }

    public static final /* synthetic */ void h(C4202a c4202a, z6.d dVar, y6.f fVar) {
        dVar.C(fVar, 0, C4203b.a.f40913a, c4202a.f40905a);
        dVar.e(fVar, 1, c4202a.f40906b);
    }

    public final C4203b a() {
        return this.f40905a;
    }

    public final C4203b b() {
        return this.f40905a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4202a)) {
            return false;
        }
        C4202a c4202a = (C4202a) obj;
        if (AbstractC3255y.d(this.f40905a, c4202a.f40905a) && AbstractC3255y.d(this.f40906b, c4202a.f40906b)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f40906b;
    }

    public int hashCode() {
        return (this.f40905a.hashCode() * 31) + this.f40906b.hashCode();
    }

    public String toString() {
        return this.f40906b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        this.f40905a.writeToParcel(out, i8);
        out.writeString(this.f40906b);
    }

    public C4202a(C4203b code, String name) {
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(name, "name");
        this.f40905a = code;
        this.f40906b = name;
    }
}
