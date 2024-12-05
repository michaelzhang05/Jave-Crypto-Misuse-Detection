package com.uptodown.activities;

import a5.C1629A;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
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
public final class q extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30358a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30359b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f30360c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f30361d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f30362e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30363f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30364g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30365h;

    /* renamed from: i, reason: collision with root package name */
    private int f30366i;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C1629A f30367a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30368b;

        public a(C1629A organization, boolean z8) {
            AbstractC3255y.i(organization, "organization");
            this.f30367a = organization;
            this.f30368b = z8;
        }

        public final boolean a() {
            return this.f30368b;
        }

        public final C1629A b() {
            return this.f30367a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f30367a, aVar.f30367a) && this.f30368b == aVar.f30368b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f30367a.hashCode() * 31;
            boolean z8 = this.f30368b;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "OrganizationData(organization=" + this.f30367a + ", moreDataAdded=" + this.f30368b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30369a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30371c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, S5.d dVar) {
            super(2, dVar);
            this.f30371c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30371c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f30369a == 0) {
                O5.t.b(obj);
                q.this.n(true);
                q.this.m(false);
                a5.I K8 = new C3660F(this.f30371c).K(((Number) q.this.j().getValue()).longValue());
                if (!K8.b() && (d8 = K8.d()) != null && d8.length() != 0) {
                    String d9 = K8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        C1629A c1629a = (C1629A) q.this.f30360c.getValue();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(Constantes.FIELD_DATA)");
                        c1629a.o(jSONObject2);
                    } else if (jSONObject.getInt("success") == 1) {
                        q.this.m(true);
                    }
                }
                q.this.f30358a.setValue(new AbstractC3685y.c(new a((C1629A) q.this.f30360c.getValue(), false)));
                q.this.n(false);
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
        int f30372a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30374c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, S5.d dVar) {
            super(2, dVar);
            this.f30374c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f30374c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            T5.b.e();
            if (this.f30372a == 0) {
                O5.t.b(obj);
                q.this.f30358a.setValue(AbstractC3685y.a.f36548a);
                q.this.n(true);
                a5.I J8 = new C3660F(this.f30374c).J(((Number) q.this.j().getValue()).longValue(), q.this.f30366i);
                if (!J8.b() && (d8 = J8.d()) != null && d8.length() != 0) {
                    String d9 = J8.d();
                    AbstractC3255y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        C1629A c1629a = (C1629A) q.this.f30360c.getValue();
                        C1629A c1629a2 = (C1629A) q.this.f30360c.getValue();
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3255y.h(jSONArray, "jsonObject.getJSONArray(Constantes.FIELD_DATA)");
                        c1629a.p(c1629a2.n(jSONArray));
                    } else if (J8.b() && J8.e() == 404) {
                        q.this.m(true);
                        q.this.f30358a.setValue(AbstractC3685y.b.f36549a);
                    }
                    q.this.f30358a.setValue(new AbstractC3685y.c(new a((C1629A) q.this.f30360c.getValue(), true)));
                    q.this.f30366i++;
                } else {
                    q.this.m(true);
                    q.this.f30358a.setValue(AbstractC3685y.b.f36549a);
                }
                q.this.n(false);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public q() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30358a = a8;
        this.f30359b = a8;
        this.f30360c = AbstractC3700N.a(new C1629A());
        this.f30361d = AbstractC3700N.a(0L);
        this.f30362e = AbstractC3700N.a("");
        this.f30366i = 2;
    }

    public final void e(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, null), 2, null);
    }

    public final void f(Context context) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, null), 2, null);
    }

    public final boolean g() {
        return this.f30364g;
    }

    public final InterfaceC3698L h() {
        return this.f30359b;
    }

    public final boolean i() {
        return this.f30363f;
    }

    public final o6.w j() {
        return this.f30361d;
    }

    public final o6.w k() {
        return this.f30362e;
    }

    public final boolean l() {
        return this.f30365h;
    }

    public final void m(boolean z8) {
        this.f30364g = z8;
    }

    public final void n(boolean z8) {
        this.f30363f = z8;
    }

    public final void o(boolean z8) {
        this.f30365h = z8;
    }
}
