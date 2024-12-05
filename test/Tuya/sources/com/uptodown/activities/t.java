package com.uptodown.activities;

import X4.C1498h;
import X4.K;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class t extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29381a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29382b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f29383c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f29384d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f29385e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f29386f;

    /* renamed from: g, reason: collision with root package name */
    private l6.v f29387g;

    /* renamed from: h, reason: collision with root package name */
    private l6.v f29388h;

    /* renamed from: i, reason: collision with root package name */
    private l6.v f29389i;

    /* renamed from: j, reason: collision with root package name */
    private l6.v f29390j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29391k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29392l;

    /* renamed from: m, reason: collision with root package name */
    private int f29393m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29394a;

        public a(ArrayList reviews) {
            AbstractC3159y.i(reviews, "reviews");
            this.f29394a = reviews;
        }

        public final ArrayList a() {
            return this.f29394a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f29394a, ((a) obj).f29394a);
        }

        public int hashCode() {
            return this.f29394a.hashCode();
        }

        public String toString() {
            return "ReviewsData(reviews=" + this.f29394a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f29395a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29396b;

        public b(int i8, int i9) {
            this.f29395a = i8;
            this.f29396b = i9;
        }

        public final int a() {
            return this.f29396b;
        }

        public final int b() {
            return this.f29395a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f29395a == bVar.f29395a && this.f29396b == bVar.f29396b;
        }

        public int hashCode() {
            return (this.f29395a * 31) + this.f29396b;
        }

        public String toString() {
            return "SendReviewData(success=" + this.f29395a + ", statusCode=" + this.f29396b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29397a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, P5.d dVar) {
            super(2, dVar);
            this.f29399c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f29399c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            Q5.b.e();
            if (this.f29397a == 0) {
                L5.t.b(obj);
                t.this.f29381a.setValue(AbstractC3337y.a.f34547a);
                ArrayList arrayList = new ArrayList();
                C3312F c3312f = new C3312F(this.f29399c);
                Object value = t.this.e().getValue();
                AbstractC3159y.f(value);
                X4.I V7 = c3312f.V(((C1498h) value).i(), 20, t.this.j(), (String) t.this.k().getValue());
                if (!V7.b() && V7.d() != null) {
                    String d8 = V7.d();
                    AbstractC3159y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONArray = null;
                    }
                    if (i8 == 1 && jSONArray != null) {
                        int length = jSONArray.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            K.b bVar = X4.K.f12381o;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                            AbstractC3159y.h(jSONObject2, "jsonArrayData.getJSONObject(i)");
                            arrayList.add(bVar.a(jSONObject2));
                        }
                    }
                } else {
                    t.this.q(false);
                }
                t.this.f29381a.setValue(new AbstractC3337y.c(new a(arrayList)));
                t tVar = t.this;
                tVar.s(tVar.j() + arrayList.size());
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29400a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.K f29401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t f29403d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(X4.K k8, Context context, t tVar, P5.d dVar) {
            super(2, dVar);
            this.f29401b = k8;
            this.f29402c = context;
            this.f29403d = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new d(this.f29401b, this.f29402c, this.f29403d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29400a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                K.b bVar = X4.K.f12381o;
                X4.K k8 = this.f29401b;
                Context context = this.f29402c;
                this.f29400a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29403d.f29385e.setValue(new AbstractC3337y.c(new K.c(this.f29401b, ((Number) obj).intValue())));
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t f29407d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, t tVar, P5.d dVar) {
            super(2, dVar);
            this.f29405b = context;
            this.f29406c = str;
            this.f29407d = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(this.f29405b, this.f29406c, this.f29407d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Q5.b.e();
            if (this.f29404a == 0) {
                L5.t.b(obj);
                K.b bVar = X4.K.f12381o;
                int i9 = 0;
                if (!bVar.b(this.f29405b, this.f29406c)) {
                    bVar.f(this.f29405b, this.f29406c, String.valueOf(System.currentTimeMillis()));
                    C3312F c3312f = new C3312F(this.f29405b);
                    X4.K k8 = new X4.K();
                    k8.c0(this.f29406c);
                    k8.b0(((Number) this.f29407d.m().getValue()).intValue());
                    Object value = this.f29407d.e().getValue();
                    AbstractC3159y.f(value);
                    X4.I I02 = c3312f.I0(((C1498h) value).i(), k8);
                    i8 = I02.e();
                    if (!I02.b() && I02.d() != null) {
                        String d8 = I02.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            i9 = jSONObject.getInt("success");
                        }
                    }
                } else {
                    i8 = 0;
                }
                this.f29407d.f29383c.setValue(new AbstractC3337y.c(new b(i9, i8)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public t() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f29381a = a8;
        this.f29382b = a8;
        AbstractC3337y.b bVar = AbstractC3337y.b.f34548a;
        l6.v a9 = AbstractC3351M.a(bVar);
        this.f29383c = a9;
        this.f29384d = a9;
        l6.v a10 = AbstractC3351M.a(bVar);
        this.f29385e = a10;
        this.f29386f = a10;
        this.f29387g = AbstractC3351M.a(null);
        this.f29388h = AbstractC3351M.a(null);
        this.f29389i = AbstractC3351M.a("date");
        this.f29390j = AbstractC3351M.a(-1);
        this.f29391k = true;
    }

    public final void d(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, null), 2, null);
    }

    public final l6.v e() {
        return this.f29387g;
    }

    public final InterfaceC3349K f() {
        return this.f29382b;
    }

    public final boolean g() {
        return this.f29391k;
    }

    public final boolean h() {
        return this.f29392l;
    }

    public final l6.v i() {
        return this.f29388h;
    }

    public final int j() {
        return this.f29393m;
    }

    public final l6.v k() {
        return this.f29389i;
    }

    public final InterfaceC3349K l() {
        return this.f29386f;
    }

    public final l6.v m() {
        return this.f29390j;
    }

    public final InterfaceC3349K n() {
        return this.f29384d;
    }

    public final void o(Context context, X4.K review) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(review, "review");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new d(review, context, this, null), 2, null);
    }

    public final void p(Context context, String str) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new e(context, str, this, null), 2, null);
    }

    public final void q(boolean z8) {
        this.f29391k = z8;
    }

    public final void r(boolean z8) {
        this.f29392l = z8;
    }

    public final void s(int i8) {
        this.f29393m = i8;
    }
}
