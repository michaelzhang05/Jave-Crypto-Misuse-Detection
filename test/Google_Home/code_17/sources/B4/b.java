package b4;

import O5.C1352h;
import O5.s;
import O5.t;
import P5.AbstractC1378t;
import P5.a0;
import a4.q;
import a4.u;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import j6.C3205d;
import j6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    /* renamed from: C, reason: collision with root package name */
    public static final C0364b f15379C = new C0364b(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: D, reason: collision with root package name */
    private static final List f15380D = AbstractC1378t.p("Y", "N");

    /* renamed from: E, reason: collision with root package name */
    private static final Set f15381E = a0.i("threeDSServerTransID", "acsCounterAtoS", "acsTransID", "challengeCompletionInd", "messageExtension", "messageType", "messageVersion", "sdkTransID", "transStatus");

    /* renamed from: A, reason: collision with root package name */
    private final String f15382A;

    /* renamed from: B, reason: collision with root package name */
    private final String f15383B;

    /* renamed from: a, reason: collision with root package name */
    private final String f15384a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15385b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15386c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15387d;

    /* renamed from: e, reason: collision with root package name */
    private final g f15388e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15389f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15390g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15391h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15392i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15393j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f15394k;

    /* renamed from: l, reason: collision with root package name */
    private final List f15395l;

    /* renamed from: m, reason: collision with root package name */
    private final String f15396m;

    /* renamed from: n, reason: collision with root package name */
    private final String f15397n;

    /* renamed from: o, reason: collision with root package name */
    private final d f15398o;

    /* renamed from: p, reason: collision with root package name */
    private final List f15399p;

    /* renamed from: q, reason: collision with root package name */
    private final String f15400q;

    /* renamed from: r, reason: collision with root package name */
    private final String f15401r;

    /* renamed from: s, reason: collision with root package name */
    private final String f15402s;

    /* renamed from: t, reason: collision with root package name */
    private final String f15403t;

    /* renamed from: u, reason: collision with root package name */
    private final d f15404u;

    /* renamed from: v, reason: collision with root package name */
    private final String f15405v;

    /* renamed from: w, reason: collision with root package name */
    private final q f15406w;

    /* renamed from: x, reason: collision with root package name */
    private final String f15407x;

    /* renamed from: y, reason: collision with root package name */
    private final String f15408y;

    /* renamed from: z, reason: collision with root package name */
    private final String f15409z;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f15411a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15412b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0362a f15410c = new C0362a(null);
        public static final Parcelable.Creator<a> CREATOR = new C0363b();

        /* renamed from: b4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0362a {
            private C0362a() {
            }

            public final List a(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                    if (optJSONObject != null) {
                        String next = optJSONObject.keys().next();
                        String optString = optJSONObject.optString(next);
                        AbstractC3255y.f(next);
                        AbstractC3255y.f(optString);
                        arrayList.add(new a(next, optString));
                    }
                }
                return arrayList;
            }

            public /* synthetic */ C0362a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: b4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0363b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String name, String text) {
            AbstractC3255y.i(name, "name");
            AbstractC3255y.i(text, "text");
            this.f15411a = name;
            this.f15412b = text;
        }

        public final String a() {
            return this.f15411a;
        }

        public final String b() {
            return this.f15412b;
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
            if (AbstractC3255y.d(this.f15411a, aVar.f15411a) && AbstractC3255y.d(this.f15412b, aVar.f15412b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f15411a.hashCode() * 31) + this.f15412b.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.f15411a + ", text=" + this.f15412b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f15411a);
            out.writeString(this.f15412b);
        }
    }

    /* renamed from: b4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0364b {
        private C0364b() {
        }

        private final String c(String str) {
            Object b8;
            Object obj = null;
            if (str == null) {
                return null;
            }
            C0364b c0364b = b.f15379C;
            try {
                s.a aVar = s.f8302b;
                byte[] decode = Base64.decode(str, 8);
                AbstractC3255y.h(decode, "decode(...)");
                b8 = s.b(new String(decode, C3205d.f34020b));
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            if (!s.g(b8)) {
                obj = b8;
            }
            return (String) obj;
        }

        private final String j(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public final void a(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            Iterator<String> keys = cresJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!b.f15381E.contains(next)) {
                    throw new b4.c(f.f15446c.b(), "Message is not final CRes", "Invalid data element for final CRes: " + next);
                }
            }
        }

        public final void b(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            if (AbstractC3255y.d("CRes", cresJson.optString("messageType"))) {
            } else {
                throw new b4.c(f.f15446c.b(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final b d(JSONObject cresJson) {
            b bVar;
            AbstractC3255y.i(cresJson, "cresJson");
            b(cresJson);
            boolean p8 = p(cresJson, "challengeCompletionInd", true);
            q qVar = new q(n(cresJson, "sdkTransID"));
            String uuid = n(cresJson, "threeDSServerTransID").toString();
            AbstractC3255y.h(uuid, "toString(...)");
            String uuid2 = n(cresJson, "acsTransID").toString();
            AbstractC3255y.h(uuid2, "toString(...)");
            String h8 = h(cresJson);
            List g8 = g(cresJson);
            if (p8) {
                a(cresJson);
                bVar = new b(uuid, uuid2, null, null, null, p8, null, null, null, null, false, null, null, null, null, g8, h8, null, null, null, null, null, qVar, null, null, null, null, m(cresJson).b(), 129925084, null);
            } else {
                boolean p9 = p(cresJson, "challengeInfoTextIndicator", false);
                String k8 = k(cresJson);
                JSONArray e8 = e(cresJson);
                g o8 = o(cresJson);
                String l8 = l(cresJson, o8);
                String f8 = f(cresJson, o8);
                String i8 = i(cresJson, o8);
                List a8 = a.f15410c.a(e8);
                String c8 = c(cresJson.optString("acsHTMLRefresh"));
                String optString = cresJson.optString("challengeInfoHeader");
                String optString2 = cresJson.optString("challengeInfoLabel");
                String optString3 = cresJson.optString("challengeInfoText");
                String optString4 = cresJson.optString("challengeAddInfo");
                String optString5 = cresJson.optString("expandInfoLabel");
                String optString6 = cresJson.optString("expandInfoText");
                d.a aVar = d.f15413d;
                bVar = new b(uuid, uuid2, f8, c8, o8, p8, optString, optString2, optString3, optString4, p9, a8, optString5, optString6, aVar.a(cresJson.optJSONObject("issuerImage")), g8, h8, cresJson.optString("oobAppURL"), cresJson.optString("oobAppLabel"), i8, aVar.a(cresJson.optJSONObject("psImage")), k8, qVar, l8, cresJson.optString("whitelistingInfoText"), cresJson.optString("whyInfoLabel"), cresJson.optString("whyInfoText"), "");
            }
            if (bVar.g0()) {
                return bVar;
            }
            throw b4.c.f15417d.b("UI fields missing");
        }

        public final JSONArray e(JSONObject cresJson) {
            Object b8;
            AbstractC3255y.i(cresJson, "cresJson");
            if (!cresJson.has("challengeSelectInfo")) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            C0364b c0364b = b.f15379C;
            try {
                s.a aVar = s.f8302b;
                b8 = s.b(cresJson.getJSONArray("challengeSelectInfo"));
            } catch (Throwable th) {
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(th));
            }
            if (s.e(b8) == null) {
                return (JSONArray) b8;
            }
            throw b4.c.f15417d.a("challengeSelectInfo");
        }

        public final String f(JSONObject cresJson, g uiType) {
            AbstractC3255y.i(cresJson, "cresJson");
            AbstractC3255y.i(uiType, "uiType");
            String j8 = j(cresJson, "acsHTML");
            if ((j8 != null && !n.u(j8)) || uiType != g.f15463h) {
                return c(j8);
            }
            throw b4.c.f15417d.b("acsHTML");
        }

        public final List g(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            List b8 = e.f15440e.b(cresJson.optJSONArray("messageExtension"));
            if (b8 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : b8) {
                    e eVar = (e) obj;
                    if (eVar.a() && !eVar.b()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new b4.c(f.f15449f, AbstractC1378t.w0(arrayList, ",", null, null, 0, null, null, 62, null));
                }
            }
            return b8;
        }

        public final String h(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            String optString = cresJson.optString("messageVersion");
            AbstractC3255y.f(optString);
            if (!(!n.u(optString))) {
                optString = null;
            }
            if (optString != null) {
                return optString;
            }
            throw b4.c.f15417d.b("messageVersion");
        }

        public final String i(JSONObject cresJson, g uiType) {
            AbstractC3255y.i(cresJson, "cresJson");
            AbstractC3255y.i(uiType, "uiType");
            String optString = cresJson.optString("oobContinueLabel");
            if ((optString != null && !n.u(optString)) || uiType != g.f15462g) {
                return optString;
            }
            throw b4.c.f15417d.b("oobContinueLabel");
        }

        public final String k(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            String j8 = j(cresJson, "resendInformationLabel");
            if (j8 != null && j8.length() == 0) {
                throw b4.c.f15417d.a("resendInformationLabel");
            }
            return j8;
        }

        public final String l(JSONObject cresJson, g uiType) {
            AbstractC3255y.i(cresJson, "cresJson");
            AbstractC3255y.i(uiType, "uiType");
            String j8 = j(cresJson, "submitAuthenticationLabel");
            if ((j8 != null && !n.u(j8)) || !uiType.d()) {
                return j8;
            }
            throw b4.c.f15417d.b("submitAuthenticationLabel");
        }

        public final u m(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            String optString = cresJson.optString("transStatus");
            if (optString != null && !n.u(optString)) {
                u a8 = u.f13926b.a(optString);
                if (a8 != null) {
                    return a8;
                }
                throw b4.c.f15417d.a("transStatus");
            }
            throw b4.c.f15417d.b("transStatus");
        }

        public final UUID n(JSONObject cresJson, String fieldName) {
            AbstractC3255y.i(cresJson, "cresJson");
            AbstractC3255y.i(fieldName, "fieldName");
            String optString = cresJson.optString(fieldName);
            if (optString != null && !n.u(optString)) {
                try {
                    s.a aVar = s.f8302b;
                    UUID fromString = UUID.fromString(optString);
                    AbstractC3255y.h(fromString, "fromString(...)");
                    return fromString;
                } catch (Throwable th) {
                    s.a aVar2 = s.f8302b;
                    if (s.e(s.b(t.a(th))) == null) {
                        throw new C1352h();
                    }
                    throw b4.c.f15417d.a(fieldName);
                }
            }
            throw b4.c.f15417d.b(fieldName);
        }

        public final g o(JSONObject cresJson) {
            AbstractC3255y.i(cresJson, "cresJson");
            String optString = cresJson.optString("acsUiType");
            if (optString != null && !n.u(optString)) {
                g a8 = g.f15458c.a(optString);
                if (a8 != null) {
                    return a8;
                }
                throw b4.c.f15417d.a("acsUiType");
            }
            throw b4.c.f15417d.b("acsUiType");
        }

        public final boolean p(JSONObject cresJson, String fieldName, boolean z8) {
            String j8;
            AbstractC3255y.i(cresJson, "cresJson");
            AbstractC3255y.i(fieldName, "fieldName");
            if (z8) {
                if (cresJson.has(fieldName)) {
                    j8 = cresJson.getString(fieldName);
                } else {
                    throw b4.c.f15417d.b(fieldName);
                }
            } else {
                j8 = j(cresJson, fieldName);
            }
            if (j8 != null && !b.f15380D.contains(j8)) {
                if (!z8 || !n.u(j8)) {
                    throw b4.c.f15417d.a(fieldName);
                }
                throw b4.c.f15417d.b(fieldName);
            }
            return AbstractC3255y.d("Y", j8);
        }

        public /* synthetic */ C0364b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            g valueOf;
            boolean z8;
            boolean z9;
            ArrayList arrayList;
            d createFromParcel;
            ArrayList arrayList2;
            d createFromParcel2;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = g.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(a.CREATOR.createFromParcel(parcel));
                }
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = d.CREATOR.createFromParcel(parcel);
            }
            d dVar = createFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i9 = 0;
                while (i9 != readInt2) {
                    arrayList3.add(e.CREATOR.createFromParcel(parcel));
                    i9++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList3;
            }
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = d.CREATOR.createFromParcel(parcel);
            }
            return new b(readString, readString2, readString3, readString4, valueOf, z8, readString5, readString6, readString7, readString8, z9, arrayList, readString9, readString10, dVar, arrayList2, readString11, readString12, readString13, readString14, createFromParcel2, parcel.readString(), q.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f15414a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15415b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15416c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f15413d = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0365b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final d a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new d(jSONObject.optString("medium"), jSONObject.optString("high"), jSONObject.optString("extraHigh"));
                }
                return null;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: b4.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0365b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3) {
            this.f15414a = str;
            this.f15415b = str2;
            this.f15416c = str3;
        }

        public final String a() {
            Object obj;
            boolean z8;
            Iterator it = AbstractC1378t.p(this.f15416c, this.f15415b, this.f15414a).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    String str = (String) obj;
                    if (str != null && !n.u(str)) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (!z8) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (String) obj;
        }

        public final String b(int i8) {
            String str;
            if (i8 <= 160) {
                str = this.f15414a;
            } else if (i8 >= 320) {
                str = this.f15416c;
            } else {
                str = this.f15415b;
            }
            if (str == null || n.u(str)) {
                str = null;
            }
            if (str == null) {
                return a();
            }
            return str;
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
            if (AbstractC3255y.d(this.f15414a, dVar.f15414a) && AbstractC3255y.d(this.f15415b, dVar.f15415b) && AbstractC3255y.d(this.f15416c, dVar.f15416c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f15414a;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = hashCode * 31;
            String str2 = this.f15415b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.f15416c;
            if (str3 != null) {
                i8 = str3.hashCode();
            }
            return i10 + i8;
        }

        public String toString() {
            return "Image(mediumUrl=" + this.f15414a + ", highUrl=" + this.f15415b + ", extraHighUrl=" + this.f15416c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f15414a);
            out.writeString(this.f15415b);
            out.writeString(this.f15416c);
        }
    }

    public b(String serverTransId, String acsTransId, String str, String str2, g gVar, boolean z8, String str3, String str4, String str5, String str6, boolean z9, List list, String str7, String str8, d dVar, List list2, String messageVersion, String str9, String str10, String str11, d dVar2, String str12, q sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        AbstractC3255y.i(serverTransId, "serverTransId");
        AbstractC3255y.i(acsTransId, "acsTransId");
        AbstractC3255y.i(messageVersion, "messageVersion");
        AbstractC3255y.i(sdkTransId, "sdkTransId");
        this.f15384a = serverTransId;
        this.f15385b = acsTransId;
        this.f15386c = str;
        this.f15387d = str2;
        this.f15388e = gVar;
        this.f15389f = z8;
        this.f15390g = str3;
        this.f15391h = str4;
        this.f15392i = str5;
        this.f15393j = str6;
        this.f15394k = z9;
        this.f15395l = list;
        this.f15396m = str7;
        this.f15397n = str8;
        this.f15398o = dVar;
        this.f15399p = list2;
        this.f15400q = messageVersion;
        this.f15401r = str9;
        this.f15402s = str10;
        this.f15403t = str11;
        this.f15404u = dVar2;
        this.f15405v = str12;
        this.f15406w = sdkTransId;
        this.f15407x = str13;
        this.f15408y = str14;
        this.f15409z = str15;
        this.f15382A = str16;
        this.f15383B = str17;
    }

    public final String H() {
        return this.f15403t;
    }

    public final d J() {
        return this.f15404u;
    }

    public final String U() {
        return this.f15405v;
    }

    public final q W() {
        return this.f15406w;
    }

    public final String X() {
        return this.f15384a;
    }

    public final boolean Y() {
        return this.f15394k;
    }

    public final String Z() {
        return this.f15407x;
    }

    public final String a0() {
        return this.f15383B;
    }

    public final g b0() {
        return this.f15388e;
    }

    public final String c0() {
        return this.f15408y;
    }

    public final String d0() {
        return this.f15409z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e0() {
        return this.f15382A;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3255y.d(this.f15384a, bVar.f15384a) && AbstractC3255y.d(this.f15385b, bVar.f15385b) && AbstractC3255y.d(this.f15386c, bVar.f15386c) && AbstractC3255y.d(this.f15387d, bVar.f15387d) && this.f15388e == bVar.f15388e && this.f15389f == bVar.f15389f && AbstractC3255y.d(this.f15390g, bVar.f15390g) && AbstractC3255y.d(this.f15391h, bVar.f15391h) && AbstractC3255y.d(this.f15392i, bVar.f15392i) && AbstractC3255y.d(this.f15393j, bVar.f15393j) && this.f15394k == bVar.f15394k && AbstractC3255y.d(this.f15395l, bVar.f15395l) && AbstractC3255y.d(this.f15396m, bVar.f15396m) && AbstractC3255y.d(this.f15397n, bVar.f15397n) && AbstractC3255y.d(this.f15398o, bVar.f15398o) && AbstractC3255y.d(this.f15399p, bVar.f15399p) && AbstractC3255y.d(this.f15400q, bVar.f15400q) && AbstractC3255y.d(this.f15401r, bVar.f15401r) && AbstractC3255y.d(this.f15402s, bVar.f15402s) && AbstractC3255y.d(this.f15403t, bVar.f15403t) && AbstractC3255y.d(this.f15404u, bVar.f15404u) && AbstractC3255y.d(this.f15405v, bVar.f15405v) && AbstractC3255y.d(this.f15406w, bVar.f15406w) && AbstractC3255y.d(this.f15407x, bVar.f15407x) && AbstractC3255y.d(this.f15408y, bVar.f15408y) && AbstractC3255y.d(this.f15409z, bVar.f15409z) && AbstractC3255y.d(this.f15382A, bVar.f15382A) && AbstractC3255y.d(this.f15383B, bVar.f15383B)) {
            return true;
        }
        return false;
    }

    public final boolean f0() {
        return this.f15389f;
    }

    public final String g() {
        return this.f15386c;
    }

    public final boolean g0() {
        List list;
        boolean z8;
        g gVar = this.f15388e;
        if (gVar == null) {
            return true;
        }
        boolean z9 = false;
        if (gVar == g.f15463h) {
            String str = this.f15386c;
            if (str == null || n.u(str)) {
                z9 = true;
            }
            return !z9;
        }
        Set i8 = a0.i(this.f15390g, this.f15391h, this.f15392i, this.f15409z, this.f15382A, this.f15396m, this.f15397n, this.f15405v);
        if (!(i8 instanceof Collection) || !i8.isEmpty()) {
            Iterator it = i8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && !n.u(str2)) {
                    g gVar2 = this.f15388e;
                    if (gVar2 == g.f15462g) {
                        Set<String> i9 = a0.i(this.f15402s, this.f15401r, this.f15403t);
                        if (!(i9 instanceof Collection) || !i9.isEmpty()) {
                            for (String str3 : i9) {
                                if (str3 != null && !n.u(str3)) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (!z8) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if ((gVar2 != g.f15460e && gVar2 != g.f15461f) || ((list = this.f15395l) != null && !list.isEmpty())) {
                        String str4 = this.f15407x;
                        if (str4 == null || n.u(str4)) {
                            z9 = true;
                        }
                        return !z9;
                    }
                }
            }
        }
        return false;
    }

    public final String h() {
        return this.f15387d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22 = ((this.f15384a.hashCode() * 31) + this.f15385b.hashCode()) * 31;
        String str = this.f15386c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode22 + hashCode) * 31;
        String str2 = this.f15387d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        g gVar = this.f15388e;
        if (gVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = gVar.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        boolean z8 = this.f15389f;
        int i12 = 1;
        int i13 = z8;
        if (z8 != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        String str3 = this.f15390g;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.f15391h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str5 = this.f15392i;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str6 = this.f15393j;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        boolean z9 = this.f15394k;
        if (!z9) {
            i12 = z9 ? 1 : 0;
        }
        int i19 = (i18 + i12) * 31;
        List list = this.f15395l;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        String str7 = this.f15396m;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i21 = (i20 + hashCode9) * 31;
        String str8 = this.f15397n;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        d dVar = this.f15398o;
        if (dVar == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = dVar.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        List list2 = this.f15399p;
        if (list2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list2.hashCode();
        }
        int hashCode23 = (((i23 + hashCode12) * 31) + this.f15400q.hashCode()) * 31;
        String str9 = this.f15401r;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int i24 = (hashCode23 + hashCode13) * 31;
        String str10 = this.f15402s;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int i25 = (i24 + hashCode14) * 31;
        String str11 = this.f15403t;
        if (str11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str11.hashCode();
        }
        int i26 = (i25 + hashCode15) * 31;
        d dVar2 = this.f15404u;
        if (dVar2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = dVar2.hashCode();
        }
        int i27 = (i26 + hashCode16) * 31;
        String str12 = this.f15405v;
        if (str12 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str12.hashCode();
        }
        int hashCode24 = (((i27 + hashCode17) * 31) + this.f15406w.hashCode()) * 31;
        String str13 = this.f15407x;
        if (str13 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str13.hashCode();
        }
        int i28 = (hashCode24 + hashCode18) * 31;
        String str14 = this.f15408y;
        if (str14 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str14.hashCode();
        }
        int i29 = (i28 + hashCode19) * 31;
        String str15 = this.f15409z;
        if (str15 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str15.hashCode();
        }
        int i30 = (i29 + hashCode20) * 31;
        String str16 = this.f15382A;
        if (str16 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str16.hashCode();
        }
        int i31 = (i30 + hashCode21) * 31;
        String str17 = this.f15383B;
        if (str17 != null) {
            i8 = str17.hashCode();
        }
        return i31 + i8;
    }

    public final String i() {
        return this.f15385b;
    }

    public final String l() {
        return this.f15393j;
    }

    public final String p() {
        return this.f15390g;
    }

    public final String s() {
        return this.f15391h;
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.f15384a + ", acsTransId=" + this.f15385b + ", acsHtml=" + this.f15386c + ", acsHtmlRefresh=" + this.f15387d + ", uiType=" + this.f15388e + ", isChallengeCompleted=" + this.f15389f + ", challengeInfoHeader=" + this.f15390g + ", challengeInfoLabel=" + this.f15391h + ", challengeInfoText=" + this.f15392i + ", challengeAdditionalInfoText=" + this.f15393j + ", shouldShowChallengeInfoTextIndicator=" + this.f15394k + ", challengeSelectOptions=" + this.f15395l + ", expandInfoLabel=" + this.f15396m + ", expandInfoText=" + this.f15397n + ", issuerImage=" + this.f15398o + ", messageExtensions=" + this.f15399p + ", messageVersion=" + this.f15400q + ", oobAppUrl=" + this.f15401r + ", oobAppLabel=" + this.f15402s + ", oobContinueLabel=" + this.f15403t + ", paymentSystemImage=" + this.f15404u + ", resendInformationLabel=" + this.f15405v + ", sdkTransId=" + this.f15406w + ", submitAuthenticationLabel=" + this.f15407x + ", whitelistingInfoText=" + this.f15408y + ", whyInfoLabel=" + this.f15409z + ", whyInfoText=" + this.f15382A + ", transStatus=" + this.f15383B + ")";
    }

    public final String u() {
        return this.f15392i;
    }

    public final List v() {
        return this.f15395l;
    }

    public final String w() {
        return this.f15396m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f15384a);
        out.writeString(this.f15385b);
        out.writeString(this.f15386c);
        out.writeString(this.f15387d);
        g gVar = this.f15388e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(gVar.name());
        }
        out.writeInt(this.f15389f ? 1 : 0);
        out.writeString(this.f15390g);
        out.writeString(this.f15391h);
        out.writeString(this.f15392i);
        out.writeString(this.f15393j);
        out.writeInt(this.f15394k ? 1 : 0);
        List list = this.f15395l;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).writeToParcel(out, i8);
            }
        }
        out.writeString(this.f15396m);
        out.writeString(this.f15397n);
        d dVar = this.f15398o;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        List list2 = this.f15399p;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).writeToParcel(out, i8);
            }
        }
        out.writeString(this.f15400q);
        out.writeString(this.f15401r);
        out.writeString(this.f15402s);
        out.writeString(this.f15403t);
        d dVar2 = this.f15404u;
        if (dVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar2.writeToParcel(out, i8);
        }
        out.writeString(this.f15405v);
        this.f15406w.writeToParcel(out, i8);
        out.writeString(this.f15407x);
        out.writeString(this.f15408y);
        out.writeString(this.f15409z);
        out.writeString(this.f15382A);
        out.writeString(this.f15383B);
    }

    public final String x() {
        return this.f15397n;
    }

    public final d y() {
        return this.f15398o;
    }

    public final String z() {
        return this.f15400q;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, g gVar, boolean z8, String str5, String str6, String str7, String str8, boolean z9, List list, String str9, String str10, d dVar, List list2, String str11, String str12, String str13, String str14, d dVar2, String str15, q qVar, String str16, String str17, String str18, String str19, String str20, int i8, AbstractC3247p abstractC3247p) {
        this(str, str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? null : str5, (i8 & 128) != 0 ? null : str6, (i8 & 256) != 0 ? null : str7, (i8 & 512) != 0 ? null : str8, (i8 & 1024) != 0 ? false : z9, (i8 & 2048) != 0 ? null : list, (i8 & 4096) != 0 ? null : str9, (i8 & 8192) != 0 ? null : str10, (i8 & 16384) != 0 ? null : dVar, (32768 & i8) != 0 ? null : list2, str11, (131072 & i8) != 0 ? null : str12, (262144 & i8) != 0 ? null : str13, (524288 & i8) != 0 ? null : str14, (1048576 & i8) != 0 ? null : dVar2, (2097152 & i8) != 0 ? null : str15, qVar, (8388608 & i8) != 0 ? null : str16, (16777216 & i8) != 0 ? null : str17, (33554432 & i8) != 0 ? null : str18, (67108864 & i8) != 0 ? null : str19, (i8 & 134217728) != 0 ? null : str20);
    }
}
