package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import b3.C1860E;
import b3.M;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class Source implements v2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24009a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f24010b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24011c;

    /* renamed from: d, reason: collision with root package name */
    private final CodeVerification f24012d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f24013e;

    /* renamed from: f, reason: collision with root package name */
    private final String f24014f;

    /* renamed from: g, reason: collision with root package name */
    private final Flow f24015g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f24016h;

    /* renamed from: i, reason: collision with root package name */
    private final d f24017i;

    /* renamed from: j, reason: collision with root package name */
    private final e f24018j;

    /* renamed from: k, reason: collision with root package name */
    private final Redirect f24019k;

    /* renamed from: l, reason: collision with root package name */
    private final Status f24020l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f24021m;

    /* renamed from: n, reason: collision with root package name */
    private final SourceTypeModel f24022n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24023o;

    /* renamed from: p, reason: collision with root package name */
    private final String f24024p;

    /* renamed from: q, reason: collision with root package name */
    private final Usage f24025q;

    /* renamed from: r, reason: collision with root package name */
    private final M f24026r;

    /* renamed from: s, reason: collision with root package name */
    private final c f24027s;

    /* renamed from: t, reason: collision with root package name */
    private final C1860E f24028t;

    /* renamed from: u, reason: collision with root package name */
    private final String f24029u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f24007v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f24008w = 8;
    public static final Parcelable.Creator<Source> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class CodeVerification implements v2.f {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f24030a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f24031b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24032b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f24033c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f24034d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f24035e = new Status("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ Status[] f24036f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24037g;

            /* renamed from: a, reason: collision with root package name */
            private final String f24038a;

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
                            if (AbstractC3159y.d(((Status) obj).f24038a, str)) {
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
                f24036f = a8;
                f24037g = R5.b.a(a8);
                f24032b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f24038a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f24033c, f24034d, f24035e};
            }

            public static R5.a c() {
                return f24037g;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f24036f.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f24038a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CodeVerification createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CodeVerification[] newArray(int i8) {
                return new CodeVerification[i8];
            }
        }

        public CodeVerification(int i8, Status status) {
            this.f24030a = i8;
            this.f24031b = status;
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
            return this.f24030a == codeVerification.f24030a && this.f24031b == codeVerification.f24031b;
        }

        public int hashCode() {
            int i8 = this.f24030a * 31;
            Status status = this.f24031b;
            return i8 + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.f24030a + ", status=" + this.f24031b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f24030a);
            Status status = this.f24031b;
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
        public static final a f24039b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flow f24040c = new Flow("Redirect", 0, "redirect");

        /* renamed from: d, reason: collision with root package name */
        public static final Flow f24041d = new Flow("Receiver", 1, "receiver");

        /* renamed from: e, reason: collision with root package name */
        public static final Flow f24042e = new Flow("CodeVerification", 2, "code_verification");

        /* renamed from: f, reason: collision with root package name */
        public static final Flow f24043f = new Flow("None", 3, "none");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ Flow[] f24044g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24045h;

        /* renamed from: a, reason: collision with root package name */
        private final String f24046a;

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
                        if (AbstractC3159y.d(((Flow) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Flow) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        static {
            Flow[] a8 = a();
            f24044g = a8;
            f24045h = R5.b.a(a8);
            f24039b = new a(null);
        }

        private Flow(String str, int i8, String str2) {
            this.f24046a = str2;
        }

        private static final /* synthetic */ Flow[] a() {
            return new Flow[]{f24040c, f24041d, f24042e, f24043f};
        }

        public static R5.a c() {
            return f24045h;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) f24044g.clone();
        }

        public final String b() {
            return this.f24046a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24046a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Redirect implements v2.f {
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24047a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f24048b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24049c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f24050b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f24051c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f24052d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f24053e = new Status("NotRequired", 2, "not_required");

            /* renamed from: f, reason: collision with root package name */
            public static final Status f24054f = new Status("Failed", 3, "failed");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ Status[] f24055g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24056h;

            /* renamed from: a, reason: collision with root package name */
            private final String f24057a;

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
                            if (AbstractC3159y.d(((Status) obj).f24057a, str)) {
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
                f24055g = a8;
                f24056h = R5.b.a(a8);
                f24050b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f24057a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f24051c, f24052d, f24053e, f24054f};
            }

            public static R5.a c() {
                return f24056h;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f24055g.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f24057a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Redirect createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Redirect[] newArray(int i8) {
                return new Redirect[i8];
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.f24047a = str;
            this.f24048b = status;
            this.f24049c = str2;
        }

        public final String b() {
            return this.f24049c;
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
            return AbstractC3159y.d(this.f24047a, redirect.f24047a) && this.f24048b == redirect.f24048b && AbstractC3159y.d(this.f24049c, redirect.f24049c);
        }

        public int hashCode() {
            String str = this.f24047a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.f24048b;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.f24049c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.f24047a + ", status=" + this.f24048b + ", url=" + this.f24049c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24047a);
            Status status = this.f24048b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
            out.writeString(this.f24049c);
        }

        public final String x() {
            return this.f24047a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24058b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f24059c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f24060d = new Status("Chargeable", 1, "chargeable");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f24061e = new Status("Consumed", 2, "consumed");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f24062f = new Status("Failed", 3, "failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f24063g = new Status("Pending", 4, "pending");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f24064h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24065i;

        /* renamed from: a, reason: collision with root package name */
        private final String f24066a;

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
                        if (AbstractC3159y.d(((Status) obj).f24066a, str)) {
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
            f24064h = a8;
            f24065i = R5.b.a(a8);
            f24058b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f24066a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f24059c, f24060d, f24061e, f24062f, f24063g};
        }

        public static R5.a c() {
            return f24065i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f24064h.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24066a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f24067b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f24068c = new Usage("Reusable", 0, "reusable");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f24069d = new Usage("SingleUse", 1, "single_use");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f24070e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24071f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24072a;

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
            f24070e = a8;
            f24071f = R5.b.a(a8);
            f24067b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f24072a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f24068c, f24069d};
        }

        public static R5.a c() {
            return f24071f;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f24070e.clone();
        }

        public final String b() {
            return this.f24072a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f24072a;
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

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
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
            AbstractC3159y.i(parcel, "parcel");
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
            return new Source(readString, valueOf2, readString2, createFromParcel, valueOf3, readString3, valueOf4, valueOf, createFromParcel2, createFromParcel3, createFromParcel4, status, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : M.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C1860E.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Source[] newArray(int i8) {
            return new Source[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements v2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24073a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24074b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24075c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24076d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24077e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24078f;

        /* renamed from: g, reason: collision with root package name */
        private final String f24079g;

        /* renamed from: h, reason: collision with root package name */
        private final String f24080h;

        /* renamed from: i, reason: collision with root package name */
        private final String f24081i;

        /* renamed from: j, reason: collision with root package name */
        private final String f24082j;

        /* renamed from: k, reason: collision with root package name */
        private final String f24083k;

        /* renamed from: l, reason: collision with root package name */
        private final String f24084l;

        /* renamed from: m, reason: collision with root package name */
        private final String f24085m;

        /* renamed from: n, reason: collision with root package name */
        private final String f24086n;

        /* renamed from: o, reason: collision with root package name */
        private final String f24087o;

        /* renamed from: p, reason: collision with root package name */
        private final String f24088p;

        /* renamed from: q, reason: collision with root package name */
        private final Set f24089q;

        /* renamed from: r, reason: collision with root package name */
        private final Set f24090r;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            AbstractC3159y.i(paymentMethodCategories, "paymentMethodCategories");
            AbstractC3159y.i(customPaymentMethods, "customPaymentMethods");
            this.f24073a = str;
            this.f24074b = str2;
            this.f24075c = str3;
            this.f24076d = str4;
            this.f24077e = str5;
            this.f24078f = str6;
            this.f24079g = str7;
            this.f24080h = str8;
            this.f24081i = str9;
            this.f24082j = str10;
            this.f24083k = str11;
            this.f24084l = str12;
            this.f24085m = str13;
            this.f24086n = str14;
            this.f24087o = str15;
            this.f24088p = str16;
            this.f24089q = paymentMethodCategories;
            this.f24090r = customPaymentMethods;
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
            return AbstractC3159y.d(this.f24073a, cVar.f24073a) && AbstractC3159y.d(this.f24074b, cVar.f24074b) && AbstractC3159y.d(this.f24075c, cVar.f24075c) && AbstractC3159y.d(this.f24076d, cVar.f24076d) && AbstractC3159y.d(this.f24077e, cVar.f24077e) && AbstractC3159y.d(this.f24078f, cVar.f24078f) && AbstractC3159y.d(this.f24079g, cVar.f24079g) && AbstractC3159y.d(this.f24080h, cVar.f24080h) && AbstractC3159y.d(this.f24081i, cVar.f24081i) && AbstractC3159y.d(this.f24082j, cVar.f24082j) && AbstractC3159y.d(this.f24083k, cVar.f24083k) && AbstractC3159y.d(this.f24084l, cVar.f24084l) && AbstractC3159y.d(this.f24085m, cVar.f24085m) && AbstractC3159y.d(this.f24086n, cVar.f24086n) && AbstractC3159y.d(this.f24087o, cVar.f24087o) && AbstractC3159y.d(this.f24088p, cVar.f24088p) && AbstractC3159y.d(this.f24089q, cVar.f24089q) && AbstractC3159y.d(this.f24090r, cVar.f24090r);
        }

        public int hashCode() {
            String str = this.f24073a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24074b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24075c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24076d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24077e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24078f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f24079g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f24080h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f24081i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f24082j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f24083k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f24084l;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f24085m;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f24086n;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f24087o;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f24088p;
            return ((((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.f24089q.hashCode()) * 31) + this.f24090r.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.f24073a + ", lastName=" + this.f24074b + ", purchaseCountry=" + this.f24075c + ", clientToken=" + this.f24076d + ", payNowAssetUrlsDescriptive=" + this.f24077e + ", payNowAssetUrlsStandard=" + this.f24078f + ", payNowName=" + this.f24079g + ", payNowRedirectUrl=" + this.f24080h + ", payLaterAssetUrlsDescriptive=" + this.f24081i + ", payLaterAssetUrlsStandard=" + this.f24082j + ", payLaterName=" + this.f24083k + ", payLaterRedirectUrl=" + this.f24084l + ", payOverTimeAssetUrlsDescriptive=" + this.f24085m + ", payOverTimeAssetUrlsStandard=" + this.f24086n + ", payOverTimeName=" + this.f24087o + ", payOverTimeRedirectUrl=" + this.f24088p + ", paymentMethodCategories=" + this.f24089q + ", customPaymentMethods=" + this.f24090r + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24073a);
            out.writeString(this.f24074b);
            out.writeString(this.f24075c);
            out.writeString(this.f24076d);
            out.writeString(this.f24077e);
            out.writeString(this.f24078f);
            out.writeString(this.f24079g);
            out.writeString(this.f24080h);
            out.writeString(this.f24081i);
            out.writeString(this.f24082j);
            out.writeString(this.f24083k);
            out.writeString(this.f24084l);
            out.writeString(this.f24085m);
            out.writeString(this.f24086n);
            out.writeString(this.f24087o);
            out.writeString(this.f24088p);
            Set set = this.f24089q;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            Set set2 = this.f24090r;
            out.writeInt(set2.size());
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                out.writeString((String) it2.next());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements v2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24091a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24092b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24093c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24094d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f24095e;

        /* renamed from: f, reason: collision with root package name */
        private final String f24096f;

        /* renamed from: g, reason: collision with root package name */
        private final String f24097g;

        /* renamed from: h, reason: collision with root package name */
        private final String f24098h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? com.stripe.android.model.a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a aVar, String str, String str2, String str3, com.stripe.android.model.a aVar2, String str4, String str5, String str6) {
            this.f24091a = aVar;
            this.f24092b = str;
            this.f24093c = str2;
            this.f24094d = str3;
            this.f24095e = aVar2;
            this.f24096f = str4;
            this.f24097g = str5;
            this.f24098h = str6;
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
            return AbstractC3159y.d(this.f24091a, dVar.f24091a) && AbstractC3159y.d(this.f24092b, dVar.f24092b) && AbstractC3159y.d(this.f24093c, dVar.f24093c) && AbstractC3159y.d(this.f24094d, dVar.f24094d) && AbstractC3159y.d(this.f24095e, dVar.f24095e) && AbstractC3159y.d(this.f24096f, dVar.f24096f) && AbstractC3159y.d(this.f24097g, dVar.f24097g) && AbstractC3159y.d(this.f24098h, dVar.f24098h);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f24091a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f24092b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24093c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24094d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            com.stripe.android.model.a aVar2 = this.f24095e;
            int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str4 = this.f24096f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24097g;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f24098h;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.f24091a + ", email=" + this.f24092b + ", name=" + this.f24093c + ", phone=" + this.f24094d + ", verifiedAddress=" + this.f24095e + ", verifiedEmail=" + this.f24096f + ", verifiedName=" + this.f24097g + ", verifiedPhone=" + this.f24098h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f24091a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24092b);
            out.writeString(this.f24093c);
            out.writeString(this.f24094d);
            com.stripe.android.model.a aVar2 = this.f24095e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f24096f);
            out.writeString(this.f24097g);
            out.writeString(this.f24098h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements v2.f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f24099a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24100b;

        /* renamed from: c, reason: collision with root package name */
        private final long f24101c;

        /* renamed from: d, reason: collision with root package name */
        private final long f24102d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(String str, long j8, long j9, long j10) {
            this.f24099a = str;
            this.f24100b = j8;
            this.f24101c = j9;
            this.f24102d = j10;
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
            return AbstractC3159y.d(this.f24099a, eVar.f24099a) && this.f24100b == eVar.f24100b && this.f24101c == eVar.f24101c && this.f24102d == eVar.f24102d;
        }

        public int hashCode() {
            String str = this.f24099a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + androidx.collection.a.a(this.f24100b)) * 31) + androidx.collection.a.a(this.f24101c)) * 31) + androidx.collection.a.a(this.f24102d);
        }

        public String toString() {
            return "Receiver(address=" + this.f24099a + ", amountCharged=" + this.f24100b + ", amountReceived=" + this.f24101c + ", amountReturned=" + this.f24102d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24099a);
            out.writeLong(this.f24100b);
            out.writeLong(this.f24101c);
            out.writeLong(this.f24102d);
        }
    }

    public Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, M m8, c cVar, C1860E c1860e, String str4) {
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(typeRaw, "typeRaw");
        this.f24009a = str;
        this.f24010b = l8;
        this.f24011c = str2;
        this.f24012d = codeVerification;
        this.f24013e = l9;
        this.f24014f = str3;
        this.f24015g = flow;
        this.f24016h = bool;
        this.f24017i = dVar;
        this.f24018j = eVar;
        this.f24019k = redirect;
        this.f24020l = status;
        this.f24021m = map;
        this.f24022n = sourceTypeModel;
        this.f24023o = type;
        this.f24024p = typeRaw;
        this.f24025q = usage;
        this.f24026r = m8;
        this.f24027s = cVar;
        this.f24028t = c1860e;
        this.f24029u = str4;
    }

    public final Flow b() {
        return this.f24015g;
    }

    public final Redirect c() {
        return this.f24019k;
    }

    public final String d() {
        return this.f24011c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SourceTypeModel e() {
        return this.f24022n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return AbstractC3159y.d(this.f24009a, source.f24009a) && AbstractC3159y.d(this.f24010b, source.f24010b) && AbstractC3159y.d(this.f24011c, source.f24011c) && AbstractC3159y.d(this.f24012d, source.f24012d) && AbstractC3159y.d(this.f24013e, source.f24013e) && AbstractC3159y.d(this.f24014f, source.f24014f) && this.f24015g == source.f24015g && AbstractC3159y.d(this.f24016h, source.f24016h) && AbstractC3159y.d(this.f24017i, source.f24017i) && AbstractC3159y.d(this.f24018j, source.f24018j) && AbstractC3159y.d(this.f24019k, source.f24019k) && this.f24020l == source.f24020l && AbstractC3159y.d(this.f24021m, source.f24021m) && AbstractC3159y.d(this.f24022n, source.f24022n) && AbstractC3159y.d(this.f24023o, source.f24023o) && AbstractC3159y.d(this.f24024p, source.f24024p) && this.f24025q == source.f24025q && AbstractC3159y.d(this.f24026r, source.f24026r) && AbstractC3159y.d(this.f24027s, source.f24027s) && AbstractC3159y.d(this.f24028t, source.f24028t) && AbstractC3159y.d(this.f24029u, source.f24029u);
    }

    public String getId() {
        return this.f24009a;
    }

    public int hashCode() {
        String str = this.f24009a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f24010b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str2 = this.f24011c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.f24012d;
        int hashCode4 = (hashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l9 = this.f24013e;
        int hashCode5 = (hashCode4 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str3 = this.f24014f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.f24015g;
        int hashCode7 = (hashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.f24016h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        d dVar = this.f24017i;
        int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f24018j;
        int hashCode10 = (hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Redirect redirect = this.f24019k;
        int hashCode11 = (hashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.f24020l;
        int hashCode12 = (hashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map map = this.f24021m;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.f24022n;
        int hashCode14 = (((((hashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.f24023o.hashCode()) * 31) + this.f24024p.hashCode()) * 31;
        Usage usage = this.f24025q;
        int hashCode15 = (hashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        M m8 = this.f24026r;
        int hashCode16 = (hashCode15 + (m8 == null ? 0 : m8.hashCode())) * 31;
        c cVar = this.f24027s;
        int hashCode17 = (hashCode16 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C1860E c1860e = this.f24028t;
        int hashCode18 = (hashCode17 + (c1860e == null ? 0 : c1860e.hashCode())) * 31;
        String str4 = this.f24029u;
        return hashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Source(id=" + this.f24009a + ", amount=" + this.f24010b + ", clientSecret=" + this.f24011c + ", codeVerification=" + this.f24012d + ", created=" + this.f24013e + ", currency=" + this.f24014f + ", flow=" + this.f24015g + ", isLiveMode=" + this.f24016h + ", owner=" + this.f24017i + ", receiver=" + this.f24018j + ", redirect=" + this.f24019k + ", status=" + this.f24020l + ", sourceTypeData=" + this.f24021m + ", sourceTypeModel=" + this.f24022n + ", type=" + this.f24023o + ", typeRaw=" + this.f24024p + ", usage=" + this.f24025q + ", _weChat=" + this.f24026r + ", _klarna=" + this.f24027s + ", sourceOrder=" + this.f24028t + ", statementDescriptor=" + this.f24029u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24009a);
        Long l8 = this.f24010b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f24011c);
        CodeVerification codeVerification = this.f24012d;
        if (codeVerification == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codeVerification.writeToParcel(out, i8);
        }
        Long l9 = this.f24013e;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
        out.writeString(this.f24014f);
        Flow flow = this.f24015g;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.f24016h;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        d dVar = this.f24017i;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        e eVar = this.f24018j;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Redirect redirect = this.f24019k;
        if (redirect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirect.writeToParcel(out, i8);
        }
        Status status = this.f24020l;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        Map map = this.f24021m;
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
        out.writeParcelable(this.f24022n, i8);
        out.writeString(this.f24023o);
        out.writeString(this.f24024p);
        Usage usage = this.f24025q;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        M m8 = this.f24026r;
        if (m8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            m8.writeToParcel(out, i8);
        }
        c cVar = this.f24027s;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C1860E c1860e = this.f24028t;
        if (c1860e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c1860e.writeToParcel(out, i8);
        }
        out.writeString(this.f24029u);
    }

    public /* synthetic */ Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, M m8, c cVar, C1860E c1860e, String str6, int i8, AbstractC3151p abstractC3151p) {
        this(str, (i8 & 2) != 0 ? null : l8, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : codeVerification, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : str3, (i8 & 64) != 0 ? null : flow, (i8 & 128) != 0 ? null : bool, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : eVar, (i8 & 1024) != 0 ? null : redirect, (i8 & 2048) != 0 ? null : status, (i8 & 4096) != 0 ? null : map, (i8 & 8192) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i8) != 0 ? null : usage, (131072 & i8) != 0 ? null : m8, (262144 & i8) != 0 ? null : cVar, (524288 & i8) != 0 ? null : c1860e, (i8 & 1048576) != 0 ? null : str6);
    }
}
