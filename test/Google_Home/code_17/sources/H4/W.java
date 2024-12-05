package h4;

import A6.AbstractC0983d0;
import A6.C;
import A6.C0984e;
import A6.C0985e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import h4.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.C3777y;
import p4.G;

@StabilityInferred(parameters = 0)
@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes4.dex */
public final class W extends AbstractC2928f0 {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32535a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f32536b;

    /* renamed from: c, reason: collision with root package name */
    private final List f32537c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32533d = 8;
    public static final Parcelable.Creator<W> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final w6.b[] f32534e = {null, P0.Companion.serializer(), new C0984e(V.a.f32531a)};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32538a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f32539b;

        static {
            a aVar = new a();
            f32538a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.ui.core.elements.DropdownSpec", aVar, 3);
            c0985e0.k("api_path", false);
            c0985e0.k("translation_id", false);
            c0985e0.k("items", false);
            f32539b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f32539b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b[] bVarArr = W.f32534e;
            return new w6.b[]{G.a.f37125a, bVarArr[1], bVarArr[2]};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public W b(z6.e decoder) {
            int i8;
            p4.G g8;
            P0 p02;
            List list;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = W.f32534e;
            p4.G g9 = null;
            if (d8.w()) {
                p4.G g10 = (p4.G) d8.x(a8, 0, G.a.f37125a, null);
                P0 p03 = (P0) d8.x(a8, 1, bVarArr[1], null);
                list = (List) d8.x(a8, 2, bVarArr[2], null);
                g8 = g10;
                p02 = p03;
                i8 = 7;
            } else {
                P0 p04 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g11 = d8.g(a8);
                    if (g11 != -1) {
                        if (g11 != 0) {
                            if (g11 != 1) {
                                if (g11 == 2) {
                                    list2 = (List) d8.x(a8, 2, bVarArr[2], list2);
                                    i9 |= 4;
                                } else {
                                    throw new w6.l(g11);
                                }
                            } else {
                                p04 = (P0) d8.x(a8, 1, bVarArr[1], p04);
                                i9 |= 2;
                            }
                        } else {
                            g9 = (p4.G) d8.x(a8, 0, G.a.f37125a, g9);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                g8 = g9;
                p02 = p04;
                list = list2;
            }
            d8.b(a8);
            return new W(i8, g8, p02, list, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, W value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            W.p(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f32538a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            p4.G g8 = (p4.G) parcel.readParcelable(W.class.getClassLoader());
            P0 valueOf = P0.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(V.CREATOR.createFromParcel(parcel));
            }
            return new W(g8, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W[] newArray(int i8) {
            return new W[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i8, p4.G g8, P0 p02, List list, A6.n0 n0Var) {
        super(null);
        if (7 != (i8 & 7)) {
            AbstractC0983d0.a(i8, 7, a.f32538a.a());
        }
        this.f32535a = g8;
        this.f32536b = p02;
        this.f32537c = list;
    }

    public static final /* synthetic */ void p(W w8, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f32534e;
        dVar.C(fVar, 0, G.a.f37125a, w8.i());
        dVar.C(fVar, 1, bVarArr[1], w8.f32536b);
        dVar.C(fVar, 2, bVarArr[2], w8.f32537c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w8 = (W) obj;
        if (AbstractC3255y.d(this.f32535a, w8.f32535a) && this.f32536b == w8.f32536b && AbstractC3255y.d(this.f32537c, w8.f32537c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f32535a.hashCode() * 31) + this.f32536b.hashCode()) * 31) + this.f32537c.hashCode();
    }

    public p4.G i() {
        return this.f32535a;
    }

    public final p4.h0 l(Map initialValues) {
        AbstractC3255y.i(initialValues, "initialValues");
        return AbstractC2928f0.g(this, new K0(i(), new C3777y(new J0(this.f32536b.c(), this.f32537c), (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "DropdownSpec(apiPath=" + this.f32535a + ", labelTranslationId=" + this.f32536b + ", items=" + this.f32537c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f32535a, i8);
        out.writeString(this.f32536b.name());
        List list = this.f32537c;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((V) it.next()).writeToParcel(out, i8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(p4.G apiPath, P0 labelTranslationId, List items) {
        super(null);
        AbstractC3255y.i(apiPath, "apiPath");
        AbstractC3255y.i(labelTranslationId, "labelTranslationId");
        AbstractC3255y.i(items, "items");
        this.f32535a = apiPath;
        this.f32536b = labelTranslationId;
        this.f32537c = items;
    }
}
