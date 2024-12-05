package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3944e0;

@StabilityInferred(parameters = 1)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: e4.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2600b0 implements Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public static final int f30647e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f30648a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30649b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30650c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30651d;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<C2600b0> CREATOR = new c();

    /* renamed from: e4.b0$a */
    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30652a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30653b;

        static {
            a aVar = new a();
            f30652a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec", aVar, 4);
            c3944e0.k("type", false);
            c3944e0.k("label", false);
            c3944e0.k("light_image_url", false);
            c3944e0.k("dark_image_url", true);
            f30653b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30653b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            x6.r0 r0Var = x6.r0.f39600a;
            return new t6.b[]{r0Var, r0Var, r0Var, AbstractC3808a.p(r0Var)};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C2600b0 c(w6.e decoder) {
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            String str5 = null;
            if (d8.z()) {
                String q8 = d8.q(a8, 0);
                String q9 = d8.q(a8, 1);
                String q10 = d8.q(a8, 2);
                str = q8;
                str4 = (String) d8.y(a8, 3, x6.r0.f39600a, null);
                str3 = q10;
                str2 = q9;
                i8 = 15;
            } else {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 != 2) {
                                    if (p8 == 3) {
                                        str8 = (String) d8.y(a8, 3, x6.r0.f39600a, str8);
                                        i9 |= 8;
                                    } else {
                                        throw new t6.l(p8);
                                    }
                                } else {
                                    str7 = d8.q(a8, 2);
                                    i9 |= 4;
                                }
                            } else {
                                str6 = d8.q(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str5 = d8.q(a8, 0);
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
            d8.a(a8);
            return new C2600b0(i8, str, str2, str3, str4, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, C2600b0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            C2600b0.f(value, d8, a8);
            d8.a(a8);
        }
    }

    /* renamed from: e4.b0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30652a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e4.b0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2600b0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2600b0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2600b0[] newArray(int i8) {
            return new C2600b0[i8];
        }
    }

    public /* synthetic */ C2600b0(int i8, String str, String str2, String str3, String str4, x6.n0 n0Var) {
        if (7 != (i8 & 7)) {
            AbstractC3942d0.a(i8, 7, a.f30652a.a());
        }
        this.f30648a = str;
        this.f30649b = str2;
        this.f30650c = str3;
        if ((i8 & 8) == 0) {
            this.f30651d = null;
        } else {
            this.f30651d = str4;
        }
    }

    public static final /* synthetic */ void f(C2600b0 c2600b0, w6.d dVar, v6.f fVar) {
        dVar.y(fVar, 0, c2600b0.f30648a);
        dVar.y(fVar, 1, c2600b0.f30649b);
        dVar.y(fVar, 2, c2600b0.f30650c);
        if (dVar.i(fVar, 3) || c2600b0.f30651d != null) {
            dVar.u(fVar, 3, x6.r0.f39600a, c2600b0.f30651d);
        }
    }

    public final String b() {
        return this.f30651d;
    }

    public final String c() {
        return this.f30649b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f30650c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2600b0)) {
            return false;
        }
        C2600b0 c2600b0 = (C2600b0) obj;
        if (AbstractC3159y.d(this.f30648a, c2600b0.f30648a) && AbstractC3159y.d(this.f30649b, c2600b0.f30649b) && AbstractC3159y.d(this.f30650c, c2600b0.f30650c) && AbstractC3159y.d(this.f30651d, c2600b0.f30651d)) {
            return true;
        }
        return false;
    }

    public final String getType() {
        return this.f30648a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f30648a.hashCode() * 31) + this.f30649b.hashCode()) * 31) + this.f30650c.hashCode()) * 31;
        String str = this.f30651d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ExternalPaymentMethodSpec(type=" + this.f30648a + ", label=" + this.f30649b + ", lightImageUrl=" + this.f30650c + ", darkImageUrl=" + this.f30651d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f30648a);
        out.writeString(this.f30649b);
        out.writeString(this.f30650c);
        out.writeString(this.f30651d);
    }

    public C2600b0(String type, String label, String lightImageUrl, String str) {
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(label, "label");
        AbstractC3159y.i(lightImageUrl, "lightImageUrl");
        this.f30648a = type;
        this.f30649b = label;
        this.f30650c = lightImageUrl;
        this.f30651d = str;
    }
}
