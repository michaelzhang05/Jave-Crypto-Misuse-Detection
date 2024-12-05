package h4;

import A6.AbstractC0983d0;
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
/* renamed from: h4.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2920b0 implements Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public static final int f32568e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f32569a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32570b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32571c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32572d;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C2920b0> CREATOR = new c();

    /* renamed from: h4.b0$a */
    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32573a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32574b;

        static {
            a aVar = new a();
            f32573a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec", aVar, 4);
            c0985e0.k("type", false);
            c0985e0.k("label", false);
            c0985e0.k("light_image_url", false);
            c0985e0.k("dark_image_url", true);
            f32574b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32574b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            A6.r0 r0Var = A6.r0.f595a;
            return new w6.b[]{r0Var, r0Var, r0Var, AbstractC4193a.p(r0Var)};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2920b0 b(z6.e decoder) {
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            String str5 = null;
            if (d8.w()) {
                String e8 = d8.e(a8, 0);
                String e9 = d8.e(a8, 1);
                String e10 = d8.e(a8, 2);
                str = e8;
                str4 = (String) d8.q(a8, 3, A6.r0.f595a, null);
                str3 = e10;
                str2 = e9;
                i8 = 15;
            } else {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 != 2) {
                                    if (g8 == 3) {
                                        str8 = (String) d8.q(a8, 3, A6.r0.f595a, str8);
                                        i9 |= 8;
                                    } else {
                                        throw new w6.l(g8);
                                    }
                                } else {
                                    str7 = d8.e(a8, 2);
                                    i9 |= 4;
                                }
                            } else {
                                str6 = d8.e(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str5 = d8.e(a8, 0);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
            }
            d8.b(a8);
            return new C2920b0(i8, str, str2, str3, str4, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, C2920b0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            C2920b0.h(value, d8, a8);
            d8.b(a8);
        }
    }

    /* renamed from: h4.b0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32573a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h4.b0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2920b0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2920b0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2920b0[] newArray(int i8) {
            return new C2920b0[i8];
        }
    }

    public /* synthetic */ C2920b0(int i8, String str, String str2, String str3, String str4, A6.n0 n0Var) {
        if (7 != (i8 & 7)) {
            AbstractC0983d0.a(i8, 7, a.f32573a.a());
        }
        this.f32569a = str;
        this.f32570b = str2;
        this.f32571c = str3;
        if ((i8 & 8) == 0) {
            this.f32572d = null;
        } else {
            this.f32572d = str4;
        }
    }

    public static final /* synthetic */ void h(C2920b0 c2920b0, z6.d dVar, y6.f fVar) {
        dVar.e(fVar, 0, c2920b0.f32569a);
        dVar.e(fVar, 1, c2920b0.f32570b);
        dVar.e(fVar, 2, c2920b0.f32571c);
        if (dVar.p(fVar, 3) || c2920b0.f32572d != null) {
            dVar.x(fVar, 3, A6.r0.f595a, c2920b0.f32572d);
        }
    }

    public final String a() {
        return this.f32572d;
    }

    public final String b() {
        return this.f32570b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2920b0)) {
            return false;
        }
        C2920b0 c2920b0 = (C2920b0) obj;
        if (AbstractC3255y.d(this.f32569a, c2920b0.f32569a) && AbstractC3255y.d(this.f32570b, c2920b0.f32570b) && AbstractC3255y.d(this.f32571c, c2920b0.f32571c) && AbstractC3255y.d(this.f32572d, c2920b0.f32572d)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f32571c;
    }

    public final String getType() {
        return this.f32569a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f32569a.hashCode() * 31) + this.f32570b.hashCode()) * 31) + this.f32571c.hashCode()) * 31;
        String str = this.f32572d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ExternalPaymentMethodSpec(type=" + this.f32569a + ", label=" + this.f32570b + ", lightImageUrl=" + this.f32571c + ", darkImageUrl=" + this.f32572d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f32569a);
        out.writeString(this.f32570b);
        out.writeString(this.f32571c);
        out.writeString(this.f32572d);
    }

    public C2920b0(String type, String label, String lightImageUrl, String str) {
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(label, "label");
        AbstractC3255y.i(lightImageUrl, "lightImageUrl");
        this.f32569a = type;
        this.f32570b = label;
        this.f32571c = lightImageUrl;
        this.f32572d = str;
    }
}
