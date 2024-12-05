package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import e4.F0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import u6.AbstractC3808a;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3943e;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class H0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f30376a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f30377b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f30378c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f30374d = 8;
    public static final Parcelable.Creator<H0> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f30375e = {null, new C3943e(C2610g0.f30683c), null};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30379a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30380b;

        static {
            a aVar = new a();
            f30379a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.SharedDataSpec", aVar, 3);
            c3944e0.k("type", false);
            c3944e0.k("fields", true);
            c3944e0.k("selector_icon", true);
            f30380b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30380b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            return new t6.b[]{x6.r0.f39600a, H0.f30375e[1], AbstractC3808a.p(F0.a.f30356a)};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public H0 c(w6.e decoder) {
            int i8;
            String str;
            ArrayList arrayList;
            F0 f02;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = H0.f30375e;
            String str2 = null;
            if (d8.z()) {
                String q8 = d8.q(a8, 0);
                arrayList = (ArrayList) d8.r(a8, 1, bVarArr[1], null);
                str = q8;
                f02 = (F0) d8.y(a8, 2, F0.a.f30356a, null);
                i8 = 7;
            } else {
                ArrayList arrayList2 = null;
                F0 f03 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 == 2) {
                                    f03 = (F0) d8.y(a8, 2, F0.a.f30356a, f03);
                                    i9 |= 4;
                                } else {
                                    throw new t6.l(p8);
                                }
                            } else {
                                arrayList2 = (ArrayList) d8.r(a8, 1, bVarArr[1], arrayList2);
                                i9 |= 2;
                            }
                        } else {
                            str2 = d8.q(a8, 0);
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
            d8.a(a8);
            return new H0(i8, str, arrayList, f02, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, H0 value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            H0.f(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30379a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 createFromParcel(Parcel parcel) {
            F0 createFromParcel;
            AbstractC3159y.i(parcel, "parcel");
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

    public /* synthetic */ H0(int i8, String str, ArrayList arrayList, F0 f02, x6.n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC3942d0.a(i8, 1, a.f30379a.a());
        }
        this.f30376a = str;
        if ((i8 & 2) == 0) {
            this.f30377b = new ArrayList();
        } else {
            this.f30377b = arrayList;
        }
        if ((i8 & 4) == 0) {
            this.f30378c = null;
        } else {
            this.f30378c = f02;
        }
    }

    public static final /* synthetic */ void f(H0 h02, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30375e;
        dVar.y(fVar, 0, h02.f30376a);
        if (dVar.i(fVar, 1) || !AbstractC3159y.d(h02.f30377b, new ArrayList())) {
            dVar.A(fVar, 1, bVarArr[1], h02.f30377b);
        }
        if (dVar.i(fVar, 2) || h02.f30378c != null) {
            dVar.u(fVar, 2, F0.a.f30356a, h02.f30378c);
        }
    }

    public final ArrayList c() {
        return this.f30377b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final F0 e() {
        return this.f30378c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (AbstractC3159y.d(this.f30376a, h02.f30376a) && AbstractC3159y.d(this.f30377b, h02.f30377b) && AbstractC3159y.d(this.f30378c, h02.f30378c)) {
            return true;
        }
        return false;
    }

    public final String getType() {
        return this.f30376a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f30376a.hashCode() * 31) + this.f30377b.hashCode()) * 31;
        F0 f02 = this.f30378c;
        if (f02 == null) {
            hashCode = 0;
        } else {
            hashCode = f02.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "SharedDataSpec(type=" + this.f30376a + ", fields=" + this.f30377b + ", selectorIcon=" + this.f30378c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f30376a);
        ArrayList arrayList = this.f30377b;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        F0 f02 = this.f30378c;
        if (f02 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            f02.writeToParcel(out, i8);
        }
    }

    public H0(String type, ArrayList fields, F0 f02) {
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(fields, "fields");
        this.f30376a = type;
        this.f30377b = fields;
        this.f30378c = f02;
    }
}
