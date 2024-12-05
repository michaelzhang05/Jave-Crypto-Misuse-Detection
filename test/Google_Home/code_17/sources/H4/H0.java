package h4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0984e;
import A6.C0985e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import h4.F0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import x6.AbstractC4193a;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class H0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32297a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f32298b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f32299c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32295d = 8;
    public static final Parcelable.Creator<H0> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f32296e = {null, new C0984e(C2930g0.f32604c), null};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32300a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32301b;

        static {
            a aVar = new a();
            f32300a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.SharedDataSpec", aVar, 3);
            c0985e0.k("type", false);
            c0985e0.k("fields", true);
            c0985e0.k("selector_icon", true);
            f32301b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32301b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            return new w6.b[]{A6.r0.f595a, H0.f32296e[1], AbstractC4193a.p(F0.a.f32277a)};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public H0 b(z6.e decoder) {
            int i8;
            String str;
            ArrayList arrayList;
            F0 f02;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = H0.f32296e;
            String str2 = null;
            if (d8.w()) {
                String e8 = d8.e(a8, 0);
                arrayList = (ArrayList) d8.x(a8, 1, bVarArr[1], null);
                str = e8;
                f02 = (F0) d8.q(a8, 2, F0.a.f32277a, null);
                i8 = 7;
            } else {
                ArrayList arrayList2 = null;
                F0 f03 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 == 2) {
                                    f03 = (F0) d8.q(a8, 2, F0.a.f32277a, f03);
                                    i9 |= 4;
                                } else {
                                    throw new w6.l(g8);
                                }
                            } else {
                                arrayList2 = (ArrayList) d8.x(a8, 1, bVarArr[1], arrayList2);
                                i9 |= 2;
                            }
                        } else {
                            str2 = d8.e(a8, 0);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str2;
                arrayList = arrayList2;
                f02 = f03;
            }
            d8.b(a8);
            return new H0(i8, str, arrayList, f02, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, H0 value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            H0.h(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32300a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 createFromParcel(Parcel parcel) {
            F0 createFromParcel;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(H0.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = F0.CREATOR.createFromParcel(parcel);
            }
            return new H0(readString, arrayList, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H0[] newArray(int i8) {
            return new H0[i8];
        }
    }

    public /* synthetic */ H0(int i8, String str, ArrayList arrayList, F0 f02, A6.n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC0983d0.a(i8, 1, a.f32300a.a());
        }
        this.f32297a = str;
        if ((i8 & 2) == 0) {
            this.f32298b = new ArrayList();
        } else {
            this.f32298b = arrayList;
        }
        if ((i8 & 4) == 0) {
            this.f32299c = null;
        } else {
            this.f32299c = f02;
        }
    }

    public static final /* synthetic */ void h(H0 h02, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32296e;
        dVar.e(fVar, 0, h02.f32297a);
        if (dVar.p(fVar, 1) || !AbstractC3255y.d(h02.f32298b, new ArrayList())) {
            dVar.C(fVar, 1, bVarArr[1], h02.f32298b);
        }
        if (dVar.p(fVar, 2) || h02.f32299c != null) {
            dVar.x(fVar, 2, F0.a.f32277a, h02.f32299c);
        }
    }

    public final ArrayList b() {
        return this.f32298b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (AbstractC3255y.d(this.f32297a, h02.f32297a) && AbstractC3255y.d(this.f32298b, h02.f32298b) && AbstractC3255y.d(this.f32299c, h02.f32299c)) {
            return true;
        }
        return false;
    }

    public final F0 g() {
        return this.f32299c;
    }

    public final String getType() {
        return this.f32297a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f32297a.hashCode() * 31) + this.f32298b.hashCode()) * 31;
        F0 f02 = this.f32299c;
        if (f02 == null) {
            hashCode = 0;
        } else {
            hashCode = f02.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "SharedDataSpec(type=" + this.f32297a + ", fields=" + this.f32298b + ", selectorIcon=" + this.f32299c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f32297a);
        ArrayList arrayList = this.f32298b;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        F0 f02 = this.f32299c;
        if (f02 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            f02.writeToParcel(out, i8);
        }
    }

    public H0(String type, ArrayList fields, F0 f02) {
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(fields, "fields");
        this.f32297a = type;
        this.f32298b = fields;
        this.f32299c = f02;
    }
}
