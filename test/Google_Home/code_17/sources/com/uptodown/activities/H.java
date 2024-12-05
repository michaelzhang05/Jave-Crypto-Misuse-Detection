package com.uptodown.activities;

import a5.K;
import a5.Q;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class H extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29329a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29330b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f29331c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f29332d;

    /* renamed from: e, reason: collision with root package name */
    private o6.w f29333e;

    /* renamed from: f, reason: collision with root package name */
    private o6.w f29334f;

    /* renamed from: g, reason: collision with root package name */
    private o6.w f29335g;

    /* renamed from: h, reason: collision with root package name */
    private o6.w f29336h;

    /* renamed from: i, reason: collision with root package name */
    private o6.w f29337i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29338j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29339k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29340l;

    /* renamed from: m, reason: collision with root package name */
    private int f29341m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Q f29342a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29343b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f29344c;

        public a(Q q8, ArrayList reviews, boolean z8) {
            AbstractC3255y.i(reviews, "reviews");
            this.f29342a = q8;
            this.f29343b = reviews;
            this.f29344c = z8;
        }

        public final ArrayList a() {
            return this.f29343b;
        }

        public final Q b() {
            return this.f29342a;
        }

        public final boolean c() {
            return this.f29344c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f29342a, aVar.f29342a) && AbstractC3255y.d(this.f29343b, aVar.f29343b) && this.f29344c == aVar.f29344c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Q q8 = this.f29342a;
            int hashCode = (((q8 == null ? 0 : q8.hashCode()) * 31) + this.f29343b.hashCode()) * 31;
            boolean z8 = this.f29344c;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "UserCommentsData(user=" + this.f29342a + ", reviews=" + this.f29343b + ", userExists=" + this.f29344c + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29345a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, S5.d dVar) {
            super(2, dVar);
            this.f29347c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f29347c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q q8;
            T5.b.e();
            if (this.f29345a == 0) {
                O5.t.b(obj);
                if (H.this.f29339k) {
                    ArrayList arrayList = new ArrayList();
                    C3660F c3660f = new C3660F(this.f29347c);
                    Object value = H.this.m().getValue();
                    AbstractC3255y.f(value);
                    a5.I p02 = c3660f.p0((String) value, 10, H.this.j());
                    Q q9 = null;
                    JSONArray jSONArray = null;
                    q9 = null;
                    q9 = null;
                    if (!p02.b() && p02.d() != null) {
                        String d8 = p02.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("user")) {
                                q8 = new Q();
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                                AbstractC3255y.h(jSONObject3, "jsonObjectData.getJSONOb…ct(Constantes.FIELD_USER)");
                                q8.i(jSONObject3);
                                H.this.n().setValue(q8.s());
                                H.this.l().setValue(q8.b());
                                H.this.o().setValue(q8.w());
                                H.this.p().setValue(kotlin.coroutines.jvm.internal.b.a(q8.z()));
                            } else {
                                q8 = null;
                            }
                            if (!jSONObject2.isNull("comments")) {
                                jSONArray = jSONObject2.getJSONArray("comments");
                            }
                            if (jSONArray == null) {
                                H.this.f29339k = false;
                            } else {
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    K.b bVar = a5.K.f14002o;
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i8);
                                    AbstractC3255y.h(jSONObject4, "jsonArrayData.getJSONObject(i)");
                                    arrayList.add(bVar.g(jSONObject4));
                                }
                            }
                            q9 = q8;
                        }
                    } else if (p02.e() == 404) {
                        H.this.f29338j = false;
                    }
                    H h8 = H.this;
                    h8.s(h8.j() + arrayList.size());
                    H.this.f29329a.setValue(new AbstractC3685y.c(new a(q9, arrayList, H.this.f29338j)));
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29348a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.K f29349b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29350c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ H f29351d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a5.K k8, Context context, H h8, S5.d dVar) {
            super(2, dVar);
            this.f29349b = k8;
            this.f29350c = context;
            this.f29351d = h8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29349b, this.f29350c, this.f29351d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29348a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                K.b bVar = a5.K.f14002o;
                a5.K k8 = this.f29349b;
                Context context = this.f29350c;
                this.f29348a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29351d.f29331c.setValue(new AbstractC3685y.c(new K.c(this.f29349b, ((Number) obj).intValue())));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public H() {
        AbstractC3685y.a aVar = AbstractC3685y.a.f36548a;
        o6.w a8 = AbstractC3700N.a(aVar);
        this.f29329a = a8;
        this.f29330b = a8;
        o6.w a9 = AbstractC3700N.a(aVar);
        this.f29331c = a9;
        this.f29332d = a9;
        this.f29333e = AbstractC3700N.a("");
        this.f29334f = AbstractC3700N.a("");
        this.f29335g = AbstractC3700N.a("");
        this.f29336h = AbstractC3700N.a("");
        this.f29337i = AbstractC3700N.a(Boolean.FALSE);
        this.f29338j = true;
        this.f29339k = true;
    }

    public final void g(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, null), 2, null);
    }

    public final InterfaceC3698L h() {
        return this.f29330b;
    }

    public final boolean i() {
        return this.f29340l;
    }

    public final int j() {
        return this.f29341m;
    }

    public final InterfaceC3698L k() {
        return this.f29332d;
    }

    public final o6.w l() {
        return this.f29335g;
    }

    public final o6.w m() {
        return this.f29333e;
    }

    public final o6.w n() {
        return this.f29334f;
    }

    public final o6.w o() {
        return this.f29336h;
    }

    public final o6.w p() {
        return this.f29337i;
    }

    public final void q(Context context, a5.K review) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(review, "review");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(review, context, this, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f29340l = z8;
    }

    public final void s(int i8) {
        this.f29341m = i8;
    }
}
