package e4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import e4.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.C3434y;
import m4.G;
import x6.AbstractC3942d0;
import x6.C;
import x6.C3943e;
import x6.C3944e0;

@StabilityInferred(parameters = 0)
@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes4.dex */
public final class W extends AbstractC2608f0 {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30614a;

    /* renamed from: b, reason: collision with root package name */
    private final P0 f30615b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30616c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f30612d = 8;
    public static final Parcelable.Creator<W> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final t6.b[] f30613e = {null, P0.Companion.serializer(), new C3943e(V.a.f30610a)};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30617a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f30618b;

        static {
            a aVar = new a();
            f30617a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.ui.core.elements.DropdownSpec", aVar, 3);
            c3944e0.k("api_path", false);
            c3944e0.k("translation_id", false);
            c3944e0.k("items", false);
            f30618b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f30618b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b[] bVarArr = W.f30613e;
            return new t6.b[]{G.a.f35099a, bVarArr[1], bVarArr[2]};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public W c(w6.e decoder) {
            int i8;
            m4.G g8;
            P0 p02;
            List list;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = W.f30613e;
            m4.G g9 = null;
            if (d8.z()) {
                m4.G g10 = (m4.G) d8.r(a8, 0, G.a.f35099a, null);
                P0 p03 = (P0) d8.r(a8, 1, bVarArr[1], null);
                list = (List) d8.r(a8, 2, bVarArr[2], null);
                g8 = g10;
                p02 = p03;
                i8 = 7;
            } else {
                P0 p04 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 == 2) {
                                    list2 = (List) d8.r(a8, 2, bVarArr[2], list2);
                                    i9 |= 4;
                                } else {
                                    throw new t6.l(p8);
                                }
                            } else {
                                p04 = (P0) d8.r(a8, 1, bVarArr[1], p04);
                                i9 |= 2;
                            }
                        } else {
                            g9 = (m4.G) d8.r(a8, 0, G.a.f35099a, g9);
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
            d8.a(a8);
            return new W(i8, g8, p02, list, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, W value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            W.k(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f30617a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            m4.G g8 = (m4.G) parcel.readParcelable(W.class.getClassLoader());
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
    public /* synthetic */ W(int i8, m4.G g8, P0 p02, List list, x6.n0 n0Var) {
        super(null);
        if (7 != (i8 & 7)) {
            AbstractC3942d0.a(i8, 7, a.f30617a.a());
        }
        this.f30614a = g8;
        this.f30615b = p02;
        this.f30616c = list;
    }

    public static final /* synthetic */ void k(W w8, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f30613e;
        dVar.A(fVar, 0, G.a.f35099a, w8.i());
        dVar.A(fVar, 1, bVarArr[1], w8.f30615b);
        dVar.A(fVar, 2, bVarArr[2], w8.f30616c);
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
        if (AbstractC3159y.d(this.f30614a, w8.f30614a) && this.f30615b == w8.f30615b && AbstractC3159y.d(this.f30616c, w8.f30616c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f30614a.hashCode() * 31) + this.f30615b.hashCode()) * 31) + this.f30616c.hashCode();
    }

    public m4.G i() {
        return this.f30614a;
    }

    public final m4.h0 j(Map initialValues) {
        AbstractC3159y.i(initialValues, "initialValues");
        return AbstractC2608f0.e(this, new K0(i(), new C3434y(new J0(this.f30615b.c(), this.f30616c), (String) initialValues.get(i()))), null, 2, null);
    }

    public String toString() {
        return "DropdownSpec(apiPath=" + this.f30614a + ", labelTranslationId=" + this.f30615b + ", items=" + this.f30616c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f30614a, i8);
        out.writeString(this.f30615b.name());
        List list = this.f30616c;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((V) it.next()).writeToParcel(out, i8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(m4.G apiPath, P0 labelTranslationId, List items) {
        super(null);
        AbstractC3159y.i(apiPath, "apiPath");
        AbstractC3159y.i(labelTranslationId, "labelTranslationId");
        AbstractC3159y.i(items, "items");
        this.f30614a = apiPath;
        this.f30615b = labelTranslationId;
        this.f30616c = items;
    }
}
