package com.uptodown.activities;

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
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class J extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29387a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29388b;

    /* renamed from: c, reason: collision with root package name */
    private final o6.w f29389c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f29390d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f29391e;

    /* renamed from: f, reason: collision with root package name */
    private final o6.w f29392f;

    /* renamed from: g, reason: collision with root package name */
    private final o6.w f29393g;

    /* renamed from: h, reason: collision with root package name */
    private final o6.w f29394h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final a5.H f29395a;

        public a(a5.H h8) {
            this.f29395a = h8;
        }

        public final a5.H a() {
            return this.f29395a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f29395a, ((a) obj).f29395a);
        }

        public int hashCode() {
            a5.H h8 = this.f29395a;
            if (h8 == null) {
                return 0;
            }
            return h8.hashCode();
        }

        public String toString() {
            return "VirusTotalReportData(reportVT=" + this.f29395a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29396a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29398c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29399d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f29400e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f29401f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, boolean z8, long j8, long j9, S5.d dVar) {
            super(2, dVar);
            this.f29398c = context;
            this.f29399d = z8;
            this.f29400e = j8;
            this.f29401f = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f29398c, this.f29399d, this.f29400e, this.f29401f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            int i8;
            JSONObject jSONObject;
            T5.b.e();
            if (this.f29396a == 0) {
                O5.t.b(obj);
                J.this.f29387a.setValue(AbstractC3685y.a.f36548a);
                C3660F c3660f = new C3660F(this.f29398c);
                if (!this.f29399d) {
                    j8 = this.f29400e;
                } else {
                    j8 = this.f29401f;
                }
                a5.I u02 = c3660f.u0(String.valueOf(j8));
                a5.H h8 = null;
                if (!u02.b() && u02.d() != null) {
                    String d8 = u02.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = u02.d();
                        AbstractC3255y.f(d9);
                        JSONObject jSONObject2 = new JSONObject(d9);
                        if (!jSONObject2.isNull("success")) {
                            i8 = jSONObject2.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (i8 == 1 && jSONObject != null) {
                            h8 = new a5.H();
                            h8.a(jSONObject);
                        }
                    }
                }
                J.this.f29387a.setValue(new AbstractC3685y.c(new a(h8)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public J() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.b.f36549a);
        this.f29387a = a8;
        this.f29388b = a8;
        this.f29389c = AbstractC3700N.a(null);
        this.f29390d = AbstractC3700N.a(null);
        this.f29391e = AbstractC3700N.a(null);
        this.f29392f = AbstractC3700N.a(null);
        this.f29393g = AbstractC3700N.a(0L);
        this.f29394h = AbstractC3700N.a(Boolean.FALSE);
    }

    public final void b(Context context, long j8, long j9, boolean z8) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, z8, j8, j9, null), 2, null);
    }

    public final o6.w c() {
        return this.f29389c;
    }

    public final o6.w d() {
        return this.f29390d;
    }

    public final InterfaceC3698L e() {
        return this.f29388b;
    }

    public final o6.w f() {
        return this.f29393g;
    }

    public final o6.w g() {
        return this.f29392f;
    }

    public final o6.w h() {
        return this.f29391e;
    }

    public final o6.w i() {
        return this.f29394h;
    }
}
