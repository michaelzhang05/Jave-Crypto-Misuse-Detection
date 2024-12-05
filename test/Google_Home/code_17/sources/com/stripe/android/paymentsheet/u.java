package com.stripe.android.paymentsheet;

import P5.AbstractC1378t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.ColorKt;
import com.stripe.android.googlepaylauncher.h;
import e3.EnumC2791e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m4.C3440l;
import q2.C3830a;
import u3.C4059a;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final f f27423b = new f(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f27424c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final w f27425a;

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {

        /* renamed from: m, reason: collision with root package name */
        private static final e f27458m;

        /* renamed from: n, reason: collision with root package name */
        private static final e f27459n;

        /* renamed from: a, reason: collision with root package name */
        private final int f27460a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27461b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27462c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27463d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27464e;

        /* renamed from: f, reason: collision with root package name */
        private final int f27465f;

        /* renamed from: g, reason: collision with root package name */
        private final int f27466g;

        /* renamed from: h, reason: collision with root package name */
        private final int f27467h;

        /* renamed from: i, reason: collision with root package name */
        private final int f27468i;

        /* renamed from: j, reason: collision with root package name */
        private final int f27469j;

        /* renamed from: k, reason: collision with root package name */
        private final int f27470k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f27457l = new a(null);
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final e a() {
                return e.f27459n;
            }

            public final e b() {
                return e.f27458m;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        static {
            C3440l c3440l = C3440l.f35212a;
            f27458m = new e(c3440l.c().g().m1183getPrimary0d7_KjU(), c3440l.c().g().m1187getSurface0d7_KjU(), c3440l.c().d(), c3440l.c().e(), c3440l.c().f(), c3440l.c().h(), c3440l.c().j(), c3440l.c().i(), c3440l.c().g().m1182getOnSurface0d7_KjU(), c3440l.c().c(), c3440l.c().g().m1177getError0d7_KjU(), null);
            f27459n = new e(c3440l.b().g().m1183getPrimary0d7_KjU(), c3440l.b().g().m1187getSurface0d7_KjU(), c3440l.b().d(), c3440l.b().e(), c3440l.b().f(), c3440l.b().h(), c3440l.b().j(), c3440l.b().i(), c3440l.b().g().m1182getOnSurface0d7_KjU(), c3440l.b().c(), c3440l.b().g().m1177getError0d7_KjU(), null);
        }

        public /* synthetic */ e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC3247p abstractC3247p) {
            this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f27460a == eVar.f27460a && this.f27461b == eVar.f27461b && this.f27462c == eVar.f27462c && this.f27463d == eVar.f27463d && this.f27464e == eVar.f27464e && this.f27465f == eVar.f27465f && this.f27466g == eVar.f27466g && this.f27467h == eVar.f27467h && this.f27468i == eVar.f27468i && this.f27469j == eVar.f27469j && this.f27470k == eVar.f27470k;
        }

        public final int g() {
            return this.f27469j;
        }

        public final int h() {
            return this.f27462c;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f27460a * 31) + this.f27461b) * 31) + this.f27462c) * 31) + this.f27463d) * 31) + this.f27464e) * 31) + this.f27465f) * 31) + this.f27466g) * 31) + this.f27467h) * 31) + this.f27468i) * 31) + this.f27469j) * 31) + this.f27470k;
        }

        public final int i() {
            return this.f27463d;
        }

        public final int l() {
            return this.f27464e;
        }

        public final int p() {
            return this.f27470k;
        }

        public final int s() {
            return this.f27465f;
        }

        public String toString() {
            return "Colors(primary=" + this.f27460a + ", surface=" + this.f27461b + ", component=" + this.f27462c + ", componentBorder=" + this.f27463d + ", componentDivider=" + this.f27464e + ", onComponent=" + this.f27465f + ", onSurface=" + this.f27466g + ", subtitle=" + this.f27467h + ", placeholderText=" + this.f27468i + ", appBarIcon=" + this.f27469j + ", error=" + this.f27470k + ")";
        }

        public final int u() {
            return this.f27466g;
        }

        public final int v() {
            return this.f27468i;
        }

        public final int w() {
            return this.f27460a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f27460a);
            out.writeInt(this.f27461b);
            out.writeInt(this.f27462c);
            out.writeInt(this.f27463d);
            out.writeInt(this.f27464e);
            out.writeInt(this.f27465f);
            out.writeInt(this.f27466g);
            out.writeInt(this.f27467h);
            out.writeInt(this.f27468i);
            out.writeInt(this.f27469j);
            out.writeInt(this.f27470k);
        }

        public final int x() {
            return this.f27467h;
        }

        public final int y() {
            return this.f27461b;
        }

        public e(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f27460a = i8;
            this.f27461b = i9;
            this.f27462c = i10;
            this.f27463d = i11;
            this.f27464e = i12;
            this.f27465f = i13;
            this.f27466g = i14;
            this.f27467h = i15;
            this.f27468i = i16;
            this.f27469j = i17;
            this.f27470k = i18;
        }

        private e(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
            this(ColorKt.m3030toArgb8_81llA(j8), ColorKt.m3030toArgb8_81llA(j9), ColorKt.m3030toArgb8_81llA(j10), ColorKt.m3030toArgb8_81llA(j11), ColorKt.m3030toArgb8_81llA(j12), ColorKt.m3030toArgb8_81llA(j13), ColorKt.m3030toArgb8_81llA(j16), ColorKt.m3030toArgb8_81llA(j14), ColorKt.m3030toArgb8_81llA(j15), ColorKt.m3030toArgb8_81llA(j17), ColorKt.m3030toArgb8_81llA(j18));
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface h extends Parcelable {

        /* loaded from: classes4.dex */
        public static final class a implements h {
            public static final Parcelable.Creator<a> CREATOR = new C0646a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27489a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27490b;

            /* renamed from: com.stripe.android.paymentsheet.u$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0646a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String customerSessionClientSecret) {
                AbstractC3255y.i(customerSessionClientSecret, "customerSessionClientSecret");
                this.f27489a = customerSessionClientSecret;
                this.f27490b = "customer_session";
            }

            public final String I() {
                return this.f27489a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3255y.d(this.f27489a, ((a) obj).f27489a);
            }

            @Override // com.stripe.android.paymentsheet.u.h
            public String f() {
                return this.f27490b;
            }

            public int hashCode() {
                return this.f27489a.hashCode();
            }

            public String toString() {
                return "CustomerSession(customerSessionClientSecret=" + this.f27489a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f27489a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements h {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27491a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27492b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(String ephemeralKeySecret) {
                AbstractC3255y.i(ephemeralKeySecret, "ephemeralKeySecret");
                this.f27491a = ephemeralKeySecret;
                this.f27492b = "legacy";
            }

            public final String a() {
                return this.f27491a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3255y.d(this.f27491a, ((b) obj).f27491a);
            }

            @Override // com.stripe.android.paymentsheet.u.h
            public String f() {
                return this.f27492b;
            }

            public int hashCode() {
                return this.f27491a.hashCode();
            }

            public String toString() {
                return "LegacyCustomerEphemeralKey(ephemeralKeySecret=" + this.f27491a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f27491a);
            }
        }

        String f();
    }

    /* loaded from: classes4.dex */
    public static final class i implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27495a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27496b;

        /* renamed from: c, reason: collision with root package name */
        private final h f27497c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f27493d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f27494e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
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
            public final i createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new i(parcel.readString(), parcel.readString(), (h) parcel.readParcelable(i.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String id, String ephemeralKeySecret, h accessType) {
            AbstractC3255y.i(id, "id");
            AbstractC3255y.i(ephemeralKeySecret, "ephemeralKeySecret");
            AbstractC3255y.i(accessType, "accessType");
            this.f27495a = id;
            this.f27496b = ephemeralKeySecret;
            this.f27497c = accessType;
        }

        public final h a() {
            return this.f27497c;
        }

        public final String b() {
            return this.f27496b;
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
            return AbstractC3255y.d(this.f27495a, iVar.f27495a) && AbstractC3255y.d(this.f27496b, iVar.f27496b) && AbstractC3255y.d(this.f27497c, iVar.f27497c);
        }

        public final String getId() {
            return this.f27495a;
        }

        public int hashCode() {
            return (((this.f27495a.hashCode() * 31) + this.f27496b.hashCode()) * 31) + this.f27497c.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.f27495a + ", ephemeralKeySecret=" + this.f27496b + ", accessType=" + this.f27497c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27495a);
            out.writeString(this.f27496b);
            out.writeParcelable(this.f27497c, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27498a = a.f27499a;

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f27499a = new a();

            /* renamed from: b, reason: collision with root package name */
            private static com.stripe.android.paymentsheet.h f27500b;

            private a() {
            }

            public final void a(com.stripe.android.paymentsheet.h hVar) {
                f27500b = hVar;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final c f27501a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27502b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27503c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f27504d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27505e;

        /* renamed from: f, reason: collision with root package name */
        private final a f27506f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27507a = new a("Buy", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f27508b = new a("Book", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f27509c = new a("Checkout", 2);

            /* renamed from: d, reason: collision with root package name */
            public static final a f27510d = new a("Donate", 3);

            /* renamed from: e, reason: collision with root package name */
            public static final a f27511e = new a("Order", 4);

            /* renamed from: f, reason: collision with root package name */
            public static final a f27512f = new a("Pay", 5);

            /* renamed from: g, reason: collision with root package name */
            public static final a f27513g = new a("Subscribe", 6);

            /* renamed from: h, reason: collision with root package name */
            public static final a f27514h = new a("Plain", 7);

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ a[] f27515i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ U5.a f27516j;

            static {
                a[] a8 = a();
                f27515i = a8;
                f27516j = U5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27507a, f27508b, f27509c, f27510d, f27511e, f27512f, f27513g, f27514h};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27515i.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            public static final c f27517a = new c("Production", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final c f27518b = new c("Test", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ c[] f27519c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ U5.a f27520d;

            static {
                c[] a8 = a();
                f27519c = a8;
                f27520d = U5.b.a(a8);
            }

            private c(String str, int i8) {
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f27517a, f27518b};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f27519c.clone();
            }
        }

        public k(c environment, String countryCode, String str, Long l8, String str2, a buttonType) {
            AbstractC3255y.i(environment, "environment");
            AbstractC3255y.i(countryCode, "countryCode");
            AbstractC3255y.i(buttonType, "buttonType");
            this.f27501a = environment;
            this.f27502b = countryCode;
            this.f27503c = str;
            this.f27504d = l8;
            this.f27505e = str2;
            this.f27506f = buttonType;
        }

        public final Long a() {
            return this.f27504d;
        }

        public final a b() {
            return this.f27506f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f27501a == kVar.f27501a && AbstractC3255y.d(this.f27502b, kVar.f27502b) && AbstractC3255y.d(this.f27503c, kVar.f27503c) && AbstractC3255y.d(this.f27504d, kVar.f27504d) && AbstractC3255y.d(this.f27505e, kVar.f27505e) && this.f27506f == kVar.f27506f;
        }

        public final String g() {
            return this.f27503c;
        }

        public final c h() {
            return this.f27501a;
        }

        public int hashCode() {
            int hashCode = ((this.f27501a.hashCode() * 31) + this.f27502b.hashCode()) * 31;
            String str = this.f27503c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l8 = this.f27504d;
            int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
            String str2 = this.f27505e;
            return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f27506f.hashCode();
        }

        public final String i() {
            return this.f27505e;
        }

        public final String m() {
            return this.f27502b;
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.f27501a + ", countryCode=" + this.f27502b + ", currencyCode=" + this.f27503c + ", amount=" + this.f27504d + ", label=" + this.f27505e + ", buttonType=" + this.f27506f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27501a.name());
            out.writeString(this.f27502b);
            out.writeString(this.f27503c);
            Long l8 = this.f27504d;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f27505e);
            out.writeString(this.f27506f.name());
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class l implements Parcelable {

        /* loaded from: classes4.dex */
        public static final class a extends l {
            public static final Parcelable.Creator<a> CREATOR = new C0647a();

            /* renamed from: a, reason: collision with root package name */
            private final m f27521a;

            /* renamed from: com.stripe.android.paymentsheet.u$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0647a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
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
                AbstractC3255y.i(intentConfiguration, "intentConfiguration");
                this.f27521a = intentConfiguration;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void a() {
            }

            public final m b() {
                return this.f27521a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC3255y.d(this.f27521a, ((a) obj).f27521a);
            }

            public int hashCode() {
                return this.f27521a.hashCode();
            }

            public String toString() {
                return "DeferredIntent(intentConfiguration=" + this.f27521a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                this.f27521a.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends l {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27522a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
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
                AbstractC3255y.i(clientSecret, "clientSecret");
                this.f27522a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void a() {
                new B3.e(this.f27522a).b();
            }

            public final String d() {
                return this.f27522a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3255y.d(this.f27522a, ((b) obj).f27522a);
            }

            public int hashCode() {
                return this.f27522a.hashCode();
            }

            public String toString() {
                return "PaymentIntent(clientSecret=" + this.f27522a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f27522a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends l {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f27523a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
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
            public c(String clientSecret) {
                super(null);
                AbstractC3255y.i(clientSecret, "clientSecret");
                this.f27523a = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.u.l
            public void a() {
                new B3.k(this.f27523a).b();
            }

            public final String d() {
                return this.f27523a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3255y.d(this.f27523a, ((c) obj).f27523a);
            }

            public int hashCode() {
                return this.f27523a.hashCode();
            }

            public String toString() {
                return "SetupIntent(clientSecret=" + this.f27523a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f27523a);
            }
        }

        private l() {
        }

        public abstract void a();

        public /* synthetic */ l(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27546a;

        /* renamed from: b, reason: collision with root package name */
        private static final n f27547b;

        /* renamed from: c, reason: collision with root package name */
        public static final n f27548c;

        /* renamed from: d, reason: collision with root package name */
        public static final n f27549d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ n[] f27550e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f27551f;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final n a() {
                return n.f27547b;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            n nVar = new n("Horizontal", 0);
            f27548c = nVar;
            f27549d = new n("Vertical", 1);
            n[] a8 = a();
            f27550e = a8;
            f27551f = U5.b.a(a8);
            f27546a = new a(null);
            f27547b = nVar;
        }

        private n(String str, int i8) {
        }

        private static final /* synthetic */ n[] a() {
            return new n[]{f27548c, f27549d};
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) f27550e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: g, reason: collision with root package name */
        private static final p f27557g;

        /* renamed from: h, reason: collision with root package name */
        private static final p f27558h;

        /* renamed from: a, reason: collision with root package name */
        private final Integer f27559a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27560b;

        /* renamed from: c, reason: collision with root package name */
        private final int f27561c;

        /* renamed from: d, reason: collision with root package name */
        private final int f27562d;

        /* renamed from: e, reason: collision with root package name */
        private final int f27563e;

        /* renamed from: f, reason: collision with root package name */
        public static final a f27556f = new a(null);
        public static final Parcelable.Creator<p> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final p a() {
                return p.f27558h;
            }

            public final p b() {
                return p.f27557g;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new p(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        static {
            C3440l c3440l = C3440l.f35212a;
            f27557g = new p(null, ColorKt.m3030toArgb8_81llA(c3440l.d().c().c()), ColorKt.m3030toArgb8_81llA(c3440l.d().c().b()), ColorKt.m3030toArgb8_81llA(c3440l.d().c().e()), ColorKt.m3030toArgb8_81llA(c3440l.d().c().c()));
            f27558h = new p(null, ColorKt.m3030toArgb8_81llA(c3440l.d().b().c()), ColorKt.m3030toArgb8_81llA(c3440l.d().b().b()), ColorKt.m3030toArgb8_81llA(c3440l.d().b().e()), ColorKt.m3030toArgb8_81llA(c3440l.d().b().c()));
        }

        public p(Integer num, int i8, int i9, int i10, int i11) {
            this.f27559a = num;
            this.f27560b = i8;
            this.f27561c = i9;
            this.f27562d = i10;
            this.f27563e = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return AbstractC3255y.d(this.f27559a, pVar.f27559a) && this.f27560b == pVar.f27560b && this.f27561c == pVar.f27561c && this.f27562d == pVar.f27562d && this.f27563e == pVar.f27563e;
        }

        public final Integer g() {
            return this.f27559a;
        }

        public final int h() {
            return this.f27561c;
        }

        public int hashCode() {
            Integer num = this.f27559a;
            return ((((((((num == null ? 0 : num.hashCode()) * 31) + this.f27560b) * 31) + this.f27561c) * 31) + this.f27562d) * 31) + this.f27563e;
        }

        public final int i() {
            return this.f27560b;
        }

        public final int l() {
            return this.f27563e;
        }

        public final int p() {
            return this.f27562d;
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.f27559a + ", onBackground=" + this.f27560b + ", border=" + this.f27561c + ", successBackgroundColor=" + this.f27562d + ", onSuccessBackgroundColor=" + this.f27563e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            Integer num = this.f27559a;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f27560b);
            out.writeInt(this.f27561c);
            out.writeInt(this.f27562d);
            out.writeInt(this.f27563e);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final s f27569d;

        /* renamed from: a, reason: collision with root package name */
        private final float f27570a;

        /* renamed from: b, reason: collision with root package name */
        private final float f27571b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f27568c = new a(null);
        public static final Parcelable.Creator<s> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final s a() {
                return s.f27569d;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new s(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        static {
            C3440l c3440l = C3440l.f35212a;
            f27569d = new s(c3440l.e().e(), c3440l.e().c());
        }

        public s(float f8, float f9) {
            this.f27570a = f8;
            this.f27571b = f9;
        }

        public final float b() {
            return this.f27571b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Float.compare(this.f27570a, sVar.f27570a) == 0 && Float.compare(this.f27571b, sVar.f27571b) == 0;
        }

        public final float g() {
            return this.f27570a;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f27570a) * 31) + Float.floatToIntBits(this.f27571b);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.f27570a + ", borderStrokeWidthDp=" + this.f27571b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeFloat(this.f27570a);
            out.writeFloat(this.f27571b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements Parcelable {

        /* renamed from: d, reason: collision with root package name */
        private static final t f27573d;

        /* renamed from: a, reason: collision with root package name */
        private final float f27574a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f27575b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f27572c = new a(null);
        public static final Parcelable.Creator<t> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final t a() {
                return t.f27573d;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new t(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final t[] newArray(int i8) {
                return new t[i8];
            }
        }

        static {
            C3440l c3440l = C3440l.f35212a;
            f27573d = new t(c3440l.f().g(), c3440l.f().f());
        }

        public t(float f8, Integer num) {
            this.f27574a = f8;
            this.f27575b = num;
        }

        public final Integer b() {
            return this.f27575b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return Float.compare(this.f27574a, tVar.f27574a) == 0 && AbstractC3255y.d(this.f27575b, tVar.f27575b);
        }

        public final float g() {
            return this.f27574a;
        }

        public int hashCode() {
            int hashCode;
            int floatToIntBits = Float.floatToIntBits(this.f27574a) * 31;
            Integer num = this.f27575b;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return floatToIntBits + hashCode;
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.f27574a + ", fontResId=" + this.f27575b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            out.writeFloat(this.f27574a);
            Integer num = this.f27575b;
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
        AbstractC3255y.i(paymentSheetLauncher, "paymentSheetLauncher");
        this.f27425a = paymentSheetLauncher;
    }

    public final void a(String paymentIntentClientSecret, g gVar) {
        AbstractC3255y.i(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.f27425a.a(new l.b(paymentIntentClientSecret), gVar);
    }

    /* loaded from: classes4.dex */
    public static final class q implements Parcelable {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Float f27564a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f27565b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new q(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i8) {
                return new q[i8];
            }
        }

        public q(Float f8, Float f9) {
            this.f27564a = f8;
            this.f27565b = f9;
        }

        public final Float a() {
            return this.f27565b;
        }

        public final Float b() {
            return this.f27564a;
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
            return AbstractC3255y.d(this.f27564a, qVar.f27564a) && AbstractC3255y.d(this.f27565b, qVar.f27565b);
        }

        public int hashCode() {
            Float f8 = this.f27564a;
            int hashCode = (f8 == null ? 0 : f8.hashCode()) * 31;
            Float f9 = this.f27565b;
            return hashCode + (f9 != null ? f9.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.f27564a + ", borderStrokeWidthDp=" + this.f27565b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            Float f8 = this.f27564a;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
            Float f9 = this.f27565b;
            if (f9 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f9.floatValue());
            }
        }

        public /* synthetic */ q(Float f8, Float f9, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : f8, (i8 & 2) != 0 ? null : f9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class r implements Parcelable {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Integer f27566a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f27567b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new r(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        public r(Integer num, Float f8) {
            this.f27566a = num;
            this.f27567b = f8;
        }

        public final Integer a() {
            return this.f27566a;
        }

        public final Float b() {
            return this.f27567b;
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
            return AbstractC3255y.d(this.f27566a, rVar.f27566a) && AbstractC3255y.d(this.f27567b, rVar.f27567b);
        }

        public int hashCode() {
            Integer num = this.f27566a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f8 = this.f27567b;
            return hashCode + (f8 != null ? f8.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.f27566a + ", fontSizeSp=" + this.f27567b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            Integer num = this.f27566a;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Float f8 = this.f27567b;
            if (f8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f8.floatValue());
            }
        }

        public /* synthetic */ r(Integer num, Float f8, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : f8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(ComponentActivity activity, t3.p callback) {
        this(new C2627b(activity, callback));
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(callback, "callback");
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final a f27437a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27438b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27439c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27440d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(a aVar, String str, String str2, String str3) {
            this.f27437a = aVar;
            this.f27438b = str;
            this.f27439c = str2;
            this.f27440d = str3;
        }

        public final a a() {
            return this.f27437a;
        }

        public final String b() {
            return this.f27438b;
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
            return AbstractC3255y.d(this.f27437a, cVar.f27437a) && AbstractC3255y.d(this.f27438b, cVar.f27438b) && AbstractC3255y.d(this.f27439c, cVar.f27439c) && AbstractC3255y.d(this.f27440d, cVar.f27440d);
        }

        public final String g() {
            return this.f27439c;
        }

        public final String h() {
            return this.f27440d;
        }

        public int hashCode() {
            a aVar = this.f27437a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f27438b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f27439c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f27440d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean i() {
            if (this.f27437a == null && this.f27438b == null && this.f27439c == null && this.f27440d == null) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "BillingDetails(address=" + this.f27437a + ", email=" + this.f27438b + ", name=" + this.f27439c + ", phone=" + this.f27440d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            a aVar = this.f27437a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f27438b);
            out.writeString(this.f27439c);
            out.writeString(this.f27440d);
        }

        public /* synthetic */ c(a aVar, String str, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements Parcelable {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final p f27552a;

        /* renamed from: b, reason: collision with root package name */
        private final p f27553b;

        /* renamed from: c, reason: collision with root package name */
        private final q f27554c;

        /* renamed from: d, reason: collision with root package name */
        private final r f27555d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            AbstractC3255y.i(colorsLight, "colorsLight");
            AbstractC3255y.i(colorsDark, "colorsDark");
            AbstractC3255y.i(shape, "shape");
            AbstractC3255y.i(typography, "typography");
            this.f27552a = colorsLight;
            this.f27553b = colorsDark;
            this.f27554c = shape;
            this.f27555d = typography;
        }

        public final p a() {
            return this.f27553b;
        }

        public final p b() {
            return this.f27552a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return AbstractC3255y.d(this.f27552a, oVar.f27552a) && AbstractC3255y.d(this.f27553b, oVar.f27553b) && AbstractC3255y.d(this.f27554c, oVar.f27554c) && AbstractC3255y.d(this.f27555d, oVar.f27555d);
        }

        public final q g() {
            return this.f27554c;
        }

        public final r h() {
            return this.f27555d;
        }

        public int hashCode() {
            return (((((this.f27552a.hashCode() * 31) + this.f27553b.hashCode()) * 31) + this.f27554c.hashCode()) * 31) + this.f27555d.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.f27552a + ", colorsDark=" + this.f27553b + ", shape=" + this.f27554c + ", typography=" + this.f27555d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27552a.writeToParcel(out, i8);
            this.f27553b.writeToParcel(out, i8);
            this.f27554c.writeToParcel(out, i8);
            this.f27555d.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ o(com.stripe.android.paymentsheet.u.p r3, com.stripe.android.paymentsheet.u.p r4, com.stripe.android.paymentsheet.u.q r5, com.stripe.android.paymentsheet.u.r r6, int r7, kotlin.jvm.internal.AbstractC3247p r8) {
            /*
                r2 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                com.stripe.android.paymentsheet.u$p$a r3 = com.stripe.android.paymentsheet.u.p.f27556f
                com.stripe.android.paymentsheet.u$p r3 = r3.b()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L14
                com.stripe.android.paymentsheet.u$p$a r4 = com.stripe.android.paymentsheet.u.p.f27556f
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
        private final e f27432a;

        /* renamed from: b, reason: collision with root package name */
        private final e f27433b;

        /* renamed from: c, reason: collision with root package name */
        private final s f27434c;

        /* renamed from: d, reason: collision with root package name */
        private final t f27435d;

        /* renamed from: e, reason: collision with root package name */
        private final o f27436e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            AbstractC3255y.i(colorsLight, "colorsLight");
            AbstractC3255y.i(colorsDark, "colorsDark");
            AbstractC3255y.i(shapes, "shapes");
            AbstractC3255y.i(typography, "typography");
            AbstractC3255y.i(primaryButton, "primaryButton");
            this.f27432a = colorsLight;
            this.f27433b = colorsDark;
            this.f27434c = shapes;
            this.f27435d = typography;
            this.f27436e = primaryButton;
        }

        public final e a() {
            return this.f27433b;
        }

        public final e b() {
            return this.f27432a;
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
            return AbstractC3255y.d(this.f27432a, bVar.f27432a) && AbstractC3255y.d(this.f27433b, bVar.f27433b) && AbstractC3255y.d(this.f27434c, bVar.f27434c) && AbstractC3255y.d(this.f27435d, bVar.f27435d) && AbstractC3255y.d(this.f27436e, bVar.f27436e);
        }

        public final o g() {
            return this.f27436e;
        }

        public final s h() {
            return this.f27434c;
        }

        public int hashCode() {
            return (((((((this.f27432a.hashCode() * 31) + this.f27433b.hashCode()) * 31) + this.f27434c.hashCode()) * 31) + this.f27435d.hashCode()) * 31) + this.f27436e.hashCode();
        }

        public final t i() {
            return this.f27435d;
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.f27432a + ", colorsDark=" + this.f27433b + ", shapes=" + this.f27434c + ", typography=" + this.f27435d + ", primaryButton=" + this.f27436e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27432a.writeToParcel(out, i8);
            this.f27433b.writeToParcel(out, i8);
            this.f27434c.writeToParcel(out, i8);
            this.f27435d.writeToParcel(out, i8);
            this.f27436e.writeToParcel(out, i8);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b() {
            /*
                r13 = this;
                com.stripe.android.paymentsheet.u$e$a r0 = com.stripe.android.paymentsheet.u.e.f27457l
                com.stripe.android.paymentsheet.u$e r2 = r0.b()
                com.stripe.android.paymentsheet.u$e r3 = r0.a()
                com.stripe.android.paymentsheet.u$s$a r0 = com.stripe.android.paymentsheet.u.s.f27568c
                com.stripe.android.paymentsheet.u$s r4 = r0.a()
                com.stripe.android.paymentsheet.u$t$a r0 = com.stripe.android.paymentsheet.u.t.f27572c
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
        private final b f27441a;

        /* renamed from: b, reason: collision with root package name */
        private final b f27442b;

        /* renamed from: c, reason: collision with root package name */
        private final b f27443c;

        /* renamed from: d, reason: collision with root package name */
        private final a f27444d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27445e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27446a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f27447b = new a("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f27448c = new a("Full", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f27449d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f27450e;

            static {
                a[] a8 = a();
                f27449d = a8;
                f27450e = U5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27446a, f27447b, f27448c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27449d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f27451a = new b("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final b f27452b = new b("Never", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final b f27453c = new b("Always", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f27454d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f27455e;

            static {
                b[] a8 = a();
                f27454d = a8;
                f27455e = U5.b.a(a8);
            }

            private b(String str, int i8) {
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f27451a, f27452b, f27453c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f27454d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
        public /* synthetic */ class C0645d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27456a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f27447b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f27446a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.f27448c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27456a = iArr;
            }
        }

        public d(b name, b phone, b email, a address, boolean z8) {
            AbstractC3255y.i(name, "name");
            AbstractC3255y.i(phone, "phone");
            AbstractC3255y.i(email, "email");
            AbstractC3255y.i(address, "address");
            this.f27441a = name;
            this.f27442b = phone;
            this.f27443c = email;
            this.f27444d = address;
            this.f27445e = z8;
        }

        public final a a() {
            return this.f27444d;
        }

        public final boolean b() {
            return this.f27445e;
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
            return this.f27441a == dVar.f27441a && this.f27442b == dVar.f27442b && this.f27443c == dVar.f27443c && this.f27444d == dVar.f27444d && this.f27445e == dVar.f27445e;
        }

        public final boolean g() {
            b bVar = this.f27441a;
            b bVar2 = b.f27453c;
            if (bVar != bVar2 && this.f27442b != bVar2 && this.f27443c != bVar2 && this.f27444d != a.f27448c) {
                return false;
            }
            return true;
        }

        public final boolean h() {
            if (this.f27443c == b.f27453c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f27441a.hashCode() * 31) + this.f27442b.hashCode()) * 31) + this.f27443c.hashCode()) * 31) + this.f27444d.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27445e);
        }

        public final boolean i() {
            if (this.f27441a == b.f27453c) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if (this.f27442b == b.f27453c) {
                return true;
            }
            return false;
        }

        public final b p() {
            return this.f27443c;
        }

        public final b s() {
            return this.f27441a;
        }

        public String toString() {
            return "BillingDetailsCollectionConfiguration(name=" + this.f27441a + ", phone=" + this.f27442b + ", email=" + this.f27443c + ", address=" + this.f27444d + ", attachDefaultsToPaymentMethod=" + this.f27445e + ")";
        }

        public final b u() {
            return this.f27442b;
        }

        public final h.b v() {
            boolean z8;
            boolean z9;
            h.b.EnumC0472b enumC0472b;
            a aVar = this.f27444d;
            boolean z10 = false;
            if (aVar == a.f27448c) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f27442b == b.f27453c) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i8 = C0645d.f27456a[aVar.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    enumC0472b = h.b.EnumC0472b.f24988c;
                } else {
                    throw new O5.p();
                }
            } else {
                enumC0472b = h.b.EnumC0472b.f24987b;
            }
            if (z8 || z9) {
                z10 = true;
            }
            return new h.b(z10, enumC0472b, z9);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27441a.name());
            out.writeString(this.f27442b.name());
            out.writeString(this.f27443c.name());
            out.writeString(this.f27444d.name());
            out.writeInt(this.f27445e ? 1 : 0);
        }

        public /* synthetic */ d(b bVar, b bVar2, b bVar3, a aVar, boolean z8, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? b.f27451a : bVar, (i8 & 2) != 0 ? b.f27451a : bVar2, (i8 & 4) != 0 ? b.f27451a : bVar3, (i8 & 8) != 0 ? a.f27446a : aVar, (i8 & 16) != 0 ? false : z8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final d f27526a;

        /* renamed from: b, reason: collision with root package name */
        private final List f27527b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27528c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27529d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f27530e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f27524f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f27525g = 8;
        public static final Parcelable.Creator<m> CREATOR = new c();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f27531a = new a("Automatic", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a f27532b = new a("AutomaticAsync", 1);

            /* renamed from: c, reason: collision with root package name */
            public static final a f27533c = new a("Manual", 2);

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f27534d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ U5.a f27535e;

            static {
                a[] a8 = a();
                f27534d = a8;
                f27535e = U5.b.a(a8);
            }

            private a(String str, int i8) {
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f27531a, f27532b, f27533c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f27534d.clone();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
                public static final Parcelable.Creator<a> CREATOR = new C0648a();

                /* renamed from: a, reason: collision with root package name */
                private final long f27536a;

                /* renamed from: b, reason: collision with root package name */
                private final String f27537b;

                /* renamed from: c, reason: collision with root package name */
                private final e f27538c;

                /* renamed from: d, reason: collision with root package name */
                private final a f27539d;

                /* renamed from: com.stripe.android.paymentsheet.u$m$d$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0648a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        AbstractC3255y.i(parcel, "parcel");
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
                    AbstractC3255y.i(currency, "currency");
                    AbstractC3255y.i(captureMethod, "captureMethod");
                    this.f27536a = j8;
                    this.f27537b = currency;
                    this.f27538c = eVar;
                    this.f27539d = captureMethod;
                }

                public final String M() {
                    return this.f27537b;
                }

                @Override // com.stripe.android.paymentsheet.u.m.d
                public e a() {
                    return this.f27538c;
                }

                public final long b() {
                    return this.f27536a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public a g() {
                    return this.f27539d;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3255y.i(out, "out");
                    out.writeLong(this.f27536a);
                    out.writeString(this.f27537b);
                    e eVar = this.f27538c;
                    if (eVar == null) {
                        out.writeInt(0);
                    } else {
                        out.writeInt(1);
                        out.writeString(eVar.name());
                    }
                    out.writeString(this.f27539d.name());
                }
            }

            private d() {
            }

            public abstract e a();

            /* loaded from: classes4.dex */
            public static final class b extends d {
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* renamed from: a, reason: collision with root package name */
                private final String f27540a;

                /* renamed from: b, reason: collision with root package name */
                private final e f27541b;

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3255y.i(parcel, "parcel");
                        return new b(parcel.readString(), e.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public /* synthetic */ b(String str, e eVar, int i8, AbstractC3247p abstractC3247p) {
                    this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? e.f27543b : eVar);
                }

                public final String M() {
                    return this.f27540a;
                }

                @Override // com.stripe.android.paymentsheet.u.m.d
                public e a() {
                    return this.f27541b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3255y.i(out, "out");
                    out.writeString(this.f27540a);
                    out.writeString(this.f27541b.name());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, e setupFutureUse) {
                    super(null);
                    AbstractC3255y.i(setupFutureUse, "setupFutureUse");
                    this.f27540a = str;
                    this.f27541b = setupFutureUse;
                }
            }

            public /* synthetic */ d(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            public static final e f27542a = new e("OnSession", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final e f27543b = new e("OffSession", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ e[] f27544c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ U5.a f27545d;

            static {
                e[] a8 = a();
                f27544c = a8;
                f27545d = U5.b.a(a8);
            }

            private e(String str, int i8) {
            }

            private static final /* synthetic */ e[] a() {
                return new e[]{f27542a, f27543b};
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f27544c.clone();
            }
        }

        public m(d mode, List paymentMethodTypes, String str, String str2, boolean z8) {
            AbstractC3255y.i(mode, "mode");
            AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
            this.f27526a = mode;
            this.f27527b = paymentMethodTypes;
            this.f27528c = str;
            this.f27529d = str2;
            this.f27530e = z8;
        }

        public final d a() {
            return this.f27526a;
        }

        public final String b() {
            return this.f27529d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List e() {
            return this.f27527b;
        }

        public final String g() {
            return this.f27528c;
        }

        public final boolean h() {
            return this.f27530e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f27526a, i8);
            out.writeStringList(this.f27527b);
            out.writeString(this.f27528c);
            out.writeString(this.f27529d);
            out.writeInt(this.f27530e ? 1 : 0);
        }

        public /* synthetic */ m(d dVar, List list, String str, String str2, int i8, AbstractC3247p abstractC3247p) {
            this(dVar, (i8 & 2) != 0 ? AbstractC1378t.m() : list, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public m(d mode, List paymentMethodTypes, String str, String str2) {
            this(mode, paymentMethodTypes, str, str2, false);
            AbstractC3255y.i(mode, "mode");
            AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0644a();

        /* renamed from: a, reason: collision with root package name */
        private final String f27426a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27427b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27428c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27429d;

        /* renamed from: e, reason: collision with root package name */
        private final String f27430e;

        /* renamed from: f, reason: collision with root package name */
        private final String f27431f;

        /* renamed from: com.stripe.android.paymentsheet.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0644a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f27426a = str;
            this.f27427b = str2;
            this.f27428c = str3;
            this.f27429d = str4;
            this.f27430e = str5;
            this.f27431f = str6;
        }

        public final String a() {
            return this.f27426a;
        }

        public final String b() {
            return this.f27427b;
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
            return AbstractC3255y.d(this.f27426a, aVar.f27426a) && AbstractC3255y.d(this.f27427b, aVar.f27427b) && AbstractC3255y.d(this.f27428c, aVar.f27428c) && AbstractC3255y.d(this.f27429d, aVar.f27429d) && AbstractC3255y.d(this.f27430e, aVar.f27430e) && AbstractC3255y.d(this.f27431f, aVar.f27431f);
        }

        public final String g() {
            return this.f27428c;
        }

        public final String h() {
            return this.f27429d;
        }

        public int hashCode() {
            String str = this.f27426a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f27427b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f27428c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f27429d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f27430e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f27431f;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.f27430e;
        }

        public final String l() {
            return this.f27431f;
        }

        public String toString() {
            return "Address(city=" + this.f27426a + ", country=" + this.f27427b + ", line1=" + this.f27428c + ", line2=" + this.f27429d + ", postalCode=" + this.f27430e + ", state=" + this.f27431f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27426a);
            out.writeString(this.f27427b);
            out.writeString(this.f27428c);
            out.writeString(this.f27429d);
            out.writeString(this.f27430e);
            out.writeString(this.f27431f);
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f27473a;

        /* renamed from: b, reason: collision with root package name */
        private final i f27474b;

        /* renamed from: c, reason: collision with root package name */
        private final k f27475c;

        /* renamed from: d, reason: collision with root package name */
        private final ColorStateList f27476d;

        /* renamed from: e, reason: collision with root package name */
        private final c f27477e;

        /* renamed from: f, reason: collision with root package name */
        private final C4059a f27478f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f27479g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f27480h;

        /* renamed from: i, reason: collision with root package name */
        private final b f27481i;

        /* renamed from: j, reason: collision with root package name */
        private final String f27482j;

        /* renamed from: k, reason: collision with root package name */
        private final d f27483k;

        /* renamed from: l, reason: collision with root package name */
        private final List f27484l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f27485m;

        /* renamed from: n, reason: collision with root package name */
        private final List f27486n;

        /* renamed from: o, reason: collision with root package name */
        private final List f27487o;

        /* renamed from: p, reason: collision with root package name */
        private final n f27488p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f27471q = new a(null);

        /* renamed from: r, reason: collision with root package name */
        public static final int f27472r = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final g a(Context context) {
                AbstractC3255y.i(context, "context");
                return new g(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                i createFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
                k createFromParcel2 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
                ColorStateList colorStateList = (ColorStateList) parcel.readParcelable(g.class.getClassLoader());
                c createFromParcel3 = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
                C4059a createFromParcel4 = parcel.readInt() != 0 ? C4059a.CREATOR.createFromParcel(parcel) : null;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                b createFromParcel5 = b.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                d createFromParcel6 = d.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(EnumC2791e.valueOf(parcel.readString()));
                }
                return new g(readString, createFromParcel, createFromParcel2, colorStateList, createFromParcel3, createFromParcel4, z8, z9, createFromParcel5, readString2, createFromParcel6, arrayList, parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4059a c4059a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks, boolean z10, List paymentMethodOrder, List externalPaymentMethods, n paymentMethodLayout) {
            AbstractC3255y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3255y.i(appearance, "appearance");
            AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3255y.i(preferredNetworks, "preferredNetworks");
            AbstractC3255y.i(paymentMethodOrder, "paymentMethodOrder");
            AbstractC3255y.i(externalPaymentMethods, "externalPaymentMethods");
            AbstractC3255y.i(paymentMethodLayout, "paymentMethodLayout");
            this.f27473a = merchantDisplayName;
            this.f27474b = iVar;
            this.f27475c = kVar;
            this.f27476d = colorStateList;
            this.f27477e = cVar;
            this.f27478f = c4059a;
            this.f27479g = z8;
            this.f27480h = z9;
            this.f27481i = appearance;
            this.f27482j = str;
            this.f27483k = billingDetailsCollectionConfiguration;
            this.f27484l = preferredNetworks;
            this.f27485m = z10;
            this.f27486n = paymentMethodOrder;
            this.f27487o = externalPaymentMethods;
            this.f27488p = paymentMethodLayout;
        }

        public final String H() {
            return this.f27482j;
        }

        public final boolean a() {
            return this.f27479g;
        }

        public final boolean b() {
            return this.f27480h;
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
            return AbstractC3255y.d(this.f27473a, gVar.f27473a) && AbstractC3255y.d(this.f27474b, gVar.f27474b) && AbstractC3255y.d(this.f27475c, gVar.f27475c) && AbstractC3255y.d(this.f27476d, gVar.f27476d) && AbstractC3255y.d(this.f27477e, gVar.f27477e) && AbstractC3255y.d(this.f27478f, gVar.f27478f) && this.f27479g == gVar.f27479g && this.f27480h == gVar.f27480h && AbstractC3255y.d(this.f27481i, gVar.f27481i) && AbstractC3255y.d(this.f27482j, gVar.f27482j) && AbstractC3255y.d(this.f27483k, gVar.f27483k) && AbstractC3255y.d(this.f27484l, gVar.f27484l) && this.f27485m == gVar.f27485m && AbstractC3255y.d(this.f27486n, gVar.f27486n) && AbstractC3255y.d(this.f27487o, gVar.f27487o) && this.f27488p == gVar.f27488p;
        }

        public final boolean g() {
            return this.f27485m;
        }

        public final b h() {
            return this.f27481i;
        }

        public int hashCode() {
            int hashCode = this.f27473a.hashCode() * 31;
            i iVar = this.f27474b;
            int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            k kVar = this.f27475c;
            int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            ColorStateList colorStateList = this.f27476d;
            int hashCode4 = (hashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            c cVar = this.f27477e;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            C4059a c4059a = this.f27478f;
            int hashCode6 = (((((((hashCode5 + (c4059a == null ? 0 : c4059a.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f27479g)) * 31) + androidx.compose.foundation.a.a(this.f27480h)) * 31) + this.f27481i.hashCode()) * 31;
            String str = this.f27482j;
            return ((((((((((((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.f27483k.hashCode()) * 31) + this.f27484l.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f27485m)) * 31) + this.f27486n.hashCode()) * 31) + this.f27487o.hashCode()) * 31) + this.f27488p.hashCode();
        }

        public final d i() {
            return this.f27483k;
        }

        public final i l() {
            return this.f27474b;
        }

        public final c p() {
            return this.f27477e;
        }

        public final C4059a q() {
            return this.f27478f;
        }

        public final List s() {
            return this.f27487o;
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.f27473a + ", customer=" + this.f27474b + ", googlePay=" + this.f27475c + ", primaryButtonColor=" + this.f27476d + ", defaultBillingDetails=" + this.f27477e + ", shippingDetails=" + this.f27478f + ", allowsDelayedPaymentMethods=" + this.f27479g + ", allowsPaymentMethodsRequiringShippingAddress=" + this.f27480h + ", appearance=" + this.f27481i + ", primaryButtonLabel=" + this.f27482j + ", billingDetailsCollectionConfiguration=" + this.f27483k + ", preferredNetworks=" + this.f27484l + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f27485m + ", paymentMethodOrder=" + this.f27486n + ", externalPaymentMethods=" + this.f27487o + ", paymentMethodLayout=" + this.f27488p + ")";
        }

        public final k u() {
            return this.f27475c;
        }

        public final String v() {
            return this.f27473a;
        }

        public final n w() {
            return this.f27488p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27473a);
            i iVar = this.f27474b;
            if (iVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                iVar.writeToParcel(out, i8);
            }
            k kVar = this.f27475c;
            if (kVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                kVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f27476d, i8);
            c cVar = this.f27477e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            C4059a c4059a = this.f27478f;
            if (c4059a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c4059a.writeToParcel(out, i8);
            }
            out.writeInt(this.f27479g ? 1 : 0);
            out.writeInt(this.f27480h ? 1 : 0);
            this.f27481i.writeToParcel(out, i8);
            out.writeString(this.f27482j);
            this.f27483k.writeToParcel(out, i8);
            List list = this.f27484l;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeString(((EnumC2791e) it.next()).name());
            }
            out.writeInt(this.f27485m ? 1 : 0);
            out.writeStringList(this.f27486n);
            out.writeStringList(this.f27487o);
            out.writeString(this.f27488p.name());
        }

        public final List x() {
            return this.f27486n;
        }

        public final List y() {
            return this.f27484l;
        }

        public final ColorStateList z() {
            return this.f27476d;
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4059a c4059a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, boolean z10, List list2, List list3, n nVar, int i8, AbstractC3247p abstractC3247p) {
            this(str, (i8 & 2) != 0 ? C3830a.f38111a.d() : iVar, (i8 & 4) != 0 ? C3830a.f38111a.f() : kVar, (i8 & 8) != 0 ? C3830a.f38111a.i() : colorStateList, (i8 & 16) != 0 ? C3830a.f38111a.b() : cVar, (i8 & 32) != 0 ? C3830a.f38111a.k() : c4059a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3830a.f38111a.a() : bVar, (i8 & 512) != 0 ? C3830a.f38111a.j() : str2, (i8 & 1024) != 0 ? C3830a.f38111a.c() : dVar, (i8 & 2048) != 0 ? C3830a.f38111a.h() : list, (i8 & 4096) != 0 ? true : z10, (i8 & 8192) != 0 ? C3830a.f38111a.g() : list2, (i8 & 16384) != 0 ? C3830a.f38111a.e() : list3, (i8 & 32768) != 0 ? n.f27546a.a() : nVar);
        }

        public /* synthetic */ g(String str, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4059a c4059a, boolean z8, boolean z9, b bVar, String str2, d dVar, List list, int i8, AbstractC3247p abstractC3247p) {
            this(str, (i8 & 2) != 0 ? C3830a.f38111a.d() : iVar, (i8 & 4) != 0 ? C3830a.f38111a.f() : kVar, (i8 & 8) != 0 ? C3830a.f38111a.i() : colorStateList, (i8 & 16) != 0 ? C3830a.f38111a.b() : cVar, (i8 & 32) != 0 ? C3830a.f38111a.k() : c4059a, (i8 & 64) != 0 ? false : z8, (i8 & 128) == 0 ? z9 : false, (i8 & 256) != 0 ? C3830a.f38111a.a() : bVar, (i8 & 512) != 0 ? C3830a.f38111a.j() : str2, (i8 & 1024) != 0 ? C3830a.f38111a.c() : dVar, (i8 & 2048) != 0 ? C3830a.f38111a.h() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(String merchantDisplayName, i iVar, k kVar, ColorStateList colorStateList, c cVar, C4059a c4059a, boolean z8, boolean z9, b appearance, String str, d billingDetailsCollectionConfiguration, List preferredNetworks) {
            this(merchantDisplayName, iVar, kVar, colorStateList, cVar, c4059a, z8, z9, appearance, str, billingDetailsCollectionConfiguration, preferredNetworks, true, null, C3830a.f38111a.e(), null, 40960, null);
            AbstractC3255y.i(merchantDisplayName, "merchantDisplayName");
            AbstractC3255y.i(appearance, "appearance");
            AbstractC3255y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3255y.i(preferredNetworks, "preferredNetworks");
        }
    }
}
