package com.stripe.android.model;

import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.Source;
import e3.InterfaceC2784H;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25818a;

    /* renamed from: b, reason: collision with root package name */
    private Long f25819b;

    /* renamed from: c, reason: collision with root package name */
    private String f25820c;

    /* renamed from: d, reason: collision with root package name */
    private e f25821d;

    /* renamed from: e, reason: collision with root package name */
    private Source.Usage f25822e;

    /* renamed from: f, reason: collision with root package name */
    private String f25823f;

    /* renamed from: g, reason: collision with root package name */
    private d f25824g;

    /* renamed from: h, reason: collision with root package name */
    private v f25825h;

    /* renamed from: i, reason: collision with root package name */
    private String f25826i;

    /* renamed from: j, reason: collision with root package name */
    private Map f25827j;

    /* renamed from: k, reason: collision with root package name */
    private g f25828k;

    /* renamed from: l, reason: collision with root package name */
    private a f25829l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f25830m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f25816n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f25817o = 8;
    public static final Parcelable.Creator<w> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final Map f25833a;

        /* renamed from: b, reason: collision with root package name */
        public static final C0527a f25831b = new C0527a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25832c = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0527a {
            private C0527a() {
            }

            public a a(Parcel parcel) {
                JSONObject jSONObject;
                AbstractC3255y.i(parcel, "parcel");
                y2.e eVar = y2.e.f40920a;
                String readString = parcel.readString();
                if (readString != null) {
                    jSONObject = new JSONObject(readString);
                } else {
                    jSONObject = null;
                }
                Map b8 = eVar.b(jSONObject);
                if (b8 == null) {
                    b8 = Q.h();
                }
                return new a(b8);
            }

            public void b(a aVar, Parcel parcel, int i8) {
                String str;
                AbstractC3255y.i(aVar, "<this>");
                AbstractC3255y.i(parcel, "parcel");
                JSONObject d8 = y2.e.f40920a.d(aVar.a());
                if (d8 != null) {
                    str = d8.toString();
                } else {
                    str = null;
                }
                parcel.writeString(str);
            }

            public /* synthetic */ C0527a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return a.f25831b.a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Map value) {
            AbstractC3255y.i(value, "value");
            this.f25833a = value;
        }

        public final Map a() {
            return this.f25833a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f25833a, ((a) obj).f25833a);
        }

        public int hashCode() {
            return this.f25833a.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.f25833a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            f25831b.b(this, out, i8);
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
        public final w createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            android.support.v4.media.a.a(parcel.readParcelable(w.class.getClassLoader()));
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            e createFromParcel = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            Source.Usage valueOf2 = parcel.readInt() == 0 ? null : Source.Usage.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            d valueOf3 = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            v createFromParcel2 = parcel.readInt() == 0 ? null : v.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            g createFromParcel3 = parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel);
            a createFromParcel4 = a.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet.add(parcel.readString());
            }
            return new w(readString, null, valueOf, readString2, createFromParcel, valueOf2, readString3, valueOf3, createFromParcel2, readString4, linkedHashMap, createFromParcel3, createFromParcel4, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w[] newArray(int i8) {
            return new w[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f25834b = new d("Redirect", 0, "redirect");

        /* renamed from: c, reason: collision with root package name */
        public static final d f25835c = new d("Receiver", 1, "receiver");

        /* renamed from: d, reason: collision with root package name */
        public static final d f25836d = new d("CodeVerification", 2, "code_verification");

        /* renamed from: e, reason: collision with root package name */
        public static final d f25837e = new d("None", 3, "none");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f25838f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25839g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25840a;

        static {
            d[] a8 = a();
            f25838f = a8;
            f25839g = U5.b.a(a8);
        }

        private d(String str, int i8, String str2) {
            this.f25840a = str2;
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f25834b, f25835c, f25836d, f25837e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f25838f.clone();
        }

        public final String b() {
            return this.f25840a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private com.stripe.android.model.a f25843a;

        /* renamed from: b, reason: collision with root package name */
        private String f25844b;

        /* renamed from: c, reason: collision with root package name */
        private String f25845c;

        /* renamed from: d, reason: collision with root package name */
        private String f25846d;

        /* renamed from: e, reason: collision with root package name */
        private static final a f25841e = new a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f25842f = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f25843a = aVar;
            this.f25844b = str;
            this.f25845c = str2;
            this.f25846d = str3;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f25843a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(O5.x.a("address", aVar.B()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f25844b;
            if (str != null) {
                map2 = Q.e(O5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f25845c;
            if (str2 != null) {
                map3 = Q.e(O5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f25846d;
            if (str3 != null) {
                map4 = Q.e(O5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
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
            return AbstractC3255y.d(this.f25843a, eVar.f25843a) && AbstractC3255y.d(this.f25844b, eVar.f25844b) && AbstractC3255y.d(this.f25845c, eVar.f25845c) && AbstractC3255y.d(this.f25846d, eVar.f25846d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f25843a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f25844b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25845c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25846d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OwnerParams(address=" + this.f25843a + ", email=" + this.f25844b + ", name=" + this.f25845c + ", phone=" + this.f25846d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            com.stripe.android.model.a aVar = this.f25843a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25844b);
            out.writeString(this.f25845c);
            out.writeString(this.f25846d);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class f implements Parcelable {
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25848a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25849b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25847c = new a(null);
        public static final Parcelable.Creator<g> CREATOR = new b();

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
            public final g createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str, String str2) {
            this.f25848a = str;
            this.f25849b = str2;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            Map h8 = Q.h();
            String str = this.f25848a;
            Map map2 = null;
            if (str != null) {
                map = Q.e(O5.x.a("appid", str));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str2 = this.f25849b;
            if (str2 != null) {
                map2 = Q.e(O5.x.a("statement_descriptor", str2));
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            return Q.q(q8, map2);
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
            return AbstractC3255y.d(this.f25848a, gVar.f25848a) && AbstractC3255y.d(this.f25849b, gVar.f25849b);
        }

        public int hashCode() {
            String str = this.f25848a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25849b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WeChatParams(appId=" + this.f25848a + ", statementDescriptor=" + this.f25849b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25848a);
            out.writeString(this.f25849b);
        }
    }

    public w(String typeRaw, f fVar, Long l8, String str, e eVar, Source.Usage usage, String str2, d dVar, v vVar, String str3, Map map, g gVar, a apiParams, Set attribution) {
        AbstractC3255y.i(typeRaw, "typeRaw");
        AbstractC3255y.i(apiParams, "apiParams");
        AbstractC3255y.i(attribution, "attribution");
        this.f25818a = typeRaw;
        this.f25819b = l8;
        this.f25820c = str;
        this.f25821d = eVar;
        this.f25822e = usage;
        this.f25823f = str2;
        this.f25824g = dVar;
        this.f25825h = vVar;
        this.f25826i = str3;
        this.f25827j = map;
        this.f25828k = gVar;
        this.f25829l = apiParams;
        this.f25830m = attribution;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        Map map9;
        Map map10;
        Map e8 = Q.e(O5.x.a("type", this.f25818a));
        Map a8 = this.f25829l.a();
        Map map11 = null;
        if (!(!a8.isEmpty())) {
            a8 = null;
        }
        if (a8 != null) {
            map = Q.e(O5.x.a(this.f25818a, a8));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(Q.q(e8, map), Q.h());
        Long l8 = this.f25819b;
        if (l8 != null) {
            map2 = Q.e(O5.x.a(RewardPlus.AMOUNT, Long.valueOf(l8.longValue())));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        String str = this.f25820c;
        if (str != null) {
            map3 = Q.e(O5.x.a("currency", str));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        d dVar = this.f25824g;
        if (dVar != null) {
            map4 = Q.e(O5.x.a("flow", dVar.b()));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        v vVar = this.f25825h;
        if (vVar != null) {
            map5 = Q.e(O5.x.a("source_order", vVar.B()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        e eVar = this.f25821d;
        if (eVar != null) {
            map6 = Q.e(O5.x.a("owner", eVar.B()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        String str2 = this.f25823f;
        if (str2 != null) {
            map7 = Q.e(O5.x.a("redirect", Q.e(O5.x.a("return_url", str2))));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(q13, map7);
        Map map12 = this.f25827j;
        if (map12 != null) {
            map8 = Q.e(O5.x.a(TtmlNode.TAG_METADATA, map12));
        } else {
            map8 = null;
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        Map q15 = Q.q(q14, map8);
        String str3 = this.f25826i;
        if (str3 != null) {
            map9 = Q.e(O5.x.a("token", str3));
        } else {
            map9 = null;
        }
        if (map9 == null) {
            map9 = Q.h();
        }
        Map q16 = Q.q(q15, map9);
        Source.Usage usage = this.f25822e;
        if (usage != null) {
            map10 = Q.e(O5.x.a("usage", usage.b()));
        } else {
            map10 = null;
        }
        if (map10 == null) {
            map10 = Q.h();
        }
        Map q17 = Q.q(q16, map10);
        g gVar = this.f25828k;
        if (gVar != null) {
            map11 = Q.e(O5.x.a("wechat", gVar.B()));
        }
        if (map11 == null) {
            map11 = Q.h();
        }
        return Q.q(q17, map11);
    }

    public final Set a() {
        return this.f25830m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC3255y.d(this.f25818a, wVar.f25818a) && AbstractC3255y.d(null, null) && AbstractC3255y.d(this.f25819b, wVar.f25819b) && AbstractC3255y.d(this.f25820c, wVar.f25820c) && AbstractC3255y.d(this.f25821d, wVar.f25821d) && this.f25822e == wVar.f25822e && AbstractC3255y.d(this.f25823f, wVar.f25823f) && this.f25824g == wVar.f25824g && AbstractC3255y.d(this.f25825h, wVar.f25825h) && AbstractC3255y.d(this.f25826i, wVar.f25826i) && AbstractC3255y.d(this.f25827j, wVar.f25827j) && AbstractC3255y.d(this.f25828k, wVar.f25828k) && AbstractC3255y.d(this.f25829l, wVar.f25829l) && AbstractC3255y.d(this.f25830m, wVar.f25830m);
    }

    public final String getType() {
        return Source.f25062v.a(this.f25818a);
    }

    public int hashCode() {
        int hashCode = this.f25818a.hashCode() * 961;
        Long l8 = this.f25819b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.f25820c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f25821d;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Source.Usage usage = this.f25822e;
        int hashCode5 = (hashCode4 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.f25823f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f25824g;
        int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        v vVar = this.f25825h;
        int hashCode8 = (hashCode7 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str3 = this.f25826i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.f25827j;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        g gVar = this.f25828k;
        return ((((hashCode10 + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f25829l.hashCode()) * 31) + this.f25830m.hashCode();
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.f25818a + ", typeData=" + ((Object) null) + ", amount=" + this.f25819b + ", currency=" + this.f25820c + ", owner=" + this.f25821d + ", usage=" + this.f25822e + ", returnUrl=" + this.f25823f + ", flow=" + this.f25824g + ", sourceOrder=" + this.f25825h + ", token=" + this.f25826i + ", metadata=" + this.f25827j + ", weChatParams=" + this.f25828k + ", apiParams=" + this.f25829l + ", attribution=" + this.f25830m + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25818a);
        out.writeParcelable(null, i8);
        Long l8 = this.f25819b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f25820c);
        e eVar = this.f25821d;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Source.Usage usage = this.f25822e;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        out.writeString(this.f25823f);
        d dVar = this.f25824g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(dVar.name());
        }
        v vVar = this.f25825h;
        if (vVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            vVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25826i);
        Map map = this.f25827j;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
        g gVar = this.f25828k;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        this.f25829l.writeToParcel(out, i8);
        Set set = this.f25830m;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }
}
