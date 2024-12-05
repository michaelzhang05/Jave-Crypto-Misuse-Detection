package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import b3.InterfaceC1863H;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.Source;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24763a;

    /* renamed from: b, reason: collision with root package name */
    private Long f24764b;

    /* renamed from: c, reason: collision with root package name */
    private String f24765c;

    /* renamed from: d, reason: collision with root package name */
    private e f24766d;

    /* renamed from: e, reason: collision with root package name */
    private Source.Usage f24767e;

    /* renamed from: f, reason: collision with root package name */
    private String f24768f;

    /* renamed from: g, reason: collision with root package name */
    private d f24769g;

    /* renamed from: h, reason: collision with root package name */
    private v f24770h;

    /* renamed from: i, reason: collision with root package name */
    private String f24771i;

    /* renamed from: j, reason: collision with root package name */
    private Map f24772j;

    /* renamed from: k, reason: collision with root package name */
    private g f24773k;

    /* renamed from: l, reason: collision with root package name */
    private a f24774l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f24775m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f24761n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f24762o = 8;
    public static final Parcelable.Creator<w> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final Map f24778a;

        /* renamed from: b, reason: collision with root package name */
        public static final C0531a f24776b = new C0531a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24777c = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.w$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0531a {
            private C0531a() {
            }

            public a a(Parcel parcel) {
                JSONObject jSONObject;
                AbstractC3159y.i(parcel, "parcel");
                v2.e eVar = v2.e.f38789a;
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
                AbstractC3159y.i(aVar, "<this>");
                AbstractC3159y.i(parcel, "parcel");
                JSONObject d8 = v2.e.f38789a.d(aVar.b());
                if (d8 != null) {
                    str = d8.toString();
                } else {
                    str = null;
                }
                parcel.writeString(str);
            }

            public /* synthetic */ C0531a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return a.f24776b.a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Map value) {
            AbstractC3159y.i(value, "value");
            this.f24778a = value;
        }

        public final Map b() {
            return this.f24778a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f24778a, ((a) obj).f24778a);
        }

        public int hashCode() {
            return this.f24778a.hashCode();
        }

        public String toString() {
            return "ApiParams(value=" + this.f24778a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            f24776b.b(this, out, i8);
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
        public final w createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            AbstractC3159y.i(parcel, "parcel");
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
        public static final d f24779b = new d("Redirect", 0, "redirect");

        /* renamed from: c, reason: collision with root package name */
        public static final d f24780c = new d("Receiver", 1, "receiver");

        /* renamed from: d, reason: collision with root package name */
        public static final d f24781d = new d("CodeVerification", 2, "code_verification");

        /* renamed from: e, reason: collision with root package name */
        public static final d f24782e = new d("None", 3, "none");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f24783f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24784g;

        /* renamed from: a, reason: collision with root package name */
        private final String f24785a;

        static {
            d[] a8 = a();
            f24783f = a8;
            f24784g = R5.b.a(a8);
        }

        private d(String str, int i8, String str2) {
            this.f24785a = str2;
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f24779b, f24780c, f24781d, f24782e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f24783f.clone();
        }

        public final String b() {
            return this.f24785a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private com.stripe.android.model.a f24788a;

        /* renamed from: b, reason: collision with root package name */
        private String f24789b;

        /* renamed from: c, reason: collision with root package name */
        private String f24790c;

        /* renamed from: d, reason: collision with root package name */
        private String f24791d;

        /* renamed from: e, reason: collision with root package name */
        private static final a f24786e = new a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f24787f = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
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
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f24788a = aVar;
            this.f24789b = str;
            this.f24790c = str2;
            this.f24791d = str3;
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
            return AbstractC3159y.d(this.f24788a, eVar.f24788a) && AbstractC3159y.d(this.f24789b, eVar.f24789b) && AbstractC3159y.d(this.f24790c, eVar.f24790c) && AbstractC3159y.d(this.f24791d, eVar.f24791d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f24788a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f24789b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24790c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24791d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OwnerParams(address=" + this.f24788a + ", email=" + this.f24789b + ", name=" + this.f24790c + ", phone=" + this.f24791d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f24788a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24789b);
            out.writeString(this.f24790c);
            out.writeString(this.f24791d);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f24788a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(L5.x.a("address", aVar.y()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f24789b;
            if (str != null) {
                map2 = Q.e(L5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f24790c;
            if (str2 != null) {
                map3 = Q.e(L5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f24791d;
            if (str3 != null) {
                map4 = Q.e(L5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class f implements Parcelable {
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24793a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24794b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24792c = new a(null);
        public static final Parcelable.Creator<g> CREATOR = new b();

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
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str, String str2) {
            this.f24793a = str;
            this.f24794b = str2;
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
            return AbstractC3159y.d(this.f24793a, gVar.f24793a) && AbstractC3159y.d(this.f24794b, gVar.f24794b);
        }

        public int hashCode() {
            String str = this.f24793a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24794b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "WeChatParams(appId=" + this.f24793a + ", statementDescriptor=" + this.f24794b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24793a);
            out.writeString(this.f24794b);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map h8 = Q.h();
            String str = this.f24793a;
            Map map2 = null;
            if (str != null) {
                map = Q.e(L5.x.a("appid", str));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str2 = this.f24794b;
            if (str2 != null) {
                map2 = Q.e(L5.x.a("statement_descriptor", str2));
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            return Q.q(q8, map2);
        }
    }

    public w(String typeRaw, f fVar, Long l8, String str, e eVar, Source.Usage usage, String str2, d dVar, v vVar, String str3, Map map, g gVar, a apiParams, Set attribution) {
        AbstractC3159y.i(typeRaw, "typeRaw");
        AbstractC3159y.i(apiParams, "apiParams");
        AbstractC3159y.i(attribution, "attribution");
        this.f24763a = typeRaw;
        this.f24764b = l8;
        this.f24765c = str;
        this.f24766d = eVar;
        this.f24767e = usage;
        this.f24768f = str2;
        this.f24769g = dVar;
        this.f24770h = vVar;
        this.f24771i = str3;
        this.f24772j = map;
        this.f24773k = gVar;
        this.f24774l = apiParams;
        this.f24775m = attribution;
    }

    public final Set b() {
        return this.f24775m;
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
        return AbstractC3159y.d(this.f24763a, wVar.f24763a) && AbstractC3159y.d(null, null) && AbstractC3159y.d(this.f24764b, wVar.f24764b) && AbstractC3159y.d(this.f24765c, wVar.f24765c) && AbstractC3159y.d(this.f24766d, wVar.f24766d) && this.f24767e == wVar.f24767e && AbstractC3159y.d(this.f24768f, wVar.f24768f) && this.f24769g == wVar.f24769g && AbstractC3159y.d(this.f24770h, wVar.f24770h) && AbstractC3159y.d(this.f24771i, wVar.f24771i) && AbstractC3159y.d(this.f24772j, wVar.f24772j) && AbstractC3159y.d(this.f24773k, wVar.f24773k) && AbstractC3159y.d(this.f24774l, wVar.f24774l) && AbstractC3159y.d(this.f24775m, wVar.f24775m);
    }

    public final String getType() {
        return Source.f24007v.a(this.f24763a);
    }

    public int hashCode() {
        int hashCode = this.f24763a.hashCode() * 961;
        Long l8 = this.f24764b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.f24765c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f24766d;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Source.Usage usage = this.f24767e;
        int hashCode5 = (hashCode4 + (usage == null ? 0 : usage.hashCode())) * 31;
        String str2 = this.f24768f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f24769g;
        int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        v vVar = this.f24770h;
        int hashCode8 = (hashCode7 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str3 = this.f24771i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.f24772j;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        g gVar = this.f24773k;
        return ((((hashCode10 + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f24774l.hashCode()) * 31) + this.f24775m.hashCode();
    }

    public String toString() {
        return "SourceParams(typeRaw=" + this.f24763a + ", typeData=" + ((Object) null) + ", amount=" + this.f24764b + ", currency=" + this.f24765c + ", owner=" + this.f24766d + ", usage=" + this.f24767e + ", returnUrl=" + this.f24768f + ", flow=" + this.f24769g + ", sourceOrder=" + this.f24770h + ", token=" + this.f24771i + ", metadata=" + this.f24772j + ", weChatParams=" + this.f24773k + ", apiParams=" + this.f24774l + ", attribution=" + this.f24775m + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24763a);
        out.writeParcelable(null, i8);
        Long l8 = this.f24764b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f24765c);
        e eVar = this.f24766d;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Source.Usage usage = this.f24767e;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        out.writeString(this.f24768f);
        d dVar = this.f24769g;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(dVar.name());
        }
        v vVar = this.f24770h;
        if (vVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            vVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24771i);
        Map map = this.f24772j;
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
        g gVar = this.f24773k;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        this.f24774l.writeToParcel(out, i8);
        Set set = this.f24775m;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
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
        Map e8 = Q.e(L5.x.a("type", this.f24763a));
        Map b8 = this.f24774l.b();
        Map map11 = null;
        if (!(!b8.isEmpty())) {
            b8 = null;
        }
        if (b8 != null) {
            map = Q.e(L5.x.a(this.f24763a, b8));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(Q.q(e8, map), Q.h());
        Long l8 = this.f24764b;
        if (l8 != null) {
            map2 = Q.e(L5.x.a(RewardPlus.AMOUNT, Long.valueOf(l8.longValue())));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        String str = this.f24765c;
        if (str != null) {
            map3 = Q.e(L5.x.a("currency", str));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        d dVar = this.f24769g;
        if (dVar != null) {
            map4 = Q.e(L5.x.a("flow", dVar.b()));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        v vVar = this.f24770h;
        if (vVar != null) {
            map5 = Q.e(L5.x.a("source_order", vVar.y()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        e eVar = this.f24766d;
        if (eVar != null) {
            map6 = Q.e(L5.x.a("owner", eVar.y()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        String str2 = this.f24768f;
        if (str2 != null) {
            map7 = Q.e(L5.x.a("redirect", Q.e(L5.x.a("return_url", str2))));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(q13, map7);
        Map map12 = this.f24772j;
        if (map12 != null) {
            map8 = Q.e(L5.x.a(TtmlNode.TAG_METADATA, map12));
        } else {
            map8 = null;
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        Map q15 = Q.q(q14, map8);
        String str3 = this.f24771i;
        if (str3 != null) {
            map9 = Q.e(L5.x.a("token", str3));
        } else {
            map9 = null;
        }
        if (map9 == null) {
            map9 = Q.h();
        }
        Map q16 = Q.q(q15, map9);
        Source.Usage usage = this.f24767e;
        if (usage != null) {
            map10 = Q.e(L5.x.a("usage", usage.b()));
        } else {
            map10 = null;
        }
        if (map10 == null) {
            map10 = Q.h();
        }
        Map q17 = Q.q(q16, map10);
        g gVar = this.f24773k;
        if (gVar != null) {
            map11 = Q.e(L5.x.a("wechat", gVar.y()));
        }
        if (map11 == null) {
            map11 = Q.h();
        }
        return Q.q(q17, map11);
    }
}
