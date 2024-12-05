package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class v0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f27979a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27980b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27981c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27982d;

    /* renamed from: e, reason: collision with root package name */
    private final List f27983e;

    /* renamed from: f, reason: collision with root package name */
    private final j2.r f27984f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f27985g;

    /* renamed from: h, reason: collision with root package name */
    private final EnumC2472u f27986h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f27987i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f27988j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f27989k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f27977l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final int f27978m = 8;
    public static final Parcelable.Creator<v0> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ v0 a(Intent intent) {
            AbstractC3159y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (v0) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z8 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i8 = 0; i8 != readInt3; i8++) {
                arrayList.add(o.p.CREATOR.createFromParcel(parcel));
            }
            return new v0(readString, readInt, readInt2, z8, arrayList, parcel.readInt() == 0 ? null : j2.r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, EnumC2472u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0[] newArray(int i8) {
            return new v0[i8];
        }
    }

    public v0(String str, int i8, int i9, boolean z8, List paymentMethodTypes, j2.r rVar, Integer num, EnumC2472u billingAddressFields, boolean z9, boolean z10, boolean z11) {
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3159y.i(billingAddressFields, "billingAddressFields");
        this.f27979a = str;
        this.f27980b = i8;
        this.f27981c = i9;
        this.f27982d = z8;
        this.f27983e = paymentMethodTypes;
        this.f27984f = rVar;
        this.f27985g = num;
        this.f27986h = billingAddressFields;
        this.f27987i = z9;
        this.f27988j = z10;
        this.f27989k = z11;
    }

    public final int b() {
        return this.f27981c;
    }

    public final EnumC2472u c() {
        return this.f27986h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f27989k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC3159y.d(this.f27979a, v0Var.f27979a) && this.f27980b == v0Var.f27980b && this.f27981c == v0Var.f27981c && this.f27982d == v0Var.f27982d && AbstractC3159y.d(this.f27983e, v0Var.f27983e) && AbstractC3159y.d(this.f27984f, v0Var.f27984f) && AbstractC3159y.d(this.f27985g, v0Var.f27985g) && this.f27986h == v0Var.f27986h && this.f27987i == v0Var.f27987i && this.f27988j == v0Var.f27988j && this.f27989k == v0Var.f27989k;
    }

    public final String f() {
        return this.f27979a;
    }

    public int hashCode() {
        String str = this.f27979a;
        int hashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.f27980b) * 31) + this.f27981c) * 31) + androidx.compose.foundation.a.a(this.f27982d)) * 31) + this.f27983e.hashCode()) * 31;
        j2.r rVar = this.f27984f;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Integer num = this.f27985g;
        return ((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f27986h.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27987i)) * 31) + androidx.compose.foundation.a.a(this.f27988j)) * 31) + androidx.compose.foundation.a.a(this.f27989k);
    }

    public final j2.r i() {
        return this.f27984f;
    }

    public final List j() {
        return this.f27983e;
    }

    public final int k() {
        return this.f27980b;
    }

    public final boolean n() {
        return this.f27987i;
    }

    public final boolean o() {
        return this.f27988j;
    }

    public final Integer s() {
        return this.f27985g;
    }

    public String toString() {
        return "Args(initialPaymentMethodId=" + this.f27979a + ", paymentMethodsFooterLayoutId=" + this.f27980b + ", addPaymentMethodFooterLayoutId=" + this.f27981c + ", isPaymentSessionActive=" + this.f27982d + ", paymentMethodTypes=" + this.f27983e + ", paymentConfiguration=" + this.f27984f + ", windowFlags=" + this.f27985g + ", billingAddressFields=" + this.f27986h + ", shouldShowGooglePay=" + this.f27987i + ", useGooglePay=" + this.f27988j + ", canDeletePaymentMethods=" + this.f27989k + ")";
    }

    public final boolean u() {
        return this.f27982d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f27979a);
        out.writeInt(this.f27980b);
        out.writeInt(this.f27981c);
        out.writeInt(this.f27982d ? 1 : 0);
        List list = this.f27983e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o.p) it.next()).writeToParcel(out, i8);
        }
        j2.r rVar = this.f27984f;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        Integer num = this.f27985g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f27986h.name());
        out.writeInt(this.f27987i ? 1 : 0);
        out.writeInt(this.f27988j ? 1 : 0);
        out.writeInt(this.f27989k ? 1 : 0);
    }
}
