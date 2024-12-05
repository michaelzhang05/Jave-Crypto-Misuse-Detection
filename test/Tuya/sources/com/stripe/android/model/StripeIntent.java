package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b3.M;
import b3.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface StripeIntent extends v2.f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class NextActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24131b;

        /* renamed from: c, reason: collision with root package name */
        public static final NextActionType f24132c = new NextActionType("RedirectToUrl", 0, "redirect_to_url");

        /* renamed from: d, reason: collision with root package name */
        public static final NextActionType f24133d = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");

        /* renamed from: e, reason: collision with root package name */
        public static final NextActionType f24134e = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");

        /* renamed from: f, reason: collision with root package name */
        public static final NextActionType f24135f = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");

        /* renamed from: g, reason: collision with root package name */
        public static final NextActionType f24136g = new NextActionType("BlikAuthorize", 4, "blik_authorize");

        /* renamed from: h, reason: collision with root package name */
        public static final NextActionType f24137h = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");

        /* renamed from: i, reason: collision with root package name */
        public static final NextActionType f24138i = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");

        /* renamed from: j, reason: collision with root package name */
        public static final NextActionType f24139j = new NextActionType("UpiAwaitNotification", 7, "upi_await_notification");

        /* renamed from: k, reason: collision with root package name */
        public static final NextActionType f24140k = new NextActionType("CashAppRedirect", 8, "cashapp_handle_redirect_or_display_qr_code");

        /* renamed from: l, reason: collision with root package name */
        public static final NextActionType f24141l = new NextActionType("DisplayBoletoDetails", 9, "boleto_display_details");

        /* renamed from: m, reason: collision with root package name */
        public static final NextActionType f24142m = new NextActionType("DisplayKonbiniDetails", 10, "konbini_display_details");

        /* renamed from: n, reason: collision with root package name */
        public static final NextActionType f24143n = new NextActionType("DisplayMultibancoDetails", 11, "multibanco_display_details");

        /* renamed from: o, reason: collision with root package name */
        public static final NextActionType f24144o = new NextActionType("SwishRedirect", 12, "swish_handle_redirect_or_display_qr_code");

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ NextActionType[] f24145p;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24146q;

        /* renamed from: a, reason: collision with root package name */
        private final String f24147a;

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
                        if (AbstractC3159y.d(((NextActionType) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (NextActionType) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            NextActionType[] a8 = a();
            f24145p = a8;
            f24146q = R5.b.a(a8);
            f24131b = new a(null);
        }

        private NextActionType(String str, int i8, String str2) {
            this.f24147a = str2;
        }

        private static final /* synthetic */ NextActionType[] a() {
            return new NextActionType[]{f24132c, f24133d, f24134e, f24135f, f24136g, f24137h, f24138i, f24139j, f24140k, f24141l, f24142m, f24143n, f24144o};
        }

        public static R5.a c() {
            return f24146q;
        }

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) f24145p.clone();
        }

        public final String b() {
            return this.f24147a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24147a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24148b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f24149c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f24150d = new Status("Processing", 1, "processing");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f24151e = new Status("RequiresAction", 2, "requires_action");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f24152f = new Status("RequiresConfirmation", 3, "requires_confirmation");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f24153g = new Status("RequiresPaymentMethod", 4, "requires_payment_method");

        /* renamed from: h, reason: collision with root package name */
        public static final Status f24154h = new Status("Succeeded", 5, "succeeded");

        /* renamed from: i, reason: collision with root package name */
        public static final Status f24155i = new Status("RequiresCapture", 6, "requires_capture");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ Status[] f24156j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24157k;

        /* renamed from: a, reason: collision with root package name */
        private final String f24158a;

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
                        if (AbstractC3159y.d(((Status) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Status[] a8 = a();
            f24156j = a8;
            f24157k = R5.b.a(a8);
            f24148b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f24158a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f24149c, f24150d, f24151e, f24152f, f24153g, f24154h, f24155i};
        }

        public static R5.a c() {
            return f24157k;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f24156j.clone();
        }

        public final String b() {
            return this.f24158a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24158a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24159b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f24160c = new Usage("OnSession", 0, "on_session");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f24161d = new Usage("OffSession", 1, "off_session");

        /* renamed from: e, reason: collision with root package name */
        public static final Usage f24162e = new Usage("OneTime", 2, "one_time");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f24163f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24164g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24165a;

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
                        if (AbstractC3159y.d(((Usage) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Usage) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Usage[] a8 = a();
            f24163f = a8;
            f24164g = R5.b.a(a8);
            f24159b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f24165a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f24160c, f24161d, f24162e};
        }

        public static R5.a c() {
            return f24164g;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f24163f.clone();
        }

        public final String b() {
            return this.f24165a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24165a;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a implements v2.f {

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f24172a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0482a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0482a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return b.f24172a;
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
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0483a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24173a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0483a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f24173a = mobileAuthUrl;
            }

            public final String c() {
                return this.f24173a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3159y.d(this.f24173a, ((c) obj).f24173a);
            }

            public int hashCode() {
                return this.f24173a.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.f24173a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24173a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a implements h {
            public static final Parcelable.Creator<d> CREATOR = new C0484a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24174a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0484a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                this.f24174a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24174a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC3159y.d(this.f24174a, ((d) obj).f24174a);
            }

            public int hashCode() {
                String str = this.f24174a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.f24174a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24174a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a implements h {
            public static final Parcelable.Creator<e> CREATOR = new C0485a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24175a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0485a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                this.f24175a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24175a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3159y.d(this.f24175a, ((e) obj).f24175a);
            }

            public int hashCode() {
                String str = this.f24175a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.f24175a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24175a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a implements h {
            public static final Parcelable.Creator<f> CREATOR = new C0486a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24176a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$f$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0486a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                this.f24176a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24176a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3159y.d(this.f24176a, ((f) obj).f24176a);
            }

            public int hashCode() {
                String str = this.f24176a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.f24176a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24176a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a implements h {
            public static final Parcelable.Creator<g> CREATOR = new C0487a();

            /* renamed from: a, reason: collision with root package name */
            private final int f24177a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24178b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24179c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$g$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0487a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                this.f24177a = i8;
                this.f24178b = str;
                this.f24179c = str2;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String b() {
                return this.f24179c;
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
                return this.f24177a == gVar.f24177a && AbstractC3159y.d(this.f24178b, gVar.f24178b) && AbstractC3159y.d(this.f24179c, gVar.f24179c);
            }

            public int hashCode() {
                int i8 = this.f24177a * 31;
                String str = this.f24178b;
                int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f24179c;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.f24177a + ", number=" + this.f24178b + ", hostedVoucherUrl=" + this.f24179c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24177a);
                out.writeString(this.f24178b);
                out.writeString(this.f24179c);
            }
        }

        /* loaded from: classes4.dex */
        public interface h {
            String b();
        }

        /* loaded from: classes4.dex */
        public static final class i extends a {
            public static final Parcelable.Creator<i> CREATOR = new C0488a();

            /* renamed from: a, reason: collision with root package name */
            private final Uri f24180a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24181b;

            /* renamed from: com.stripe.android.model.StripeIntent$a$i$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0488a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(url, "url");
                this.f24180a = url;
                this.f24181b = str;
            }

            public final Uri c() {
                return this.f24180a;
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
                return AbstractC3159y.d(this.f24180a, iVar.f24180a) && AbstractC3159y.d(this.f24181b, iVar.f24181b);
            }

            public int hashCode() {
                int hashCode = this.f24180a.hashCode() * 31;
                String str = this.f24181b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.f24180a + ", returnUrl=" + this.f24181b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeParcelable(this.f24180a, i8);
                out.writeString(this.f24181b);
            }

            public final String x() {
                return this.f24181b;
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class j extends a {

            /* renamed from: com.stripe.android.model.StripeIntent$a$j$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0489a extends j {
                public static final Parcelable.Creator<C0489a> CREATOR = new C0490a();

                /* renamed from: a, reason: collision with root package name */
                private final String f24182a;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0490a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final C0489a createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new C0489a(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final C0489a[] newArray(int i8) {
                        return new C0489a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0489a(String url) {
                    super(null);
                    AbstractC3159y.i(url, "url");
                    this.f24182a = url;
                }

                public final String c() {
                    return this.f24182a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0489a) && AbstractC3159y.d(this.f24182a, ((C0489a) obj).f24182a);
                }

                public int hashCode() {
                    return this.f24182a.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.f24182a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f24182a);
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends j {
                public static final Parcelable.Creator<b> CREATOR = new C0491a();

                /* renamed from: a, reason: collision with root package name */
                private final String f24183a;

                /* renamed from: b, reason: collision with root package name */
                private final String f24184b;

                /* renamed from: c, reason: collision with root package name */
                private final String f24185c;

                /* renamed from: d, reason: collision with root package name */
                private final C0492b f24186d;

                /* renamed from: e, reason: collision with root package name */
                private final String f24187e;

                /* renamed from: f, reason: collision with root package name */
                private final String f24188f;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0491a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new b(parcel.readString(), parcel.readString(), parcel.readString(), C0492b.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0492b implements Parcelable {
                    public static final Parcelable.Creator<C0492b> CREATOR = new C0493a();

                    /* renamed from: a, reason: collision with root package name */
                    private final String f24189a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f24190b;

                    /* renamed from: c, reason: collision with root package name */
                    private final List f24191c;

                    /* renamed from: d, reason: collision with root package name */
                    private final String f24192d;

                    /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0493a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0492b createFromParcel(Parcel parcel) {
                            AbstractC3159y.i(parcel, "parcel");
                            return new C0492b(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0492b[] newArray(int i8) {
                            return new C0492b[i8];
                        }
                    }

                    public C0492b(String directoryServerId, String dsCertificateData, List rootCertsData, String str) {
                        AbstractC3159y.i(directoryServerId, "directoryServerId");
                        AbstractC3159y.i(dsCertificateData, "dsCertificateData");
                        AbstractC3159y.i(rootCertsData, "rootCertsData");
                        this.f24189a = directoryServerId;
                        this.f24190b = dsCertificateData;
                        this.f24191c = rootCertsData;
                        this.f24192d = str;
                    }

                    public final String b() {
                        return this.f24189a;
                    }

                    public final String c() {
                        return this.f24190b;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public final String e() {
                        return this.f24192d;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0492b)) {
                            return false;
                        }
                        C0492b c0492b = (C0492b) obj;
                        return AbstractC3159y.d(this.f24189a, c0492b.f24189a) && AbstractC3159y.d(this.f24190b, c0492b.f24190b) && AbstractC3159y.d(this.f24191c, c0492b.f24191c) && AbstractC3159y.d(this.f24192d, c0492b.f24192d);
                    }

                    public final List f() {
                        return this.f24191c;
                    }

                    public int hashCode() {
                        int hashCode = ((((this.f24189a.hashCode() * 31) + this.f24190b.hashCode()) * 31) + this.f24191c.hashCode()) * 31;
                        String str = this.f24192d;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.f24189a + ", dsCertificateData=" + this.f24190b + ", rootCertsData=" + this.f24191c + ", keyId=" + this.f24192d + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3159y.i(out, "out");
                        out.writeString(this.f24189a);
                        out.writeString(this.f24190b);
                        out.writeStringList(this.f24191c);
                        out.writeString(this.f24192d);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String source, String serverName, String transactionId, C0492b serverEncryption, String str, String str2) {
                    super(null);
                    AbstractC3159y.i(source, "source");
                    AbstractC3159y.i(serverName, "serverName");
                    AbstractC3159y.i(transactionId, "transactionId");
                    AbstractC3159y.i(serverEncryption, "serverEncryption");
                    this.f24183a = source;
                    this.f24184b = serverName;
                    this.f24185c = transactionId;
                    this.f24186d = serverEncryption;
                    this.f24187e = str;
                    this.f24188f = str2;
                }

                public final String c() {
                    return this.f24188f;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final C0492b e() {
                    return this.f24186d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return AbstractC3159y.d(this.f24183a, bVar.f24183a) && AbstractC3159y.d(this.f24184b, bVar.f24184b) && AbstractC3159y.d(this.f24185c, bVar.f24185c) && AbstractC3159y.d(this.f24186d, bVar.f24186d) && AbstractC3159y.d(this.f24187e, bVar.f24187e) && AbstractC3159y.d(this.f24188f, bVar.f24188f);
                }

                public final String f() {
                    return this.f24184b;
                }

                public int hashCode() {
                    int hashCode = ((((((this.f24183a.hashCode() * 31) + this.f24184b.hashCode()) * 31) + this.f24185c.hashCode()) * 31) + this.f24186d.hashCode()) * 31;
                    String str = this.f24187e;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f24188f;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String i() {
                    return this.f24183a;
                }

                public final String j() {
                    return this.f24187e;
                }

                public final String k() {
                    return this.f24185c;
                }

                public String toString() {
                    return "Use3DS2(source=" + this.f24183a + ", serverName=" + this.f24184b + ", transactionId=" + this.f24185c + ", serverEncryption=" + this.f24186d + ", threeDS2IntentId=" + this.f24187e + ", publishableKey=" + this.f24188f + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f24183a);
                    out.writeString(this.f24184b);
                    out.writeString(this.f24185c);
                    this.f24186d.writeToParcel(out, i8);
                    out.writeString(this.f24187e);
                    out.writeString(this.f24188f);
                }
            }

            public /* synthetic */ j(AbstractC3151p abstractC3151p) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class k extends a {
            public static final Parcelable.Creator<k> CREATOR = new C0494a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24193a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$k$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0494a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f24193a = mobileAuthUrl;
            }

            public final String c() {
                return this.f24193a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && AbstractC3159y.d(this.f24193a, ((k) obj).f24193a);
            }

            public int hashCode() {
                return this.f24193a.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.f24193a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24193a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f24194a = new l();
            public static final Parcelable.Creator<l> CREATOR = new C0495a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$l$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0495a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return l.f24194a;
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
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class m extends a {
            public static final Parcelable.Creator<m> CREATOR = new C0496a();

            /* renamed from: a, reason: collision with root package name */
            private final long f24195a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24196b;

            /* renamed from: c, reason: collision with root package name */
            private final z f24197c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$m$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0496a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(hostedVerificationUrl, "hostedVerificationUrl");
                AbstractC3159y.i(microdepositType, "microdepositType");
                this.f24195a = j8;
                this.f24196b = hostedVerificationUrl;
                this.f24197c = microdepositType;
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
                return this.f24195a == mVar.f24195a && AbstractC3159y.d(this.f24196b, mVar.f24196b) && this.f24197c == mVar.f24197c;
            }

            public int hashCode() {
                return (((androidx.collection.a.a(this.f24195a) * 31) + this.f24196b.hashCode()) * 31) + this.f24197c.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.f24195a + ", hostedVerificationUrl=" + this.f24196b + ", microdepositType=" + this.f24197c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeLong(this.f24195a);
                out.writeString(this.f24196b);
                out.writeString(this.f24197c.name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class n extends a {
            public static final Parcelable.Creator<n> CREATOR = new C0497a();

            /* renamed from: a, reason: collision with root package name */
            private final M f24198a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$n$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0497a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
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
                AbstractC3159y.i(weChat, "weChat");
                this.f24198a = weChat;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && AbstractC3159y.d(this.f24198a, ((n) obj).f24198a);
            }

            public int hashCode() {
                return this.f24198a.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.f24198a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f24198a.writeToParcel(out, i8);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }

        /* renamed from: com.stripe.android.model.StripeIntent$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0480a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f24168a;

            /* renamed from: b, reason: collision with root package name */
            private final String f24169b;

            /* renamed from: c, reason: collision with root package name */
            private final Uri f24170c;

            /* renamed from: d, reason: collision with root package name */
            private final String f24171d;

            /* renamed from: e, reason: collision with root package name */
            private static final C0481a f24166e = new C0481a(null);

            /* renamed from: f, reason: collision with root package name */
            public static final int f24167f = 8;
            public static final Parcelable.Creator<C0480a> CREATOR = new b();

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0481a {
                private C0481a() {
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
                        L5.s$a r1 = L5.s.f6511b     // Catch: java.lang.Throwable -> L2e
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
                        w4.c r1 = w4.C3850c.f39051a     // Catch: java.lang.Throwable -> L2e
                        kotlin.jvm.internal.AbstractC3159y.f(r4)     // Catch: java.lang.Throwable -> L2e
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
                        java.lang.Object r4 = L5.s.b(r4)     // Catch: java.lang.Throwable -> L2e
                        goto L3f
                    L35:
                        L5.s$a r1 = L5.s.f6511b
                        java.lang.Object r4 = L5.t.a(r4)
                        java.lang.Object r4 = L5.s.b(r4)
                    L3f:
                        boolean r1 = L5.s.g(r4)
                        if (r1 == 0) goto L46
                        goto L47
                    L46:
                        r0 = r4
                    L47:
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0480a.C0481a.b(java.lang.String):java.lang.String");
                }

                public /* synthetic */ C0481a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0480a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0480a(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(C0480a.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0480a[] newArray(int i8) {
                    return new C0480a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0480a(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                AbstractC3159y.i(data, "data");
                AbstractC3159y.i(webViewUrl, "webViewUrl");
                this.f24168a = data;
                this.f24169b = str;
                this.f24170c = webViewUrl;
                this.f24171d = str2;
            }

            public final Uri c() {
                return this.f24170c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0480a)) {
                    return false;
                }
                C0480a c0480a = (C0480a) obj;
                return AbstractC3159y.d(this.f24168a, c0480a.f24168a) && AbstractC3159y.d(this.f24169b, c0480a.f24169b) && AbstractC3159y.d(this.f24170c, c0480a.f24170c) && AbstractC3159y.d(this.f24171d, c0480a.f24171d);
            }

            public int hashCode() {
                int hashCode = this.f24168a.hashCode() * 31;
                String str = this.f24169b;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f24170c.hashCode()) * 31;
                String str2 = this.f24171d;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.f24168a + ", authCompleteUrl=" + this.f24169b + ", webViewUrl=" + this.f24170c + ", returnUrl=" + this.f24171d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24168a);
                out.writeString(this.f24169b);
                out.writeParcelable(this.f24170c, i8);
                out.writeString(this.f24171d);
            }

            public final String x() {
                return this.f24171d;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0480a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.AbstractC3159y.i(r3, r0)
                    java.lang.String r0 = "webViewUrl"
                    kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
                    com.stripe.android.model.StripeIntent$a$a$a r0 = com.stripe.android.model.StripeIntent.a.C0480a.f24166e
                    java.lang.String r0 = com.stripe.android.model.StripeIntent.a.C0480a.C0481a.a(r0, r3)
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    java.lang.String r1 = "parse(...)"
                    kotlin.jvm.internal.AbstractC3159y.h(r4, r1)
                    r2.<init>(r3, r0, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0480a.<init>(java.lang.String, java.lang.String, java.lang.String):void");
            }
        }
    }

    List D();

    List H();

    boolean J();

    Map N();

    boolean a();

    String d();

    List g();

    String getId();

    Status getStatus();

    a l();

    NextActionType m();

    String p();

    o v();

    boolean w();
}
