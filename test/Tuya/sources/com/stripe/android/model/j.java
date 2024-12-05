package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class j implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final d f24272a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24273b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24274c;

    /* renamed from: d, reason: collision with root package name */
    private final StripeIntent f24275d;

    /* renamed from: e, reason: collision with root package name */
    private final c f24276e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24277f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24278g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24279h;

    /* renamed from: i, reason: collision with root package name */
    private final Throwable f24280i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f24270j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f24271k = 8;
    public static final Parcelable.Creator<j> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final j a(StripeIntent stripeIntent, Throwable th) {
            AbstractC3159y.i(stripeIntent, "stripeIntent");
            return new j(null, null, null, stripeIntent, null, null, false, true, th);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new j(parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (StripeIntent) parcel.readParcelable(j.class.getClassLoader()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i8) {
            return new j[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: d, reason: collision with root package name */
        public static final int f24281d = 8;

        /* renamed from: a, reason: collision with root package name */
        private final List f24282a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24283b;

        /* renamed from: c, reason: collision with root package name */
        private final C0512c f24284c;

        /* loaded from: classes4.dex */
        public static final class a implements v2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0503a();

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC0508c f24285a;

            /* renamed from: b, reason: collision with root package name */
            private final b f24286b;

            /* renamed from: com.stripe.android.model.j$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0503a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a((InterfaceC0508c) parcel.readParcelable(a.class.getClassLoader()), (b) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            /* loaded from: classes4.dex */
            public interface b extends v2.f {

                /* renamed from: com.stripe.android.model.j$c$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0504a implements b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0504a f24287a = new C0504a();
                    public static final Parcelable.Creator<C0504a> CREATOR = new C0505a();

                    /* renamed from: com.stripe.android.model.j$c$a$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0505a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0504a createFromParcel(Parcel parcel) {
                            AbstractC3159y.i(parcel, "parcel");
                            parcel.readInt();
                            return C0504a.f24287a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0504a[] newArray(int i8) {
                            return new C0504a[i8];
                        }
                    }

                    private C0504a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0504a);
                    }

                    public int hashCode() {
                        return -269074152;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3159y.i(out, "out");
                        out.writeInt(1);
                    }
                }

                /* renamed from: com.stripe.android.model.j$c$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0506b implements b {
                    public static final Parcelable.Creator<C0506b> CREATOR = new C0507a();

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f24288a;

                    /* renamed from: com.stripe.android.model.j$c$a$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0507a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0506b createFromParcel(Parcel parcel) {
                            AbstractC3159y.i(parcel, "parcel");
                            return new C0506b(parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0506b[] newArray(int i8) {
                            return new C0506b[i8];
                        }
                    }

                    public C0506b(boolean z8) {
                        this.f24288a = z8;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0506b) && this.f24288a == ((C0506b) obj).f24288a;
                    }

                    public int hashCode() {
                        return androidx.compose.foundation.a.a(this.f24288a);
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodRemoveEnabled=" + this.f24288a + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3159y.i(out, "out");
                        out.writeInt(this.f24288a ? 1 : 0);
                    }
                }
            }

            /* renamed from: com.stripe.android.model.j$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public interface InterfaceC0508c extends v2.f {

                /* renamed from: com.stripe.android.model.j$c$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0509a implements InterfaceC0508c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0509a f24289a = new C0509a();
                    public static final Parcelable.Creator<C0509a> CREATOR = new C0510a();

                    /* renamed from: com.stripe.android.model.j$c$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0510a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0509a createFromParcel(Parcel parcel) {
                            AbstractC3159y.i(parcel, "parcel");
                            parcel.readInt();
                            return C0509a.f24289a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0509a[] newArray(int i8) {
                            return new C0509a[i8];
                        }
                    }

                    private C0509a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0509a);
                    }

                    public int hashCode() {
                        return -1145758141;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3159y.i(out, "out");
                        out.writeInt(1);
                    }
                }

                /* renamed from: com.stripe.android.model.j$c$a$c$b */
                /* loaded from: classes4.dex */
                public static final class b implements InterfaceC0508c {
                    public static final Parcelable.Creator<b> CREATOR = new C0511a();

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f24290a;

                    /* renamed from: b, reason: collision with root package name */
                    private final boolean f24291b;

                    /* renamed from: c, reason: collision with root package name */
                    private final o.b f24292c;

                    /* renamed from: com.stripe.android.model.j$c$a$c$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0511a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b createFromParcel(Parcel parcel) {
                            AbstractC3159y.i(parcel, "parcel");
                            return new b(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.b.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final b[] newArray(int i8) {
                            return new b[i8];
                        }
                    }

                    public b(boolean z8, boolean z9, o.b bVar) {
                        this.f24290a = z8;
                        this.f24291b = z9;
                        this.f24292c = bVar;
                    }

                    public final o.b b() {
                        return this.f24292c;
                    }

                    public final boolean c() {
                        return this.f24291b;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public final boolean e() {
                        return this.f24290a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f24290a == bVar.f24290a && this.f24291b == bVar.f24291b && this.f24292c == bVar.f24292c;
                    }

                    public int hashCode() {
                        int a8 = ((androidx.compose.foundation.a.a(this.f24290a) * 31) + androidx.compose.foundation.a.a(this.f24291b)) * 31;
                        o.b bVar = this.f24292c;
                        return a8 + (bVar == null ? 0 : bVar.hashCode());
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodSaveEnabled=" + this.f24290a + ", isPaymentMethodRemoveEnabled=" + this.f24291b + ", allowRedisplayOverride=" + this.f24292c + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3159y.i(out, "out");
                        out.writeInt(this.f24290a ? 1 : 0);
                        out.writeInt(this.f24291b ? 1 : 0);
                        o.b bVar = this.f24292c;
                        if (bVar == null) {
                            out.writeInt(0);
                        } else {
                            out.writeInt(1);
                            bVar.writeToParcel(out, i8);
                        }
                    }
                }
            }

            public a(InterfaceC0508c mobilePaymentElement, b customerSheet) {
                AbstractC3159y.i(mobilePaymentElement, "mobilePaymentElement");
                AbstractC3159y.i(customerSheet, "customerSheet");
                this.f24285a = mobilePaymentElement;
                this.f24286b = customerSheet;
            }

            public final InterfaceC0508c b() {
                return this.f24285a;
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
                return AbstractC3159y.d(this.f24285a, aVar.f24285a) && AbstractC3159y.d(this.f24286b, aVar.f24286b);
            }

            public int hashCode() {
                return (this.f24285a.hashCode() * 31) + this.f24286b.hashCode();
            }

            public String toString() {
                return "Components(mobilePaymentElement=" + this.f24285a + ", customerSheet=" + this.f24286b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f24285a, i8);
                out.writeParcelable(this.f24286b, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(o.CREATOR.createFromParcel(parcel));
                }
                return new c(arrayList, parcel.readString(), C0512c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* renamed from: com.stripe.android.model.j$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0512c implements v2.f {
            public static final Parcelable.Creator<C0512c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24293a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24294b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24295c;

            /* renamed from: d, reason: collision with root package name */
            private final int f24296d;

            /* renamed from: e, reason: collision with root package name */
            private final String f24297e;

            /* renamed from: f, reason: collision with root package name */
            private final a f24298f;

            /* renamed from: com.stripe.android.model.j$c$c$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0512c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0512c(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), a.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0512c[] newArray(int i8) {
                    return new C0512c[i8];
                }
            }

            public C0512c(String id, boolean z8, String apiKey, int i8, String customerId, a components) {
                AbstractC3159y.i(id, "id");
                AbstractC3159y.i(apiKey, "apiKey");
                AbstractC3159y.i(customerId, "customerId");
                AbstractC3159y.i(components, "components");
                this.f24293a = id;
                this.f24294b = z8;
                this.f24295c = apiKey;
                this.f24296d = i8;
                this.f24297e = customerId;
                this.f24298f = components;
            }

            public final String b() {
                return this.f24295c;
            }

            public final a c() {
                return this.f24298f;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f24297e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0512c)) {
                    return false;
                }
                C0512c c0512c = (C0512c) obj;
                return AbstractC3159y.d(this.f24293a, c0512c.f24293a) && this.f24294b == c0512c.f24294b && AbstractC3159y.d(this.f24295c, c0512c.f24295c) && this.f24296d == c0512c.f24296d && AbstractC3159y.d(this.f24297e, c0512c.f24297e) && AbstractC3159y.d(this.f24298f, c0512c.f24298f);
            }

            public int hashCode() {
                return (((((((((this.f24293a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24294b)) * 31) + this.f24295c.hashCode()) * 31) + this.f24296d) * 31) + this.f24297e.hashCode()) * 31) + this.f24298f.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.f24293a + ", liveMode=" + this.f24294b + ", apiKey=" + this.f24295c + ", apiKeyExpiry=" + this.f24296d + ", customerId=" + this.f24297e + ", components=" + this.f24298f + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24293a);
                out.writeInt(this.f24294b ? 1 : 0);
                out.writeString(this.f24295c);
                out.writeInt(this.f24296d);
                out.writeString(this.f24297e);
                this.f24298f.writeToParcel(out, i8);
            }
        }

        public c(List paymentMethods, String str, C0512c session) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            AbstractC3159y.i(session, "session");
            this.f24282a = paymentMethods;
            this.f24283b = str;
            this.f24284c = session;
        }

        public final List b() {
            return this.f24282a;
        }

        public final C0512c c() {
            return this.f24284c;
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
            return AbstractC3159y.d(this.f24282a, cVar.f24282a) && AbstractC3159y.d(this.f24283b, cVar.f24283b) && AbstractC3159y.d(this.f24284c, cVar.f24284c);
        }

        public int hashCode() {
            int hashCode = this.f24282a.hashCode() * 31;
            String str = this.f24283b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f24284c.hashCode();
        }

        public String toString() {
            return "Customer(paymentMethods=" + this.f24282a + ", defaultPaymentMethod=" + this.f24283b + ", session=" + this.f24284c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            List list = this.f24282a;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((o) it.next()).writeToParcel(out, i8);
            }
            out.writeString(this.f24283b);
            this.f24284c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements v2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final List f24299a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24300b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f24301c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f24302d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                boolean z8 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new d(createStringArrayList, z8, linkedHashMap, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(List linkFundingSources, boolean z8, Map linkFlags, boolean z9) {
            AbstractC3159y.i(linkFundingSources, "linkFundingSources");
            AbstractC3159y.i(linkFlags, "linkFlags");
            this.f24299a = linkFundingSources;
            this.f24300b = z8;
            this.f24301c = linkFlags;
            this.f24302d = z9;
        }

        public final boolean b() {
            return this.f24302d;
        }

        public final Map c() {
            return this.f24301c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f24300b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f24299a, dVar.f24299a) && this.f24300b == dVar.f24300b && AbstractC3159y.d(this.f24301c, dVar.f24301c) && this.f24302d == dVar.f24302d;
        }

        public int hashCode() {
            return (((((this.f24299a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24300b)) * 31) + this.f24301c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f24302d);
        }

        public String toString() {
            return "LinkSettings(linkFundingSources=" + this.f24299a + ", linkPassthroughModeEnabled=" + this.f24300b + ", linkFlags=" + this.f24301c + ", disableLinkSignup=" + this.f24302d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeStringList(this.f24299a);
            out.writeInt(this.f24300b ? 1 : 0);
            Map map = this.f24301c;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
            out.writeInt(this.f24302d ? 1 : 0);
        }
    }

    public j(d dVar, String str, String str2, StripeIntent stripeIntent, c cVar, String str3, boolean z8, boolean z9, Throwable th) {
        AbstractC3159y.i(stripeIntent, "stripeIntent");
        this.f24272a = dVar;
        this.f24273b = str;
        this.f24274c = str2;
        this.f24275d = stripeIntent;
        this.f24276e = cVar;
        this.f24277f = str3;
        this.f24278g = z8;
        this.f24279h = z9;
        this.f24280i = th;
    }

    public final boolean G() {
        Set set;
        boolean z8;
        boolean contains = this.f24275d.g().contains(o.p.f24531h.f24550a);
        List<String> H8 = this.f24275d.H();
        if (!(H8 instanceof Collection) || !H8.isEmpty()) {
            for (String str : H8) {
                set = b3.u.f14569a;
                if (set.contains(str)) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        if ((contains && z8) || j()) {
            return true;
        }
        return false;
    }

    public final c b() {
        return this.f24276e;
    }

    public final boolean c() {
        d dVar = this.f24272a;
        if (dVar != null) {
            return dVar.b();
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f24274c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC3159y.d(this.f24272a, jVar.f24272a) && AbstractC3159y.d(this.f24273b, jVar.f24273b) && AbstractC3159y.d(this.f24274c, jVar.f24274c) && AbstractC3159y.d(this.f24275d, jVar.f24275d) && AbstractC3159y.d(this.f24276e, jVar.f24276e) && AbstractC3159y.d(this.f24277f, jVar.f24277f) && this.f24278g == jVar.f24278g && this.f24279h == jVar.f24279h && AbstractC3159y.d(this.f24280i, jVar.f24280i);
    }

    public final Map f() {
        Map c8;
        d dVar = this.f24272a;
        if (dVar == null || (c8 = dVar.c()) == null) {
            return Q.h();
        }
        return c8;
    }

    public int hashCode() {
        d dVar = this.f24272a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        String str = this.f24273b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24274c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24275d.hashCode()) * 31;
        c cVar = this.f24276e;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.f24277f;
        int hashCode5 = (((((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24278g)) * 31) + androidx.compose.foundation.a.a(this.f24279h)) * 31;
        Throwable th = this.f24280i;
        return hashCode5 + (th != null ? th.hashCode() : 0);
    }

    public final b3.y i() {
        if (G()) {
            if (j()) {
                return b3.y.f14596b;
            }
            return b3.y.f14597c;
        }
        return null;
    }

    public final boolean j() {
        d dVar = this.f24272a;
        if (dVar != null) {
            return dVar.e();
        }
        return false;
    }

    public final String k() {
        return this.f24277f;
    }

    public final String n() {
        return this.f24273b;
    }

    public final Throwable o() {
        return this.f24280i;
    }

    public final StripeIntent s() {
        return this.f24275d;
    }

    public String toString() {
        return "ElementsSession(linkSettings=" + this.f24272a + ", paymentMethodSpecs=" + this.f24273b + ", externalPaymentMethodData=" + this.f24274c + ", stripeIntent=" + this.f24275d + ", customer=" + this.f24276e + ", merchantCountry=" + this.f24277f + ", isEligibleForCardBrandChoice=" + this.f24278g + ", isGooglePayEnabled=" + this.f24279h + ", sessionsError=" + this.f24280i + ")";
    }

    public final boolean u() {
        return this.f24278g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        d dVar = this.f24272a;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24273b);
        out.writeString(this.f24274c);
        out.writeParcelable(this.f24275d, i8);
        c cVar = this.f24276e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24277f);
        out.writeInt(this.f24278g ? 1 : 0);
        out.writeInt(this.f24279h ? 1 : 0);
        out.writeSerializable(this.f24280i);
    }

    public final boolean z() {
        return this.f24279h;
    }

    public /* synthetic */ j(d dVar, String str, String str2, StripeIntent stripeIntent, c cVar, String str3, boolean z8, boolean z9, Throwable th, int i8, AbstractC3151p abstractC3151p) {
        this(dVar, str, str2, stripeIntent, cVar, str3, z8, z9, (i8 & 256) != 0 ? null : th);
    }
}
