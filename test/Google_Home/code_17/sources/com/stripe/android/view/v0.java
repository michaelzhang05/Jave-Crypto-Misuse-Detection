package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class v0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f29034a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29035b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29036c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29037d;

    /* renamed from: e, reason: collision with root package name */
    private final List f29038e;

    /* renamed from: f, reason: collision with root package name */
    private final m2.r f29039f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f29040g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC2666u f29041h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f29042i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f29043j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f29044k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f29032l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f29033m = 8;
    public static final Parcelable.Creator<v0> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ v0 a(Intent intent) {
            AbstractC3255y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (v0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z8 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i8 = 0; i8 != readInt3; i8++) {
                arrayList.add(o.p.CREATOR.createFromParcel(parcel));
            }
            return new v0(readString, readInt, readInt2, z8, arrayList, parcel.readInt() == 0 ? null : m2.r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, EnumC2666u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0[] newArray(int i8) {
            return new v0[i8];
        }
    }

    public v0(String str, int i8, int i9, boolean z8, List paymentMethodTypes, m2.r rVar, Integer num, EnumC2666u billingAddressFields, boolean z9, boolean z10, boolean z11) {
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3255y.i(billingAddressFields, "billingAddressFields");
        this.f29034a = str;
        this.f29035b = i8;
        this.f29036c = i9;
        this.f29037d = z8;
        this.f29038e = paymentMethodTypes;
        this.f29039f = rVar;
        this.f29040g = num;
        this.f29041h = billingAddressFields;
        this.f29042i = z9;
        this.f29043j = z10;
        this.f29044k = z11;
    }

    public final int a() {
        return this.f29036c;
    }

    public final EnumC2666u b() {
        return this.f29041h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC3255y.d(this.f29034a, v0Var.f29034a) && this.f29035b == v0Var.f29035b && this.f29036c == v0Var.f29036c && this.f29037d == v0Var.f29037d && AbstractC3255y.d(this.f29038e, v0Var.f29038e) && AbstractC3255y.d(this.f29039f, v0Var.f29039f) && AbstractC3255y.d(this.f29040g, v0Var.f29040g) && this.f29041h == v0Var.f29041h && this.f29042i == v0Var.f29042i && this.f29043j == v0Var.f29043j && this.f29044k == v0Var.f29044k;
    }

    public final boolean g() {
        return this.f29044k;
    }

    public final String h() {
        return this.f29034a;
    }

    public int hashCode() {
        String str = this.f29034a;
        int hashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.f29035b) * 31) + this.f29036c) * 31) + androidx.compose.foundation.a.a(this.f29037d)) * 31) + this.f29038e.hashCode()) * 31;
        m2.r rVar = this.f29039f;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Integer num = this.f29040g;
        return ((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f29041h.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f29042i)) * 31) + androidx.compose.foundation.a.a(this.f29043j)) * 31) + androidx.compose.foundation.a.a(this.f29044k);
    }

    public final m2.r i() {
        return this.f29039f;
    }

    public final List l() {
        return this.f29038e;
    }

    public final int p() {
        return this.f29035b;
    }

    public final boolean s() {
        return this.f29042i;
    }

    public String toString() {
        return "Args(initialPaymentMethodId=" + this.f29034a + ", paymentMethodsFooterLayoutId=" + this.f29035b + ", addPaymentMethodFooterLayoutId=" + this.f29036c + ", isPaymentSessionActive=" + this.f29037d + ", paymentMethodTypes=" + this.f29038e + ", paymentConfiguration=" + this.f29039f + ", windowFlags=" + this.f29040g + ", billingAddressFields=" + this.f29041h + ", shouldShowGooglePay=" + this.f29042i + ", useGooglePay=" + this.f29043j + ", canDeletePaymentMethods=" + this.f29044k + ")";
    }

    public final boolean u() {
        return this.f29043j;
    }

    public final Integer v() {
        return this.f29040g;
    }

    public final boolean w() {
        return this.f29037d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f29034a);
        out.writeInt(this.f29035b);
        out.writeInt(this.f29036c);
        out.writeInt(this.f29037d ? 1 : 0);
        List list = this.f29038e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o.p) it.next()).writeToParcel(out, i8);
        }
        m2.r rVar = this.f29039f;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        Integer num = this.f29040g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f29041h.name());
        out.writeInt(this.f29042i ? 1 : 0);
        out.writeInt(this.f29043j ? 1 : 0);
        out.writeInt(this.f29044k ? 1 : 0);
    }
}
