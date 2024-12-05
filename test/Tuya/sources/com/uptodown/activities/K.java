package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class K extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28333a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28334b;

    /* renamed from: c, reason: collision with root package name */
    private final l6.v f28335c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f28336d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f28337e;

    /* renamed from: f, reason: collision with root package name */
    private final l6.v f28338f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f28339g;

    /* renamed from: h, reason: collision with root package name */
    private final l6.v f28340h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final X4.H f28341a;

        public a(X4.H h8) {
            this.f28341a = h8;
        }

        public final X4.H a() {
            return this.f28341a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f28341a, ((a) obj).f28341a);
        }

        public int hashCode() {
            X4.H h8 = this.f28341a;
            if (h8 == null) {
                return 0;
            }
            return h8.hashCode();
        }

        public String toString() {
            return "VirusTotalReportData(reportVT=" + this.f28341a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28342a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f28344c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28345d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f28346e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f28347f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, boolean z8, long j8, long j9, P5.d dVar) {
            super(2, dVar);
            this.f28344c = context;
            this.f28345d = z8;
            this.f28346e = j8;
            this.f28347f = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28344c, this.f28345d, this.f28346e, this.f28347f, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            int i8;
            JSONObject jSONObject;
            Q5.b.e();
            if (this.f28342a == 0) {
                L5.t.b(obj);
                K.this.f28333a.setValue(AbstractC3337y.a.f34547a);
                C3312F c3312f = new C3312F(this.f28344c);
                if (!this.f28345d) {
                    j8 = this.f28346e;
                } else {
                    j8 = this.f28347f;
                }
                X4.I u02 = c3312f.u0(String.valueOf(j8));
                X4.H h8 = null;
                if (!u02.b() && u02.d() != null) {
                    String d8 = u02.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = u02.d();
                        AbstractC3159y.f(d9);
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
                            h8 = new X4.H();
                            h8.b(jSONObject);
                        }
                    }
                }
                K.this.f28333a.setValue(new AbstractC3337y.c(new a(h8)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public K() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.b.f34548a);
        this.f28333a = a8;
        this.f28334b = a8;
        this.f28335c = AbstractC3351M.a(null);
        this.f28336d = AbstractC3351M.a(null);
        this.f28337e = AbstractC3351M.a(null);
        this.f28338f = AbstractC3351M.a(null);
        this.f28339g = AbstractC3351M.a(0L);
        this.f28340h = AbstractC3351M.a(Boolean.FALSE);
    }

    public final void b(Context context, long j8, long j9, boolean z8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, z8, j8, j9, null), 2, null);
    }

    public final l6.v c() {
        return this.f28335c;
    }

    public final l6.v d() {
        return this.f28336d;
    }

    public final InterfaceC3349K e() {
        return this.f28334b;
    }

    public final l6.v f() {
        return this.f28339g;
    }

    public final l6.v g() {
        return this.f28338f;
    }

    public final l6.v h() {
        return this.f28337e;
    }

    public final l6.v i() {
        return this.f28340h;
    }
}
