package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import com.stripe.android.model.o;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class t implements InterfaceC1863H, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f24676b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final o.p f24677a;

    /* loaded from: classes4.dex */
    public static final class a extends t {

        /* renamed from: c, reason: collision with root package name */
        private final Integer f24680c;

        /* renamed from: d, reason: collision with root package name */
        private final Integer f24681d;

        /* renamed from: e, reason: collision with root package name */
        private final c f24682e;

        /* renamed from: f, reason: collision with root package name */
        private final o.e f24683f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f24684g;

        /* renamed from: h, reason: collision with root package name */
        private final o.b f24685h;

        /* renamed from: i, reason: collision with root package name */
        private static final C0527a f24678i = new C0527a(null);

        /* renamed from: j, reason: collision with root package name */
        public static final int f24679j = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0527a {
            private C0527a() {
            }

            public /* synthetic */ C0527a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
        public static final class c implements InterfaceC1863H, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f24687a;

            /* renamed from: b, reason: collision with root package name */
            private static final C0528a f24686b = new C0528a(null);
            public static final Parcelable.Creator<c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.t$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0528a {
                private C0528a() {
                }

                public /* synthetic */ C0528a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(String str) {
                this.f24687a = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof c) && AbstractC3159y.d(((c) obj).f24687a, this.f24687a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f24687a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f24687a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24687a);
            }

            @Override // b3.InterfaceC1863H
            public Map y() {
                String str = this.f24687a;
                if (str != null) {
                    return Q.e(L5.x.a("preferred", str));
                }
                return Q.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, c cVar, o.e eVar, Set productUsageTokens, o.b bVar) {
            super(o.p.f24532i, null);
            AbstractC3159y.i(productUsageTokens, "productUsageTokens");
            this.f24680c = num;
            this.f24681d = num2;
            this.f24682e = cVar;
            this.f24683f = eVar;
            this.f24684g = productUsageTokens;
            this.f24685h = bVar;
        }

        @Override // com.stripe.android.model.t
        public Map b() {
            Map map;
            L5.r rVar;
            L5.r a8 = L5.x.a("exp_month", this.f24680c);
            L5.r a9 = L5.x.a("exp_year", this.f24681d);
            c cVar = this.f24682e;
            if (cVar != null) {
                map = cVar.y();
            } else {
                map = null;
            }
            List<L5.r> p8 = AbstractC1246t.p(a8, a9, L5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (L5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = L5.x.a(rVar2.c(), d8);
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
        public o.b c() {
            return this.f24685h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.model.t
        public o.e e() {
            return this.f24683f;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC3159y.d(aVar.f24680c, this.f24680c) && AbstractC3159y.d(aVar.f24681d, this.f24681d) && AbstractC3159y.d(aVar.f24682e, this.f24682e) && AbstractC3159y.d(aVar.e(), e())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.stripe.android.model.t
        public Set f() {
            return this.f24684g;
        }

        public int hashCode() {
            return Objects.hash(this.f24680c, this.f24681d, this.f24682e, e());
        }

        public String toString() {
            return "PaymentMethodCreateParams.Card.(expiryMonth=" + this.f24680c + ", expiryYear=" + this.f24681d + ", networks=" + this.f24682e + ", billingDetails=" + e() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            Integer num = this.f24680c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24681d;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            c cVar = this.f24682e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.e eVar = this.f24683f;
            if (eVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                eVar.writeToParcel(out, i8);
            }
            Set set = this.f24684g;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            o.b bVar = this.f24685h;
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
            AbstractC3159y.i(productUsageTokens, "productUsageTokens");
            return new a(num, num2, cVar, eVar, productUsageTokens, bVar);
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ t(o.p pVar, AbstractC3151p abstractC3151p) {
        this(pVar);
    }

    public abstract Map b();

    public abstract o.b c();

    public abstract o.e e();

    public abstract Set f();

    public final o.p i() {
        return this.f24677a;
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map e8 = Q.e(L5.x.a(this.f24677a.f24550a, b()));
        o.e e9 = e();
        Map map2 = null;
        if (e9 != null) {
            map = Q.e(L5.x.a("billing_details", e9.y()));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        o.b c8 = c();
        if (c8 != null) {
            map2 = Q.e(L5.x.a("allow_redisplay", c8.e()));
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        return Q.q(Q.q(map, map2), e8);
    }

    private t(o.p pVar) {
        this.f24677a = pVar;
    }
}
