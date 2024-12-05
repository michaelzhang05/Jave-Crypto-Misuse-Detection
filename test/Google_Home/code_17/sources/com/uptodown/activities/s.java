package com.uptodown.activities;

import a5.C1641h;
import a5.K;
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
public final class s extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30411a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30412b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30413c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f30414d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f30415e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f30416f;

    /* renamed from: g, reason: collision with root package name */
    private o6.w f30417g;

    /* renamed from: h, reason: collision with root package name */
    private o6.w f30418h;

    /* renamed from: i, reason: collision with root package name */
    private o6.w f30419i;

    /* renamed from: j, reason: collision with root package name */
    private o6.w f30420j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30421k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30422l;

    /* renamed from: m, reason: collision with root package name */
    private int f30423m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30424a;

        public a(ArrayList reviews) {
            AbstractC3255y.i(reviews, "reviews");
            this.f30424a = reviews;
        }

        public final ArrayList a() {
            return this.f30424a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f30424a, ((a) obj).f30424a);
        }

        public int hashCode() {
            return this.f30424a.hashCode();
        }

        public String toString() {
            return "ReviewsData(reviews=" + this.f30424a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f30425a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30426b;

        public b(int i8, int i9) {
            this.f30425a = i8;
            this.f30426b = i9;
        }

        public final int a() {
            return this.f30426b;
        }

        public final int b() {
            return this.f30425a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30425a == bVar.f30425a && this.f30426b == bVar.f30426b;
        }

        public int hashCode() {
            return (this.f30425a * 31) + this.f30426b;
        }

        public String toString() {
            return "SendReviewData(success=" + this.f30425a + ", statusCode=" + this.f30426b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30427a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, S5.d dVar) {
            super(2, dVar);
            this.f30429c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30429c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            T5.b.e();
            if (this.f30427a == 0) {
                O5.t.b(obj);
                s.this.f30411a.setValue(AbstractC3685y.a.f36548a);
                ArrayList arrayList = new ArrayList();
                C3660F c3660f = new C3660F(this.f30429c);
                Object value = s.this.e().getValue();
                AbstractC3255y.f(value);
                a5.I V7 = c3660f.V(((C1641h) value).i(), 20, s.this.j(), (String) s.this.k().getValue());
                if (!V7.b() && V7.d() != null) {
                    String d8 = V7.d();
                    AbstractC3255y.f(d8);
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
                            K.b bVar = a5.K.f14002o;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                            AbstractC3255y.h(jSONObject2, "jsonArrayData.getJSONObject(i)");
                            arrayList.add(bVar.a(jSONObject2));
                        }
                    }
                } else {
                    s.this.q(false);
                }
                s.this.f30411a.setValue(new AbstractC3685y.c(new a(arrayList)));
                s sVar = s.this;
                sVar.s(sVar.j() + arrayList.size());
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.K f30431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30432c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f30433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a5.K k8, Context context, s sVar, S5.d dVar) {
            super(2, dVar);
            this.f30431b = k8;
            this.f30432c = context;
            this.f30433d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f30431b, this.f30432c, this.f30433d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30430a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                K.b bVar = a5.K.f14002o;
                a5.K k8 = this.f30431b;
                Context context = this.f30432c;
                this.f30430a = 1;
                obj = bVar.c(k8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f30433d.f30415e.setValue(new AbstractC3685y.c(new K.c(this.f30431b, ((Number) obj).intValue())));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30436c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f30437d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, s sVar, S5.d dVar) {
            super(2, dVar);
            this.f30435b = context;
            this.f30436c = str;
            this.f30437d = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f30435b, this.f30436c, this.f30437d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            T5.b.e();
            if (this.f30434a == 0) {
                O5.t.b(obj);
                K.b bVar = a5.K.f14002o;
                int i9 = 0;
                if (!bVar.b(this.f30435b, this.f30436c)) {
                    bVar.f(this.f30435b, this.f30436c, String.valueOf(System.currentTimeMillis()));
                    C3660F c3660f = new C3660F(this.f30435b);
                    a5.K k8 = new a5.K();
                    k8.c0(this.f30436c);
                    k8.b0(((Number) this.f30437d.m().getValue()).intValue());
                    Object value = this.f30437d.e().getValue();
                    AbstractC3255y.f(value);
                    a5.I I02 = c3660f.I0(((C1641h) value).i(), k8);
                    i8 = I02.e();
                    if (!I02.b() && I02.d() != null) {
                        String d8 = I02.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            i9 = jSONObject.getInt("success");
                        }
                    }
                } else {
                    i8 = 0;
                }
                this.f30437d.f30413c.setValue(new AbstractC3685y.c(new b(i9, i8)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public s() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30411a = a8;
        this.f30412b = a8;
        AbstractC3685y.b bVar = AbstractC3685y.b.f36549a;
        o6.w a9 = AbstractC3700N.a(bVar);
        this.f30413c = a9;
        this.f30414d = a9;
        o6.w a10 = AbstractC3700N.a(bVar);
        this.f30415e = a10;
        this.f30416f = a10;
        this.f30417g = AbstractC3700N.a(null);
        this.f30418h = AbstractC3700N.a(null);
        this.f30419i = AbstractC3700N.a("date");
        this.f30420j = AbstractC3700N.a(-1);
        this.f30421k = true;
    }

    public final void d(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, null), 2, null);
    }

    public final o6.w e() {
        return this.f30417g;
    }

    public final InterfaceC3698L f() {
        return this.f30412b;
    }

    public final boolean g() {
        return this.f30421k;
    }

    public final boolean h() {
        return this.f30422l;
    }

    public final o6.w i() {
        return this.f30418h;
    }

    public final int j() {
        return this.f30423m;
    }

    public final o6.w k() {
        return this.f30419i;
    }

    public final InterfaceC3698L l() {
        return this.f30416f;
    }

    public final o6.w m() {
        return this.f30420j;
    }

    public final InterfaceC3698L n() {
        return this.f30414d;
    }

    public final void o(Context context, a5.K review) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(review, "review");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(review, context, this, null), 2, null);
    }

    public final void p(Context context, String str) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new e(context, str, this, null), 2, null);
    }

    public final void q(boolean z8) {
        this.f30421k = z8;
    }

    public final void r(boolean z8) {
        this.f30422l = z8;
    }

    public final void s(int i8) {
        this.f30423m = i8;
    }
}
