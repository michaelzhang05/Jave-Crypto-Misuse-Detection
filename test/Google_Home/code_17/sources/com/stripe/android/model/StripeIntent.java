package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import e3.M;
import e3.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface StripeIntent extends y2.f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class NextActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25186b;

        /* renamed from: c, reason: collision with root package name */
        public static final NextActionType f25187c = new NextActionType("RedirectToUrl", 0, "redirect_to_url");

        /* renamed from: d, reason: collision with root package name */
        public static final NextActionType f25188d = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");

        /* renamed from: e, reason: collision with root package name */
        public static final NextActionType f25189e = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");

        /* renamed from: f, reason: collision with root package name */
        public static final NextActionType f25190f = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");

        /* renamed from: g, reason: collision with root package name */
        public static final NextActionType f25191g = new NextActionType("BlikAuthorize", 4, "blik_authorize");

        /* renamed from: h, reason: collision with root package name */
        public static final NextActionType f25192h = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");

        /* renamed from: i, reason: collision with root package name */
        public static final NextActionType f25193i = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");

        /* renamed from: j, reason: collision with root package name */
        public static final NextActionType f25194j = new NextActionType("UpiAwaitNotification", 7, "upi_await_notification");

        /* renamed from: k, reason: collision with root package name */
        public static final NextActionType f25195k = new NextActionType("CashAppRedirect", 8, "cashapp_handle_redirect_or_display_qr_code");

        /* renamed from: l, reason: collision with root package name */
        public static final NextActionType f25196l = new NextActionType("DisplayBoletoDetails", 9, "boleto_display_details");

        /* renamed from: m, reason: collision with root package name */
        public static final NextActionType f25197m = new NextActionType("DisplayKonbiniDetails", 10, "konbini_display_details");

        /* renamed from: n, reason: collision with root package name */
        public static final NextActionType f25198n = new NextActionType("DisplayMultibancoDetails", 11, "multibanco_display_details");

        /* renamed from: o, reason: collision with root package name */
        public static final NextActionType f25199o = new NextActionType("SwishRedirect", 12, "swish_handle_redirect_or_display_qr_code");

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ NextActionType[] f25200p;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25201q;

        /* renamed from: a, reason: collision with root package name */
        private final String f25202a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final NextActionType a(String str) {
                Object obj;
                Iterator<E> it = NextActionType.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((NextActionType) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (NextActionType) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            NextActionType[] a8 = a();
            f25200p = a8;
            f25201q = U5.b.a(a8);
            f25186b = new a(null);
        }

        private NextActionType(String str, int i8, String str2) {
            this.f25202a = str2;
        }

        private static final /* synthetic */ NextActionType[] a() {
            return new NextActionType[]{f25187c, f25188d, f25189e, f25190f, f25191g, f25192h, f25193i, f25194j, f25195k, f25196l, f25197m, f25198n, f25199o};
        }

        public static U5.a c() {
            return f25201q;
        }

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) f25200p.clone();
        }

        public final String b() {
            return this.f25202a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25202a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25203b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f25204c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f25205d = new Status("Processing", 1, "processing");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f25206e = new Status("RequiresAction", 2, "requires_action");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f25207f = new Status("RequiresConfirmation", 3, "requires_confirmation");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f25208g = new Status("RequiresPaymentMethod", 4, "requires_payment_method");

        /* renamed from: h, reason: collision with root package name */
        public static final Status f25209h = new Status("Succeeded", 5, "succeeded");

        /* renamed from: i, reason: collision with root package name */
        public static final Status f25210i = new Status("RequiresCapture", 6, "requires_capture");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ Status[] f25211j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25212k;

        /* renamed from: a, reason: collision with root package name */
        private final String f25213a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f25211j = a8;
            f25212k = U5.b.a(a8);
            f25203b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f25213a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f25204c, f25205d, f25206e, f25207f, f25208g, f25209h, f25210i};
        }

        public static U5.a c() {
            return f25212k;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25211j.clone();
        }

        public final String b() {
            return this.f25213a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25213a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25214b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f25215c = new Usage("OnSession", 0, "on_session");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f25216d = new Usage("OffSession", 1, "off_session");

        /* renamed from: e, reason: collision with root package name */
        public static final Usage f25217e = new Usage("OneTime", 2, "one_time");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f25218f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25219g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25220a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Usage a(String str) {
                Object obj;
                Iterator<E> it = Usage.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((Usage) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Usage) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            Usage[] a8 = a();
            f25218f = a8;
            f25219g = U5.b.a(a8);
            f25214b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f25220a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f25215c, f25216d, f25217e};
        }

        public static U5.a c() {
            return f25219g;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f25218f.clone();
        }

        public final String b() {
            return this.f25220a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25220a;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a implements y2.f {

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f25227a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0478a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0478a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    parcel.readInt();
                    return b.f25227a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1031794127;
            }

            public String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0479a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25228a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0479a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String mobileAuthUrl) {
                super(null);
                AbstractC3255y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f25228a = mobileAuthUrl;
            }

            public final String b() {
                return this.f25228a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3255y.d(this.f25228a, ((c) obj).f25228a);
            }

            public int hashCode() {
                return this.f25228a.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.f25228a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25228a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a implements h {
            public static final Parcelable.Creator<d> CREATOR = new C0480a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25229a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0480a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new d(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str) {
                super(null);
                this.f25229a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25229a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC3255y.d(this.f25229a, ((d) obj).f25229a);
            }

            public int hashCode() {
                String str = this.f25229a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.f25229a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25229a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a implements h {
            public static final Parcelable.Creator<e> CREATOR = new C0481a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25230a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0481a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new e(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            public e(String str) {
                super(null);
                this.f25230a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25230a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3255y.d(this.f25230a, ((e) obj).f25230a);
            }

            public int hashCode() {
                String str = this.f25230a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.f25230a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25230a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a implements h {
            public static final Parcelable.Creator<f> CREATOR = new C0482a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25231a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$f$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0482a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new f(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i8) {
                    return new f[i8];
                }
            }

            public f(String str) {
                super(null);
                this.f25231a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25231a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3255y.d(this.f25231a, ((f) obj).f25231a);
            }

            public int hashCode() {
                String str = this.f25231a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.f25231a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25231a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a implements h {
            public static final Parcelable.Creator<g> CREATOR = new C0483a();

            /* renamed from: a, reason: collision with root package name */
            private final int f25232a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25233b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25234c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$g$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0483a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new g(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i8) {
                    return new g[i8];
                }
            }

            public g(int i8, String str, String str2) {
                super(null);
                this.f25232a = i8;
                this.f25233b = str;
                this.f25234c = str2;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25234c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f25232a == gVar.f25232a && AbstractC3255y.d(this.f25233b, gVar.f25233b) && AbstractC3255y.d(this.f25234c, gVar.f25234c);
            }

            public int hashCode() {
                int i8 = this.f25232a * 31;
                String str = this.f25233b;
                int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f25234c;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.f25232a + ", number=" + this.f25233b + ", hostedVoucherUrl=" + this.f25234c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(this.f25232a);
                out.writeString(this.f25233b);
                out.writeString(this.f25234c);
            }
        }

        /* loaded from: classes4.dex */
        public interface h {
            String a();
        }

        /* loaded from: classes4.dex */
        public static final class i extends a {
            public static final Parcelable.Creator<i> CREATOR = new C0484a();

            /* renamed from: a, reason: collision with root package name */
            private final Uri f25235a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25236b;

            /* renamed from: com.stripe.android.model.StripeIntent$a$i$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0484a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new i((Uri) parcel.readParcelable(i.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final i[] newArray(int i8) {
                    return new i[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Uri url, String str) {
                super(null);
                AbstractC3255y.i(url, "url");
                this.f25235a = url;
                this.f25236b = str;
            }

            public final String A() {
                return this.f25236b;
            }

            public final Uri b() {
                return this.f25235a;
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
                return AbstractC3255y.d(this.f25235a, iVar.f25235a) && AbstractC3255y.d(this.f25236b, iVar.f25236b);
            }

            public int hashCode() {
                int hashCode = this.f25235a.hashCode() * 31;
                String str = this.f25236b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.f25235a + ", returnUrl=" + this.f25236b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeParcelable(this.f25235a, i8);
                out.writeString(this.f25236b);
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class j extends a {

            /* renamed from: com.stripe.android.model.StripeIntent$a$j$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0485a extends j {
                public static final Parcelable.Creator<C0485a> CREATOR = new C0486a();

                /* renamed from: a, reason: collision with root package name */
                private final String f25237a;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0486a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final C0485a createFromParcel(Parcel parcel) {
                        AbstractC3255y.i(parcel, "parcel");
                        return new C0485a(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final C0485a[] newArray(int i8) {
                        return new C0485a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0485a(String url) {
                    super(null);
                    AbstractC3255y.i(url, "url");
                    this.f25237a = url;
                }

                public final String b() {
                    return this.f25237a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0485a) && AbstractC3255y.d(this.f25237a, ((C0485a) obj).f25237a);
                }

                public int hashCode() {
                    return this.f25237a.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.f25237a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3255y.i(out, "out");
                    out.writeString(this.f25237a);
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends j {
                public static final Parcelable.Creator<b> CREATOR = new C0487a();

                /* renamed from: a, reason: collision with root package name */
                private final String f25238a;

                /* renamed from: b, reason: collision with root package name */
                private final String f25239b;

                /* renamed from: c, reason: collision with root package name */
                private final String f25240c;

                /* renamed from: d, reason: collision with root package name */
                private final C0488b f25241d;

                /* renamed from: e, reason: collision with root package name */
                private final String f25242e;

                /* renamed from: f, reason: collision with root package name */
                private final String f25243f;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0487a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3255y.i(parcel, "parcel");
                        return new b(parcel.readString(), parcel.readString(), parcel.readString(), C0488b.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0488b implements Parcelable {
                    public static final Parcelable.Creator<C0488b> CREATOR = new C0489a();

                    /* renamed from: a, reason: collision with root package name */
                    private final String f25244a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f25245b;

                    /* renamed from: c, reason: collision with root package name */
                    private final List f25246c;

                    /* renamed from: d, reason: collision with root package name */
                    private final String f25247d;

                    /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0489a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0488b createFromParcel(Parcel parcel) {
                            AbstractC3255y.i(parcel, "parcel");
                            return new C0488b(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0488b[] newArray(int i8) {
                            return new C0488b[i8];
                        }
                    }

                    public C0488b(String directoryServerId, String dsCertificateData, List rootCertsData, String str) {
                        AbstractC3255y.i(directoryServerId, "directoryServerId");
                        AbstractC3255y.i(dsCertificateData, "dsCertificateData");
                        AbstractC3255y.i(rootCertsData, "rootCertsData");
                        this.f25244a = directoryServerId;
                        this.f25245b = dsCertificateData;
                        this.f25246c = rootCertsData;
                        this.f25247d = str;
                    }

                    public final String a() {
                        return this.f25244a;
                    }

                    public final String b() {
                        return this.f25245b;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0488b)) {
                            return false;
                        }
                        C0488b c0488b = (C0488b) obj;
                        return AbstractC3255y.d(this.f25244a, c0488b.f25244a) && AbstractC3255y.d(this.f25245b, c0488b.f25245b) && AbstractC3255y.d(this.f25246c, c0488b.f25246c) && AbstractC3255y.d(this.f25247d, c0488b.f25247d);
                    }

                    public final String g() {
                        return this.f25247d;
                    }

                    public final List h() {
                        return this.f25246c;
                    }

                    public int hashCode() {
                        int hashCode = ((((this.f25244a.hashCode() * 31) + this.f25245b.hashCode()) * 31) + this.f25246c.hashCode()) * 31;
                        String str = this.f25247d;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.f25244a + ", dsCertificateData=" + this.f25245b + ", rootCertsData=" + this.f25246c + ", keyId=" + this.f25247d + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3255y.i(out, "out");
                        out.writeString(this.f25244a);
                        out.writeString(this.f25245b);
                        out.writeStringList(this.f25246c);
                        out.writeString(this.f25247d);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String source, String serverName, String transactionId, C0488b serverEncryption, String str, String str2) {
                    super(null);
                    AbstractC3255y.i(source, "source");
                    AbstractC3255y.i(serverName, "serverName");
                    AbstractC3255y.i(transactionId, "transactionId");
                    AbstractC3255y.i(serverEncryption, "serverEncryption");
                    this.f25238a = source;
                    this.f25239b = serverName;
                    this.f25240c = transactionId;
                    this.f25241d = serverEncryption;
                    this.f25242e = str;
                    this.f25243f = str2;
                }

                public final String b() {
                    return this.f25243f;
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
                    return AbstractC3255y.d(this.f25238a, bVar.f25238a) && AbstractC3255y.d(this.f25239b, bVar.f25239b) && AbstractC3255y.d(this.f25240c, bVar.f25240c) && AbstractC3255y.d(this.f25241d, bVar.f25241d) && AbstractC3255y.d(this.f25242e, bVar.f25242e) && AbstractC3255y.d(this.f25243f, bVar.f25243f);
                }

                public final C0488b g() {
                    return this.f25241d;
                }

                public final String h() {
                    return this.f25239b;
                }

                public int hashCode() {
                    int hashCode = ((((((this.f25238a.hashCode() * 31) + this.f25239b.hashCode()) * 31) + this.f25240c.hashCode()) * 31) + this.f25241d.hashCode()) * 31;
                    String str = this.f25242e;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f25243f;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String i() {
                    return this.f25238a;
                }

                public final String l() {
                    return this.f25242e;
                }

                public final String p() {
                    return this.f25240c;
                }

                public String toString() {
                    return "Use3DS2(source=" + this.f25238a + ", serverName=" + this.f25239b + ", transactionId=" + this.f25240c + ", serverEncryption=" + this.f25241d + ", threeDS2IntentId=" + this.f25242e + ", publishableKey=" + this.f25243f + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3255y.i(out, "out");
                    out.writeString(this.f25238a);
                    out.writeString(this.f25239b);
                    out.writeString(this.f25240c);
                    this.f25241d.writeToParcel(out, i8);
                    out.writeString(this.f25242e);
                    out.writeString(this.f25243f);
                }
            }

            public /* synthetic */ j(AbstractC3247p abstractC3247p) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class k extends a {
            public static final Parcelable.Creator<k> CREATOR = new C0490a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25248a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$k$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0490a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new k(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final k[] newArray(int i8) {
                    return new k[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String mobileAuthUrl) {
                super(null);
                AbstractC3255y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f25248a = mobileAuthUrl;
            }

            public final String b() {
                return this.f25248a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && AbstractC3255y.d(this.f25248a, ((k) obj).f25248a);
            }

            public int hashCode() {
                return this.f25248a.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.f25248a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25248a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f25249a = new l();
            public static final Parcelable.Creator<l> CREATOR = new C0491a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$l$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0491a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    parcel.readInt();
                    return l.f25249a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final l[] newArray(int i8) {
                    return new l[i8];
                }
            }

            private l() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public int hashCode() {
                return -1021414879;
            }

            public String toString() {
                return "UpiAwaitNotification";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class m extends a {
            public static final Parcelable.Creator<m> CREATOR = new C0492a();

            /* renamed from: a, reason: collision with root package name */
            private final long f25250a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25251b;

            /* renamed from: c, reason: collision with root package name */
            private final z f25252c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$m$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0492a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new m(parcel.readLong(), parcel.readString(), z.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final m[] newArray(int i8) {
                    return new m[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(long j8, String hostedVerificationUrl, z microdepositType) {
                super(null);
                AbstractC3255y.i(hostedVerificationUrl, "hostedVerificationUrl");
                AbstractC3255y.i(microdepositType, "microdepositType");
                this.f25250a = j8;
                this.f25251b = hostedVerificationUrl;
                this.f25252c = microdepositType;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return this.f25250a == mVar.f25250a && AbstractC3255y.d(this.f25251b, mVar.f25251b) && this.f25252c == mVar.f25252c;
            }

            public int hashCode() {
                return (((androidx.collection.a.a(this.f25250a) * 31) + this.f25251b.hashCode()) * 31) + this.f25252c.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.f25250a + ", hostedVerificationUrl=" + this.f25251b + ", microdepositType=" + this.f25252c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeLong(this.f25250a);
                out.writeString(this.f25251b);
                out.writeString(this.f25252c.name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class n extends a {
            public static final Parcelable.Creator<n> CREATOR = new C0493a();

            /* renamed from: a, reason: collision with root package name */
            private final M f25253a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$n$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0493a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new n(M.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final n[] newArray(int i8) {
                    return new n[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(M weChat) {
                super(null);
                AbstractC3255y.i(weChat, "weChat");
                this.f25253a = weChat;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && AbstractC3255y.d(this.f25253a, ((n) obj).f25253a);
            }

            public int hashCode() {
                return this.f25253a.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.f25253a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                this.f25253a.writeToParcel(out, i8);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }

        /* renamed from: com.stripe.android.model.StripeIntent$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0476a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f25223a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25224b;

            /* renamed from: c, reason: collision with root package name */
            private final Uri f25225c;

            /* renamed from: d, reason: collision with root package name */
            private final String f25226d;

            /* renamed from: e, reason: collision with root package name */
            private static final C0477a f25221e = new C0477a(null);

            /* renamed from: f, reason: collision with root package name */
            public static final int f25222f = 8;
            public static final Parcelable.Creator<C0476a> CREATOR = new b();

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0477a {
                private C0477a() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.String b(java.lang.String r4) {
                    /*
                        r3 = this;
                        r0 = 0
                        O5.s$a r1 = O5.s.f8302b     // Catch: java.lang.Throwable -> L2e
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                        r1.<init>()     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r2 = "alipay://url?"
                        r1.append(r2)     // Catch: java.lang.Throwable -> L2e
                        r1.append(r4)     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2e
                        android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r1 = "return_url"
                        java.lang.String r4 = r4.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L2e
                        if (r4 == 0) goto L2c
                        z4.c r1 = z4.C4230c.f41174a     // Catch: java.lang.Throwable -> L2e
                        kotlin.jvm.internal.AbstractC3255y.f(r4)     // Catch: java.lang.Throwable -> L2e
                        boolean r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L2e
                        if (r1 == 0) goto L2c
                        goto L30
                    L2c:
                        r4 = r0
                        goto L30
                    L2e:
                        r4 = move-exception
                        goto L35
                    L30:
                        java.lang.Object r4 = O5.s.b(r4)     // Catch: java.lang.Throwable -> L2e
                        goto L3f
                    L35:
                        O5.s$a r1 = O5.s.f8302b
                        java.lang.Object r4 = O5.t.a(r4)
                        java.lang.Object r4 = O5.s.b(r4)
                    L3f:
                        boolean r1 = O5.s.g(r4)
                        if (r1 == 0) goto L46
                        goto L47
                    L46:
                        r0 = r4
                    L47:
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0476a.C0477a.b(java.lang.String):java.lang.String");
                }

                public /* synthetic */ C0477a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0476a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new C0476a(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(C0476a.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0476a[] newArray(int i8) {
                    return new C0476a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0476a(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                AbstractC3255y.i(data, "data");
                AbstractC3255y.i(webViewUrl, "webViewUrl");
                this.f25223a = data;
                this.f25224b = str;
                this.f25225c = webViewUrl;
                this.f25226d = str2;
            }

            public final String A() {
                return this.f25226d;
            }

            public final Uri b() {
                return this.f25225c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0476a)) {
                    return false;
                }
                C0476a c0476a = (C0476a) obj;
                return AbstractC3255y.d(this.f25223a, c0476a.f25223a) && AbstractC3255y.d(this.f25224b, c0476a.f25224b) && AbstractC3255y.d(this.f25225c, c0476a.f25225c) && AbstractC3255y.d(this.f25226d, c0476a.f25226d);
            }

            public int hashCode() {
                int hashCode = this.f25223a.hashCode() * 31;
                String str = this.f25224b;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25225c.hashCode()) * 31;
                String str2 = this.f25226d;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.f25223a + ", authCompleteUrl=" + this.f25224b + ", webViewUrl=" + this.f25225c + ", returnUrl=" + this.f25226d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25223a);
                out.writeString(this.f25224b);
                out.writeParcelable(this.f25225c, i8);
                out.writeString(this.f25226d);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0476a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                    java.lang.String r0 = "webViewUrl"
                    kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
                    com.stripe.android.model.StripeIntent$a$a$a r0 = com.stripe.android.model.StripeIntent.a.C0476a.f25221e
                    java.lang.String r0 = com.stripe.android.model.StripeIntent.a.C0476a.C0477a.a(r0, r3)
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    java.lang.String r1 = "parse(...)"
                    kotlin.jvm.internal.AbstractC3255y.h(r4, r1)
                    r2.<init>(r3, r0, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0476a.<init>(java.lang.String, java.lang.String, java.lang.String):void");
            }
        }
    }

    List F();

    List K();

    boolean L();

    Map O();

    boolean c();

    String d();

    List e();

    String getId();

    Status getStatus();

    a j();

    NextActionType k();

    String m();

    o r();

    boolean t();
}
