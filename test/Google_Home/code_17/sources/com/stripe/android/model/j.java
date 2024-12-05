package com.stripe.android.model;

import P5.Q;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class j implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final d f25327a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25328b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25329c;

    /* renamed from: d, reason: collision with root package name */
    private final StripeIntent f25330d;

    /* renamed from: e, reason: collision with root package name */
    private final c f25331e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25332f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25333g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25334h;

    /* renamed from: i, reason: collision with root package name */
    private final Throwable f25335i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f25325j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f25326k = 8;
    public static final Parcelable.Creator<j> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final j a(StripeIntent stripeIntent, Throwable th) {
            AbstractC3255y.i(stripeIntent, "stripeIntent");
            return new j(null, null, null, stripeIntent, null, null, false, true, th);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new j(parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (StripeIntent) parcel.readParcelable(j.class.getClassLoader()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i8) {
            return new j[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements y2.f {
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: d, reason: collision with root package name */
        public static final int f25336d = 8;

        /* renamed from: a, reason: collision with root package name */
        private final List f25337a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25338b;

        /* renamed from: c, reason: collision with root package name */
        private final C0508c f25339c;

        /* loaded from: classes4.dex */
        public static final class a implements y2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0499a();

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC0504c f25340a;

            /* renamed from: b, reason: collision with root package name */
            private final b f25341b;

            /* renamed from: com.stripe.android.model.j$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0499a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a((InterfaceC0504c) parcel.readParcelable(a.class.getClassLoader()), (b) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            /* loaded from: classes4.dex */
            public interface b extends y2.f {

                /* renamed from: com.stripe.android.model.j$c$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0500a implements b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0500a f25342a = new C0500a();
                    public static final Parcelable.Creator<C0500a> CREATOR = new C0501a();

                    /* renamed from: com.stripe.android.model.j$c$a$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0501a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0500a createFromParcel(Parcel parcel) {
                            AbstractC3255y.i(parcel, "parcel");
                            parcel.readInt();
                            return C0500a.f25342a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0500a[] newArray(int i8) {
                            return new C0500a[i8];
                        }
                    }

                    private C0500a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0500a);
                    }

                    public int hashCode() {
                        return -269074152;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3255y.i(out, "out");
                        out.writeInt(1);
                    }
                }

                /* renamed from: com.stripe.android.model.j$c$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0502b implements b {
                    public static final Parcelable.Creator<C0502b> CREATOR = new C0503a();

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f25343a;

                    /* renamed from: com.stripe.android.model.j$c$a$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0503a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0502b createFromParcel(Parcel parcel) {
                            AbstractC3255y.i(parcel, "parcel");
                            return new C0502b(parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0502b[] newArray(int i8) {
                            return new C0502b[i8];
                        }
                    }

                    public C0502b(boolean z8) {
                        this.f25343a = z8;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0502b) && this.f25343a == ((C0502b) obj).f25343a;
                    }

                    public int hashCode() {
                        return androidx.compose.foundation.a.a(this.f25343a);
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodRemoveEnabled=" + this.f25343a + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3255y.i(out, "out");
                        out.writeInt(this.f25343a ? 1 : 0);
                    }
                }
            }

            /* renamed from: com.stripe.android.model.j$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public interface InterfaceC0504c extends y2.f {

                /* renamed from: com.stripe.android.model.j$c$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0505a implements InterfaceC0504c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0505a f25344a = new C0505a();
                    public static final Parcelable.Creator<C0505a> CREATOR = new C0506a();

                    /* renamed from: com.stripe.android.model.j$c$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0506a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0505a createFromParcel(Parcel parcel) {
                            AbstractC3255y.i(parcel, "parcel");
                            parcel.readInt();
                            return C0505a.f25344a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0505a[] newArray(int i8) {
                            return new C0505a[i8];
                        }
                    }

                    private C0505a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C0505a);
                    }

                    public int hashCode() {
                        return -1145758141;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3255y.i(out, "out");
                        out.writeInt(1);
                    }
                }

                /* renamed from: com.stripe.android.model.j$c$a$c$b */
                /* loaded from: classes4.dex */
                public static final class b implements InterfaceC0504c {
                    public static final Parcelable.Creator<b> CREATOR = new C0507a();

                    /* renamed from: a, reason: collision with root package name */
                    private final boolean f25345a;

                    /* renamed from: b, reason: collision with root package name */
                    private final boolean f25346b;

                    /* renamed from: c, reason: collision with root package name */
                    private final o.b f25347c;

                    /* renamed from: com.stripe.android.model.j$c$a$c$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0507a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final b createFromParcel(Parcel parcel) {
                            AbstractC3255y.i(parcel, "parcel");
                            return new b(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : o.b.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final b[] newArray(int i8) {
                            return new b[i8];
                        }
                    }

                    public b(boolean z8, boolean z9, o.b bVar) {
                        this.f25345a = z8;
                        this.f25346b = z9;
                        this.f25347c = bVar;
                    }

                    public final o.b a() {
                        return this.f25347c;
                    }

                    public final boolean b() {
                        return this.f25346b;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f25345a == bVar.f25345a && this.f25346b == bVar.f25346b && this.f25347c == bVar.f25347c;
                    }

                    public final boolean g() {
                        return this.f25345a;
                    }

                    public int hashCode() {
                        int a8 = ((androidx.compose.foundation.a.a(this.f25345a) * 31) + androidx.compose.foundation.a.a(this.f25346b)) * 31;
                        o.b bVar = this.f25347c;
                        return a8 + (bVar == null ? 0 : bVar.hashCode());
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodSaveEnabled=" + this.f25345a + ", isPaymentMethodRemoveEnabled=" + this.f25346b + ", allowRedisplayOverride=" + this.f25347c + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3255y.i(out, "out");
                        out.writeInt(this.f25345a ? 1 : 0);
                        out.writeInt(this.f25346b ? 1 : 0);
                        o.b bVar = this.f25347c;
                        if (bVar == null) {
                            out.writeInt(0);
                        } else {
                            out.writeInt(1);
                            bVar.writeToParcel(out, i8);
                        }
                    }
                }
            }

            public a(InterfaceC0504c mobilePaymentElement, b customerSheet) {
                AbstractC3255y.i(mobilePaymentElement, "mobilePaymentElement");
                AbstractC3255y.i(customerSheet, "customerSheet");
                this.f25340a = mobilePaymentElement;
                this.f25341b = customerSheet;
            }

            public final InterfaceC0504c a() {
                return this.f25340a;
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
                return AbstractC3255y.d(this.f25340a, aVar.f25340a) && AbstractC3255y.d(this.f25341b, aVar.f25341b);
            }

            public int hashCode() {
                return (this.f25340a.hashCode() * 31) + this.f25341b.hashCode();
            }

            public String toString() {
                return "Components(mobilePaymentElement=" + this.f25340a + ", customerSheet=" + this.f25341b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f25340a, i8);
                out.writeParcelable(this.f25341b, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(o.CREATOR.createFromParcel(parcel));
                }
                return new c(arrayList, parcel.readString(), C0508c.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* renamed from: com.stripe.android.model.j$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0508c implements y2.f {
            public static final Parcelable.Creator<C0508c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25348a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25349b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25350c;

            /* renamed from: d, reason: collision with root package name */
            private final int f25351d;

            /* renamed from: e, reason: collision with root package name */
            private final String f25352e;

            /* renamed from: f, reason: collision with root package name */
            private final a f25353f;

            /* renamed from: com.stripe.android.model.j$c$c$a */
            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0508c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new C0508c(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), a.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0508c[] newArray(int i8) {
                    return new C0508c[i8];
                }
            }

            public C0508c(String id, boolean z8, String apiKey, int i8, String customerId, a components) {
                AbstractC3255y.i(id, "id");
                AbstractC3255y.i(apiKey, "apiKey");
                AbstractC3255y.i(customerId, "customerId");
                AbstractC3255y.i(components, "components");
                this.f25348a = id;
                this.f25349b = z8;
                this.f25350c = apiKey;
                this.f25351d = i8;
                this.f25352e = customerId;
                this.f25353f = components;
            }

            public final String a() {
                return this.f25350c;
            }

            public final a b() {
                return this.f25353f;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0508c)) {
                    return false;
                }
                C0508c c0508c = (C0508c) obj;
                return AbstractC3255y.d(this.f25348a, c0508c.f25348a) && this.f25349b == c0508c.f25349b && AbstractC3255y.d(this.f25350c, c0508c.f25350c) && this.f25351d == c0508c.f25351d && AbstractC3255y.d(this.f25352e, c0508c.f25352e) && AbstractC3255y.d(this.f25353f, c0508c.f25353f);
            }

            public final String g() {
                return this.f25352e;
            }

            public int hashCode() {
                return (((((((((this.f25348a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25349b)) * 31) + this.f25350c.hashCode()) * 31) + this.f25351d) * 31) + this.f25352e.hashCode()) * 31) + this.f25353f.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.f25348a + ", liveMode=" + this.f25349b + ", apiKey=" + this.f25350c + ", apiKeyExpiry=" + this.f25351d + ", customerId=" + this.f25352e + ", components=" + this.f25353f + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25348a);
                out.writeInt(this.f25349b ? 1 : 0);
                out.writeString(this.f25350c);
                out.writeInt(this.f25351d);
                out.writeString(this.f25352e);
                this.f25353f.writeToParcel(out, i8);
            }
        }

        public c(List paymentMethods, String str, C0508c session) {
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            AbstractC3255y.i(session, "session");
            this.f25337a = paymentMethods;
            this.f25338b = str;
            this.f25339c = session;
        }

        public final List a() {
            return this.f25337a;
        }

        public final C0508c b() {
            return this.f25339c;
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
            return AbstractC3255y.d(this.f25337a, cVar.f25337a) && AbstractC3255y.d(this.f25338b, cVar.f25338b) && AbstractC3255y.d(this.f25339c, cVar.f25339c);
        }

        public int hashCode() {
            int hashCode = this.f25337a.hashCode() * 31;
            String str = this.f25338b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25339c.hashCode();
        }

        public String toString() {
            return "Customer(paymentMethods=" + this.f25337a + ", defaultPaymentMethod=" + this.f25338b + ", session=" + this.f25339c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            List list = this.f25337a;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((o) it.next()).writeToParcel(out, i8);
            }
            out.writeString(this.f25338b);
            this.f25339c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements y2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final List f25354a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25355b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f25356c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f25357d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            AbstractC3255y.i(linkFundingSources, "linkFundingSources");
            AbstractC3255y.i(linkFlags, "linkFlags");
            this.f25354a = linkFundingSources;
            this.f25355b = z8;
            this.f25356c = linkFlags;
            this.f25357d = z9;
        }

        public final boolean a() {
            return this.f25357d;
        }

        public final Map b() {
            return this.f25356c;
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
            return AbstractC3255y.d(this.f25354a, dVar.f25354a) && this.f25355b == dVar.f25355b && AbstractC3255y.d(this.f25356c, dVar.f25356c) && this.f25357d == dVar.f25357d;
        }

        public final boolean g() {
            return this.f25355b;
        }

        public int hashCode() {
            return (((((this.f25354a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25355b)) * 31) + this.f25356c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25357d);
        }

        public String toString() {
            return "LinkSettings(linkFundingSources=" + this.f25354a + ", linkPassthroughModeEnabled=" + this.f25355b + ", linkFlags=" + this.f25356c + ", disableLinkSignup=" + this.f25357d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeStringList(this.f25354a);
            out.writeInt(this.f25355b ? 1 : 0);
            Map map = this.f25356c;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
            out.writeInt(this.f25357d ? 1 : 0);
        }
    }

    public j(d dVar, String str, String str2, StripeIntent stripeIntent, c cVar, String str3, boolean z8, boolean z9, Throwable th) {
        AbstractC3255y.i(stripeIntent, "stripeIntent");
        this.f25327a = dVar;
        this.f25328b = str;
        this.f25329c = str2;
        this.f25330d = stripeIntent;
        this.f25331e = cVar;
        this.f25332f = str3;
        this.f25333g = z8;
        this.f25334h = z9;
        this.f25335i = th;
    }

    public final c a() {
        return this.f25331e;
    }

    public final boolean b() {
        d dVar = this.f25327a;
        if (dVar != null) {
            return dVar.a();
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC3255y.d(this.f25327a, jVar.f25327a) && AbstractC3255y.d(this.f25328b, jVar.f25328b) && AbstractC3255y.d(this.f25329c, jVar.f25329c) && AbstractC3255y.d(this.f25330d, jVar.f25330d) && AbstractC3255y.d(this.f25331e, jVar.f25331e) && AbstractC3255y.d(this.f25332f, jVar.f25332f) && this.f25333g == jVar.f25333g && this.f25334h == jVar.f25334h && AbstractC3255y.d(this.f25335i, jVar.f25335i);
    }

    public final String g() {
        return this.f25329c;
    }

    public final Map h() {
        Map b8;
        d dVar = this.f25327a;
        if (dVar == null || (b8 = dVar.b()) == null) {
            return Q.h();
        }
        return b8;
    }

    public int hashCode() {
        d dVar = this.f25327a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        String str = this.f25328b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25329c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25330d.hashCode()) * 31;
        c cVar = this.f25331e;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.f25332f;
        int hashCode5 = (((((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25333g)) * 31) + androidx.compose.foundation.a.a(this.f25334h)) * 31;
        Throwable th = this.f25335i;
        return hashCode5 + (th != null ? th.hashCode() : 0);
    }

    public final e3.y i() {
        if (y()) {
            if (l()) {
                return e3.y.f31602b;
            }
            return e3.y.f31603c;
        }
        return null;
    }

    public final boolean l() {
        d dVar = this.f25327a;
        if (dVar != null) {
            return dVar.g();
        }
        return false;
    }

    public final String p() {
        return this.f25332f;
    }

    public final String s() {
        return this.f25328b;
    }

    public String toString() {
        return "ElementsSession(linkSettings=" + this.f25327a + ", paymentMethodSpecs=" + this.f25328b + ", externalPaymentMethodData=" + this.f25329c + ", stripeIntent=" + this.f25330d + ", customer=" + this.f25331e + ", merchantCountry=" + this.f25332f + ", isEligibleForCardBrandChoice=" + this.f25333g + ", isGooglePayEnabled=" + this.f25334h + ", sessionsError=" + this.f25335i + ")";
    }

    public final Throwable u() {
        return this.f25335i;
    }

    public final StripeIntent v() {
        return this.f25330d;
    }

    public final boolean w() {
        return this.f25333g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        d dVar = this.f25327a;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25328b);
        out.writeString(this.f25329c);
        out.writeParcelable(this.f25330d, i8);
        c cVar = this.f25331e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25332f);
        out.writeInt(this.f25333g ? 1 : 0);
        out.writeInt(this.f25334h ? 1 : 0);
        out.writeSerializable(this.f25335i);
    }

    public final boolean x() {
        return this.f25334h;
    }

    public final boolean y() {
        Set set;
        boolean z8;
        boolean contains = this.f25330d.e().contains(o.p.f25586h.f25605a);
        List<String> K8 = this.f25330d.K();
        if (!(K8 instanceof Collection) || !K8.isEmpty()) {
            for (String str : K8) {
                set = e3.u.f31575a;
                if (set.contains(str)) {
                    z8 = true;
                    break;
                }
            }
        }
        z8 = false;
        if ((contains && z8) || l()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ j(d dVar, String str, String str2, StripeIntent stripeIntent, c cVar, String str3, boolean z8, boolean z9, Throwable th, int i8, AbstractC3247p abstractC3247p) {
        this(dVar, str, str2, stripeIntent, cVar, str3, z8, z9, (i8 & 256) != 0 ? null : th);
    }
}
