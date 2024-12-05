package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class i implements v2.f {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f24260a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24261b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24262c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24263d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
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
            public static final Parcelable.Creator<a> CREATOR = new C0501a();

            /* renamed from: a, reason: collision with root package name */
            private final long f24264a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24265b;

            /* renamed from: c, reason: collision with root package name */
            private final StripeIntent.Usage f24266c;

            /* renamed from: d, reason: collision with root package name */
            private final n.b f24267d;

            /* renamed from: com.stripe.android.model.i$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0501a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), n.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(long j8, String currency, StripeIntent.Usage usage, n.b captureMethod) {
                AbstractC3159y.i(currency, "currency");
                AbstractC3159y.i(captureMethod, "captureMethod");
                this.f24264a = j8;
                this.f24265b = currency;
                this.f24266c = usage;
                this.f24267d = captureMethod;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage E() {
                return this.f24266c;
            }

            @Override // com.stripe.android.model.i.b
            public String K() {
                return this.f24265b;
            }

            public final long b() {
                return this.f24264a;
            }

            public final n.b c() {
                return this.f24267d;
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
                return this.f24264a == aVar.f24264a && AbstractC3159y.d(this.f24265b, aVar.f24265b) && this.f24266c == aVar.f24266c && this.f24267d == aVar.f24267d;
            }

            public int hashCode() {
                int a8 = ((androidx.collection.a.a(this.f24264a) * 31) + this.f24265b.hashCode()) * 31;
                StripeIntent.Usage usage = this.f24266c;
                return ((a8 + (usage == null ? 0 : usage.hashCode())) * 31) + this.f24267d.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String r() {
                return "payment";
            }

            public String toString() {
                return "Payment(amount=" + this.f24264a + ", currency=" + this.f24265b + ", setupFutureUsage=" + this.f24266c + ", captureMethod=" + this.f24267d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeLong(this.f24264a);
                out.writeString(this.f24265b);
                StripeIntent.Usage usage = this.f24266c;
                if (usage == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(usage.name());
                }
                out.writeString(this.f24267d.name());
            }
        }

        /* renamed from: com.stripe.android.model.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0502b implements b {
            public static final Parcelable.Creator<C0502b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24268a;

            /* renamed from: b, reason: collision with root package name */
            private final StripeIntent.Usage f24269b;

            /* renamed from: com.stripe.android.model.i$b$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0502b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0502b(parcel.readString(), StripeIntent.Usage.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0502b[] newArray(int i8) {
                    return new C0502b[i8];
                }
            }

            public C0502b(String str, StripeIntent.Usage setupFutureUsage) {
                AbstractC3159y.i(setupFutureUsage, "setupFutureUsage");
                this.f24268a = str;
                this.f24269b = setupFutureUsage;
            }

            @Override // com.stripe.android.model.i.b
            public StripeIntent.Usage E() {
                return this.f24269b;
            }

            @Override // com.stripe.android.model.i.b
            public String K() {
                return this.f24268a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0502b)) {
                    return false;
                }
                C0502b c0502b = (C0502b) obj;
                return AbstractC3159y.d(this.f24268a, c0502b.f24268a) && this.f24269b == c0502b.f24269b;
            }

            public int hashCode() {
                String str = this.f24268a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f24269b.hashCode();
            }

            @Override // com.stripe.android.model.i.b
            public String r() {
                return "setup";
            }

            public String toString() {
                return "Setup(currency=" + this.f24268a + ", setupFutureUsage=" + this.f24269b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24268a);
                out.writeString(this.f24269b.name());
            }
        }

        StripeIntent.Usage E();

        String K();

        String r();
    }

    public i(b mode, List paymentMethodTypes, String str, String str2) {
        AbstractC3159y.i(mode, "mode");
        AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        this.f24260a = mode;
        this.f24261b = paymentMethodTypes;
        this.f24262c = str;
        this.f24263d = str2;
    }

    public final b b() {
        return this.f24260a;
    }

    public final Map c() {
        b.a aVar;
        Long l8;
        String str;
        b.a aVar2;
        n.b c8;
        int i8 = 0;
        L5.r a8 = L5.x.a("deferred_intent[mode]", this.f24260a.r());
        b bVar = this.f24260a;
        String str2 = null;
        if (bVar instanceof b.a) {
            aVar = (b.a) bVar;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            l8 = Long.valueOf(aVar.b());
        } else {
            l8 = null;
        }
        L5.r a9 = L5.x.a("deferred_intent[amount]", l8);
        L5.r a10 = L5.x.a("deferred_intent[currency]", this.f24260a.K());
        StripeIntent.Usage E8 = this.f24260a.E();
        if (E8 != null) {
            str = E8.b();
        } else {
            str = null;
        }
        L5.r a11 = L5.x.a("deferred_intent[setup_future_usage]", str);
        b bVar2 = this.f24260a;
        if (bVar2 instanceof b.a) {
            aVar2 = (b.a) bVar2;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null && (c8 = aVar2.c()) != null) {
            str2 = c8.b();
        }
        Map k8 = Q.k(a8, a9, a10, a11, L5.x.a("deferred_intent[capture_method]", str2), L5.x.a("deferred_intent[payment_method_configuration][id]", this.f24262c), L5.x.a("deferred_intent[on_behalf_of]", this.f24263d));
        List list = this.f24261b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            arrayList.add(L5.x.a("deferred_intent[payment_method_types][" + i8 + "]", (String) obj));
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
        return AbstractC3159y.d(this.f24260a, iVar.f24260a) && AbstractC3159y.d(this.f24261b, iVar.f24261b) && AbstractC3159y.d(this.f24262c, iVar.f24262c) && AbstractC3159y.d(this.f24263d, iVar.f24263d);
    }

    public int hashCode() {
        int hashCode = ((this.f24260a.hashCode() * 31) + this.f24261b.hashCode()) * 31;
        String str = this.f24262c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24263d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DeferredIntentParams(mode=" + this.f24260a + ", paymentMethodTypes=" + this.f24261b + ", paymentMethodConfigurationId=" + this.f24262c + ", onBehalfOf=" + this.f24263d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeParcelable(this.f24260a, i8);
        out.writeStringList(this.f24261b);
        out.writeString(this.f24262c);
        out.writeString(this.f24263d);
    }
}
