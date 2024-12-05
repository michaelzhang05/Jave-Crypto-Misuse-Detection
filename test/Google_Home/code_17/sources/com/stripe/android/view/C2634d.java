package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2634d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2666u f28712a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28713b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28714c;

    /* renamed from: d, reason: collision with root package name */
    private final o.p f28715d;

    /* renamed from: e, reason: collision with root package name */
    private final m2.r f28716e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28717f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f28718g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f28711h = new b(null);
    public static final Parcelable.Creator<C2634d> CREATOR = new c();

    /* renamed from: com.stripe.android.view.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f28720b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28721c;

        /* renamed from: e, reason: collision with root package name */
        private m2.r f28723e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f28724f;

        /* renamed from: g, reason: collision with root package name */
        private int f28725g;

        /* renamed from: a, reason: collision with root package name */
        private EnumC2666u f28719a = EnumC2666u.f29024b;

        /* renamed from: d, reason: collision with root package name */
        private o.p f28722d = o.p.f25587i;

        public final C2634d a() {
            EnumC2666u enumC2666u = this.f28719a;
            boolean z8 = this.f28720b;
            boolean z9 = this.f28721c;
            o.p pVar = this.f28722d;
            if (pVar == null) {
                pVar = o.p.f25587i;
            }
            return new C2634d(enumC2666u, z8, z9, pVar, this.f28723e, this.f28725g, this.f28724f);
        }

        public final a b(int i8) {
            this.f28725g = i8;
            return this;
        }

        public final a c(EnumC2666u billingAddressFields) {
            AbstractC3255y.i(billingAddressFields, "billingAddressFields");
            this.f28719a = billingAddressFields;
            return this;
        }

        public final /* synthetic */ a d(boolean z8) {
            this.f28721c = z8;
            return this;
        }

        public final /* synthetic */ a e(m2.r rVar) {
            this.f28723e = rVar;
            return this;
        }

        public final a f(o.p paymentMethodType) {
            AbstractC3255y.i(paymentMethodType, "paymentMethodType");
            this.f28722d = paymentMethodType;
            return this;
        }

        public final a g(boolean z8) {
            this.f28720b = z8;
            return this;
        }

        public final a h(Integer num) {
            this.f28724f = num;
            return this;
        }
    }

    /* renamed from: com.stripe.android.view.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2634d a(Intent intent) {
            AbstractC3255y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2634d) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2634d createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2634d(EnumC2666u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : m2.r.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2634d[] newArray(int i8) {
            return new C2634d[i8];
        }
    }

    public C2634d(EnumC2666u billingAddressFields, boolean z8, boolean z9, o.p paymentMethodType, m2.r rVar, int i8, Integer num) {
        AbstractC3255y.i(billingAddressFields, "billingAddressFields");
        AbstractC3255y.i(paymentMethodType, "paymentMethodType");
        this.f28712a = billingAddressFields;
        this.f28713b = z8;
        this.f28714c = z9;
        this.f28715d = paymentMethodType;
        this.f28716e = rVar;
        this.f28717f = i8;
        this.f28718g = num;
    }

    public final int a() {
        return this.f28717f;
    }

    public final EnumC2666u b() {
        return this.f28712a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2634d)) {
            return false;
        }
        C2634d c2634d = (C2634d) obj;
        return this.f28712a == c2634d.f28712a && this.f28713b == c2634d.f28713b && this.f28714c == c2634d.f28714c && this.f28715d == c2634d.f28715d && AbstractC3255y.d(this.f28716e, c2634d.f28716e) && this.f28717f == c2634d.f28717f && AbstractC3255y.d(this.f28718g, c2634d.f28718g);
    }

    public final m2.r g() {
        return this.f28716e;
    }

    public final o.p h() {
        return this.f28715d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f28712a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f28713b)) * 31) + androidx.compose.foundation.a.a(this.f28714c)) * 31) + this.f28715d.hashCode()) * 31;
        m2.r rVar = this.f28716e;
        int hashCode2 = (((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f28717f) * 31;
        Integer num = this.f28718g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f28713b;
    }

    public final Integer l() {
        return this.f28718g;
    }

    public final boolean p() {
        return this.f28714c;
    }

    public String toString() {
        return "Args(billingAddressFields=" + this.f28712a + ", shouldAttachToCustomer=" + this.f28713b + ", isPaymentSessionActive=" + this.f28714c + ", paymentMethodType=" + this.f28715d + ", paymentConfiguration=" + this.f28716e + ", addPaymentMethodFooterLayoutId=" + this.f28717f + ", windowFlags=" + this.f28718g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f28712a.name());
        out.writeInt(this.f28713b ? 1 : 0);
        out.writeInt(this.f28714c ? 1 : 0);
        this.f28715d.writeToParcel(out, i8);
        m2.r rVar = this.f28716e;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f28717f);
        Integer num = this.f28718g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
