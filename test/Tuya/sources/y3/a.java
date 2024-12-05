package Y3;

import L5.C1224h;
import L5.s;
import L5.t;
import X3.q;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a implements Serializable, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f13074a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13075b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13076c;

    /* renamed from: d, reason: collision with root package name */
    private final q f13077d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13078e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC0247a f13079f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13080g;

    /* renamed from: h, reason: collision with root package name */
    private final List f13081h;

    /* renamed from: i, reason: collision with root package name */
    private final Boolean f13082i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f13083j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f13073k = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Y3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0247a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0247a f13084b = new EnumC0247a("UserSelected", 0, "01");

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0247a f13085c = new EnumC0247a("Reserved", 1, "02");

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0247a f13086d = new EnumC0247a("TransactionTimedOutDecoupled", 2, "03");

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0247a f13087e = new EnumC0247a("TransactionTimedOutOther", 3, "04");

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0247a f13088f = new EnumC0247a("TransactionTimedOutFirstCreq", 4, "05");

        /* renamed from: g, reason: collision with root package name */
        public static final EnumC0247a f13089g = new EnumC0247a("TransactionError", 5, "06");

        /* renamed from: h, reason: collision with root package name */
        public static final EnumC0247a f13090h = new EnumC0247a("Unknown", 6, "07");

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumC0247a[] f13091i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ R5.a f13092j;

        /* renamed from: a, reason: collision with root package name */
        private final String f13093a;

        static {
            EnumC0247a[] a8 = a();
            f13091i = a8;
            f13092j = R5.b.a(a8);
        }

        private EnumC0247a(String str, int i8, String str2) {
            this.f13093a = str2;
        }

        private static final /* synthetic */ EnumC0247a[] a() {
            return new EnumC0247a[]{f13084b, f13085c, f13086d, f13087e, f13088f, f13089g, f13090h};
        }

        public static EnumC0247a valueOf(String str) {
            return (EnumC0247a) Enum.valueOf(EnumC0247a.class, str);
        }

        public static EnumC0247a[] values() {
            return (EnumC0247a[]) f13091i.clone();
        }

        public final String b() {
            return this.f13093a;
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
        public final a createFromParcel(Parcel parcel) {
            EnumC0247a valueOf;
            ArrayList arrayList;
            boolean z8;
            Boolean valueOf2;
            Boolean valueOf3;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            q createFromParcel = q.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = EnumC0247a.valueOf(parcel.readString());
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
            return new a(readString, readString2, readString3, createFromParcel, readString4, valueOf, readString5, arrayList, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC0247a enumC0247a, String str2, List list, Boolean bool, Boolean bool2) {
        AbstractC3159y.i(messageVersion, "messageVersion");
        AbstractC3159y.i(threeDsServerTransId, "threeDsServerTransId");
        AbstractC3159y.i(acsTransId, "acsTransId");
        AbstractC3159y.i(sdkTransId, "sdkTransId");
        this.f13074a = messageVersion;
        this.f13075b = threeDsServerTransId;
        this.f13076c = acsTransId;
        this.f13077d = sdkTransId;
        this.f13078e = str;
        this.f13079f = enumC0247a;
        this.f13080g = str2;
        this.f13081h = list;
        this.f13082i = bool;
        this.f13083j = bool2;
    }

    public static /* synthetic */ a c(a aVar, String str, String str2, String str3, q qVar, String str4, EnumC0247a enumC0247a, String str5, List list, Boolean bool, Boolean bool2, int i8, Object obj) {
        String str6;
        String str7;
        String str8;
        q qVar2;
        String str9;
        EnumC0247a enumC0247a2;
        String str10;
        List list2;
        Boolean bool3;
        Boolean bool4;
        if ((i8 & 1) != 0) {
            str6 = aVar.f13074a;
        } else {
            str6 = str;
        }
        if ((i8 & 2) != 0) {
            str7 = aVar.f13075b;
        } else {
            str7 = str2;
        }
        if ((i8 & 4) != 0) {
            str8 = aVar.f13076c;
        } else {
            str8 = str3;
        }
        if ((i8 & 8) != 0) {
            qVar2 = aVar.f13077d;
        } else {
            qVar2 = qVar;
        }
        if ((i8 & 16) != 0) {
            str9 = aVar.f13078e;
        } else {
            str9 = str4;
        }
        if ((i8 & 32) != 0) {
            enumC0247a2 = aVar.f13079f;
        } else {
            enumC0247a2 = enumC0247a;
        }
        if ((i8 & 64) != 0) {
            str10 = aVar.f13080g;
        } else {
            str10 = str5;
        }
        if ((i8 & 128) != 0) {
            list2 = aVar.f13081h;
        } else {
            list2 = list;
        }
        if ((i8 & 256) != 0) {
            bool3 = aVar.f13082i;
        } else {
            bool3 = bool;
        }
        if ((i8 & 512) != 0) {
            bool4 = aVar.f13083j;
        } else {
            bool4 = bool2;
        }
        return aVar.b(str6, str7, str8, qVar2, str9, enumC0247a2, str10, list2, bool3, bool4);
    }

    public final JSONObject I() {
        String str;
        try {
            s.a aVar = s.f6511b;
            JSONObject put = new JSONObject().put("messageType", "CReq").put("messageVersion", this.f13074a).put("sdkTransID", this.f13077d.b()).put("threeDSServerTransID", this.f13075b).put("acsTransID", this.f13076c);
            EnumC0247a enumC0247a = this.f13079f;
            if (enumC0247a != null) {
                put.put("challengeCancel", enumC0247a.b());
            }
            String str2 = this.f13078e;
            if (str2 != null) {
                put.put("challengeDataEntry", str2);
            }
            String str3 = this.f13080g;
            if (str3 != null) {
                put.put("challengeHTMLDataEntry", str3);
            }
            JSONArray c8 = e.f13155e.c(this.f13081h);
            if (c8 != null) {
                put.put("messageExtensions", c8);
            }
            Boolean bool = this.f13082i;
            if (bool != null) {
                put.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.f13083j;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "Y";
                } else {
                    str = "N";
                }
                put.put("resendChallenge", str);
            }
            AbstractC3159y.f(put);
            return put;
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            Throwable e8 = s.e(s.b(t.a(th)));
            if (e8 == null) {
                throw new C1224h();
            }
            throw new R3.b(e8);
        }
    }

    public final a b(String messageVersion, String threeDsServerTransId, String acsTransId, q sdkTransId, String str, EnumC0247a enumC0247a, String str2, List list, Boolean bool, Boolean bool2) {
        AbstractC3159y.i(messageVersion, "messageVersion");
        AbstractC3159y.i(threeDsServerTransId, "threeDsServerTransId");
        AbstractC3159y.i(acsTransId, "acsTransId");
        AbstractC3159y.i(sdkTransId, "sdkTransId");
        return new a(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, str, enumC0247a, str2, list, bool, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f13076c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f13074a, aVar.f13074a) && AbstractC3159y.d(this.f13075b, aVar.f13075b) && AbstractC3159y.d(this.f13076c, aVar.f13076c) && AbstractC3159y.d(this.f13077d, aVar.f13077d) && AbstractC3159y.d(this.f13078e, aVar.f13078e) && this.f13079f == aVar.f13079f && AbstractC3159y.d(this.f13080g, aVar.f13080g) && AbstractC3159y.d(this.f13081h, aVar.f13081h) && AbstractC3159y.d(this.f13082i, aVar.f13082i) && AbstractC3159y.d(this.f13083j, aVar.f13083j)) {
            return true;
        }
        return false;
    }

    public final EnumC0247a f() {
        return this.f13079f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((((((this.f13074a.hashCode() * 31) + this.f13075b.hashCode()) * 31) + this.f13076c.hashCode()) * 31) + this.f13077d.hashCode()) * 31;
        String str = this.f13078e;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode) * 31;
        EnumC0247a enumC0247a = this.f13079f;
        if (enumC0247a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = enumC0247a.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f13080g;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        List list = this.f13081h;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Boolean bool = this.f13082i;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        Boolean bool2 = this.f13083j;
        if (bool2 != null) {
            i8 = bool2.hashCode();
        }
        return i13 + i8;
    }

    public final List j() {
        return this.f13081h;
    }

    public final String k() {
        return this.f13074a;
    }

    public final q n() {
        return this.f13077d;
    }

    public final String o() {
        return this.f13075b;
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.f13074a + ", threeDsServerTransId=" + this.f13075b + ", acsTransId=" + this.f13076c + ", sdkTransId=" + this.f13077d + ", challengeDataEntry=" + this.f13078e + ", cancelReason=" + this.f13079f + ", challengeHtmlDataEntry=" + this.f13080g + ", messageExtensions=" + this.f13081h + ", oobContinue=" + this.f13082i + ", shouldResendChallenge=" + this.f13083j + ")";
    }

    public final a u() {
        return c(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f13074a);
        out.writeString(this.f13075b);
        out.writeString(this.f13076c);
        this.f13077d.writeToParcel(out, i8);
        out.writeString(this.f13078e);
        EnumC0247a enumC0247a = this.f13079f;
        if (enumC0247a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC0247a.name());
        }
        out.writeString(this.f13080g);
        List list = this.f13081h;
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
        Boolean bool = this.f13082i;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f13083j;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, q qVar, String str4, EnumC0247a enumC0247a, String str5, List list, Boolean bool, Boolean bool2, int i8, AbstractC3151p abstractC3151p) {
        this(str, str2, str3, qVar, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : enumC0247a, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : list, (i8 & 256) != 0 ? null : bool, (i8 & 512) != 0 ? null : bool2);
    }
}
