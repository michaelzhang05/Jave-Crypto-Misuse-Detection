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
public final class V implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f30608a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30609b;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<V> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30610a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30611b;

        static {
            a aVar = new a();
            f30610a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.DropdownItemSpec", aVar, 2);
            c3944e0.k("api_value", true);
            c3944e0.k("display_text", true);
            f30611b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30611b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            x6.r0 r0Var = x6.r0.f39600a;
            return new t6.b[]{AbstractC3808a.p(r0Var), r0Var};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public V c(w6.e decoder) {
            String str;
            String str2;
            int i8;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            x6.n0 n0Var = null;
            if (d8.z()) {
                str = (String) d8.y(a8, 0, x6.r0.f39600a, null);
                str2 = d8.q(a8, 1);
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
                                str3 = d8.q(a8, 1);
                                i9 |= 2;
                            } else {
                                throw new t6.l(p8);
                            }
                        } else {
                            str = (String) d8.y(a8, 0, x6.r0.f39600a, str);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                str2 = str3;
                i8 = i9;
            }
            d8.a(a8);
            return new V(i8, str, str2, n0Var);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, V value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            V.e(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30610a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new V(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V[] newArray(int i8) {
            return new V[i8];
        }
    }

    public /* synthetic */ V(int i8, String str, String str2, x6.n0 n0Var) {
        this.f30608a = (i8 & 1) == 0 ? null : str;
        if ((i8 & 2) == 0) {
            this.f30609b = "Other";
        } else {
            this.f30609b = str2;
        }
    }

    public static final /* synthetic */ void e(V v8, w6.d dVar, v6.f fVar) {
        if (dVar.i(fVar, 0) || v8.f30608a != null) {
            dVar.u(fVar, 0, x6.r0.f39600a, v8.f30608a);
        }
        if (dVar.i(fVar, 1) || !AbstractC3159y.d(v8.f30609b, "Other")) {
            dVar.y(fVar, 1, v8.f30609b);
        }
    }

    public final String b() {
        return this.f30608a;
    }

    public final String c() {
        return this.f30609b;
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
        if (AbstractC3159y.d(this.f30608a, v8.f30608a) && AbstractC3159y.d(this.f30609b, v8.f30609b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f30608a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f30609b.hashCode();
    }

    public String toString() {
        return "DropdownItemSpec(apiValue=" + this.f30608a + ", displayText=" + this.f30609b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f30608a);
        out.writeString(this.f30609b);
    }

    public V(String str, String displayText) {
        AbstractC3159y.i(displayText, "displayText");
        this.f30608a = str;
        this.f30609b = displayText;
    }
}
