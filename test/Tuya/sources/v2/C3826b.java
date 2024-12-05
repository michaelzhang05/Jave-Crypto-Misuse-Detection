package v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import t6.g;
import t6.l;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;
import x6.n0;
import x6.r0;

@g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3826b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f38781a;
    public static final C0893b Companion = new C0893b(null);
    public static final Parcelable.Creator<C3826b> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final C3826b f38778b = new C3826b("US");

    /* renamed from: c, reason: collision with root package name */
    private static final C3826b f38779c = new C3826b("CA");

    /* renamed from: d, reason: collision with root package name */
    private static final C3826b f38780d = new C3826b("GB");

    /* renamed from: v2.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38782a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f38783b;

        static {
            a aVar = new a();
            f38782a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.core.model.CountryCode", aVar, 1);
            c3944e0.k("value", false);
            f38783b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f38783b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{r0.f39600a};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3826b c(w6.e decoder) {
            String str;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            int i8 = 1;
            n0 n0Var = null;
            if (d8.z()) {
                str = d8.q(a8, 0);
            } else {
                str = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 == 0) {
                            str = d8.q(a8, 0);
                            i9 = 1;
                        } else {
                            throw new l(p8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            d8.a(a8);
            return new C3826b(i8, str, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C3826b value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C3826b.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: v2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0893b {
        private C0893b() {
        }

        public final C3826b a(String value) {
            AbstractC3159y.i(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            return new C3826b(upperCase);
        }

        public final C3826b b() {
            return C3826b.f38778b;
        }

        public final t6.b serializer() {
            return a.f38782a;
        }

        public /* synthetic */ C0893b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: v2.b$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3826b createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C3826b(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3826b[] newArray(int i8) {
            return new C3826b[i8];
        }
    }

    public /* synthetic */ C3826b(int i8, String str, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC3942d0.a(i8, 1, a.f38782a.a());
        }
        this.f38781a = str;
    }

    public static final /* synthetic */ void e(C3826b c3826b, w6.d dVar, v6.f fVar) {
        dVar.y(fVar, 0, c3826b.f38781a);
    }

    public final String c() {
        return this.f38781a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3826b) && AbstractC3159y.d(this.f38781a, ((C3826b) obj).f38781a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f38781a.hashCode();
    }

    public String toString() {
        return "CountryCode(value=" + this.f38781a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f38781a);
    }

    public C3826b(String value) {
        AbstractC3159y.i(value, "value");
        this.f38781a = value;
    }
}
