package com.uptodown.activities;

import X4.Q;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3338z;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class G extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final a f28219g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28220a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28221b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28222c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f28223d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f28224e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f28225f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f28226a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28227b;

        public b(String id, String message) {
            AbstractC3159y.i(id, "id");
            AbstractC3159y.i(message, "message");
            this.f28226a = id;
            this.f28227b = message;
        }

        public final String a() {
            return this.f28226a;
        }

        public final String b() {
            return this.f28227b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f28226a, bVar.f28226a) && AbstractC3159y.d(this.f28227b, bVar.f28227b);
        }

        public int hashCode() {
            return (this.f28226a.hashCode() * 31) + this.f28227b.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductPriceData(id=" + this.f28226a + ", message=" + this.f28227b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f28228a;

        /* renamed from: b, reason: collision with root package name */
        private final b f28229b;

        /* renamed from: c, reason: collision with root package name */
        private final b f28230c;

        public c(String name, b yearProduct, b monthProduct) {
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(yearProduct, "yearProduct");
            AbstractC3159y.i(monthProduct, "monthProduct");
            this.f28228a = name;
            this.f28229b = yearProduct;
            this.f28230c = monthProduct;
        }

        public final b a() {
            return this.f28230c;
        }

        public final b b() {
            return this.f28229b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f28228a, cVar.f28228a) && AbstractC3159y.d(this.f28229b, cVar.f28229b) && AbstractC3159y.d(this.f28230c, cVar.f28230c);
        }

        public int hashCode() {
            return (((this.f28228a.hashCode() * 31) + this.f28229b.hashCode()) * 31) + this.f28230c.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductsData(name=" + this.f28228a + ", yearProduct=" + this.f28229b + ", monthProduct=" + this.f28230c + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f28231a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28232b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28233c;

        /* renamed from: d, reason: collision with root package name */
        private final String f28234d;

        /* renamed from: e, reason: collision with root package name */
        private final String f28235e;

        public d(String clientSecret, String publicKey, String ephemeralKey, String customerID, String buttonText) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(publicKey, "publicKey");
            AbstractC3159y.i(ephemeralKey, "ephemeralKey");
            AbstractC3159y.i(customerID, "customerID");
            AbstractC3159y.i(buttonText, "buttonText");
            this.f28231a = clientSecret;
            this.f28232b = publicKey;
            this.f28233c = ephemeralKey;
            this.f28234d = customerID;
            this.f28235e = buttonText;
        }

        public final String a() {
            return this.f28235e;
        }

        public final String b() {
            return this.f28231a;
        }

        public final String c() {
            return this.f28232b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f28231a, dVar.f28231a) && AbstractC3159y.d(this.f28232b, dVar.f28232b) && AbstractC3159y.d(this.f28233c, dVar.f28233c) && AbstractC3159y.d(this.f28234d, dVar.f28234d) && AbstractC3159y.d(this.f28235e, dVar.f28235e);
        }

        public int hashCode() {
            return (((((((this.f28231a.hashCode() * 31) + this.f28232b.hashCode()) * 31) + this.f28233c.hashCode()) * 31) + this.f28234d.hashCode()) * 31) + this.f28235e.hashCode();
        }

        public String toString() {
            return "UptodownTurboSubscriptionData(clientSecret=" + this.f28231a + ", publicKey=" + this.f28232b + ", ephemeralKey=" + this.f28233c + ", customerID=" + this.f28234d + ", buttonText=" + this.f28235e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28236a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f28239d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f28240e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f28241f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, String str2, String str3, P5.d dVar) {
            super(2, dVar);
            this.f28238c = context;
            this.f28239d = str;
            this.f28240e = str2;
            this.f28241f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f28238c, this.f28239d, this.f28240e, this.f28241f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
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
            Q5.b.e();
            if (this.f28236a == 0) {
                L5.t.b(obj);
                l6.v vVar = G.this.f28222c;
                AbstractC3338z.c cVar = AbstractC3338z.c.f34552a;
                vVar.setValue(cVar);
                X4.I i9 = new C3312F(this.f28238c).i(this.f28239d, this.f28240e, this.f28241f);
                if (!i9.b() && (d8 = i9.d()) != null && d8.length() != 0) {
                    String d9 = i9.d();
                    AbstractC3159y.f(d9);
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
                                            G.this.f28222c.setValue(new AbstractC3338z.d(new d(str, str2, str3, str4, str6)));
                                        }
                                    }
                                }
                            }
                        }
                        G.this.f28222c.setValue(cVar);
                    } else {
                        G.this.f28222c.setValue(cVar);
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28242a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, P5.d dVar) {
            super(2, dVar);
            this.f28244c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(this.f28244c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            String str;
            String str2;
            String str3;
            Q5.b.e();
            if (this.f28242a == 0) {
                L5.t.b(obj);
                G.this.f28220a.setValue(AbstractC3338z.c.f34552a);
                X4.I h02 = new C3312F(this.f28244c).h0();
                if (!h02.b() && (d8 = h02.d()) != null && d8.length() != 0) {
                    String d9 = h02.d();
                    AbstractC3159y.f(d9);
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
                                AbstractC3159y.h(str, "jsonObjectData.getString(FIELD_NAME)");
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
                                        AbstractC3159y.h(str3, "yearJsonObjectData.getSt…onstantes.FIELD_UDATA_ID)");
                                    }
                                    if (!jSONObject4.isNull("message")) {
                                        str4 = jSONObject4.getString("message");
                                        AbstractC3159y.h(str4, "yearJsonObjectData.getString(FIELD_MESSAGE)");
                                    }
                                    str2 = str4;
                                    str4 = str3;
                                }
                                b bVar = new b(str4, str2);
                                if (!jSONObject3.isNull("month")) {
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("month");
                                    if (!jSONObject5.isNull("id")) {
                                        str4 = jSONObject5.getString("id");
                                        AbstractC3159y.h(str4, "monthJsonObjectData.getS…onstantes.FIELD_UDATA_ID)");
                                    }
                                    if (!jSONObject5.isNull("message")) {
                                        str2 = jSONObject5.getString("message");
                                        AbstractC3159y.h(str2, "monthJsonObjectData.getString(FIELD_MESSAGE)");
                                    }
                                }
                                G.this.f28220a.setValue(new AbstractC3338z.d(new c(str, bVar, new b(str4, str2))));
                            }
                        }
                    } else {
                        G.this.f28220a.setValue(AbstractC3338z.a.f34550a);
                    }
                } else {
                    G.this.f28220a.setValue(AbstractC3338z.a.f34550a);
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28246b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f28247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, G g8, P5.d dVar) {
            super(2, dVar);
            this.f28246b = context;
            this.f28247c = g8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(this.f28246b, this.f28247c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            Q5.b.e();
            if (this.f28245a == 0) {
                L5.t.b(obj);
                C3312F c3312f = new C3312F(this.f28246b);
                Q e8 = Q.f12437k.e(this.f28246b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3159y.f(id2);
                    X4.I Z7 = c3312f.Z(id2);
                    if (!Z7.b() && (d8 = Z7.d()) != null && d8.length() != 0) {
                        String d9 = Z7.d();
                        AbstractC3159y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                            if (!jSONObject2.isNull("url")) {
                                this.f28247c.f28224e.setValue(new AbstractC3338z.d(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public G() {
        AbstractC3338z.b bVar = AbstractC3338z.b.f34551a;
        l6.v a8 = AbstractC3351M.a(bVar);
        this.f28220a = a8;
        this.f28221b = a8;
        l6.v a9 = AbstractC3351M.a(bVar);
        this.f28222c = a9;
        this.f28223d = a9;
        l6.v a10 = AbstractC3351M.a(bVar);
        this.f28224e = a10;
        this.f28225f = a10;
    }

    public final void d(Context context, String priceId, String userID, String productType) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(priceId, "priceId");
        AbstractC3159y.i(userID, "userID");
        AbstractC3159y.i(productType, "productType");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, userID, priceId, productType, null), 2, null);
    }

    public final InterfaceC3349K e() {
        return this.f28221b;
    }

    public final void f(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new f(context, null), 2, null);
    }

    public final InterfaceC3349K g() {
        return this.f28225f;
    }

    public final void h(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new g(context, this, null), 2, null);
    }

    public final InterfaceC3349K i() {
        return this.f28223d;
    }
}
