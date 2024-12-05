package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2440d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2472u f27657a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27658b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27659c;

    /* renamed from: d, reason: collision with root package name */
    private final o.p f27660d;

    /* renamed from: e, reason: collision with root package name */
    private final j2.r f27661e;

    /* renamed from: f, reason: collision with root package name */
    private final int f27662f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f27663g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f27656h = new b(null);
    public static final Parcelable.Creator<C2440d> CREATOR = new c();

    /* renamed from: com.stripe.android.view.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f27665b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27666c;

        /* renamed from: e, reason: collision with root package name */
        private j2.r f27668e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f27669f;

        /* renamed from: g, reason: collision with root package name */
        private int f27670g;

        /* renamed from: a, reason: collision with root package name */
        private EnumC2472u f27664a = EnumC2472u.f27969b;

        /* renamed from: d, reason: collision with root package name */
        private o.p f27667d = o.p.f24532i;

        public final C2440d a() {
            EnumC2472u enumC2472u = this.f27664a;
            boolean z8 = this.f27665b;
            boolean z9 = this.f27666c;
            o.p pVar = this.f27667d;
            if (pVar == null) {
                pVar = o.p.f24532i;
            }
            return new C2440d(enumC2472u, z8, z9, pVar, this.f27668e, this.f27670g, this.f27669f);
        }

        public final a b(int i8) {
            this.f27670g = i8;
            return this;
        }

        public final a c(EnumC2472u billingAddressFields) {
            AbstractC3159y.i(billingAddressFields, "billingAddressFields");
            this.f27664a = billingAddressFields;
            return this;
        }

        public final /* synthetic */ a d(boolean z8) {
            this.f27666c = z8;
            return this;
        }

        public final /* synthetic */ a e(j2.r rVar) {
            this.f27668e = rVar;
            return this;
        }

        public final a f(o.p paymentMethodType) {
            AbstractC3159y.i(paymentMethodType, "paymentMethodType");
            this.f27667d = paymentMethodType;
            return this;
        }

        public final a g(boolean z8) {
            this.f27665b = z8;
            return this;
        }

        public final a h(Integer num) {
            this.f27669f = num;
            return this;
        }
    }

    /* renamed from: com.stripe.android.view.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2440d a(Intent intent) {
            AbstractC3159y.i(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (C2440d) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.d$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2440d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2440d(EnumC2472u.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, o.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : j2.r.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2440d[] newArray(int i8) {
            return new C2440d[i8];
        }
    }

    public C2440d(EnumC2472u billingAddressFields, boolean z8, boolean z9, o.p paymentMethodType, j2.r rVar, int i8, Integer num) {
        AbstractC3159y.i(billingAddressFields, "billingAddressFields");
        AbstractC3159y.i(paymentMethodType, "paymentMethodType");
        this.f27657a = billingAddressFields;
        this.f27658b = z8;
        this.f27659c = z9;
        this.f27660d = paymentMethodType;
        this.f27661e = rVar;
        this.f27662f = i8;
        this.f27663g = num;
    }

    public final int b() {
        return this.f27662f;
    }

    public final EnumC2472u c() {
        return this.f27657a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final j2.r e() {
        return this.f27661e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2440d)) {
            return false;
        }
        C2440d c2440d = (C2440d) obj;
        return this.f27657a == c2440d.f27657a && this.f27658b == c2440d.f27658b && this.f27659c == c2440d.f27659c && this.f27660d == c2440d.f27660d && AbstractC3159y.d(this.f27661e, c2440d.f27661e) && this.f27662f == c2440d.f27662f && AbstractC3159y.d(this.f27663g, c2440d.f27663g);
    }

    public final o.p f() {
        return this.f27660d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f27657a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f27658b)) * 31) + androidx.compose.foundation.a.a(this.f27659c)) * 31) + this.f27660d.hashCode()) * 31;
        j2.r rVar = this.f27661e;
        int hashCode2 = (((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31) + this.f27662f) * 31;
        Integer num = this.f27663g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f27658b;
    }

    public final Integer j() {
        return this.f27663g;
    }

    public final boolean k() {
        return this.f27659c;
    }

    public String toString() {
        return "Args(billingAddressFields=" + this.f27657a + ", shouldAttachToCustomer=" + this.f27658b + ", isPaymentSessionActive=" + this.f27659c + ", paymentMethodType=" + this.f27660d + ", paymentConfiguration=" + this.f27661e + ", addPaymentMethodFooterLayoutId=" + this.f27662f + ", windowFlags=" + this.f27663g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f27657a.name());
        out.writeInt(this.f27658b ? 1 : 0);
        out.writeInt(this.f27659c ? 1 : 0);
        this.f27660d.writeToParcel(out, i8);
        j2.r rVar = this.f27661e;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        out.writeInt(this.f27662f);
        Integer num = this.f27663g;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
