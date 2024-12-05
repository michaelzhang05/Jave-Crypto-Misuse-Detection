package com.uptodown.activities;

import X4.K;
import X4.Q;
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
public final class I extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28275a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28276b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28277c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f28278d;

    /* renamed from: e, reason: collision with root package name */
    private l6.v f28279e;

    /* renamed from: f, reason: collision with root package name */
    private l6.v f28280f;

    /* renamed from: g, reason: collision with root package name */
    private l6.v f28281g;

    /* renamed from: h, reason: collision with root package name */
    private l6.v f28282h;

    /* renamed from: i, reason: collision with root package name */
    private l6.v f28283i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28284j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f28285k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f28286l;

    /* renamed from: m, reason: collision with root package name */
    private int f28287m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Q f28288a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f28289b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f28290c;

        public a(Q q8, ArrayList reviews, boolean z8) {
            AbstractC3159y.i(reviews, "reviews");
            this.f28288a = q8;
            this.f28289b = reviews;
            this.f28290c = z8;
        }

        public final ArrayList a() {
            return this.f28289b;
        }

        public final Q b() {
            return this.f28288a;
        }

        public final boolean c() {
            return this.f28290c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f28288a, aVar.f28288a) && AbstractC3159y.d(this.f28289b, aVar.f28289b) && this.f28290c == aVar.f28290c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Q q8 = this.f28288a;
            int hashCode = (((q8 == null ? 0 : q8.hashCode()) * 31) + this.f28289b.hashCode()) * 31;
            boolean z8 = this.f28290c;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "UserCommentsData(user=" + this.f28288a + ", reviews=" + this.f28289b + ", userExists=" + this.f28290c + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28291a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, P5.d dVar) {
            super(2, dVar);
            this.f28293c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28293c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q q8;
            Q5.b.e();
            if (this.f28291a == 0) {
                L5.t.b(obj);
                if (I.this.f28285k) {
                    ArrayList arrayList = new ArrayList();
                    C3312F c3312f = new C3312F(this.f28293c);
                    Object value = I.this.m().getValue();
                    AbstractC3159y.f(value);
                    X4.I p02 = c3312f.p0((String) value, 10, I.this.j());
                    Q q9 = null;
                    JSONArray jSONArray = null;
                    q9 = null;
                    q9 = null;
                    if (!p02.b() && p02.d() != null) {
                        String d8 = p02.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("user")) {
                                q8 = new Q();
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                                AbstractC3159y.h(jSONObject3, "jsonObjectData.getJSONOb…ct(Constantes.FIELD_USER)");
                                q8.i(jSONObject3);
                                I.this.n().setValue(q8.n());
                                I.this.l().setValue(q8.c());
                                I.this.o().setValue(q8.u());
                                I.this.p().setValue(kotlin.coroutines.jvm.internal.b.a(q8.I()));
                            } else {
                                q8 = null;
                            }
                            if (!jSONObject2.isNull("comments")) {
                                jSONArray = jSONObject2.getJSONArray("comments");
                            }
                            if (jSONArray == null) {
                                I.this.f28285k = false;
                            } else {
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    K.b bVar = X4.K.f12381o;
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i8);
                                    AbstractC3159y.h(jSONObject4, "jsonArrayData.getJSONObject(i)");
                                    arrayList.add(bVar.g(jSONObject4));
                                }
                            }
                            q9 = q8;
                        }
                    } else if (p02.e() == 404) {
                        I.this.f28284j = false;
                    }
                    I i9 = I.this;
                    i9.s(i9.j() + arrayList.size());
                    I.this.f28275a.setValue(new AbstractC3337y.c(new a(q9, arrayList, I.this.f28284j)));
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28294a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X4.K f28295b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28296c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I f28297d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(X4.K k8, Context context, I i8, P5.d dVar) {
            super(2, dVar);
            this.f28295b = k8;
            this.f28296c = context;
            this.f28297d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f28295b, this.f28296c, this.f28297d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f28294a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                K.b bVar = X4.K.f12381o;
                X4.K k8 = this.f28295b;
                Context context = this.f28296c;
                this.f28294a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f28297d.f28277c.setValue(new AbstractC3337y.c(new K.c(this.f28295b, ((Number) obj).intValue())));
            return L5.I.f6487a;
        }
    }

    public I() {
        AbstractC3337y.a aVar = AbstractC3337y.a.f34547a;
        l6.v a8 = AbstractC3351M.a(aVar);
        this.f28275a = a8;
        this.f28276b = a8;
        l6.v a9 = AbstractC3351M.a(aVar);
        this.f28277c = a9;
        this.f28278d = a9;
        this.f28279e = AbstractC3351M.a("");
        this.f28280f = AbstractC3351M.a("");
        this.f28281g = AbstractC3351M.a("");
        this.f28282h = AbstractC3351M.a("");
        this.f28283i = AbstractC3351M.a(Boolean.FALSE);
        this.f28284j = true;
        this.f28285k = true;
    }

    public final void g(Context context) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, null), 2, null);
    }

    public final InterfaceC3349K h() {
        return this.f28276b;
    }

    public final boolean i() {
        return this.f28286l;
    }

    public final int j() {
        return this.f28287m;
    }

    public final InterfaceC3349K k() {
        return this.f28278d;
    }

    public final l6.v l() {
        return this.f28281g;
    }

    public final l6.v m() {
        return this.f28279e;
    }

    public final l6.v n() {
        return this.f28280f;
    }

    public final l6.v o() {
        return this.f28282h;
    }

    public final l6.v p() {
        return this.f28283i;
    }

    public final void q(Context context, X4.K review) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(review, "review");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(review, context, this, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f28286l = z8;
    }

    public final void s(int i8) {
        this.f28287m = i8;
    }
}
