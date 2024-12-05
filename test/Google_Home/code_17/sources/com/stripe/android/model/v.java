package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import e3.InterfaceC2784H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class v implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f25795a;

    /* renamed from: b, reason: collision with root package name */
    private final d f25796b;

    /* renamed from: c, reason: collision with root package name */
    private static final a f25793c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25794d = 8;
    public static final Parcelable.Creator<v> CREATOR = new b();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC3255y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(c.CREATOR.createFromParcel(parcel));
                }
            }
            return new v(arrayList, parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i8) {
            return new v[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0526c f25798a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f25799b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25800c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25801d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25802e;

        /* renamed from: f, reason: collision with root package name */
        private final Integer f25803f;

        /* renamed from: g, reason: collision with root package name */
        private static final a f25797g = new a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : EnumC0526c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.stripe.android.model.v$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0526c {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0526c f25804b = new EnumC0526c("Sku", 0, "sku");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0526c f25805c = new EnumC0526c("Tax", 1, "tax");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0526c f25806d = new EnumC0526c("Shipping", 2, "shipping");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ EnumC0526c[] f25807e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25808f;

            /* renamed from: a, reason: collision with root package name */
            private final String f25809a;

            static {
                EnumC0526c[] a8 = a();
                f25807e = a8;
                f25808f = U5.b.a(a8);
            }

            private EnumC0526c(String str, int i8, String str2) {
                this.f25809a = str2;
            }

            private static final /* synthetic */ EnumC0526c[] a() {
                return new EnumC0526c[]{f25804b, f25805c, f25806d};
            }

            public static EnumC0526c valueOf(String str) {
                return (EnumC0526c) Enum.valueOf(EnumC0526c.class, str);
            }

            public static EnumC0526c[] values() {
                return (EnumC0526c[]) f25807e.clone();
            }

            public final String b() {
                return this.f25809a;
            }
        }

        public c(EnumC0526c enumC0526c, Integer num, String str, String str2, String str3, Integer num2) {
            this.f25798a = enumC0526c;
            this.f25799b = num;
            this.f25800c = str;
            this.f25801d = str2;
            this.f25802e = str3;
            this.f25803f = num2;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map map4;
            Map map5;
            Map h8 = Q.h();
            Integer num = this.f25799b;
            Map map6 = null;
            if (num != null) {
                map = Q.e(O5.x.a(RewardPlus.AMOUNT, Integer.valueOf(num.intValue())));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f25800c;
            if (str != null) {
                map2 = Q.e(O5.x.a("currency", str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f25801d;
            if (str2 != null) {
                map3 = Q.e(O5.x.a("description", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f25802e;
            if (str3 != null) {
                map4 = Q.e(O5.x.a("parent", str3));
            } else {
                map4 = null;
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            Map q11 = Q.q(q10, map4);
            Integer num2 = this.f25803f;
            if (num2 != null) {
                map5 = Q.e(O5.x.a("quantity", Integer.valueOf(num2.intValue())));
            } else {
                map5 = null;
            }
            if (map5 == null) {
                map5 = Q.h();
            }
            Map q12 = Q.q(q11, map5);
            EnumC0526c enumC0526c = this.f25798a;
            if (enumC0526c != null) {
                map6 = Q.e(O5.x.a("type", enumC0526c.b()));
            }
            if (map6 == null) {
                map6 = Q.h();
            }
            return Q.q(q12, map6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f25798a == cVar.f25798a && AbstractC3255y.d(this.f25799b, cVar.f25799b) && AbstractC3255y.d(this.f25800c, cVar.f25800c) && AbstractC3255y.d(this.f25801d, cVar.f25801d) && AbstractC3255y.d(this.f25802e, cVar.f25802e) && AbstractC3255y.d(this.f25803f, cVar.f25803f);
        }

        public int hashCode() {
            EnumC0526c enumC0526c = this.f25798a;
            int hashCode = (enumC0526c == null ? 0 : enumC0526c.hashCode()) * 31;
            Integer num = this.f25799b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f25800c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25801d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25802e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.f25803f;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Item(type=" + this.f25798a + ", amount=" + this.f25799b + ", currency=" + this.f25800c + ", description=" + this.f25801d + ", parent=" + this.f25802e + ", quantity=" + this.f25803f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            EnumC0526c enumC0526c = this.f25798a;
            if (enumC0526c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC0526c.name());
            }
            Integer num = this.f25799b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f25800c);
            out.writeString(this.f25801d);
            out.writeString(this.f25802e);
            Integer num2 = this.f25803f;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25811a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25812b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25813c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25814d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25815e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f25810f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3255y.i(address, "address");
            this.f25811a = address;
            this.f25812b = str;
            this.f25813c = str2;
            this.f25814d = str3;
            this.f25815e = str4;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map e8 = Q.e(O5.x.a("address", this.f25811a.B()));
            String str = this.f25812b;
            Map map4 = null;
            if (str != null) {
                map = Q.e(O5.x.a("carrier", str));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(e8, map);
            String str2 = this.f25813c;
            if (str2 != null) {
                map2 = Q.e(O5.x.a("name", str2));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str3 = this.f25814d;
            if (str3 != null) {
                map3 = Q.e(O5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str4 = this.f25815e;
            if (str4 != null) {
                map4 = Q.e(O5.x.a("tracking_number", str4));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f25811a, dVar.f25811a) && AbstractC3255y.d(this.f25812b, dVar.f25812b) && AbstractC3255y.d(this.f25813c, dVar.f25813c) && AbstractC3255y.d(this.f25814d, dVar.f25814d) && AbstractC3255y.d(this.f25815e, dVar.f25815e);
        }

        public int hashCode() {
            int hashCode = this.f25811a.hashCode() * 31;
            String str = this.f25812b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25813c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25814d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25815e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f25811a + ", carrier=" + this.f25812b + ", name=" + this.f25813c + ", phone=" + this.f25814d + ", trackingNumber=" + this.f25815e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f25811a.writeToParcel(out, i8);
            out.writeString(this.f25812b);
            out.writeString(this.f25813c);
            out.writeString(this.f25814d);
            out.writeString(this.f25815e);
        }
    }

    public v(List list, d dVar) {
        this.f25795a = list;
        this.f25796b = dVar;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        Map h8 = Q.h();
        List list = this.f25795a;
        Map map2 = null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1378t.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((c) it.next()).B());
            }
            map = Q.e(O5.x.a("items", arrayList));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(h8, map);
        d dVar = this.f25796b;
        if (dVar != null) {
            map2 = Q.e(O5.x.a("shipping", dVar.B()));
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        return Q.q(q8, map2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return AbstractC3255y.d(this.f25795a, vVar.f25795a) && AbstractC3255y.d(this.f25796b, vVar.f25796b);
    }

    public int hashCode() {
        List list = this.f25795a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        d dVar = this.f25796b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "SourceOrderParams(items=" + this.f25795a + ", shipping=" + this.f25796b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        List list = this.f25795a;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).writeToParcel(out, i8);
            }
        }
        d dVar = this.f25796b;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
    }
}
