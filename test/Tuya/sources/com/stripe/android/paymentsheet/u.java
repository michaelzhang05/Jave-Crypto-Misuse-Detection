package com.stripe.android.paymentsheet;

import M5.AbstractC1246t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.ColorKt;
import b3.EnumC1870e;
import com.stripe.android.googlepaylauncher.h;
import j4.C3086l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import n2.C3451a;
import r3.C3686a;
import y3.C3990e;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final f f26368b = new f(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f26369c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final w f26370a;

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {

        /* renamed from: m, reason: collision with root package name */
        private static final e f26403m;

        /* renamed from: n, reason: collision with root package name */
        private static final e f26404n;

        /* renamed from: a, reason: collision with root package name */
        private final int f26405a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26406b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26407c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26408d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26409e;

        /* renamed from: f, reason: collision with root package name */
        private final int f26410f;

        /* renamed from: g, reason: collision with root package name */
        private final int f26411g;

        /* renamed from: h, reason: collision with root package name */
        private final int f26412h;

        /* renamed from: i, reason: collision with root package name */
        private final int f26413i;

        /* renamed from: j, reason: collision with root package name */
        private final int f26414j;

        /* renamed from: k, reason: collision with root package name */
        private final int f26415k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f26402l = new a(null);
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a() {
                return e.f26404n;
            }

            public final e b() {
                return e.f26403m;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33236a;
            f26403m = new e(c3086l.c().g().m1178getPrimary0d7_KjU(), c3086l.c().g().m1182getSurface0d7_KjU(), c3086l.c().d(), c3086l.c().e(), c3086l.c().f(), c3086l.c().h(), c3086l.c().j(), c3086l.c().i(), c3086l.c().g().m1177getOnSurface0d7_KjU(), c3086l.c().c(), c3086l.c().g().m1172getError0d7_KjU(), null);
            f26404n = new e(c3086l.b().g().m1178getPrimary0d7_KjU(), c3086l.b().g().m1182getSurface0d7_KjU(), c3086l.b().d(), c3086l.b().e(), c3086l.b().f(), c3086l.b().h(), c3086l.b().j(), c3086l.b().i(), c3086l.b().g().m1177getOnSurface0d7_KjU(), c3086l.b().c(), c3086l.b().g().m1172getError0d7_KjU(), null);
        }

        public /* synthetic */ e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC3151p abstractC3151p) {
            this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
        }

        public final int G() {
            return this.f26406b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f26414j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f26405a == eVar.f26405a && this.f26406b == eVar.f26406b && this.f26407c == eVar.f26407c && this.f26408d == eVar.f26408d && this.f26409e == eVar.f26409e && this.f26410f == eVar.f26410f && this.f26411g == eVar.f26411g && this.f26412h == eVar.f26412h && this.f26413i == eVar.f26413i && this.f26414j == eVar.f26414j && this.f26415k == eVar.f26415k;
        }

        public final int f() {
            return this.f26407c;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f26405a * 31) + this.f26406b) * 31) + this.f26407c) * 31) + this.f26408d) * 31) + this.f26409e) * 31) + this.f26410f) * 31) + this.f26411g) * 31) + this.f26412h) * 31) + this.f26413i) * 31) + this.f26414j) * 31) + this.f26415k;
        }

        public final int i() {
            return this.f26408d;
        }

        public final int j() {
            return this.f26409e;
        }

        public final int k() {
            return this.f26415k;
        }

        public final int n() {
            return this.f26410f;
        }

        public final int o() {
            return this.f26411g;
        }

        public final int s() {
            return this.f26413i;
        }

        public String toString() {
            return "Colors(primary=" + this.f26405a + ", surface=" + this.f26406b + ", component=" + this.f26407c + ", componentBorder=" + this.f26408d + ", componentDivider=" + this.f26409e + ", onComponent=" + this.f26410f + ", onSurface=" + this.f26411g + ", subtitle=" + this.f26412h + ", placeholderText=" + this.f26413i + ", appBarIcon=" + this.f26414j + ", error=" + this.f26415k + ")";
        }

        public final int u() {
            return this.f26405a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f26405a);
            out.writeInt(this.f26406b);
            out.writeInt(this.f26407c);
            out.writeInt(this.f26408d);
            out.writeInt(this.f26409e);
            out.writeInt(this.f26410f);
            out.writeInt(this.f26411g);
            out.writeInt(this.f26412h);
            out.writeInt(this.f26413i);
            out.writeInt(this.f26414j);
            out.writeInt(this.f26415k);
        }

        public final int z() {
            return this.f26412h;
        }

        public e(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f26405a = i8;
            this.f26406b = i9;
            this.f26407c = i10;
            this.f26408d = i11;
            this.f26409e = i12;
            this.f26410f = i13;
            this.f26411g = i14;
            this.f26412h = i15;
            this.f26413i = i16;
            this.f26414j = i17;
            this.f26415k = i18;
        }

        private e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            this(ColorKt.m3025toArgb8_81llA(j8), ColorKt.m3025toArgb8_81llA(j9), ColorKt.m3025toArgb8_81llA(j10), ColorKt.m3025toArgb8_81llA(j11), ColorKt.m3025toArgb8_81llA(j12), ColorKt.m3025toArgb8_81llA(j13), ColorKt.m3025toArgb8_81llA(j16), ColorKt.m3025toArgb8_81llA(j14), ColorKt.m3025toArgb8_81llA(j15), ColorKt.m3025toArgb8_81llA(j17), ColorKt.m3025toArgb8_81llA(j18));
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface h extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements h {
            public static final Parcelable.Creator<a> CREATOR = new C0650a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26434a;

            /* renamed from: b, reason: collision with root package name */
            private final String f26435b;

            /* renamed from: com.stripe.android.paymentsheet.u$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0650a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String customerSessionClientSecret) {
                AbstractC3159y.i(customerSessionClientSecret, "customerSessionClientSecret");
                this.f26434a = customerSessionClientSecret;
                this.f26435b = "customer_session";
            }

            public final String F() {
                return this.f26434a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3159y.d(this.f26434a, ((a) obj).f26434a);
            }

            @Override // com.stripe.android.paymentsheet.u.h
            public String h() {
                return this.f26435b;
            }

            public int hashCode() {
                return this.f26434a.hashCode();
            }

            public String toString() {
                return "CustomerSession(customerSessionClientSecret=" + this.f26434a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26434a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements h {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26436a;

            /* renamed from: b, reason: collision with root package name */
            private final String f26437b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(String ephemeralKeySecret) {
                AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
                this.f26436a = ephemeralKeySecret;
                this.f26437b = "legacy";
            }

            public final String b() {
                return this.f26436a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3159y.d(this.f26436a, ((b) obj).f26436a);
            }

            @Override // com.stripe.android.paymentsheet.u.h
            public String h() {
                return this.f26437b;
            }

            public int hashCode() {
                return this.f26436a.hashCode();
            }

            public String toString() {
                return "LegacyCustomerEphemeralKey(ephemeralKeySecret=" + this.f26436a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26436a);
            }
        }

        String h();
    }

    /* loaded from: classes4.dex */
    public static final class i implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26440a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26441b;

        /* renamed from: c, reason: collision with root package name */
        private final h f26442c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f26438d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f26439e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new i(parcel.readString(), parcel.readString(), (h) parcel.readParcelable(i.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String id, String ephemeralKeySecret, h accessType) {
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(ephemeralKeySecret, "ephemeralKeySecret");
            AbstractC3159y.i(accessType, "accessType");
            this.f26440a = id;
            this.f26441b = ephemeralKeySecret;
            this.f26442c = accessType;
        }

        public final h b() {
            return this.f26442c;
        }

        public final String c() {
            return this.f26441b;
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
            return AbstractC3159y.d(this.f26440a, iVar.f26440a) && AbstractC3159y.d(this.f26441b, iVar.f26441b) && AbstractC3159y.d(this.f26442c, iVar.f26442c);
        }

        public final String getId() {
            return this.f26440a;
        }

        public int hashCode() {
            return (((this.f26440a.hashCode() * 31) + this.f26441b.hashCode()) * 31) + this.f26442c.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.f26440a + ", ephemeralKeySecret=" + this.f26441b + ", accessType=" + this.f26442c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26440a);
            out.writeString(this.f26441b);
            out.writeParcelable(this.f26442c, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26443a = a.f26444a;

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f26444a = new a();

            /* renamed from: b, reason: collision with root package name */
            private static com.stripe.android.paymentsheet.h f26445b;

            private a() {
            }

            public final void a(com.stripe.android.paymentsheet.h hVar) {
                f26445b = hVar;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final c f26446a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26447b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26448c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f26449d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26450e;

        /* renamed from: f, reason: collision with root package name */
        private final a f26451f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26452a = new a("Buy", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f26453b = new a("Book", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f26454c = new a("Checkout", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final a f26455d = new a("Donate", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final a f26456e = new a("Order", 4);

            /* renamed from: f, reason: collision with root package name */
            public static final a f26457f = new a("Pay", 5);

            /* renamed from: g, reason: collision with root package name */
            public static final a f26458g = new a("Subscribe", 6);

            /* renamed from: h, reason: collision with root package name */
            public static final a f26459h = new a("Plain", 7);

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ a[] f26460i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26461j;

            static {
                a[] a8 = a();
                f26460i = a8;
                f26461j = R5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26452a, f26453b, f26454c, f26455d, f26456e, f26457f, f26458g, f26459h};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26460i.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new k(c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public static final c f26462a = new c("Production", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final c f26463b = new c("Test", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ c[] f26464c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26465d;

            static {
                c[] a8 = a();
                f26464c = a8;
                f26465d = R5.b.a(a8);
            }

            private c(String str, int i8) {
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f26462a, f26463b};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f26464c.clone();
            }
        }

        public k(c environment, String countryCode, String str, Long l8, String str2, a buttonType) {
            AbstractC3159y.i(environment, "environment");
            AbstractC3159y.i(countryCode, "countryCode");
            AbstractC3159y.i(buttonType, "buttonType");
            this.f26446a = environment;
            this.f26447b = countryCode;
            this.f26448c = str;
            this.f26449d = l8;
            this.f26450e = str2;
            this.f26451f = buttonType;
        }

        public final Long b() {
            return this.f26449d;
        }

        public final a c() {
            return this.f26451f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26448c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f26446a == kVar.f26446a && AbstractC3159y.d(this.f26447b, kVar.f26447b) && AbstractC3159y.d(this.f26448c, kVar.f26448c) && AbstractC3159y.d(this.f26449d, kVar.f26449d) && AbstractC3159y.d(this.f26450e, kVar.f26450e) && this.f26451f == kVar.f26451f;
        }

        public final c f() {
            return this.f26446a;
        }

        public int hashCode() {
            int hashCode = ((this.f26446a.hashCode() * 31) + this.f26447b.hashCode()) * 31;
            String str = this.f26448c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l8 = this.f26449d;
            int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str2 = this.f26450e;
            return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f26451f.hashCode();
        }

        public final String i() {
            return this.f26450e;
        }

        public final String p() {
            return this.f26447b;
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.f26446a + ", countryCode=" + this.f26447b + ", currencyCode=" + this.f26448c + ", amount=" + this.f26449d + ", label=" + this.f26450e + ", buttonType=" + this.f26451f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26446a.name());
            out.writeString(this.f26447b);
            out.writeString(this.f26448c);
            Long l8 = this.f26449d;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f26450e);
            out.writeString(this.f26451f.name());
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class l implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends l {
            public static final Parcelable.Creator<a> CREATOR = new C0651a();

            /* renamed from: a, reason: collision with root package name */
            private final m f26466a;

            /* renamed from: com.stripe.android.paymentsheet.u$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0651a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(m.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m intentConfiguration) {
                super(null);
                AbstractC3159y.i(intentConfiguration, "intentConfiguration");
                this.f26466a = intentConfiguration;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void b() {
            }

            public final m c() {
                return this.f26466a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3159y.d(this.f26466a, ((a) obj).f26466a);
            }

            public int hashCode() {
                return this.f26466a.hashCode();
            }

            public String toString() {
                return "DeferredIntent(intentConfiguration=" + this.f26466a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                this.f26466a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26467a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String clientSecret) {
                super(null);
                AbstractC3159y.i(clientSecret, "clientSecret");
                this.f26467a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void b() {
                new C3990e(this.f26467a).c();
            }

            public final String d() {
                return this.f26467a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3159y.d(this.f26467a, ((b) obj).f26467a);
            }

            public int hashCode() {
                return this.f26467a.hashCode();
            }

            public String toString() {
                return "PaymentIntent(clientSecret=" + this.f26467a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26467a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends l {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f26468a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
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
            public c(String clientSecret) {
                super(null);
                AbstractC3159y.i(clientSecret, "clientSecret");
                this.f26468a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void b() {
                new y3.k(this.f26468a).c();
            }

            public final String d() {
                return this.f26468a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3159y.d(this.f26468a, ((c) obj).f26468a);
            }

            public int hashCode() {
                return this.f26468a.hashCode();
            }

            public String toString() {
                return "SetupIntent(clientSecret=" + this.f26468a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f26468a);
            }
        }

        private l() {
        }

        public abstract void b();

        public /* synthetic */ l(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26491a;

        /* renamed from: b, reason: collision with root package name */
        private static final n f26492b;

        /* renamed from: c, reason: collision with root package name */
        public static final n f26493c;

        /* renamed from: d, reason: collision with root package name */
        public static final n f26494d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ n[] f26495e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f26496f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final n a() {
                return n.f26492b;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            n nVar = new n("Horizontal", 0);
            f26493c = nVar;
            f26494d = new n("Vertical", 1);
            n[] a8 = a();
            f26495e = a8;
            f26496f = R5.b.a(a8);
            f26491a = new a(null);
            f26492b = nVar;
        }

        private n(String str, int i8) {
        }

        private static final /* synthetic */ n[] a() {
            return new n[]{f26493c, f26494d};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f26495e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        private static final p f26502g;

        /* renamed from: h, reason: collision with root package name */
        private static final p f26503h;

        /* renamed from: a, reason: collision with root package name */
        private final Integer f26504a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26505b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26506c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26507d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26508e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f26501f = new a(null);
        public static final Parcelable.Creator<p> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final p a() {
                return p.f26503h;
            }

            public final p b() {
                return p.f26502g;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new p(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33236a;
            f26502g = new p(null, ColorKt.m3025toArgb8_81llA(c3086l.d().c().c()), ColorKt.m3025toArgb8_81llA(c3086l.d().c().b()), ColorKt.m3025toArgb8_81llA(c3086l.d().c().e()), ColorKt.m3025toArgb8_81llA(c3086l.d().c().c()));
            f26503h = new p(null, ColorKt.m3025toArgb8_81llA(c3086l.d().b().c()), ColorKt.m3025toArgb8_81llA(c3086l.d().b().b()), ColorKt.m3025toArgb8_81llA(c3086l.d().b().e()), ColorKt.m3025toArgb8_81llA(c3086l.d().b().c()));
        }

        public p(Integer num, int i8, int i9, int i10, int i11) {
            this.f26504a = num;
            this.f26505b = i8;
            this.f26506c = i9;
            this.f26507d = i10;
            this.f26508e = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.f26504a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return AbstractC3159y.d(this.f26504a, pVar.f26504a) && this.f26505b == pVar.f26505b && this.f26506c == pVar.f26506c && this.f26507d == pVar.f26507d && this.f26508e == pVar.f26508e;
        }

        public final int f() {
            return this.f26506c;
        }

        public int hashCode() {
            Integer num = this.f26504a;
            return ((((((((num == null ? 0 : num.hashCode()) * 31) + this.f26505b) * 31) + this.f26506c) * 31) + this.f26507d) * 31) + this.f26508e;
        }

        public final int i() {
            return this.f26505b;
        }

        public final int j() {
            return this.f26508e;
        }

        public final int k() {
            return this.f26507d;
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.f26504a + ", onBackground=" + this.f26505b + ", border=" + this.f26506c + ", successBackgroundColor=" + this.f26507d + ", onSuccessBackgroundColor=" + this.f26508e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            Integer num = this.f26504a;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26505b);
            out.writeInt(this.f26506c);
            out.writeInt(this.f26507d);
            out.writeInt(this.f26508e);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final s f26514d;

        /* renamed from: a, reason: collision with root package name */
        private final float f26515a;

        /* renamed from: b, reason: collision with root package name */
        private final float f26516b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26513c = new a(null);
        public static final Parcelable.Creator<s> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final s a() {
                return s.f26514d;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new s(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33236a;
            f26514d = new s(c3086l.e().e(), c3086l.e().c());
        }

        public s(float f8, float f9) {
            this.f26515a = f8;
            this.f26516b = f9;
        }

        public final float c() {
            return this.f26516b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final float e() {
            return this.f26515a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Float.compare(this.f26515a, sVar.f26515a) == 0 && Float.compare(this.f26516b, sVar.f26516b) == 0;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f26515a) * 31) + Float.floatToIntBits(this.f26516b);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.f26515a + ", borderStrokeWidthDp=" + this.f26516b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeFloat(this.f26515a);
            out.writeFloat(this.f26516b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final t f26518d;

        /* renamed from: a, reason: collision with root package name */
        private final float f26519a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f26520b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f26517c = new a(null);
        public static final Parcelable.Creator<t> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final t a() {
                return t.f26518d;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new t(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t[] newArray(int i8) {
                return new t[i8];
            }
        }

        static {
            C3086l c3086l = C3086l.f33236a;
            f26518d = new t(c3086l.f().g(), c3086l.f().f());
        }

        public t(float f8, Integer num) {
            this.f26519a = f8;
            this.f26520b = num;
        }

        public final Integer c() {
            return this.f26520b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final float e() {
            return this.f26519a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return Float.compare(this.f26519a, tVar.f26519a) == 0 && AbstractC3159y.d(this.f26520b, tVar.f26520b);
        }

        public int hashCode() {
            int hashCode;
            int floatToIntBits = Float.floatToIntBits(this.f26519a) * 31;
            Integer num = this.f26520b;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return floatToIntBits + hashCode;
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.f26519a + ", fontResId=" + this.f26520b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            out.writeFloat(this.f26519a);
            Integer num = this.f26520b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    public u(w paymentSheetLauncher) {
        AbstractC3159y.i(paymentSheetLauncher, "paymentSheetLauncher");
        this.f26370a = paymentSheetLauncher;
    }

    public final void a(String paymentIntentClientSecret, g gVar) {
        AbstractC3159y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.f26370a.a(new l.b(paymentIntentClientSecret), gVar);
    }

    /* loaded from: classes4.dex */
    public static final class q implements Parcelable {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Float f26509a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f26510b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new q(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i8) {
                return new q[i8];
            }
        }

        public q(Float f8, Float f9) {
            this.f26509a = f8;
            this.f26510b = f9;
        }

        public final Float b() {
            return this.f26510b;
        }

        public final Float c() {
            return this.f26509a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return AbstractC3159y.d(this.f26509a, qVar.f26509a) && AbstractC3159y.d(this.f26510b, qVar.f26510b);
        }

        public int hashCode() {
            Float f8 = this.f26509a;
            int hashCode = (f8 == null ? 0 : f8.hashCode()) * 31;
            Float f9 = this.f26510b;
            return hashCode + (f9 != null ? f9.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.f26509a + ", borderStrokeWidthDp=" + this.f26510b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            Float f8 = this.f26509a;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
            Float f9 = this.f26510b;
            if (f9 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f9.floatValue());
            }
        }

        public /* synthetic */ q(Float f8, Float f9, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : f8, (i8 & 2) != 0 ? null : f9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements Parcelable {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Integer f26511a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f26512b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new r(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        public r(Integer num, Float f8) {
            this.f26511a = num;
            this.f26512b = f8;
        }

        public final Integer b() {
            return this.f26511a;
        }

        public final Float c() {
            return this.f26512b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return AbstractC3159y.d(this.f26511a, rVar.f26511a) && AbstractC3159y.d(this.f26512b, rVar.f26512b);
        }

        public int hashCode() {
            Integer num = this.f26511a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f8 = this.f26512b;
            return hashCode + (f8 != null ? f8.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.f26511a + ", fontSizeSp=" + this.f26512b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            Integer num = this.f26511a;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Float f8 = this.f26512b;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
        }

        public /* synthetic */ r(Integer num, Float f8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : f8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(ComponentActivity activity, q3.p callback) {
        this(new C2433b(activity, callback));
        AbstractC3159y.i(activity, "activity");
        AbstractC3159y.i(callback, "callback");
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final a f26382a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26383b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26384c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26385d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(a aVar, String str, String str2, String str3) {
            this.f26382a = aVar;
            this.f26383b = str;
            this.f26384c = str2;
            this.f26385d = str3;
        }

        public final a b() {
            return this.f26382a;
        }

        public final String c() {
            return this.f26383b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26384c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f26382a, cVar.f26382a) && AbstractC3159y.d(this.f26383b, cVar.f26383b) && AbstractC3159y.d(this.f26384c, cVar.f26384c) && AbstractC3159y.d(this.f26385d, cVar.f26385d);
        }

        public final String f() {
            return this.f26385d;
        }

        public int hashCode() {
            a aVar = this.f26382a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f26383b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26384c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26385d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean i() {
            if (this.f26382a == null && this.f26383b == null && this.f26384c == null && this.f26385d == null) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "BillingDetails(address=" + this.f26382a + ", email=" + this.f26383b + ", name=" + this.f26384c + ", phone=" + this.f26385d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            a aVar = this.f26382a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f26383b);
            out.writeString(this.f26384c);
            out.writeString(this.f26385d);
        }

        public /* synthetic */ c(a aVar, String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements Parcelable {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final p f26497a;

        /* renamed from: b, reason: collision with root package name */
        private final p f26498b;

        /* renamed from: c, reason: collision with root package name */
        private final q f26499c;

        /* renamed from: d, reason: collision with root package name */
        private final r f26500d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                Parcelable.Creator<p> creator = p.CREATOR;
                return new o(creator.createFromParcel(parcel), creator.createFromParcel(parcel), q.CREATOR.createFromParcel(parcel), r.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(p colorsLight, p colorsDark, q shape, r typography) {
            AbstractC3159y.i(colorsLight, "colorsLight");
            AbstractC3159y.i(colorsDark, "colorsDark");
            AbstractC3159y.i(shape, "shape");
            AbstractC3159y.i(typography, "typography");
            this.f26497a = colorsLight;
            this.f26498b = colorsDark;
            this.f26499c = shape;
            this.f26500d = typography;
        }

        public final p b() {
            return this.f26498b;
        }

        public final p c() {
            return this.f26497a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final q e() {
            return this.f26499c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return AbstractC3159y.d(this.f26497a, oVar.f26497a) && AbstractC3159y.d(this.f26498b, oVar.f26498b) && AbstractC3159y.d(this.f26499c, oVar.f26499c) && AbstractC3159y.d(this.f26500d, oVar.f26500d);
        }

        public final r f() {
            return this.f26500d;
        }

        public int hashCode() {
            return (((((this.f26497a.hashCode() * 31) + this.f26498b.hashCode()) * 31) + this.f26499c.hashCode()) * 31) + this.f26500d.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.f26497a + ", colorsDark=" + this.f26498b + ", shape=" + this.f26499c + ", typography=" + this.f26500d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26497a.writeToParcel(out, i8);
            this.f26498b.writeToParcel(out, i8);
            this.f26499c.writeToParcel(out, i8);
            this.f26500d.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ o(com.stripe.android.paymentsheet.u.p r3, com.stripe.android.paymentsheet.u.p r4, com.stripe.android.paymentsheet.u.q r5, com.stripe.android.paymentsheet.u.r r6, int r7, kotlin.jvm.internal.AbstractC3151p r8) {
            /*
                r2 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                com.stripe.android.paymentsheet.u$p$a r3 = com.stripe.android.paymentsheet.u.p.f26501f
                com.stripe.android.paymentsheet.u$p r3 = r3.b()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L14
                com.stripe.android.paymentsheet.u$p$a r4 = com.stripe.android.paymentsheet.u.p.f26501f
                com.stripe.android.paymentsheet.u$p r4 = r4.a()
            L14:
                r8 = r7 & 4
                r0 = 3
                r1 = 0
                if (r8 == 0) goto L1f
                com.stripe.android.paymentsheet.u$q r5 = new com.stripe.android.paymentsheet.u$q
                r5.<init>(r1, r1, r0, r1)
            L1f:
                r7 = r7 & 8
                if (r7 == 0) goto L28
                com.stripe.android.paymentsheet.u$r r6 = new com.stripe.android.paymentsheet.u$r
                r6.<init>(r1, r1, r0, r1)
            L28:
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.u.o.<init>(com.stripe.android.paymentsheet.u$p, com.stripe.android.paymentsheet.u$p, com.stripe.android.paymentsheet.u$q, com.stripe.android.paymentsheet.u$r, int, kotlin.jvm.internal.p):void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final e f26377a;

        /* renamed from: b, reason: collision with root package name */
        private final e f26378b;

        /* renamed from: c, reason: collision with root package name */
        private final s f26379c;

        /* renamed from: d, reason: collision with root package name */
        private final t f26380d;

        /* renamed from: e, reason: collision with root package name */
        private final o f26381e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                Parcelable.Creator<e> creator = e.CREATOR;
                return new b(creator.createFromParcel(parcel), creator.createFromParcel(parcel), s.CREATOR.createFromParcel(parcel), t.CREATOR.createFromParcel(parcel), o.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(e colorsLight, e colorsDark, s shapes, t typography, o primaryButton) {
            AbstractC3159y.i(colorsLight, "colorsLight");
            AbstractC3159y.i(colorsDark, "colorsDark");
            AbstractC3159y.i(shapes, "shapes");
            AbstractC3159y.i(typography, "typography");
            AbstractC3159y.i(primaryButton, "primaryButton");
            this.f26377a = colorsLight;
            this.f26378b = colorsDark;
            this.f26379c = shapes;
            this.f26380d = typography;
            this.f26381e = primaryButton;
        }

        public final e b() {
            return this.f26378b;
        }

        public final e c() {
            return this.f26377a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final o e() {
            return this.f26381e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26377a, bVar.f26377a) && AbstractC3159y.d(this.f26378b, bVar.f26378b) && AbstractC3159y.d(this.f26379c, bVar.f26379c) && AbstractC3159y.d(this.f26380d, bVar.f26380d) && AbstractC3159y.d(this.f26381e, bVar.f26381e);
        }

        public final s f() {
            return this.f26379c;
        }

        public int hashCode() {
            return (((((((this.f26377a.hashCode() * 31) + this.f26378b.hashCode()) * 31) + this.f26379c.hashCode()) * 31) + this.f26380d.hashCode()) * 31) + this.f26381e.hashCode();
        }

        public final t i() {
            return this.f26380d;
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.f26377a + ", colorsDark=" + this.f26378b + ", shapes=" + this.f26379c + ", typography=" + this.f26380d + ", primaryButton=" + this.f26381e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26377a.writeToParcel(out, i8);
            this.f26378b.writeToParcel(out, i8);
            this.f26379c.writeToParcel(out, i8);
            this.f26380d.writeToParcel(out, i8);
            this.f26381e.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b() {
            /*
                r13 = this;
                com.stripe.android.paymentsheet.u$e$a r0 = com.stripe.android.paymentsheet.u.e.f26402l
                com.stripe.android.paymentsheet.u$e r2 = r0.b()
                com.stripe.android.paymentsheet.u$e r3 = r0.a()
                com.stripe.android.paymentsheet.u$s$a r0 = com.stripe.android.paymentsheet.u.s.f26513c
                com.stripe.android.paymentsheet.u$s r4 = r0.a()
                com.stripe.android.paymentsheet.u$t$a r0 = com.stripe.android.paymentsheet.u.t.f26517c
                com.stripe.android.paymentsheet.u$t r5 = r0.a()
                com.stripe.android.paymentsheet.u$o r0 = new com.stripe.android.paymentsheet.u$o
                r11 = 15
                r12 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r1 = r13
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.u.b.<init>():void");
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        private final b f26386a;

        /* renamed from: b, reason: collision with root package name */
        private final b f26387b;

        /* renamed from: c, reason: collision with root package name */
        private final b f26388c;

        /* renamed from: d, reason: collision with root package name */
        private final a f26389d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26390e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26391a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f26392b = new a("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f26393c = new a("Full", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f26394d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26395e;

            static {
                a[] a8 = a();
                f26394d = a8;
                f26395e = R5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26391a, f26392b, f26393c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26394d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f26396a = new b("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final b f26397b = new b("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final b f26398c = new b("Always", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f26399d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26400e;

            static {
                b[] a8 = a();
                f26399d = a8;
                f26400e = R5.b.a(a8);
            }

            private b(String str, int i8) {
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f26396a, f26397b, f26398c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f26399d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), b.valueOf(parcel.readString()), a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.u$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0649d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f26401a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f26392b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f26391a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.f26393c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f26401a = iArr;
            }
        }

        public d(b name, b phone, b email, a address, boolean z8) {
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(phone, "phone");
            AbstractC3159y.i(email, "email");
            AbstractC3159y.i(address, "address");
            this.f26386a = name;
            this.f26387b = phone;
            this.f26388c = email;
            this.f26389d = address;
            this.f26390e = z8;
        }

        public final a b() {
            return this.f26389d;
        }

        public final boolean c() {
            return this.f26390e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            b bVar = this.f26386a;
            b bVar2 = b.f26398c;
            if (bVar != bVar2 && this.f26387b != bVar2 && this.f26388c != bVar2 && this.f26389d != a.f26393c) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f26386a == dVar.f26386a && this.f26387b == dVar.f26387b && this.f26388c == dVar.f26388c && this.f26389d == dVar.f26389d && this.f26390e == dVar.f26390e;
        }

        public final boolean f() {
            if (this.f26388c == b.f26398c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f26386a.hashCode() * 31) + this.f26387b.hashCode()) * 31) + this.f26388c.hashCode()) * 31) + this.f26389d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26390e);
        }

        public final boolean i() {
            if (this.f26386a == b.f26398c) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            if (this.f26387b == b.f26398c) {
                return true;
            }
            return false;
        }

        public final b k() {
            return this.f26388c;
        }

        public final b n() {
            return this.f26386a;
        }

        public final b o() {
            return this.f26387b;
        }

        public final h.b s() {
            boolean z8;
            boolean z9;
            h.b.EnumC0476b enumC0476b;
            a aVar = this.f26389d;
            boolean z10 = false;
            if (aVar == a.f26393c) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f26387b == b.f26398c) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i8 = C0649d.f26401a[aVar.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    enumC0476b = h.b.EnumC0476b.f23933c;
                } else {
                    throw new L5.p();
                }
            } else {
                enumC0476b = h.b.EnumC0476b.f23932b;
            }
            if (z8 || z9) {
                z10 = true;
            }
            return new h.b(z10, enumC0476b, z9);
        }

        public String toString() {
            return "BillingDetailsCollectionConfiguration(name=" + this.f26386a + ", phone=" + this.f26387b + ", email=" + this.f26388c + ", address=" + this.f26389d + ", attachDefaultsToPaymentMethod=" + this.f26390e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26386a.name());
            out.writeString(this.f26387b.name());
            out.writeString(this.f26388c.name());
            out.writeString(this.f26389d.name());
            out.writeInt(this.f26390e ? 1 : 0);
        }

        public /* synthetic */ d(b bVar, b bVar2, b bVar3, a aVar, boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? b.f26396a : bVar, (i8 & 2) != 0 ? b.f26396a : bVar2, (i8 & 4) != 0 ? b.f26396a : bVar3, (i8 & 8) != 0 ? a.f26391a : aVar, (i8 & 16) != 0 ? false : z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final d f26471a;

        /* renamed from: b, reason: collision with root package name */
        private final List f26472b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26473c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26474d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f26475e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f26469f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f26470g = 8;
        public static final Parcelable.Creator<m> CREATOR = new c();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26476a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f26477b = new a("AutomaticAsync", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f26478c = new a("Manual", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f26479d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26480e;

            static {
                a[] a8 = a();
                f26479d = a8;
                f26480e = R5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f26476a, f26477b, f26478c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f26479d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new m((d) parcel.readParcelable(m.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class d implements Parcelable {

            /* loaded from: classes4.dex */
            public static final class a extends d {
                public static final Parcelable.Creator<a> CREATOR = new C0652a();

                /* renamed from: a, reason: collision with root package name */
                private final long f26481a;

                /* renamed from: b, reason: collision with root package name */
                private final String f26482b;

                /* renamed from: c, reason: collision with root package name */
                private final e f26483c;

                /* renamed from: d, reason: collision with root package name */
                private final a f26484d;

                /* renamed from: com.stripe.android.paymentsheet.u$m$d$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0652a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new a(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), a.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final a[] newArray(int i8) {
                        return new a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(long j8, String currency, e eVar, a captureMethod) {
                    super(null);
                    AbstractC3159y.i(currency, "currency");
                    AbstractC3159y.i(captureMethod, "captureMethod");
                    this.f26481a = j8;
                    this.f26482b = currency;
                    this.f26483c = eVar;
                    this.f26484d = captureMethod;
                }

                public final String K() {
                    return this.f26482b;
                }

                @Override // com.stripe.android.paymentsheet.u.m.d
                public e b() {
                    return this.f26483c;
                }

                public final long c() {
                    return this.f26481a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public a e() {
                    return this.f26484d;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeLong(this.f26481a);
                    out.writeString(this.f26482b);
                    e eVar = this.f26483c;
                    if (eVar == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeString(eVar.name());
                    }
                    out.writeString(this.f26484d.name());
                }
            }

            private d() {
            }

            public abstract e b();

            /* loaded from: classes4.dex */
            public static final class b extends d {
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name */
                private final String f26485a;

                /* renamed from: b, reason: collision with root package name */
                private final e f26486b;

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3159y.i(parcel, "parcel");
                        return new b(parcel.readString(), e.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public /* synthetic */ b(String str, e eVar, int i8, AbstractC3151p abstractC3151p) {
                    this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? e.f26488b : eVar);
                }

                public final String K() {
                    return this.f26485a;
                }

                @Override // com.stripe.android.paymentsheet.u.m.d
                public e b() {
                    return this.f26486b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3159y.i(out, "out");
                    out.writeString(this.f26485a);
                    out.writeString(this.f26486b.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, e setupFutureUse) {
                    super(null);
                    AbstractC3159y.i(setupFutureUse, "setupFutureUse");
                    this.f26485a = str;
                    this.f26486b = setupFutureUse;
                }
            }

            public /* synthetic */ d(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            public static final e f26487a = new e("OnSession", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final e f26488b = new e("OffSession", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ e[] f26489c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ R5.a f26490d;

            static {
                e[] a8 = a();
                f26489c = a8;
                f26490d = R5.b.a(a8);
            }

            private e(String str, int i8) {
            }

            private static final /* synthetic */ e[] a() {
                return new e[]{f26487a, f26488b};
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f26489c.clone();
            }
        }

        public m(d mode, List paymentMethodTypes, String str, String str2, boolean z8) {
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
            this.f26471a = mode;
            this.f26472b = paymentMethodTypes;
            this.f26473c = str;
            this.f26474d = str2;
            this.f26475e = z8;
        }

        public final d b() {
            return this.f26471a;
        }

        public final String c() {
            return this.f26474d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26473c;
        }

        public final boolean f() {
            return this.f26475e;
        }

        public final List g() {
            return this.f26472b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26471a, i8);
            out.writeStringList(this.f26472b);
            out.writeString(this.f26473c);
            out.writeString(this.f26474d);
            out.writeInt(this.f26475e ? 1 : 0);
        }

        public /* synthetic */ m(d dVar, List list, String str, String str2, int i8, AbstractC3151p abstractC3151p) {
            this(dVar, (i8 & 2) != 0 ? AbstractC1246t.m() : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public m(d mode, List paymentMethodTypes, String str, String str2) {
            this(mode, paymentMethodTypes, str, str2, false);
            AbstractC3159y.i(mode, "mode");
            AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0648a();

        /* renamed from: a, reason: collision with root package name */
        private final String f26371a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26372b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26373c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26374d;

        /* renamed from: e, reason: collision with root package name */
        private final String f26375e;

        /* renamed from: f, reason: collision with root package name */
        private final String f26376f;

        /* renamed from: com.stripe.android.paymentsheet.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0648a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f26371a = str;
            this.f26372b = str2;
            this.f26373c = str3;
            this.f26374d = str4;
            this.f26375e = str5;
            this.f26376f = str6;
        }

        public final String b() {
            return this.f26371a;
        }

        public final String c() {
            return this.f26372b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f26373c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26371a, aVar.f26371a) && AbstractC3159y.d(this.f26372b, aVar.f26372b) && AbstractC3159y.d(this.f26373c, aVar.f26373c) && AbstractC3159y.d(this.f26374d, aVar.f26374d) && AbstractC3159y.d(this.f26375e, aVar.f26375e) && AbstractC3159y.d(this.f26376f, aVar.f26376f);
        }

        public final String f() {
            return this.f26374d;
        }

        public int hashCode() {
            String str = this.f26371a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f26372b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26373c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26374d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f26375e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f26376f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.f26375e;
        }

        public final String j() {
            return this.f26376f;
        }

        public String toString() {
            return "Address(city=" + this.f26371a + ", country=" + this.f26372b + ", line1=" + this.f26373c + ", line2=" + this.f26374d + ", postalCode=" + this.f26375e + ", state=" + this.f26376f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26371a);
            out.writeString(this.f26372b);
            out.writeString(this.f26373c);
            out.writeString(this.f26374d);
            out.writeString(this.f26375e);
            out.writeString(this.f26376f);
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26418a;

        /* renamed from: b, reason: collision with root package name */
        private final i f26419b;

        /* renamed from: c, reason: collision with root package name */
        private final k f26420c;

        /* renamed from: d, reason: collision with root package name */
        private final ColorStateList f26421d;

        /* renamed from: e, reason: collision with root package name */
        private final c f26422e;

        /* renamed from: f, reason: collision with root package name */
        private final C3686a f26423f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f26424g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f26425h;

        /* renamed from: i, reason: collision with root package name */
        private final b f26426i;

        /* renamed from: j, reason: collision with root package name */
        private final String f26427j;

        /* renamed from: k, reason: collision with root package name */
        private final d f26428k;

        /* renamed from: l, reason: collision with root package name */
        private final List f26429l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f26430m;

        /* renamed from: n, reason: collision with root package name */
        private final List f26431n;

        /* renamed from: o, reason: collision with root package name */
        private final List f26432o;

        /* renamed from: p, reason: collision with root package name */
        private final n f26433p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f26416q = new a(null);

        /* renamed from: r, reason: collision with root package name */
        public static final int f26417r = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final g a(Context context) {
                AbstractC3159y.i(context, "context");
                return new g(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                i createFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
                k createFromParcel2 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
                ColorStateList colorStateList = (ColorStateList) parcel.readParcelable(g.class.getClassLoader());
                c createFromParcel3 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                C3686a createFromParcel4 = parcel.readInt() != 0 ? C3686a.CREATOR.createFromParcel(parcel) : null;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                b createFromParcel5 = b.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                d createFromParcel6 = d.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC1870e.valueOf(parcel.readString()));
                }
                return new g(readString, createFromParcel, createFromParcel2, colorStateList, createFromParcel3, createFromParcel4, z8, z9, createFromParcel5, readString2, createFromParcel6, arrayList, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks, boolean z10, List paymentMethodOrder, List externalPaymentMethods, n paymentMethodLayout) {
            AbstractC3159y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3159y.i(appearance, "appearance");
            AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3159y.i(preferredNetworks, "preferredNetworks");
            AbstractC3159y.i(paymentMethodOrder, "paymentMethodOrder");
            AbstractC3159y.i(externalPaymentMethods, "externalPaymentMethods");
            AbstractC3159y.i(paymentMethodLayout, "paymentMethodLayout");
            this.f26418a = merchantDisplayName;
            this.f26419b = iVar;
            this.f26420c = kVar;
            this.f26421d = colorStateList;
            this.f26422e = cVar;
            this.f26423f = c3686a;
            this.f26424g = z8;
            this.f26425h = z9;
            this.f26426i = appearance;
            this.f26427j = str;
            this.f26428k = billingDetailsCollectionConfiguration;
            this.f26429l = preferredNetworks;
            this.f26430m = z10;
            this.f26431n = paymentMethodOrder;
            this.f26432o = externalPaymentMethods;
            this.f26433p = paymentMethodLayout;
        }

        public final List G() {
            return this.f26429l;
        }

        public final ColorStateList I() {
            return this.f26421d;
        }

        public final String L() {
            return this.f26427j;
        }

        public final boolean b() {
            return this.f26424g;
        }

        public final boolean c() {
            return this.f26425h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return this.f26430m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3159y.d(this.f26418a, gVar.f26418a) && AbstractC3159y.d(this.f26419b, gVar.f26419b) && AbstractC3159y.d(this.f26420c, gVar.f26420c) && AbstractC3159y.d(this.f26421d, gVar.f26421d) && AbstractC3159y.d(this.f26422e, gVar.f26422e) && AbstractC3159y.d(this.f26423f, gVar.f26423f) && this.f26424g == gVar.f26424g && this.f26425h == gVar.f26425h && AbstractC3159y.d(this.f26426i, gVar.f26426i) && AbstractC3159y.d(this.f26427j, gVar.f26427j) && AbstractC3159y.d(this.f26428k, gVar.f26428k) && AbstractC3159y.d(this.f26429l, gVar.f26429l) && this.f26430m == gVar.f26430m && AbstractC3159y.d(this.f26431n, gVar.f26431n) && AbstractC3159y.d(this.f26432o, gVar.f26432o) && this.f26433p == gVar.f26433p;
        }

        public final b f() {
            return this.f26426i;
        }

        public int hashCode() {
            int hashCode = this.f26418a.hashCode() * 31;
            i iVar = this.f26419b;
            int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            k kVar = this.f26420c;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            ColorStateList colorStateList = this.f26421d;
            int hashCode4 = (hashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            c cVar = this.f26422e;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            C3686a c3686a = this.f26423f;
            int hashCode6 = (((((((hashCode5 + (c3686a == null ? 0 : c3686a.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26424g)) * 31) + androidx.compose.foundation.a.a(this.f26425h)) * 31) + this.f26426i.hashCode()) * 31;
            String str = this.f26427j;
            return ((((((((((((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.f26428k.hashCode()) * 31) + this.f26429l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f26430m)) * 31) + this.f26431n.hashCode()) * 31) + this.f26432o.hashCode()) * 31) + this.f26433p.hashCode();
        }

        public final d i() {
            return this.f26428k;
        }

        public final i j() {
            return this.f26419b;
        }

        public final c k() {
            return this.f26422e;
        }

        public final List n() {
            return this.f26432o;
        }

        public final k o() {
            return this.f26420c;
        }

        public final String s() {
            return this.f26418a;
        }

        public final C3686a t() {
            return this.f26423f;
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.f26418a + ", customer=" + this.f26419b + ", googlePay=" + this.f26420c + ", primaryButtonColor=" + this.f26421d + ", defaultBillingDetails=" + this.f26422e + ", shippingDetails=" + this.f26423f + ", allowsDelayedPaymentMethods=" + this.f26424g + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f26425h + ", appearance=" + this.f26426i + ", primaryButtonLabel=" + this.f26427j + ", billingDetailsCollectionConfiguration=" + this.f26428k + ", preferredNetworks=" + this.f26429l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f26430m + ", paymentMethodOrder=" + this.f26431n + ", externalPaymentMethods=" + this.f26432o + ", paymentMethodLayout=" + this.f26433p + ")";
        }

        public final n u() {
            return this.f26433p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26418a);
            i iVar = this.f26419b;
            if (iVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                iVar.writeToParcel(out, i8);
            }
            k kVar = this.f26420c;
            if (kVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                kVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f26421d, i8);
            c cVar = this.f26422e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            C3686a c3686a = this.f26423f;
            if (c3686a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c3686a.writeToParcel(out, i8);
            }
            out.writeInt(this.f26424g ? 1 : 0);
            out.writeInt(this.f26425h ? 1 : 0);
            this.f26426i.writeToParcel(out, i8);
            out.writeString(this.f26427j);
            this.f26428k.writeToParcel(out, i8);
            List list = this.f26429l;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC1870e) it.next()).name());
            }
            out.writeInt(this.f26430m ? 1 : 0);
            out.writeStringList(this.f26431n);
            out.writeStringList(this.f26432o);
            out.writeString(this.f26433p.name());
        }

        public final List z() {
            return this.f26431n;
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, boolean z10, List list2, List list3, n nVar, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? C3451a.f35983a.d() : iVar, (i8 & 4) != 0 ? C3451a.f35983a.f() : kVar, (i8 & 8) != 0 ? C3451a.f35983a.i() : colorStateList, (i8 & 16) != 0 ? C3451a.f35983a.b() : cVar, (i8 & 32) != 0 ? C3451a.f35983a.k() : c3686a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3451a.f35983a.a() : bVar, (i8 & 512) != 0 ? C3451a.f35983a.j() : str2, (i8 & 1024) != 0 ? C3451a.f35983a.c() : dVar, (i8 & 2048) != 0 ? C3451a.f35983a.h() : list, (i8 & 4096) != 0 ? true : z10, (i8 & 8192) != 0 ? C3451a.f35983a.g() : list2, (i8 & 16384) != 0 ? C3451a.f35983a.e() : list3, (i8 & 32768) != 0 ? n.f26491a.a() : nVar);
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? C3451a.f35983a.d() : iVar, (i8 & 4) != 0 ? C3451a.f35983a.f() : kVar, (i8 & 8) != 0 ? C3451a.f35983a.i() : colorStateList, (i8 & 16) != 0 ? C3451a.f35983a.b() : cVar, (i8 & 32) != 0 ? C3451a.f35983a.k() : c3686a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3451a.f35983a.a() : bVar, (i8 & 512) != 0 ? C3451a.f35983a.j() : str2, (i8 & 1024) != 0 ? C3451a.f35983a.c() : dVar, (i8 & 2048) != 0 ? C3451a.f35983a.h() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C3686a c3686a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks) {
            this(merchantDisplayName, iVar, kVar, colorStateList, cVar, c3686a, z8, z9, appearance, str, billingDetailsCollectionConfiguration, preferredNetworks, true, null, C3451a.f35983a.e(), null, 40960, null);
            AbstractC3159y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3159y.i(appearance, "appearance");
            AbstractC3159y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3159y.i(preferredNetworks, "preferredNetworks");
        }
    }
}
