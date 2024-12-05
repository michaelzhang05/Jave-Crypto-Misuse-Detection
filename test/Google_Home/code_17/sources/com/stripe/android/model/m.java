package com.stripe.android.model;

import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabsCallback;
import e3.InterfaceC2784H;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class m implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final c f25373a;

    /* renamed from: b, reason: collision with root package name */
    private static final a f25372b = new a(null);
    public static final Parcelable.Creator<m> CREATOR = new b();

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
        public final m createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new m((c) parcel.readParcelable(m.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i8) {
            return new m[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25374a;

        /* loaded from: classes4.dex */
        public static final class a extends c {

            /* renamed from: b, reason: collision with root package name */
            private final String f25377b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25378c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f25379d;

            /* renamed from: e, reason: collision with root package name */
            public static final C0509a f25375e = new C0509a(null);
            public static final Parcelable.Creator<a> CREATOR = new b();

            /* renamed from: f, reason: collision with root package name */
            private static final a f25376f = new a(null, null, true, 3, null);

            /* renamed from: com.stripe.android.model.m$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0509a {
                private C0509a() {
                }

                public final a a() {
                    return a.f25376f;
                }

                public /* synthetic */ C0509a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(String str, String str2, boolean z8, int i8, AbstractC3247p abstractC3247p) {
                this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? false : z8);
            }

            @Override // e3.InterfaceC2784H
            public Map B() {
                if (this.f25379d) {
                    return Q.e(O5.x.a("infer_from_client", Boolean.TRUE));
                }
                String str = this.f25377b;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                O5.r a8 = O5.x.a("ip_address", str);
                String str3 = this.f25378c;
                if (str3 != null) {
                    str2 = str3;
                }
                return Q.k(a8, O5.x.a("user_agent", str2));
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
                return AbstractC3255y.d(this.f25377b, aVar.f25377b) && AbstractC3255y.d(this.f25378c, aVar.f25378c) && this.f25379d == aVar.f25379d;
            }

            public int hashCode() {
                String str = this.f25377b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25378c;
                return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f25379d);
            }

            public String toString() {
                return "Online(ipAddress=" + this.f25377b + ", userAgent=" + this.f25378c + ", inferFromClient=" + this.f25379d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25377b);
                out.writeString(this.f25378c);
                out.writeInt(this.f25379d ? 1 : 0);
            }

            public a(String str, String str2, boolean z8) {
                super(CustomTabsCallback.ONLINE_EXTRAS_KEY, null);
                this.f25377b = str;
                this.f25378c = str2;
                this.f25379d = z8;
            }
        }

        public /* synthetic */ c(String str, AbstractC3247p abstractC3247p) {
            this(str);
        }

        public final String a() {
            return this.f25374a;
        }

        private c(String str) {
            this.f25374a = str;
        }
    }

    public m(c type) {
        AbstractC3255y.i(type, "type");
        this.f25373a = type;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        return Q.e(O5.x.a("customer_acceptance", Q.k(O5.x.a("type", this.f25373a.a()), O5.x.a(this.f25373a.a(), this.f25373a.B()))));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && AbstractC3255y.d(this.f25373a, ((m) obj).f25373a);
    }

    public int hashCode() {
        return this.f25373a.hashCode();
    }

    public String toString() {
        return "MandateDataParams(type=" + this.f25373a + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeParcelable(this.f25373a, i8);
    }
}
