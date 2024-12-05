package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import e3.InterfaceC2784H;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class t implements InterfaceC2784H, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f25731b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final o.p f25732a;

    /* loaded from: classes4.dex */
    public static final class a extends t {

        /* renamed from: c, reason: collision with root package name */
        private final Integer f25735c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f25736d;

        /* renamed from: e, reason: collision with root package name */
        private final c f25737e;

        /* renamed from: f, reason: collision with root package name */
        private final o.e f25738f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f25739g;

        /* renamed from: h, reason: collision with root package name */
        private final o.b f25740h;

        /* renamed from: i, reason: collision with root package name */
        private static final C0523a f25733i = new C0523a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f25734j = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0523a {
            private C0523a() {
            }

            public /* synthetic */ C0523a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                o.e createFromParcel2 = parcel.readInt() == 0 ? null : o.e.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(valueOf, valueOf2, createFromParcel, createFromParcel2, linkedHashSet, parcel.readInt() != 0 ? o.b.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC2784H, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f25742a;

            /* renamed from: b, reason: collision with root package name */
            private static final C0524a f25741b = new C0524a(null);
            public static final Parcelable.Creator<c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.t$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0524a {
                private C0524a() {
                }

                public /* synthetic */ C0524a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(String str) {
                this.f25742a = str;
            }

            @Override // e3.InterfaceC2784H
            public Map B() {
                String str = this.f25742a;
                if (str != null) {
                    return Q.e(O5.x.a("preferred", str));
                }
                return Q.h();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof c) && AbstractC3255y.d(((c) obj).f25742a, this.f25742a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f25742a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f25742a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25742a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, c cVar, o.e eVar, Set productUsageTokens, o.b bVar) {
            super(o.p.f25587i, null);
            AbstractC3255y.i(productUsageTokens, "productUsageTokens");
            this.f25735c = num;
            this.f25736d = num2;
            this.f25737e = cVar;
            this.f25738f = eVar;
            this.f25739g = productUsageTokens;
            this.f25740h = bVar;
        }

        @Override // com.stripe.android.model.t
        public Map a() {
            Map map;
            O5.r rVar;
            O5.r a8 = O5.x.a("exp_month", this.f25735c);
            O5.r a9 = O5.x.a("exp_year", this.f25736d);
            c cVar = this.f25737e;
            if (cVar != null) {
                map = cVar.B();
            } else {
                map = null;
            }
            List<O5.r> p8 = AbstractC1378t.p(a8, a9, O5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (O5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = O5.x.a(rVar2.c(), d8);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return Q.w(arrayList);
        }

        @Override // com.stripe.android.model.t
        public o.b b() {
            return this.f25740h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC3255y.d(aVar.f25735c, this.f25735c) && AbstractC3255y.d(aVar.f25736d, this.f25736d) && AbstractC3255y.d(aVar.f25737e, this.f25737e) && AbstractC3255y.d(aVar.g(), g())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.stripe.android.model.t
        public o.e g() {
            return this.f25738f;
        }

        @Override // com.stripe.android.model.t
        public Set h() {
            return this.f25739g;
        }

        public int hashCode() {
            return Objects.hash(this.f25735c, this.f25736d, this.f25737e, g());
        }

        public String toString() {
            return "PaymentMethodCreateParams.Card.(expiryMonth=" + this.f25735c + ", expiryYear=" + this.f25736d + ", networks=" + this.f25737e + ", billingDetails=" + g() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            Integer num = this.f25735c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25736d;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            c cVar = this.f25737e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.e eVar = this.f25738f;
            if (eVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                eVar.writeToParcel(out, i8);
            }
            Set set = this.f25739g;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            o.b bVar = this.f25740h;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                bVar.writeToParcel(out, i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ t b(b bVar, Integer num, Integer num2, a.c cVar, o.e eVar, o.b bVar2, Set set, int i8, Object obj) {
            Integer num3;
            Integer num4;
            a.c cVar2;
            o.e eVar2;
            o.b bVar3;
            if ((i8 & 1) != 0) {
                num3 = null;
            } else {
                num3 = num;
            }
            if ((i8 & 2) != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if ((i8 & 4) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 8) != 0) {
                eVar2 = null;
            } else {
                eVar2 = eVar;
            }
            if ((i8 & 16) != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar2;
            }
            return bVar.a(num3, num4, cVar2, eVar2, bVar3, set);
        }

        public final t a(Integer num, Integer num2, a.c cVar, o.e eVar, o.b bVar, Set productUsageTokens) {
            AbstractC3255y.i(productUsageTokens, "productUsageTokens");
            return new a(num, num2, cVar, eVar, productUsageTokens, bVar);
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ t(o.p pVar, AbstractC3247p abstractC3247p) {
        this(pVar);
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        Map e8 = Q.e(O5.x.a(this.f25732a.f25605a, a()));
        o.e g8 = g();
        Map map2 = null;
        if (g8 != null) {
            map = Q.e(O5.x.a("billing_details", g8.B()));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        o.b b8 = b();
        if (b8 != null) {
            map2 = Q.e(O5.x.a("allow_redisplay", b8.g()));
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        return Q.q(Q.q(map, map2), e8);
    }

    public abstract Map a();

    public abstract o.b b();

    public abstract o.e g();

    public abstract Set h();

    public final o.p i() {
        return this.f25732a;
    }

    private t(o.p pVar) {
        this.f25732a = pVar;
    }
}
