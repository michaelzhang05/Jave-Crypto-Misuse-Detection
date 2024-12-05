package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import com.stripe.android.model.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class l implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24312a;

    /* renamed from: b, reason: collision with root package name */
    private final o.p f24313b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f24314c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24315d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24316e;

    /* renamed from: f, reason: collision with root package name */
    private static final a f24311f = new a(null);
    public static final Parcelable.Creator<l> CREATOR = new b();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new l(parcel.readString(), o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i8) {
            return new l[i8];
        }
    }

    public l(String customerId, o.p paymentMethodType, Integer num, String str, String str2) {
        AbstractC3159y.i(customerId, "customerId");
        AbstractC3159y.i(paymentMethodType, "paymentMethodType");
        this.f24312a = customerId;
        this.f24313b = paymentMethodType;
        this.f24314c = num;
        this.f24315d = str;
        this.f24316e = str2;
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
        return AbstractC3159y.d(this.f24312a, lVar.f24312a) && this.f24313b == lVar.f24313b && AbstractC3159y.d(this.f24314c, lVar.f24314c) && AbstractC3159y.d(this.f24315d, lVar.f24315d) && AbstractC3159y.d(this.f24316e, lVar.f24316e);
    }

    public int hashCode() {
        int hashCode = ((this.f24312a.hashCode() * 31) + this.f24313b.hashCode()) * 31;
        Integer num = this.f24314c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f24315d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24316e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.f24312a + ", paymentMethodType=" + this.f24313b + ", limit=" + this.f24314c + ", endingBefore=" + this.f24315d + ", startingAfter=" + this.f24316e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int intValue;
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24312a);
        this.f24313b.writeToParcel(out, i8);
        Integer num = this.f24314c;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.f24315d);
        out.writeString(this.f24316e);
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        List<L5.r> p8 = AbstractC1246t.p(L5.x.a("customer", this.f24312a), L5.x.a("type", this.f24313b.f24550a), L5.x.a("limit", this.f24314c), L5.x.a("ending_before", this.f24315d), L5.x.a("starting_after", this.f24316e));
        Map h8 = Q.h();
        for (L5.r rVar : p8) {
            String str = (String) rVar.a();
            Object b8 = rVar.b();
            if (b8 != null) {
                map = Q.e(L5.x.a(str, b8));
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

    public /* synthetic */ l(String str, o.p pVar, Integer num, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
        this(str, pVar, (i8 & 4) != 0 ? null : num, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3);
    }
}
