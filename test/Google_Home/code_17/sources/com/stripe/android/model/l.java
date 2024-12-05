package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import e3.InterfaceC2784H;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class l implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25367a;

    /* renamed from: b, reason: collision with root package name */
    private final o.p f25368b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f25369c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25370d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25371e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f25366f = new a(null);
    public static final Parcelable.Creator<l> CREATOR = new b();

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
        public final l createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new l(parcel.readString(), o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(String customerId, o.p paymentMethodType, Integer num, String str, String str2) {
        AbstractC3255y.i(customerId, "customerId");
        AbstractC3255y.i(paymentMethodType, "paymentMethodType");
        this.f25367a = customerId;
        this.f25368b = paymentMethodType;
        this.f25369c = num;
        this.f25370d = str;
        this.f25371e = str2;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        List<O5.r> p8 = AbstractC1378t.p(O5.x.a("customer", this.f25367a), O5.x.a("type", this.f25368b.f25605a), O5.x.a("limit", this.f25369c), O5.x.a("ending_before", this.f25370d), O5.x.a("starting_after", this.f25371e));
        Map h8 = Q.h();
        for (O5.r rVar : p8) {
            String str = (String) rVar.a();
            Object b8 = rVar.b();
            if (b8 != null) {
                map = Q.e(O5.x.a(str, b8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        return h8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC3255y.d(this.f25367a, lVar.f25367a) && this.f25368b == lVar.f25368b && AbstractC3255y.d(this.f25369c, lVar.f25369c) && AbstractC3255y.d(this.f25370d, lVar.f25370d) && AbstractC3255y.d(this.f25371e, lVar.f25371e);
    }

    public int hashCode() {
        int hashCode = ((this.f25367a.hashCode() * 31) + this.f25368b.hashCode()) * 31;
        Integer num = this.f25369c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f25370d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25371e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.f25367a + ", paymentMethodType=" + this.f25368b + ", limit=" + this.f25369c + ", endingBefore=" + this.f25370d + ", startingAfter=" + this.f25371e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25367a);
        this.f25368b.writeToParcel(out, i8);
        Integer num = this.f25369c;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.f25370d);
        out.writeString(this.f25371e);
    }

    public /* synthetic */ l(String str, o.p pVar, Integer num, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
        this(str, pVar, (i8 & 4) != 0 ? null : num, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
    }
}
