package y2;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0985e0;
import A6.n0;
import A6.r0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import w6.g;
import w6.l;

@g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4203b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f40912a;
    public static final C0930b Companion = new C0930b(null);
    public static final Parcelable.Creator<C4203b> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final C4203b f40909b = new C4203b("US");

    /* renamed from: c, reason: collision with root package name */
    private static final C4203b f40910c = new C4203b("CA");

    /* renamed from: d, reason: collision with root package name */
    private static final C4203b f40911d = new C4203b("GB");

    /* renamed from: y2.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40913a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f40914b;

        static {
            a aVar = new a();
            f40913a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.core.model.CountryCode", aVar, 1);
            c0985e0.k("value", false);
            f40914b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f40914b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{r0.f595a};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C4203b b(z6.e decoder) {
            String str;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            int i8 = 1;
            n0 n0Var = null;
            if (d8.w()) {
                str = d8.e(a8, 0);
            } else {
                str = null;
                boolean z8 = true;
                int i9 = 0;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 == 0) {
                            str = d8.e(a8, 0);
                            i9 = 1;
                        } else {
                            throw new l(g8);
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
            }
            d8.b(a8);
            return new C4203b(i8, str, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C4203b value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C4203b.g(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: y2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0930b {
        private C0930b() {
        }

        public final C4203b a(String value) {
            AbstractC3255y.i(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            return new C4203b(upperCase);
        }

        public final C4203b b() {
            return C4203b.f40909b;
        }

        public final w6.b serializer() {
            return a.f40913a;
        }

        public /* synthetic */ C0930b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: y2.b$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4203b createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C4203b(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4203b[] newArray(int i8) {
            return new C4203b[i8];
        }
    }

    public /* synthetic */ C4203b(int i8, String str, n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC0983d0.a(i8, 1, a.f40913a.a());
        }
        this.f40912a = str;
    }

    public static final /* synthetic */ void g(C4203b c4203b, z6.d dVar, y6.f fVar) {
        dVar.e(fVar, 0, c4203b.f40912a);
    }

    public final String b() {
        return this.f40912a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4203b) && AbstractC3255y.d(this.f40912a, ((C4203b) obj).f40912a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f40912a.hashCode();
    }

    public String toString() {
        return "CountryCode(value=" + this.f40912a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f40912a);
    }

    public C4203b(String value) {
        AbstractC3255y.i(value, "value");
        this.f40912a = value;
    }
}
