package b4;

import O5.C1352h;
import O5.s;
import O5.t;
import a4.q;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1975a implements Serializable, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f15359a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15360b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15361c;

    /* renamed from: d, reason: collision with root package name */
    private final q f15362d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15363e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC0361a f15364f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15365g;

    /* renamed from: h, reason: collision with root package name */
    private final List f15366h;

    /* renamed from: i, reason: collision with root package name */
    private final Boolean f15367i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f15368j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f15358k = new b(null);
    public static final Parcelable.Creator<C1975a> CREATOR = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: b4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0361a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0361a f15369b = new EnumC0361a("UserSelected", 0, "01");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0361a f15370c = new EnumC0361a("Reserved", 1, "02");

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0361a f15371d = new EnumC0361a("TransactionTimedOutDecoupled", 2, "03");

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0361a f15372e = new EnumC0361a("TransactionTimedOutOther", 3, "04");

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0361a f15373f = new EnumC0361a("TransactionTimedOutFirstCreq", 4, "05");

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0361a f15374g = new EnumC0361a("TransactionError", 5, "06");

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0361a f15375h = new EnumC0361a("Unknown", 6, "07");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumC0361a[] f15376i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ U5.a f15377j;

        /* renamed from: a, reason: collision with root package name */
        private final String f15378a;

        static {
            EnumC0361a[] a8 = a();
            f15376i = a8;
            f15377j = U5.b.a(a8);
        }

        private EnumC0361a(String str, int i8, String str2) {
            this.f15378a = str2;
        }

        private static final /* synthetic */ EnumC0361a[] a() {
            return new EnumC0361a[]{f15369b, f15370c, f15371d, f15372e, f15373f, f15374g, f15375h};
        }

        public static EnumC0361a valueOf(String str) {
            return (EnumC0361a) Enum.valueOf(EnumC0361a.class, str);
        }

        public static EnumC0361a[] values() {
            return (EnumC0361a[]) f15376i.clone();
        }

        public final String b() {
            return this.f15378a;
        }
    }

    /* renamed from: b4.a$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: b4.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1975a createFromParcel(Parcel parcel) {
            EnumC0361a valueOf;
            ArrayList arrayList;
            boolean z8;
            Boolean valueOf2;
            Boolean valueOf3;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            q createFromParcel = q.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = EnumC0361a.valueOf(parcel.readString());
            }
            String readString5 = parcel.readString();
            boolean z9 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(e.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                valueOf2 = Boolean.valueOf(z8);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                valueOf3 = Boolean.valueOf(z9);
            }
            return new C1975a(readString, readString2, readString3, createFromParcel, readString4, valueOf, readString5, arrayList, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1975a[] newArray(int i8) {
            return new C1975a[i8];
        }
    }

    public C1975a(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC0361a enumC0361a, String str2, List list, Boolean bool, Boolean bool2) {
        AbstractC3255y.i(messageVersion, "messageVersion");
        AbstractC3255y.i(threeDsServerTransId, "threeDsServerTransId");
        AbstractC3255y.i(acsTransId, "acsTransId");
        AbstractC3255y.i(sdkTransId, "sdkTransId");
        this.f15359a = messageVersion;
        this.f15360b = threeDsServerTransId;
        this.f15361c = acsTransId;
        this.f15362d = sdkTransId;
        this.f15363e = str;
        this.f15364f = enumC0361a;
        this.f15365g = str2;
        this.f15366h = list;
        this.f15367i = bool;
        this.f15368j = bool2;
    }

    public static /* synthetic */ C1975a b(C1975a c1975a, String str, String str2, String str3, q qVar, String str4, EnumC0361a enumC0361a, String str5, List list, Boolean bool, Boolean bool2, int i8, Object obj) {
        String str6;
        String str7;
        String str8;
        q qVar2;
        String str9;
        EnumC0361a enumC0361a2;
        String str10;
        List list2;
        Boolean bool3;
        Boolean bool4;
        if ((i8 & 1) != 0) {
            str6 = c1975a.f15359a;
        } else {
            str6 = str;
        }
        if ((i8 & 2) != 0) {
            str7 = c1975a.f15360b;
        } else {
            str7 = str2;
        }
        if ((i8 & 4) != 0) {
            str8 = c1975a.f15361c;
        } else {
            str8 = str3;
        }
        if ((i8 & 8) != 0) {
            qVar2 = c1975a.f15362d;
        } else {
            qVar2 = qVar;
        }
        if ((i8 & 16) != 0) {
            str9 = c1975a.f15363e;
        } else {
            str9 = str4;
        }
        if ((i8 & 32) != 0) {
            enumC0361a2 = c1975a.f15364f;
        } else {
            enumC0361a2 = enumC0361a;
        }
        if ((i8 & 64) != 0) {
            str10 = c1975a.f15365g;
        } else {
            str10 = str5;
        }
        if ((i8 & 128) != 0) {
            list2 = c1975a.f15366h;
        } else {
            list2 = list;
        }
        if ((i8 & 256) != 0) {
            bool3 = c1975a.f15367i;
        } else {
            bool3 = bool;
        }
        if ((i8 & 512) != 0) {
            bool4 = c1975a.f15368j;
        } else {
            bool4 = bool2;
        }
        return c1975a.a(str6, str7, str8, qVar2, str9, enumC0361a2, str10, list2, bool3, bool4);
    }

    public final C1975a a(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC0361a enumC0361a, String str2, List list, Boolean bool, Boolean bool2) {
        AbstractC3255y.i(messageVersion, "messageVersion");
        AbstractC3255y.i(threeDsServerTransId, "threeDsServerTransId");
        AbstractC3255y.i(acsTransId, "acsTransId");
        AbstractC3255y.i(sdkTransId, "sdkTransId");
        return new C1975a(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, str, enumC0361a, str2, list, bool, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1975a)) {
            return false;
        }
        C1975a c1975a = (C1975a) obj;
        if (AbstractC3255y.d(this.f15359a, c1975a.f15359a) && AbstractC3255y.d(this.f15360b, c1975a.f15360b) && AbstractC3255y.d(this.f15361c, c1975a.f15361c) && AbstractC3255y.d(this.f15362d, c1975a.f15362d) && AbstractC3255y.d(this.f15363e, c1975a.f15363e) && this.f15364f == c1975a.f15364f && AbstractC3255y.d(this.f15365g, c1975a.f15365g) && AbstractC3255y.d(this.f15366h, c1975a.f15366h) && AbstractC3255y.d(this.f15367i, c1975a.f15367i) && AbstractC3255y.d(this.f15368j, c1975a.f15368j)) {
            return true;
        }
        return false;
    }

    public final String g() {
        return this.f15361c;
    }

    public final EnumC0361a h() {
        return this.f15364f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((((((this.f15359a.hashCode() * 31) + this.f15360b.hashCode()) * 31) + this.f15361c.hashCode()) * 31) + this.f15362d.hashCode()) * 31;
        String str = this.f15363e;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode) * 31;
        EnumC0361a enumC0361a = this.f15364f;
        if (enumC0361a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC0361a.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f15365g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list = this.f15366h;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool = this.f15367i;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool2 = this.f15368j;
        if (bool2 != null) {
            i8 = bool2.hashCode();
        }
        return i13 + i8;
    }

    public final List i() {
        return this.f15366h;
    }

    public final String s() {
        return this.f15359a;
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.f15359a + ", threeDsServerTransId=" + this.f15360b + ", acsTransId=" + this.f15361c + ", sdkTransId=" + this.f15362d + ", challengeDataEntry=" + this.f15363e + ", cancelReason=" + this.f15364f + ", challengeHtmlDataEntry=" + this.f15365g + ", messageExtensions=" + this.f15366h + ", oobContinue=" + this.f15367i + ", shouldResendChallenge=" + this.f15368j + ")";
    }

    public final q u() {
        return this.f15362d;
    }

    public final String v() {
        return this.f15360b;
    }

    public final C1975a w() {
        return b(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f15359a);
        out.writeString(this.f15360b);
        out.writeString(this.f15361c);
        this.f15362d.writeToParcel(out, i8);
        out.writeString(this.f15363e);
        EnumC0361a enumC0361a = this.f15364f;
        if (enumC0361a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC0361a.name());
        }
        out.writeString(this.f15365g);
        List list = this.f15366h;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).writeToParcel(out, i8);
            }
        }
        Boolean bool = this.f15367i;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f15368j;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public final JSONObject x() {
        String str;
        try {
            s.a aVar = s.f8302b;
            JSONObject put = new JSONObject().put("messageType", "CReq").put("messageVersion", this.f15359a).put("sdkTransID", this.f15362d.a()).put("threeDSServerTransID", this.f15360b).put("acsTransID", this.f15361c);
            EnumC0361a enumC0361a = this.f15364f;
            if (enumC0361a != null) {
                put.put("challengeCancel", enumC0361a.b());
            }
            String str2 = this.f15363e;
            if (str2 != null) {
                put.put("challengeDataEntry", str2);
            }
            String str3 = this.f15365g;
            if (str3 != null) {
                put.put("challengeHTMLDataEntry", str3);
            }
            JSONArray c8 = e.f15440e.c(this.f15366h);
            if (c8 != null) {
                put.put("messageExtensions", c8);
            }
            Boolean bool = this.f15367i;
            if (bool != null) {
                put.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.f15368j;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "Y";
                } else {
                    str = "N";
                }
                put.put("resendChallenge", str);
            }
            AbstractC3255y.f(put);
            return put;
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            Throwable e8 = s.e(s.b(t.a(th)));
            if (e8 == null) {
                throw new C1352h();
            }
            throw new U3.b(e8);
        }
    }

    public /* synthetic */ C1975a(String str, String str2, String str3, q qVar, String str4, EnumC0361a enumC0361a, String str5, List list, Boolean bool, Boolean bool2, int i8, AbstractC3247p abstractC3247p) {
        this(str, str2, str3, qVar, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : enumC0361a, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : list, (i8 & 256) != 0 ? null : bool, (i8 & 512) != 0 ? null : bool2);
    }
}
