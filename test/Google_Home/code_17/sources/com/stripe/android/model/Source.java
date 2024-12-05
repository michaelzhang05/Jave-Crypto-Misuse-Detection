package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import e3.C2781E;
import e3.M;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class Source implements y2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25064a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f25065b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25066c;

    /* renamed from: d, reason: collision with root package name */
    private final CodeVerification f25067d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f25068e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25069f;

    /* renamed from: g, reason: collision with root package name */
    private final Flow f25070g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f25071h;

    /* renamed from: i, reason: collision with root package name */
    private final d f25072i;

    /* renamed from: j, reason: collision with root package name */
    private final e f25073j;

    /* renamed from: k, reason: collision with root package name */
    private final Redirect f25074k;

    /* renamed from: l, reason: collision with root package name */
    private final Status f25075l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f25076m;

    /* renamed from: n, reason: collision with root package name */
    private final SourceTypeModel f25077n;

    /* renamed from: o, reason: collision with root package name */
    private final String f25078o;

    /* renamed from: p, reason: collision with root package name */
    private final String f25079p;

    /* renamed from: q, reason: collision with root package name */
    private final Usage f25080q;

    /* renamed from: r, reason: collision with root package name */
    private final M f25081r;

    /* renamed from: s, reason: collision with root package name */
    private final c f25082s;

    /* renamed from: t, reason: collision with root package name */
    private final C2781E f25083t;

    /* renamed from: u, reason: collision with root package name */
    private final String f25084u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f25062v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f25063w = 8;
    public static final Parcelable.Creator<Source> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class CodeVerification implements y2.f {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f25085a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f25086b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25087b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f25088c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f25089d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f25090e = new Status("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ Status[] f25091f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25092g;

            /* renamed from: a, reason: collision with root package name */
            private final String f25093a;

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
                            if (AbstractC3255y.d(((Status) obj).f25093a, str)) {
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
                f25091f = a8;
                f25092g = U5.b.a(a8);
                f25087b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f25093a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f25088c, f25089d, f25090e};
            }

            public static U5.a c() {
                return f25092g;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f25091f.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f25093a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CodeVerification createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CodeVerification[] newArray(int i8) {
                return new CodeVerification[i8];
            }
        }

        public CodeVerification(int i8, Status status) {
            this.f25085a = i8;
            this.f25086b = status;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) obj;
            return this.f25085a == codeVerification.f25085a && this.f25086b == codeVerification.f25086b;
        }

        public int hashCode() {
            int i8 = this.f25085a * 31;
            Status status = this.f25086b;
            return i8 + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.f25085a + ", status=" + this.f25086b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f25085a);
            Status status = this.f25086b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Flow {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25094b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flow f25095c = new Flow("Redirect", 0, "redirect");

        /* renamed from: d, reason: collision with root package name */
        public static final Flow f25096d = new Flow("Receiver", 1, "receiver");

        /* renamed from: e, reason: collision with root package name */
        public static final Flow f25097e = new Flow("CodeVerification", 2, "code_verification");

        /* renamed from: f, reason: collision with root package name */
        public static final Flow f25098f = new Flow("None", 3, "none");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ Flow[] f25099g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25100h;

        /* renamed from: a, reason: collision with root package name */
        private final String f25101a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Flow a(String str) {
                Object obj;
                Iterator<E> it = Flow.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((Flow) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Flow) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            Flow[] a8 = a();
            f25099g = a8;
            f25100h = U5.b.a(a8);
            f25094b = new a(null);
        }

        private Flow(String str, int i8, String str2) {
            this.f25101a = str2;
        }

        private static final /* synthetic */ Flow[] a() {
            return new Flow[]{f25095c, f25096d, f25097e, f25098f};
        }

        public static U5.a c() {
            return f25100h;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) f25099g.clone();
        }

        public final String b() {
            return this.f25101a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25101a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Redirect implements y2.f {
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25102a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f25103b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25104c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25105b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f25106c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f25107d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f25108e = new Status("NotRequired", 2, "not_required");

            /* renamed from: f, reason: collision with root package name */
            public static final Status f25109f = new Status("Failed", 3, "failed");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ Status[] f25110g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25111h;

            /* renamed from: a, reason: collision with root package name */
            private final String f25112a;

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
                            if (AbstractC3255y.d(((Status) obj).f25112a, str)) {
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
                f25110g = a8;
                f25111h = U5.b.a(a8);
                f25105b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f25112a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f25106c, f25107d, f25108e, f25109f};
            }

            public static U5.a c() {
                return f25111h;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f25110g.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f25112a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Redirect createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Redirect[] newArray(int i8) {
                return new Redirect[i8];
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.f25102a = str;
            this.f25103b = status;
            this.f25104c = str2;
        }

        public final String A() {
            return this.f25102a;
        }

        public final String a() {
            return this.f25104c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return AbstractC3255y.d(this.f25102a, redirect.f25102a) && this.f25103b == redirect.f25103b && AbstractC3255y.d(this.f25104c, redirect.f25104c);
        }

        public int hashCode() {
            String str = this.f25102a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.f25103b;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.f25104c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.f25102a + ", status=" + this.f25103b + ", url=" + this.f25104c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25102a);
            Status status = this.f25103b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
            out.writeString(this.f25104c);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25113b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f25114c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f25115d = new Status("Chargeable", 1, "chargeable");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f25116e = new Status("Consumed", 2, "consumed");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f25117f = new Status("Failed", 3, "failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f25118g = new Status("Pending", 4, "pending");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f25119h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25120i;

        /* renamed from: a, reason: collision with root package name */
        private final String f25121a;

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
                        if (AbstractC3255y.d(((Status) obj).f25121a, str)) {
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
            f25119h = a8;
            f25120i = U5.b.a(a8);
            f25113b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f25121a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f25114c, f25115d, f25116e, f25117f, f25118g};
        }

        public static U5.a c() {
            return f25120i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25119h.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25121a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25122b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f25123c = new Usage("Reusable", 0, "reusable");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f25124d = new Usage("SingleUse", 1, "single_use");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f25125e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25126f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25127a;

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
            f25125e = a8;
            f25126f = U5.b.a(a8);
            f25122b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f25127a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f25123c, f25124d};
        }

        public static U5.a c() {
            return f25126f;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f25125e.clone();
        }

        public final String b() {
            return this.f25127a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25127a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final String a(String str) {
            String str2;
            if (str == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            switch (str.hashCode()) {
                case -1920743119:
                    str2 = "bancontact";
                    if (!str.equals("bancontact")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -1414960566:
                    str2 = "alipay";
                    if (!str.equals("alipay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -896955097:
                    str2 = "sofort";
                    if (!str.equals("sofort")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -825238221:
                    str2 = "three_d_secure";
                    if (!str.equals("three_d_secure")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -791770330:
                    str2 = "wechat";
                    if (!str.equals("wechat")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -284840886:
                    str.equals(EnvironmentCompat.MEDIA_UNKNOWN);
                    return EnvironmentCompat.MEDIA_UNKNOWN;
                case 100648:
                    str2 = "eps";
                    if (!str.equals("eps")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 109234:
                    str2 = "p24";
                    if (!str.equals("p24")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 3046160:
                    str2 = "card";
                    if (!str.equals("card")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 38358441:
                    str2 = "giropay";
                    if (!str.equals("giropay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 100048981:
                    str2 = "ideal";
                    if (!str.equals("ideal")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1251821346:
                    str2 = "multibanco";
                    if (!str.equals("multibanco")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1636477296:
                    str2 = "sepa_debit";
                    if (!str.equals("sepa_debit")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return str2;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Source createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Status status;
            LinkedHashMap linkedHashMap;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            CodeVerification createFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Flow valueOf4 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i8 = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            d createFromParcel2 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            e createFromParcel3 = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            Redirect createFromParcel4 = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status valueOf5 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                status = valueOf5;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i8 != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i8++;
                    readInt = readInt;
                    valueOf5 = valueOf5;
                }
                status = valueOf5;
                linkedHashMap = linkedHashMap2;
            }
            return new Source(readString, valueOf2, readString2, createFromParcel, valueOf3, readString3, valueOf4, valueOf, createFromParcel2, createFromParcel3, createFromParcel4, status, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : M.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C2781E.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Source[] newArray(int i8) {
            return new Source[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements y2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25128a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25129b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25130c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25131d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25132e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25133f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25134g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25135h;

        /* renamed from: i, reason: collision with root package name */
        private final String f25136i;

        /* renamed from: j, reason: collision with root package name */
        private final String f25137j;

        /* renamed from: k, reason: collision with root package name */
        private final String f25138k;

        /* renamed from: l, reason: collision with root package name */
        private final String f25139l;

        /* renamed from: m, reason: collision with root package name */
        private final String f25140m;

        /* renamed from: n, reason: collision with root package name */
        private final String f25141n;

        /* renamed from: o, reason: collision with root package name */
        private final String f25142o;

        /* renamed from: p, reason: collision with root package name */
        private final String f25143p;

        /* renamed from: q, reason: collision with root package name */
        private final Set f25144q;

        /* renamed from: r, reason: collision with root package name */
        private final Set f25145r;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                int i8 = 0;
                while (i8 != readInt) {
                    linkedHashSet.add(parcel.readString());
                    i8++;
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                int i9 = 0;
                while (i9 != readInt2) {
                    linkedHashSet2.add(parcel.readString());
                    i9++;
                    readInt2 = readInt2;
                }
                return new c(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set paymentMethodCategories, Set customPaymentMethods) {
            AbstractC3255y.i(paymentMethodCategories, "paymentMethodCategories");
            AbstractC3255y.i(customPaymentMethods, "customPaymentMethods");
            this.f25128a = str;
            this.f25129b = str2;
            this.f25130c = str3;
            this.f25131d = str4;
            this.f25132e = str5;
            this.f25133f = str6;
            this.f25134g = str7;
            this.f25135h = str8;
            this.f25136i = str9;
            this.f25137j = str10;
            this.f25138k = str11;
            this.f25139l = str12;
            this.f25140m = str13;
            this.f25141n = str14;
            this.f25142o = str15;
            this.f25143p = str16;
            this.f25144q = paymentMethodCategories;
            this.f25145r = customPaymentMethods;
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
            return AbstractC3255y.d(this.f25128a, cVar.f25128a) && AbstractC3255y.d(this.f25129b, cVar.f25129b) && AbstractC3255y.d(this.f25130c, cVar.f25130c) && AbstractC3255y.d(this.f25131d, cVar.f25131d) && AbstractC3255y.d(this.f25132e, cVar.f25132e) && AbstractC3255y.d(this.f25133f, cVar.f25133f) && AbstractC3255y.d(this.f25134g, cVar.f25134g) && AbstractC3255y.d(this.f25135h, cVar.f25135h) && AbstractC3255y.d(this.f25136i, cVar.f25136i) && AbstractC3255y.d(this.f25137j, cVar.f25137j) && AbstractC3255y.d(this.f25138k, cVar.f25138k) && AbstractC3255y.d(this.f25139l, cVar.f25139l) && AbstractC3255y.d(this.f25140m, cVar.f25140m) && AbstractC3255y.d(this.f25141n, cVar.f25141n) && AbstractC3255y.d(this.f25142o, cVar.f25142o) && AbstractC3255y.d(this.f25143p, cVar.f25143p) && AbstractC3255y.d(this.f25144q, cVar.f25144q) && AbstractC3255y.d(this.f25145r, cVar.f25145r);
        }

        public int hashCode() {
            String str = this.f25128a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25129b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25130c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25131d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25132e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25133f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f25134g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f25135h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f25136i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f25137j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f25138k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f25139l;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f25140m;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f25141n;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f25142o;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f25143p;
            return ((((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.f25144q.hashCode()) * 31) + this.f25145r.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.f25128a + ", lastName=" + this.f25129b + ", purchaseCountry=" + this.f25130c + ", clientToken=" + this.f25131d + ", payNowAssetUrlsDescriptive=" + this.f25132e + ", payNowAssetUrlsStandard=" + this.f25133f + ", payNowName=" + this.f25134g + ", payNowRedirectUrl=" + this.f25135h + ", payLaterAssetUrlsDescriptive=" + this.f25136i + ", payLaterAssetUrlsStandard=" + this.f25137j + ", payLaterName=" + this.f25138k + ", payLaterRedirectUrl=" + this.f25139l + ", payOverTimeAssetUrlsDescriptive=" + this.f25140m + ", payOverTimeAssetUrlsStandard=" + this.f25141n + ", payOverTimeName=" + this.f25142o + ", payOverTimeRedirectUrl=" + this.f25143p + ", paymentMethodCategories=" + this.f25144q + ", customPaymentMethods=" + this.f25145r + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25128a);
            out.writeString(this.f25129b);
            out.writeString(this.f25130c);
            out.writeString(this.f25131d);
            out.writeString(this.f25132e);
            out.writeString(this.f25133f);
            out.writeString(this.f25134g);
            out.writeString(this.f25135h);
            out.writeString(this.f25136i);
            out.writeString(this.f25137j);
            out.writeString(this.f25138k);
            out.writeString(this.f25139l);
            out.writeString(this.f25140m);
            out.writeString(this.f25141n);
            out.writeString(this.f25142o);
            out.writeString(this.f25143p);
            Set set = this.f25144q;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            Set set2 = this.f25145r;
            out.writeInt(set2.size());
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                out.writeString((String) it2.next());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements y2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25146a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25147b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25148c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25149d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f25150e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25151f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25152g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25153h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? com.stripe.android.model.a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a aVar, String str, String str2, String str3, com.stripe.android.model.a aVar2, String str4, String str5, String str6) {
            this.f25146a = aVar;
            this.f25147b = str;
            this.f25148c = str2;
            this.f25149d = str3;
            this.f25150e = aVar2;
            this.f25151f = str4;
            this.f25152g = str5;
            this.f25153h = str6;
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
            return AbstractC3255y.d(this.f25146a, dVar.f25146a) && AbstractC3255y.d(this.f25147b, dVar.f25147b) && AbstractC3255y.d(this.f25148c, dVar.f25148c) && AbstractC3255y.d(this.f25149d, dVar.f25149d) && AbstractC3255y.d(this.f25150e, dVar.f25150e) && AbstractC3255y.d(this.f25151f, dVar.f25151f) && AbstractC3255y.d(this.f25152g, dVar.f25152g) && AbstractC3255y.d(this.f25153h, dVar.f25153h);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f25146a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f25147b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25148c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25149d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            com.stripe.android.model.a aVar2 = this.f25150e;
            int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str4 = this.f25151f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25152g;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25153h;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.f25146a + ", email=" + this.f25147b + ", name=" + this.f25148c + ", phone=" + this.f25149d + ", verifiedAddress=" + this.f25150e + ", verifiedEmail=" + this.f25151f + ", verifiedName=" + this.f25152g + ", verifiedPhone=" + this.f25153h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            com.stripe.android.model.a aVar = this.f25146a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25147b);
            out.writeString(this.f25148c);
            out.writeString(this.f25149d);
            com.stripe.android.model.a aVar2 = this.f25150e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f25151f);
            out.writeString(this.f25152g);
            out.writeString(this.f25153h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements y2.f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25154a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25155b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25156c;

        /* renamed from: d, reason: collision with root package name */
        private final long f25157d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(String str, long j8, long j9, long j10) {
            this.f25154a = str;
            this.f25155b = j8;
            this.f25156c = j9;
            this.f25157d = j10;
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
            return AbstractC3255y.d(this.f25154a, eVar.f25154a) && this.f25155b == eVar.f25155b && this.f25156c == eVar.f25156c && this.f25157d == eVar.f25157d;
        }

        public int hashCode() {
            String str = this.f25154a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + androidx.collection.a.a(this.f25155b)) * 31) + androidx.collection.a.a(this.f25156c)) * 31) + androidx.collection.a.a(this.f25157d);
        }

        public String toString() {
            return "Receiver(address=" + this.f25154a + ", amountCharged=" + this.f25155b + ", amountReceived=" + this.f25156c + ", amountReturned=" + this.f25157d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25154a);
            out.writeLong(this.f25155b);
            out.writeLong(this.f25156c);
            out.writeLong(this.f25157d);
        }
    }

    public Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, M m8, c cVar, C2781E c2781e, String str4) {
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(typeRaw, "typeRaw");
        this.f25064a = str;
        this.f25065b = l8;
        this.f25066c = str2;
        this.f25067d = codeVerification;
        this.f25068e = l9;
        this.f25069f = str3;
        this.f25070g = flow;
        this.f25071h = bool;
        this.f25072i = dVar;
        this.f25073j = eVar;
        this.f25074k = redirect;
        this.f25075l = status;
        this.f25076m = map;
        this.f25077n = sourceTypeModel;
        this.f25078o = type;
        this.f25079p = typeRaw;
        this.f25080q = usage;
        this.f25081r = m8;
        this.f25082s = cVar;
        this.f25083t = c2781e;
        this.f25084u = str4;
    }

    public final Flow a() {
        return this.f25070g;
    }

    public final Redirect b() {
        return this.f25074k;
    }

    public final String d() {
        return this.f25066c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return AbstractC3255y.d(this.f25064a, source.f25064a) && AbstractC3255y.d(this.f25065b, source.f25065b) && AbstractC3255y.d(this.f25066c, source.f25066c) && AbstractC3255y.d(this.f25067d, source.f25067d) && AbstractC3255y.d(this.f25068e, source.f25068e) && AbstractC3255y.d(this.f25069f, source.f25069f) && this.f25070g == source.f25070g && AbstractC3255y.d(this.f25071h, source.f25071h) && AbstractC3255y.d(this.f25072i, source.f25072i) && AbstractC3255y.d(this.f25073j, source.f25073j) && AbstractC3255y.d(this.f25074k, source.f25074k) && this.f25075l == source.f25075l && AbstractC3255y.d(this.f25076m, source.f25076m) && AbstractC3255y.d(this.f25077n, source.f25077n) && AbstractC3255y.d(this.f25078o, source.f25078o) && AbstractC3255y.d(this.f25079p, source.f25079p) && this.f25080q == source.f25080q && AbstractC3255y.d(this.f25081r, source.f25081r) && AbstractC3255y.d(this.f25082s, source.f25082s) && AbstractC3255y.d(this.f25083t, source.f25083t) && AbstractC3255y.d(this.f25084u, source.f25084u);
    }

    public final SourceTypeModel g() {
        return this.f25077n;
    }

    public String getId() {
        return this.f25064a;
    }

    public int hashCode() {
        String str = this.f25064a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f25065b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str2 = this.f25066c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.f25067d;
        int hashCode4 = (hashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l9 = this.f25068e;
        int hashCode5 = (hashCode4 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str3 = this.f25069f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.f25070g;
        int hashCode7 = (hashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.f25071h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        d dVar = this.f25072i;
        int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f25073j;
        int hashCode10 = (hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Redirect redirect = this.f25074k;
        int hashCode11 = (hashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.f25075l;
        int hashCode12 = (hashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map map = this.f25076m;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.f25077n;
        int hashCode14 = (((((hashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.f25078o.hashCode()) * 31) + this.f25079p.hashCode()) * 31;
        Usage usage = this.f25080q;
        int hashCode15 = (hashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        M m8 = this.f25081r;
        int hashCode16 = (hashCode15 + (m8 == null ? 0 : m8.hashCode())) * 31;
        c cVar = this.f25082s;
        int hashCode17 = (hashCode16 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C2781E c2781e = this.f25083t;
        int hashCode18 = (hashCode17 + (c2781e == null ? 0 : c2781e.hashCode())) * 31;
        String str4 = this.f25084u;
        return hashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Source(id=" + this.f25064a + ", amount=" + this.f25065b + ", clientSecret=" + this.f25066c + ", codeVerification=" + this.f25067d + ", created=" + this.f25068e + ", currency=" + this.f25069f + ", flow=" + this.f25070g + ", isLiveMode=" + this.f25071h + ", owner=" + this.f25072i + ", receiver=" + this.f25073j + ", redirect=" + this.f25074k + ", status=" + this.f25075l + ", sourceTypeData=" + this.f25076m + ", sourceTypeModel=" + this.f25077n + ", type=" + this.f25078o + ", typeRaw=" + this.f25079p + ", usage=" + this.f25080q + ", _weChat=" + this.f25081r + ", _klarna=" + this.f25082s + ", sourceOrder=" + this.f25083t + ", statementDescriptor=" + this.f25084u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25064a);
        Long l8 = this.f25065b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f25066c);
        CodeVerification codeVerification = this.f25067d;
        if (codeVerification == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codeVerification.writeToParcel(out, i8);
        }
        Long l9 = this.f25068e;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
        out.writeString(this.f25069f);
        Flow flow = this.f25070g;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.f25071h;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        d dVar = this.f25072i;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        e eVar = this.f25073j;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Redirect redirect = this.f25074k;
        if (redirect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirect.writeToParcel(out, i8);
        }
        Status status = this.f25075l;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        Map map = this.f25076m;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
        out.writeParcelable(this.f25077n, i8);
        out.writeString(this.f25078o);
        out.writeString(this.f25079p);
        Usage usage = this.f25080q;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        M m8 = this.f25081r;
        if (m8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            m8.writeToParcel(out, i8);
        }
        c cVar = this.f25082s;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C2781E c2781e = this.f25083t;
        if (c2781e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2781e.writeToParcel(out, i8);
        }
        out.writeString(this.f25084u);
    }

    public /* synthetic */ Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, M m8, c cVar, C2781E c2781e, String str6, int i8, AbstractC3247p abstractC3247p) {
        this(str, (i8 & 2) != 0 ? null : l8, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : codeVerification, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : str3, (i8 & 64) != 0 ? null : flow, (i8 & 128) != 0 ? null : bool, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : eVar, (i8 & 1024) != 0 ? null : redirect, (i8 & 2048) != 0 ? null : status, (i8 & 4096) != 0 ? null : map, (i8 & 8192) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i8) != 0 ? null : usage, (131072 & i8) != 0 ? null : m8, (262144 & i8) != 0 ? null : cVar, (524288 & i8) != 0 ? null : c2781e, (i8 & 1048576) != 0 ? null : str6);
    }
}
