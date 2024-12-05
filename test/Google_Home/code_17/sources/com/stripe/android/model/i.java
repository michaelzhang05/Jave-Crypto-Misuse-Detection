package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class i implements y2.f {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f25315a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25316b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25317c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25318d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new i((b) parcel.readParcelable(i.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i[] newArray(int i8) {
            return new i[i8];
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements b {
            public static final Parcelable.Creator<a> CREATOR = new C0497a();

            /* renamed from: a, reason: collision with root package name */
            private final long f25319a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25320b;

            /* renamed from: c, reason: collision with root package name */
            private final StripeIntent.Usage f25321c;

            /* renamed from: d, reason: collision with root package name */
            private final n.b f25322d;

            /* renamed from: com.stripe.android.model.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0497a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), n.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(long j8, String currency, StripeIntent.Usage usage, n.b captureMethod) {
                AbstractC3255y.i(currency, "currency");
                AbstractC3255y.i(captureMethod, "captureMethod");
                this.f25319a = j8;
                this.f25320b = currency;
                this.f25321c = usage;
                this.f25322d = captureMethod;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage G() {
                return this.f25321c;
            }

            @Override // com.stripe.android.model.i.b
            public String M() {
                return this.f25320b;
            }

            public final long a() {
                return this.f25319a;
            }

            public final n.b b() {
                return this.f25322d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f25319a == aVar.f25319a && AbstractC3255y.d(this.f25320b, aVar.f25320b) && this.f25321c == aVar.f25321c && this.f25322d == aVar.f25322d;
            }

            public int hashCode() {
                int a8 = ((androidx.collection.a.a(this.f25319a) * 31) + this.f25320b.hashCode()) * 31;
                StripeIntent.Usage usage = this.f25321c;
                return ((a8 + (usage == null ? 0 : usage.hashCode())) * 31) + this.f25322d.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String o() {
                return "payment";
            }

            public String toString() {
                return "Payment(amount=" + this.f25319a + ", currency=" + this.f25320b + ", setupFutureUsage=" + this.f25321c + ", captureMethod=" + this.f25322d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeLong(this.f25319a);
                out.writeString(this.f25320b);
                StripeIntent.Usage usage = this.f25321c;
                if (usage == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(usage.name());
                }
                out.writeString(this.f25322d.name());
            }
        }

        /* renamed from: com.stripe.android.model.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0498b implements b {
            public static final Parcelable.Creator<C0498b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25323a;

            /* renamed from: b, reason: collision with root package name */
            private final StripeIntent.Usage f25324b;

            /* renamed from: com.stripe.android.model.i$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0498b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new C0498b(parcel.readString(), StripeIntent.Usage.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0498b[] newArray(int i8) {
                    return new C0498b[i8];
                }
            }

            public C0498b(String str, StripeIntent.Usage setupFutureUsage) {
                AbstractC3255y.i(setupFutureUsage, "setupFutureUsage");
                this.f25323a = str;
                this.f25324b = setupFutureUsage;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage G() {
                return this.f25324b;
            }

            @Override // com.stripe.android.model.i.b
            public String M() {
                return this.f25323a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0498b)) {
                    return false;
                }
                C0498b c0498b = (C0498b) obj;
                return AbstractC3255y.d(this.f25323a, c0498b.f25323a) && this.f25324b == c0498b.f25324b;
            }

            public int hashCode() {
                String str = this.f25323a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f25324b.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String o() {
                return "setup";
            }

            public String toString() {
                return "Setup(currency=" + this.f25323a + ", setupFutureUsage=" + this.f25324b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25323a);
                out.writeString(this.f25324b.name());
            }
        }

        StripeIntent.Usage G();

        String M();

        String o();
    }

    public i(b mode, List paymentMethodTypes, String str, String str2) {
        AbstractC3255y.i(mode, "mode");
        AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        this.f25315a = mode;
        this.f25316b = paymentMethodTypes;
        this.f25317c = str;
        this.f25318d = str2;
    }

    public final b a() {
        return this.f25315a;
    }

    public final Map b() {
        b.a aVar;
        Long l8;
        String str;
        b.a aVar2;
        n.b b8;
        int i8 = 0;
        O5.r a8 = O5.x.a("deferred_intent[mode]", this.f25315a.o());
        b bVar = this.f25315a;
        String str2 = null;
        if (bVar instanceof b.a) {
            aVar = (b.a) bVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            l8 = Long.valueOf(aVar.a());
        } else {
            l8 = null;
        }
        O5.r a9 = O5.x.a("deferred_intent[amount]", l8);
        O5.r a10 = O5.x.a("deferred_intent[currency]", this.f25315a.M());
        StripeIntent.Usage G8 = this.f25315a.G();
        if (G8 != null) {
            str = G8.b();
        } else {
            str = null;
        }
        O5.r a11 = O5.x.a("deferred_intent[setup_future_usage]", str);
        b bVar2 = this.f25315a;
        if (bVar2 instanceof b.a) {
            aVar2 = (b.a) bVar2;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null && (b8 = aVar2.b()) != null) {
            str2 = b8.b();
        }
        Map k8 = Q.k(a8, a9, a10, a11, O5.x.a("deferred_intent[capture_method]", str2), O5.x.a("deferred_intent[payment_method_configuration][id]", this.f25317c), O5.x.a("deferred_intent[on_behalf_of]", this.f25318d));
        List list = this.f25316b;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            arrayList.add(O5.x.a("deferred_intent[payment_method_types][" + i8 + "]", (String) obj));
            i8 = i9;
        }
        return Q.p(k8, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC3255y.d(this.f25315a, iVar.f25315a) && AbstractC3255y.d(this.f25316b, iVar.f25316b) && AbstractC3255y.d(this.f25317c, iVar.f25317c) && AbstractC3255y.d(this.f25318d, iVar.f25318d);
    }

    public int hashCode() {
        int hashCode = ((this.f25315a.hashCode() * 31) + this.f25316b.hashCode()) * 31;
        String str = this.f25317c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25318d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeferredIntentParams(mode=" + this.f25315a + ", paymentMethodTypes=" + this.f25316b + ", paymentMethodConfigurationId=" + this.f25317c + ", onBehalfOf=" + this.f25318d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f25315a, i8);
        out.writeStringList(this.f25316b);
        out.writeString(this.f25317c);
        out.writeString(this.f25318d);
    }
}
