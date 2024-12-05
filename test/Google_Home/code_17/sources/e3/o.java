package e3;

import A6.AbstractC0983d0;
import A6.AbstractC1005y;
import A6.C;
import A6.C0984e;
import A6.C0985e0;
import A6.n0;
import A6.r0;
import P5.AbstractC1378t;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@w6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class o implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f31505a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31506b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31507c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31508d;

    /* renamed from: e, reason: collision with root package name */
    private final List f31509e;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<o> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final w6.b[] f31504f = {null, null, null, null, new C0984e(d.a.f31515a)};

    /* loaded from: classes4.dex */
    public static final class a implements A6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31510a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0985e0 f31511b;

        static {
            a aVar = new a();
            f31510a = aVar;
            C0985e0 c0985e0 = new C0985e0("com.stripe.android.model.ConsumerSession", aVar, 5);
            c0985e0.k("client_secret", true);
            c0985e0.k("email_address", false);
            c0985e0.k("redacted_formatted_phone_number", false);
            c0985e0.k("redacted_phone_number", false);
            c0985e0.k("verification_sessions", true);
            f31511b = c0985e0;
        }

        private a() {
        }

        @Override // w6.b, w6.i, w6.InterfaceC4150a
        public y6.f a() {
            return f31511b;
        }

        @Override // A6.C
        public w6.b[] c() {
            return C.a.a(this);
        }

        @Override // A6.C
        public w6.b[] e() {
            w6.b bVar = o.f31504f[4];
            r0 r0Var = r0.f595a;
            return new w6.b[]{r0Var, r0Var, r0Var, r0Var, bVar};
        }

        @Override // w6.InterfaceC4150a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public o b(z6.e decoder) {
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            AbstractC3255y.i(decoder, "decoder");
            y6.f a8 = a();
            z6.c d8 = decoder.d(a8);
            w6.b[] bVarArr = o.f31504f;
            String str5 = null;
            if (d8.w()) {
                String e8 = d8.e(a8, 0);
                String e9 = d8.e(a8, 1);
                String e10 = d8.e(a8, 2);
                String e11 = d8.e(a8, 3);
                list = (List) d8.x(a8, 4, bVarArr[4], null);
                str = e8;
                str4 = e11;
                str3 = e10;
                str2 = e9;
                i8 = 31;
            } else {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int g8 = d8.g(a8);
                    if (g8 != -1) {
                        if (g8 != 0) {
                            if (g8 != 1) {
                                if (g8 != 2) {
                                    if (g8 != 3) {
                                        if (g8 == 4) {
                                            list2 = (List) d8.x(a8, 4, bVarArr[4], list2);
                                            i9 |= 16;
                                        } else {
                                            throw new w6.l(g8);
                                        }
                                    } else {
                                        str8 = d8.e(a8, 3);
                                        i9 |= 8;
                                    }
                                } else {
                                    str7 = d8.e(a8, 2);
                                    i9 |= 4;
                                }
                            } else {
                                str6 = d8.e(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str5 = d8.e(a8, 0);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str5;
                str2 = str6;
                str3 = str7;
                str4 = str8;
                list = list2;
            }
            d8.b(a8);
            return new o(i8, str, str2, str3, str4, list, null);
        }

        @Override // w6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z6.f encoder, o value) {
            AbstractC3255y.i(encoder, "encoder");
            AbstractC3255y.i(value, "value");
            y6.f a8 = a();
            z6.d d8 = encoder.d(a8);
            o.i(value, d8, a8);
            d8.b(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final w6.b serializer() {
            return a.f31510a;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(d.CREATOR.createFromParcel(parcel));
            }
            return new o(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i8) {
            return new o[i8];
        }
    }

    @w6.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static final class d implements y2.f {

        /* renamed from: a, reason: collision with root package name */
        private final e f31513a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0726d f31514b;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* renamed from: c, reason: collision with root package name */
        private static final w6.b[] f31512c = {AbstractC1005y.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", e.values()), AbstractC1005y.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", EnumC0726d.values())};

        /* loaded from: classes4.dex */
        public static final class a implements A6.C {

            /* renamed from: a, reason: collision with root package name */
            public static final a f31515a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C0985e0 f31516b;

            static {
                a aVar = new a();
                f31515a = aVar;
                C0985e0 c0985e0 = new C0985e0("com.stripe.android.model.ConsumerSession.VerificationSession", aVar, 2);
                c0985e0.k("type", false);
                c0985e0.k("state", false);
                f31516b = c0985e0;
            }

            private a() {
            }

            @Override // w6.b, w6.i, w6.InterfaceC4150a
            public y6.f a() {
                return f31516b;
            }

            @Override // A6.C
            public w6.b[] c() {
                return C.a.a(this);
            }

            @Override // A6.C
            public w6.b[] e() {
                w6.b[] bVarArr = d.f31512c;
                return new w6.b[]{bVarArr[0], bVarArr[1]};
            }

            @Override // w6.InterfaceC4150a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public d b(z6.e decoder) {
                EnumC0726d enumC0726d;
                e eVar;
                int i8;
                AbstractC3255y.i(decoder, "decoder");
                y6.f a8 = a();
                z6.c d8 = decoder.d(a8);
                w6.b[] bVarArr = d.f31512c;
                n0 n0Var = null;
                if (d8.w()) {
                    eVar = (e) d8.x(a8, 0, bVarArr[0], null);
                    enumC0726d = (EnumC0726d) d8.x(a8, 1, bVarArr[1], null);
                    i8 = 3;
                } else {
                    EnumC0726d enumC0726d2 = null;
                    e eVar2 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int g8 = d8.g(a8);
                        if (g8 != -1) {
                            if (g8 != 0) {
                                if (g8 == 1) {
                                    enumC0726d2 = (EnumC0726d) d8.x(a8, 1, bVarArr[1], enumC0726d2);
                                    i9 |= 2;
                                } else {
                                    throw new w6.l(g8);
                                }
                            } else {
                                eVar2 = (e) d8.x(a8, 0, bVarArr[0], eVar2);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    enumC0726d = enumC0726d2;
                    eVar = eVar2;
                    i8 = i9;
                }
                d8.b(a8);
                return new d(i8, eVar, enumC0726d, n0Var);
            }

            @Override // w6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void d(z6.f encoder, d value) {
                AbstractC3255y.i(encoder, "encoder");
                AbstractC3255y.i(value, "value");
                y6.f a8 = a();
                z6.d d8 = encoder.d(a8);
                d.h(value, d8, a8);
                d8.b(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final w6.b serializer() {
                return a.f31515a;
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(e.CREATOR.createFromParcel(parcel), EnumC0726d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: e3.o$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0726d implements Parcelable {
            public static final Parcelable.Creator<EnumC0726d> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final a f31517b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0726d f31518c = new EnumC0726d("Unknown", 0, "");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0726d f31519d = new EnumC0726d("Started", 1, "started");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0726d f31520e = new EnumC0726d("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            public static final EnumC0726d f31521f = new EnumC0726d("Verified", 3, "verified");

            /* renamed from: g, reason: collision with root package name */
            public static final EnumC0726d f31522g = new EnumC0726d("Canceled", 4, "canceled");

            /* renamed from: h, reason: collision with root package name */
            public static final EnumC0726d f31523h = new EnumC0726d("Expired", 5, "expired");

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ EnumC0726d[] f31524i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ U5.a f31525j;

            /* renamed from: a, reason: collision with root package name */
            private final String f31526a;

            /* renamed from: e3.o$d$d$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final EnumC0726d a(String value) {
                    Object obj;
                    AbstractC3255y.i(value, "value");
                    Iterator<E> it = EnumC0726d.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (j6.n.s(((EnumC0726d) obj).g(), value, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    EnumC0726d enumC0726d = (EnumC0726d) obj;
                    if (enumC0726d == null) {
                        return EnumC0726d.f31518c;
                    }
                    return enumC0726d;
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* renamed from: e3.o$d$d$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EnumC0726d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return EnumC0726d.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC0726d[] newArray(int i8) {
                    return new EnumC0726d[i8];
                }
            }

            static {
                EnumC0726d[] a8 = a();
                f31524i = a8;
                f31525j = U5.b.a(a8);
                f31517b = new a(null);
                CREATOR = new b();
            }

            private EnumC0726d(String str, int i8, String str2) {
                this.f31526a = str2;
            }

            private static final /* synthetic */ EnumC0726d[] a() {
                return new EnumC0726d[]{f31518c, f31519d, f31520e, f31521f, f31522g, f31523h};
            }

            public static U5.a b() {
                return f31525j;
            }

            public static EnumC0726d valueOf(String str) {
                return (EnumC0726d) Enum.valueOf(EnumC0726d.class, str);
            }

            public static EnumC0726d[] values() {
                return (EnumC0726d[]) f31524i.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String g() {
                return this.f31526a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class e implements Parcelable {
            public static final Parcelable.Creator<e> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final a f31527b;

            /* renamed from: c, reason: collision with root package name */
            public static final e f31528c = new e("Unknown", 0, "");

            /* renamed from: d, reason: collision with root package name */
            public static final e f31529d = new e("SignUp", 1, "signup");

            /* renamed from: e, reason: collision with root package name */
            public static final e f31530e = new e("Email", 2, NotificationCompat.CATEGORY_EMAIL);

            /* renamed from: f, reason: collision with root package name */
            public static final e f31531f = new e("Sms", 3, "sms");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ e[] f31532g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ U5.a f31533h;

            /* renamed from: a, reason: collision with root package name */
            private final String f31534a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final e a(String value) {
                    Object obj;
                    AbstractC3255y.i(value, "value");
                    Iterator<E> it = e.b().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (j6.n.s(((e) obj).g(), value, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    e eVar = (e) obj;
                    if (eVar == null) {
                        return e.f31528c;
                    }
                    return eVar;
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
                    return e.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            static {
                e[] a8 = a();
                f31532g = a8;
                f31533h = U5.b.a(a8);
                f31527b = new a(null);
                CREATOR = new b();
            }

            private e(String str, int i8, String str2) {
                this.f31534a = str2;
            }

            private static final /* synthetic */ e[] a() {
                return new e[]{f31528c, f31529d, f31530e, f31531f};
            }

            public static U5.a b() {
                return f31533h;
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f31532g.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String g() {
                return this.f31534a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(name());
            }
        }

        public /* synthetic */ d(int i8, e eVar, EnumC0726d enumC0726d, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC0983d0.a(i8, 3, a.f31515a.a());
            }
            this.f31513a = eVar;
            this.f31514b = enumC0726d;
        }

        public static final /* synthetic */ void h(d dVar, z6.d dVar2, y6.f fVar) {
            w6.b[] bVarArr = f31512c;
            dVar2.C(fVar, 0, bVarArr[0], dVar.f31513a);
            dVar2.C(fVar, 1, bVarArr[1], dVar.f31514b);
        }

        public final EnumC0726d b() {
            return this.f31514b;
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
            if (this.f31513a == dVar.f31513a && this.f31514b == dVar.f31514b) {
                return true;
            }
            return false;
        }

        public final e g() {
            return this.f31513a;
        }

        public int hashCode() {
            return (this.f31513a.hashCode() * 31) + this.f31514b.hashCode();
        }

        public String toString() {
            return "VerificationSession(type=" + this.f31513a + ", state=" + this.f31514b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f31513a.writeToParcel(out, i8);
            this.f31514b.writeToParcel(out, i8);
        }

        public d(e type, EnumC0726d state) {
            AbstractC3255y.i(type, "type");
            AbstractC3255y.i(state, "state");
            this.f31513a = type;
            this.f31514b = state;
        }
    }

    public /* synthetic */ o(int i8, String str, String str2, String str3, String str4, List list, n0 n0Var) {
        if (14 != (i8 & 14)) {
            AbstractC0983d0.a(i8, 14, a.f31510a.a());
        }
        this.f31505a = (i8 & 1) == 0 ? "" : str;
        this.f31506b = str2;
        this.f31507c = str3;
        this.f31508d = str4;
        if ((i8 & 16) == 0) {
            this.f31509e = AbstractC1378t.m();
        } else {
            this.f31509e = list;
        }
    }

    public static final /* synthetic */ void i(o oVar, z6.d dVar, y6.f fVar) {
        w6.b[] bVarArr = f31504f;
        if (dVar.p(fVar, 0) || !AbstractC3255y.d(oVar.f31505a, "")) {
            dVar.e(fVar, 0, oVar.f31505a);
        }
        dVar.e(fVar, 1, oVar.f31506b);
        dVar.e(fVar, 2, oVar.f31507c);
        dVar.e(fVar, 3, oVar.f31508d);
        if (dVar.p(fVar, 4) || !AbstractC3255y.d(oVar.f31509e, AbstractC1378t.m())) {
            dVar.C(fVar, 4, bVarArr[4], oVar.f31509e);
        }
    }

    public final String b() {
        return this.f31506b;
    }

    public final String d() {
        return this.f31505a;
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
        if (AbstractC3255y.d(this.f31505a, oVar.f31505a) && AbstractC3255y.d(this.f31506b, oVar.f31506b) && AbstractC3255y.d(this.f31507c, oVar.f31507c) && AbstractC3255y.d(this.f31508d, oVar.f31508d) && AbstractC3255y.d(this.f31509e, oVar.f31509e)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f31508d;
    }

    public final List h() {
        return this.f31509e;
    }

    public int hashCode() {
        return (((((((this.f31505a.hashCode() * 31) + this.f31506b.hashCode()) * 31) + this.f31507c.hashCode()) * 31) + this.f31508d.hashCode()) * 31) + this.f31509e.hashCode();
    }

    public String toString() {
        return "ConsumerSession(clientSecret=" + this.f31505a + ", emailAddress=" + this.f31506b + ", redactedFormattedPhoneNumber=" + this.f31507c + ", redactedPhoneNumber=" + this.f31508d + ", verificationSessions=" + this.f31509e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31505a);
        out.writeString(this.f31506b);
        out.writeString(this.f31507c);
        out.writeString(this.f31508d);
        List list = this.f31509e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d) it.next()).writeToParcel(out, i8);
        }
    }

    public o(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, List verificationSessions) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(emailAddress, "emailAddress");
        AbstractC3255y.i(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        AbstractC3255y.i(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC3255y.i(verificationSessions, "verificationSessions");
        this.f31505a = clientSecret;
        this.f31506b = emailAddress;
        this.f31507c = redactedFormattedPhoneNumber;
        this.f31508d = redactedPhoneNumber;
        this.f31509e = verificationSessions;
    }
}
