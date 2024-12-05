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
public final class V implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32529a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32530b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<V> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32531a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32532b;

        static {
            a aVar = new a();
            f32531a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.DropdownItemSpec", aVar, 2);
            c0985e0.k("api_value", true);
            c0985e0.k("display_text", true);
            f32532b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32532b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            A6.r0 r0Var = A6.r0.f595a;
            return new w6.b[]{AbstractC4193a.p(r0Var), r0Var};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public V b(z6.e decoder) {
            String str;
            String str2;
            int i8;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            A6.n0 n0Var = null;
            if (d8.w()) {
                str = (String) d8.q(a8, 0, A6.r0.f595a, null);
                str2 = d8.e(a8, 1);
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
                                str3 = d8.e(a8, 1);
                                i9 |= 2;
                            } else {
                                throw new w6.l(g8);
                            }
                        } else {
                            str = (String) d8.q(a8, 0, A6.r0.f595a, str);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                str2 = str3;
                i8 = i9;
            }
            d8.b(a8);
            return new V(i8, str, str2, n0Var);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, V value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            V.g(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32531a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new V(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V[] newArray(int i8) {
            return new V[i8];
        }
    }

    public /* synthetic */ V(int i8, String str, String str2, A6.n0 n0Var) {
        this.f32529a = (i8 & 1) == 0 ? null : str;
        if ((i8 & 2) == 0) {
            this.f32530b = "Other";
        } else {
            this.f32530b = str2;
        }
    }

    public static final /* synthetic */ void g(V v8, z6.d dVar, y6.f fVar) {
        if (dVar.p(fVar, 0) || v8.f32529a != null) {
            dVar.x(fVar, 0, A6.r0.f595a, v8.f32529a);
        }
        if (dVar.p(fVar, 1) || !AbstractC3255y.d(v8.f32530b, "Other")) {
            dVar.e(fVar, 1, v8.f32530b);
        }
    }

    public final String a() {
        return this.f32529a;
    }

    public final String b() {
        return this.f32530b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v8 = (V) obj;
        if (AbstractC3255y.d(this.f32529a, v8.f32529a) && AbstractC3255y.d(this.f32530b, v8.f32530b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f32529a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f32530b.hashCode();
    }

    public String toString() {
        return "DropdownItemSpec(apiValue=" + this.f32529a + ", displayText=" + this.f32530b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f32529a);
        out.writeString(this.f32530b);
    }

    public V(String str, String displayText) {
        AbstractC3255y.i(displayText, "displayText");
        this.f32529a = str;
        this.f32530b = displayText;
    }
}
