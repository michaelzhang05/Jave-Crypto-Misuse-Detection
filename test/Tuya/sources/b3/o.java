package b3;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x6.AbstractC3942d0;
import x6.AbstractC3964y;
import x6.C;
import x6.C3943e;
import x6.C3944e0;
import x6.n0;
import x6.r0;

@t6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class o implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f14499a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14500b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14501c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14502d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14503e;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<o> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final t6.b[] f14498f = {null, null, null, null, new C3943e(d.a.f14509a)};

    /* loaded from: classes4.dex */
    public static final class a implements x6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14504a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C3944e0 f14505b;

        static {
            a aVar = new a();
            f14504a = aVar;
            C3944e0 c3944e0 = new C3944e0("com.stripe.android.model.ConsumerSession", aVar, 5);
            c3944e0.k("client_secret", true);
            c3944e0.k("email_address", false);
            c3944e0.k("redacted_formatted_phone_number", false);
            c3944e0.k("redacted_phone_number", false);
            c3944e0.k("verification_sessions", true);
            f14505b = c3944e0;
        }

        private a() {
        }

        @Override // t6.b, t6.i, t6.InterfaceC3796a
        public v6.f a() {
            return f14505b;
        }

        @Override // x6.C
        public t6.b[] b() {
            return C.a.a(this);
        }

        @Override // x6.C
        public t6.b[] d() {
            t6.b bVar = o.f14498f[4];
            r0 r0Var = r0.f39600a;
            return new t6.b[]{r0Var, r0Var, r0Var, r0Var, bVar};
        }

        @Override // t6.InterfaceC3796a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public o c(w6.e decoder) {
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            AbstractC3159y.i(decoder, "decoder");
            v6.f a8 = a();
            w6.c d8 = decoder.d(a8);
            t6.b[] bVarArr = o.f14498f;
            String str5 = null;
            if (d8.z()) {
                String q8 = d8.q(a8, 0);
                String q9 = d8.q(a8, 1);
                String q10 = d8.q(a8, 2);
                String q11 = d8.q(a8, 3);
                list = (List) d8.r(a8, 4, bVarArr[4], null);
                str = q8;
                str4 = q11;
                str3 = q10;
                str2 = q9;
                i8 = 31;
            } else {
                String str6 = null;
                String str7 = null;
                String str8 = null;
                List list2 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int p8 = d8.p(a8);
                    if (p8 != -1) {
                        if (p8 != 0) {
                            if (p8 != 1) {
                                if (p8 != 2) {
                                    if (p8 != 3) {
                                        if (p8 == 4) {
                                            list2 = (List) d8.r(a8, 4, bVarArr[4], list2);
                                            i9 |= 16;
                                        } else {
                                            throw new t6.l(p8);
                                        }
                                    } else {
                                        str8 = d8.q(a8, 3);
                                        i9 |= 8;
                                    }
                                } else {
                                    str7 = d8.q(a8, 2);
                                    i9 |= 4;
                                }
                            } else {
                                str6 = d8.q(a8, 1);
                                i9 |= 2;
                            }
                        } else {
                            str5 = d8.q(a8, 0);
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
            d8.a(a8);
            return new o(i8, str, str2, str3, str4, list, null);
        }

        @Override // t6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(w6.f encoder, o value) {
            AbstractC3159y.i(encoder, "encoder");
            AbstractC3159y.i(value, "value");
            v6.f a8 = a();
            w6.d d8 = encoder.d(a8);
            o.i(value, d8, a8);
            d8.a(a8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final t6.b serializer() {
            return a.f14504a;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
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

    @t6.g
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public static final class d implements v2.f {

        /* renamed from: a, reason: collision with root package name */
        private final e f14507a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0358d f14508b;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* renamed from: c, reason: collision with root package name */
        private static final t6.b[] f14506c = {AbstractC3964y.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionType", e.values()), AbstractC3964y.b("com.stripe.android.model.ConsumerSession.VerificationSession.SessionState", EnumC0358d.values())};

        /* loaded from: classes4.dex */
        public static final class a implements x6.C {

            /* renamed from: a, reason: collision with root package name */
            public static final a f14509a;

            /* renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ C3944e0 f14510b;

            static {
                a aVar = new a();
                f14509a = aVar;
                C3944e0 c3944e0 = new C3944e0("com.stripe.android.model.ConsumerSession.VerificationSession", aVar, 2);
                c3944e0.k("type", false);
                c3944e0.k("state", false);
                f14510b = c3944e0;
            }

            private a() {
            }

            @Override // t6.b, t6.i, t6.InterfaceC3796a
            public v6.f a() {
                return f14510b;
            }

            @Override // x6.C
            public t6.b[] b() {
                return C.a.a(this);
            }

            @Override // x6.C
            public t6.b[] d() {
                t6.b[] bVarArr = d.f14506c;
                return new t6.b[]{bVarArr[0], bVarArr[1]};
            }

            @Override // t6.InterfaceC3796a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public d c(w6.e decoder) {
                EnumC0358d enumC0358d;
                e eVar;
                int i8;
                AbstractC3159y.i(decoder, "decoder");
                v6.f a8 = a();
                w6.c d8 = decoder.d(a8);
                t6.b[] bVarArr = d.f14506c;
                n0 n0Var = null;
                if (d8.z()) {
                    eVar = (e) d8.r(a8, 0, bVarArr[0], null);
                    enumC0358d = (EnumC0358d) d8.r(a8, 1, bVarArr[1], null);
                    i8 = 3;
                } else {
                    EnumC0358d enumC0358d2 = null;
                    e eVar2 = null;
                    int i9 = 0;
                    boolean z8 = true;
                    while (z8) {
                        int p8 = d8.p(a8);
                        if (p8 != -1) {
                            if (p8 != 0) {
                                if (p8 == 1) {
                                    enumC0358d2 = (EnumC0358d) d8.r(a8, 1, bVarArr[1], enumC0358d2);
                                    i9 |= 2;
                                } else {
                                    throw new t6.l(p8);
                                }
                            } else {
                                eVar2 = (e) d8.r(a8, 0, bVarArr[0], eVar2);
                                i9 |= 1;
                            }
                        } else {
                            z8 = false;
                        }
                    }
                    enumC0358d = enumC0358d2;
                    eVar = eVar2;
                    i8 = i9;
                }
                d8.a(a8);
                return new d(i8, eVar, enumC0358d, n0Var);
            }

            @Override // t6.i
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public void e(w6.f encoder, d value) {
                AbstractC3159y.i(encoder, "encoder");
                AbstractC3159y.i(value, "value");
                v6.f a8 = a();
                w6.d d8 = encoder.d(a8);
                d.f(value, d8, a8);
                d8.a(a8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final t6.b serializer() {
                return a.f14509a;
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(e.CREATOR.createFromParcel(parcel), EnumC0358d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: b3.o$d$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0358d implements Parcelable {
            public static final Parcelable.Creator<EnumC0358d> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final a f14511b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0358d f14512c = new EnumC0358d("Unknown", 0, "");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0358d f14513d = new EnumC0358d("Started", 1, "started");

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0358d f14514e = new EnumC0358d("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            public static final EnumC0358d f14515f = new EnumC0358d("Verified", 3, "verified");

            /* renamed from: g, reason: collision with root package name */
            public static final EnumC0358d f14516g = new EnumC0358d("Canceled", 4, "canceled");

            /* renamed from: h, reason: collision with root package name */
            public static final EnumC0358d f14517h = new EnumC0358d("Expired", 5, "expired");

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ EnumC0358d[] f14518i;

            /* renamed from: j, reason: collision with root package name */
            private static final /* synthetic */ R5.a f14519j;

            /* renamed from: a, reason: collision with root package name */
            private final String f14520a;

            /* renamed from: b3.o$d$d$a */
            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final EnumC0358d a(String value) {
                    Object obj;
                    AbstractC3159y.i(value, "value");
                    Iterator<E> it = EnumC0358d.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (g6.n.s(((EnumC0358d) obj).e(), value, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    EnumC0358d enumC0358d = (EnumC0358d) obj;
                    if (enumC0358d == null) {
                        return EnumC0358d.f14512c;
                    }
                    return enumC0358d;
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: b3.o$d$d$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final EnumC0358d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return EnumC0358d.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC0358d[] newArray(int i8) {
                    return new EnumC0358d[i8];
                }
            }

            static {
                EnumC0358d[] b8 = b();
                f14518i = b8;
                f14519j = R5.b.a(b8);
                f14511b = new a(null);
                CREATOR = new b();
            }

            private EnumC0358d(String str, int i8, String str2) {
                this.f14520a = str2;
            }

            private static final /* synthetic */ EnumC0358d[] b() {
                return new EnumC0358d[]{f14512c, f14513d, f14514e, f14515f, f14516g, f14517h};
            }

            public static R5.a c() {
                return f14519j;
            }

            public static EnumC0358d valueOf(String str) {
                return (EnumC0358d) Enum.valueOf(EnumC0358d.class, str);
            }

            public static EnumC0358d[] values() {
                return (EnumC0358d[]) f14518i.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f14520a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class e implements Parcelable {
            public static final Parcelable.Creator<e> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final a f14521b;

            /* renamed from: c, reason: collision with root package name */
            public static final e f14522c = new e("Unknown", 0, "");

            /* renamed from: d, reason: collision with root package name */
            public static final e f14523d = new e("SignUp", 1, "signup");

            /* renamed from: e, reason: collision with root package name */
            public static final e f14524e = new e("Email", 2, NotificationCompat.CATEGORY_EMAIL);

            /* renamed from: f, reason: collision with root package name */
            public static final e f14525f = new e("Sms", 3, "sms");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ e[] f14526g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ R5.a f14527h;

            /* renamed from: a, reason: collision with root package name */
            private final String f14528a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final e a(String value) {
                    Object obj;
                    AbstractC3159y.i(value, "value");
                    Iterator<E> it = e.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (g6.n.s(((e) obj).e(), value, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    e eVar = (e) obj;
                    if (eVar == null) {
                        return e.f14522c;
                    }
                    return eVar;
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
                    return e.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            static {
                e[] b8 = b();
                f14526g = b8;
                f14527h = R5.b.a(b8);
                f14521b = new a(null);
                CREATOR = new b();
            }

            private e(String str, int i8, String str2) {
                this.f14528a = str2;
            }

            private static final /* synthetic */ e[] b() {
                return new e[]{f14522c, f14523d, f14524e, f14525f};
            }

            public static R5.a c() {
                return f14527h;
            }

            public static e valueOf(String str) {
                return (e) Enum.valueOf(e.class, str);
            }

            public static e[] values() {
                return (e[]) f14526g.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f14528a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(name());
            }
        }

        public /* synthetic */ d(int i8, e eVar, EnumC0358d enumC0358d, n0 n0Var) {
            if (3 != (i8 & 3)) {
                AbstractC3942d0.a(i8, 3, a.f14509a.a());
            }
            this.f14507a = eVar;
            this.f14508b = enumC0358d;
        }

        public static final /* synthetic */ void f(d dVar, w6.d dVar2, v6.f fVar) {
            t6.b[] bVarArr = f14506c;
            dVar2.A(fVar, 0, bVarArr[0], dVar.f14507a);
            dVar2.A(fVar, 1, bVarArr[1], dVar.f14508b);
        }

        public final EnumC0358d c() {
            return this.f14508b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final e e() {
            return this.f14507a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f14507a == dVar.f14507a && this.f14508b == dVar.f14508b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f14507a.hashCode() * 31) + this.f14508b.hashCode();
        }

        public String toString() {
            return "VerificationSession(type=" + this.f14507a + ", state=" + this.f14508b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f14507a.writeToParcel(out, i8);
            this.f14508b.writeToParcel(out, i8);
        }

        public d(e type, EnumC0358d state) {
            AbstractC3159y.i(type, "type");
            AbstractC3159y.i(state, "state");
            this.f14507a = type;
            this.f14508b = state;
        }
    }

    public /* synthetic */ o(int i8, String str, String str2, String str3, String str4, List list, n0 n0Var) {
        if (14 != (i8 & 14)) {
            AbstractC3942d0.a(i8, 14, a.f14504a.a());
        }
        this.f14499a = (i8 & 1) == 0 ? "" : str;
        this.f14500b = str2;
        this.f14501c = str3;
        this.f14502d = str4;
        if ((i8 & 16) == 0) {
            this.f14503e = AbstractC1246t.m();
        } else {
            this.f14503e = list;
        }
    }

    public static final /* synthetic */ void i(o oVar, w6.d dVar, v6.f fVar) {
        t6.b[] bVarArr = f14498f;
        if (dVar.i(fVar, 0) || !AbstractC3159y.d(oVar.f14499a, "")) {
            dVar.y(fVar, 0, oVar.f14499a);
        }
        dVar.y(fVar, 1, oVar.f14500b);
        dVar.y(fVar, 2, oVar.f14501c);
        dVar.y(fVar, 3, oVar.f14502d);
        if (dVar.i(fVar, 4) || !AbstractC3159y.d(oVar.f14503e, AbstractC1246t.m())) {
            dVar.A(fVar, 4, bVarArr[4], oVar.f14503e);
        }
    }

    public final String c() {
        return this.f14500b;
    }

    public final String d() {
        return this.f14499a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f14502d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3159y.d(this.f14499a, oVar.f14499a) && AbstractC3159y.d(this.f14500b, oVar.f14500b) && AbstractC3159y.d(this.f14501c, oVar.f14501c) && AbstractC3159y.d(this.f14502d, oVar.f14502d) && AbstractC3159y.d(this.f14503e, oVar.f14503e)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f14503e;
    }

    public int hashCode() {
        return (((((((this.f14499a.hashCode() * 31) + this.f14500b.hashCode()) * 31) + this.f14501c.hashCode()) * 31) + this.f14502d.hashCode()) * 31) + this.f14503e.hashCode();
    }

    public String toString() {
        return "ConsumerSession(clientSecret=" + this.f14499a + ", emailAddress=" + this.f14500b + ", redactedFormattedPhoneNumber=" + this.f14501c + ", redactedPhoneNumber=" + this.f14502d + ", verificationSessions=" + this.f14503e + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14499a);
        out.writeString(this.f14500b);
        out.writeString(this.f14501c);
        out.writeString(this.f14502d);
        List list = this.f14503e;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((d) it.next()).writeToParcel(out, i8);
        }
    }

    public o(String clientSecret, String emailAddress, String redactedFormattedPhoneNumber, String redactedPhoneNumber, List verificationSessions) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(emailAddress, "emailAddress");
        AbstractC3159y.i(redactedFormattedPhoneNumber, "redactedFormattedPhoneNumber");
        AbstractC3159y.i(redactedPhoneNumber, "redactedPhoneNumber");
        AbstractC3159y.i(verificationSessions, "verificationSessions");
        this.f14499a = clientSecret;
        this.f14500b = emailAddress;
        this.f14501c = redactedFormattedPhoneNumber;
        this.f14502d = redactedPhoneNumber;
        this.f14503e = verificationSessions;
    }
}
