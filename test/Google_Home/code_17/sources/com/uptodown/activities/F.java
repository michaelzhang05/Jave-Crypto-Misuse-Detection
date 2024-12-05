package com.uptodown.activities;

import a5.Q;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3686z;
import o5.C3660F;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class F extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final a f29273g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29274a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29275b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f29276c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f29277d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f29278e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f29279f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f29280a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29281b;

        public b(String id, String message) {
            AbstractC3255y.i(id, "id");
            AbstractC3255y.i(message, "message");
            this.f29280a = id;
            this.f29281b = message;
        }

        public final String a() {
            return this.f29280a;
        }

        public final String b() {
            return this.f29281b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f29280a, bVar.f29280a) && AbstractC3255y.d(this.f29281b, bVar.f29281b);
        }

        public int hashCode() {
            return (this.f29280a.hashCode() * 31) + this.f29281b.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductPriceData(id=" + this.f29280a + ", message=" + this.f29281b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f29282a;

        /* renamed from: b, reason: collision with root package name */
        private final b f29283b;

        /* renamed from: c, reason: collision with root package name */
        private final b f29284c;

        public c(String name, b yearProduct, b monthProduct) {
            AbstractC3255y.i(name, "name");
            AbstractC3255y.i(yearProduct, "yearProduct");
            AbstractC3255y.i(monthProduct, "monthProduct");
            this.f29282a = name;
            this.f29283b = yearProduct;
            this.f29284c = monthProduct;
        }

        public final b a() {
            return this.f29284c;
        }

        public final b b() {
            return this.f29283b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3255y.d(this.f29282a, cVar.f29282a) && AbstractC3255y.d(this.f29283b, cVar.f29283b) && AbstractC3255y.d(this.f29284c, cVar.f29284c);
        }

        public int hashCode() {
            return (((this.f29282a.hashCode() * 31) + this.f29283b.hashCode()) * 31) + this.f29284c.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductsData(name=" + this.f29282a + ", yearProduct=" + this.f29283b + ", monthProduct=" + this.f29284c + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f29285a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29286b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29287c;

        /* renamed from: d, reason: collision with root package name */
        private final String f29288d;

        /* renamed from: e, reason: collision with root package name */
        private final String f29289e;

        public d(String clientSecret, String publicKey, String ephemeralKey, String customerID, String buttonText) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(publicKey, "publicKey");
            AbstractC3255y.i(ephemeralKey, "ephemeralKey");
            AbstractC3255y.i(customerID, "customerID");
            AbstractC3255y.i(buttonText, "buttonText");
            this.f29285a = clientSecret;
            this.f29286b = publicKey;
            this.f29287c = ephemeralKey;
            this.f29288d = customerID;
            this.f29289e = buttonText;
        }

        public final String a() {
            return this.f29289e;
        }

        public final String b() {
            return this.f29285a;
        }

        public final String c() {
            return this.f29286b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f29285a, dVar.f29285a) && AbstractC3255y.d(this.f29286b, dVar.f29286b) && AbstractC3255y.d(this.f29287c, dVar.f29287c) && AbstractC3255y.d(this.f29288d, dVar.f29288d) && AbstractC3255y.d(this.f29289e, dVar.f29289e);
        }

        public int hashCode() {
            return (((((((this.f29285a.hashCode() * 31) + this.f29286b.hashCode()) * 31) + this.f29287c.hashCode()) * 31) + this.f29288d.hashCode()) * 31) + this.f29289e.hashCode();
        }

        public String toString() {
            return "UptodownTurboSubscriptionData(clientSecret=" + this.f29285a + ", publicKey=" + this.f29286b + ", ephemeralKey=" + this.f29287c + ", customerID=" + this.f29288d + ", buttonText=" + this.f29289e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29290a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29292c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29293d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29294e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29295f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, String str2, String str3, S5.d dVar) {
            super(2, dVar);
            this.f29292c = context;
            this.f29293d = str;
            this.f29294e = str2;
            this.f29295f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29292c, this.f29293d, this.f29294e, this.f29295f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            T5.b.e();
            if (this.f29290a == 0) {
                O5.t.b(obj);
                o6.w wVar = F.this.f29276c;
                AbstractC3686z.c cVar = AbstractC3686z.c.f36553a;
                wVar.setValue(cVar);
                a5.I i9 = new C3660F(this.f29292c).i(this.f29293d, this.f29294e, this.f29295f);
                if (!i9.b() && (d8 = i9.d()) != null && d8.length() != 0) {
                    String d9 = i9.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    boolean z12 = false;
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        String str5 = null;
                        if (!jSONObject2.isNull("clientSecret")) {
                            str = jSONObject2.getString("clientSecret");
                        } else {
                            str = null;
                        }
                        if (!jSONObject2.isNull("publicKey")) {
                            str2 = jSONObject2.getString("publicKey");
                        } else {
                            str2 = null;
                        }
                        if (!jSONObject2.isNull("ephemeralKey")) {
                            str3 = jSONObject2.getString("ephemeralKey");
                        } else {
                            str3 = null;
                        }
                        if (!jSONObject2.isNull("customerID")) {
                            str4 = jSONObject2.getString("customerID");
                        } else {
                            str4 = null;
                        }
                        if (!jSONObject2.isNull("buttonText")) {
                            str5 = jSONObject2.getString("buttonText");
                        }
                        String str6 = str5;
                        if (str != null && str.length() != 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (!z8) {
                            if (str2 != null && str2.length() != 0) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (!z9) {
                                if (str3 != null && str3.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    if (str4 != null && str4.length() != 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        if (str6 == null || str6.length() == 0) {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            F.this.f29276c.setValue(new AbstractC3686z.d(new d(str, str2, str3, str4, str6)));
                                        }
                                    }
                                }
                            }
                        }
                        F.this.f29276c.setValue(cVar);
                    } else {
                        F.this.f29276c.setValue(cVar);
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29296a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, S5.d dVar) {
            super(2, dVar);
            this.f29298c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f29298c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            String str;
            String str2;
            String str3;
            T5.b.e();
            if (this.f29296a == 0) {
                O5.t.b(obj);
                F.this.f29274a.setValue(AbstractC3686z.c.f36553a);
                a5.I h02 = new C3660F(this.f29298c).h0();
                if (!h02.b() && (d8 = h02.d()) != null && d8.length() != 0) {
                    String d9 = h02.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            String str4 = "";
                            if (jSONObject2.isNull("name")) {
                                str = "";
                            } else {
                                str = jSONObject2.getString("name");
                                AbstractC3255y.h(str, "jsonObjectData.getString(FIELD_NAME)");
                            }
                            if (!jSONObject2.isNull("prices")) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("prices");
                                if (jSONObject3.isNull("year")) {
                                    str2 = "";
                                } else {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("year");
                                    if (jSONObject4.isNull("id")) {
                                        str3 = "";
                                    } else {
                                        str3 = jSONObject4.getString("id");
                                        AbstractC3255y.h(str3, "yearJsonObjectData.getSt…onstantes.FIELD_UDATA_ID)");
                                    }
                                    if (!jSONObject4.isNull("message")) {
                                        str4 = jSONObject4.getString("message");
                                        AbstractC3255y.h(str4, "yearJsonObjectData.getString(FIELD_MESSAGE)");
                                    }
                                    str2 = str4;
                                    str4 = str3;
                                }
                                b bVar = new b(str4, str2);
                                if (!jSONObject3.isNull("month")) {
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("month");
                                    if (!jSONObject5.isNull("id")) {
                                        str4 = jSONObject5.getString("id");
                                        AbstractC3255y.h(str4, "monthJsonObjectData.getS…onstantes.FIELD_UDATA_ID)");
                                    }
                                    if (!jSONObject5.isNull("message")) {
                                        str2 = jSONObject5.getString("message");
                                        AbstractC3255y.h(str2, "monthJsonObjectData.getString(FIELD_MESSAGE)");
                                    }
                                }
                                F.this.f29274a.setValue(new AbstractC3686z.d(new c(str, bVar, new b(str4, str2))));
                            }
                        }
                    } else {
                        F.this.f29274a.setValue(AbstractC3686z.a.f36551a);
                    }
                } else {
                    F.this.f29274a.setValue(AbstractC3686z.a.f36551a);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29300b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F f29301c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, F f8, S5.d dVar) {
            super(2, dVar);
            this.f29300b = context;
            this.f29301c = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f29300b, this.f29301c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            T5.b.e();
            if (this.f29299a == 0) {
                O5.t.b(obj);
                C3660F c3660f = new C3660F(this.f29300b);
                Q e8 = Q.f14058k.e(this.f29300b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3255y.f(id2);
                    a5.I Z7 = c3660f.Z(id2);
                    if (!Z7.b() && (d8 = Z7.d()) != null && d8.length() != 0) {
                        String d9 = Z7.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            if (!jSONObject2.isNull("url")) {
                                this.f29301c.f29278e.setValue(new AbstractC3686z.d(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public F() {
        AbstractC3686z.b bVar = AbstractC3686z.b.f36552a;
        o6.w a8 = AbstractC3700N.a(bVar);
        this.f29274a = a8;
        this.f29275b = a8;
        o6.w a9 = AbstractC3700N.a(bVar);
        this.f29276c = a9;
        this.f29277d = a9;
        o6.w a10 = AbstractC3700N.a(bVar);
        this.f29278e = a10;
        this.f29279f = a10;
    }

    public final void d(Context context, String priceId, String userID, String productType) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(priceId, "priceId");
        AbstractC3255y.i(userID, "userID");
        AbstractC3255y.i(productType, "productType");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(context, userID, priceId, productType, null), 2, null);
    }

    public final InterfaceC3698L e() {
        return this.f29275b;
    }

    public final void f(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new f(context, null), 2, null);
    }

    public final InterfaceC3698L g() {
        return this.f29279f;
    }

    public final void h(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new g(context, this, null), 2, null);
    }

    public final InterfaceC3698L i() {
        return this.f29277d;
    }
}
