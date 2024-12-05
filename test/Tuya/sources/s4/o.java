package S4;

import L5.I;
import L5.t;
import X4.C1498h;
import X4.D;
import X4.y;
import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3326n;
import l5.C3330r;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private Context f9592a;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9593a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9593a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                o oVar = o.this;
                this.f9593a = 1;
                if (oVar.c(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9595a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            JSONObject jSONObject;
            Q5.b.e();
            if (this.f9595a == 0) {
                t.b(obj);
                if (!SettingsPreferences.f29323b.m0(o.this.f9592a)) {
                    C3326n a8 = C3326n.f34504t.a(o.this.f9592a);
                    a8.a();
                    Iterator it = a8.m0().iterator();
                    while (it.hasNext()) {
                        y yVar = (y) it.next();
                        C1498h c1498h = null;
                        if (g6.n.t(yVar.a(), "upcoming_release", false, 2, null) && yVar.b() != null) {
                            try {
                                String b8 = yVar.b();
                                AbstractC3159y.f(b8);
                                j8 = Long.parseLong(b8);
                            } catch (NumberFormatException unused) {
                                a8.H(yVar.c());
                                j8 = -1;
                            }
                            if (j8 > 0 && a8.t0(j8) == null) {
                                X4.I Q8 = new C3312F(o.this.f9592a).Q(j8);
                                if (!Q8.b() && Q8.d() != null) {
                                    String d8 = Q8.d();
                                    AbstractC3159y.f(d8);
                                    JSONObject jSONObject2 = new JSONObject(d8);
                                    if (!jSONObject2.isNull("success")) {
                                        int i8 = jSONObject2.getInt("success");
                                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        } else {
                                            jSONObject = null;
                                        }
                                        if (i8 == 1 && jSONObject != null) {
                                            c1498h = C1498h.f12542L0.a(jSONObject);
                                        }
                                    }
                                }
                                if (c1498h != null && c1498h.i() > 0 && c1498h.s0() != null) {
                                    long i9 = c1498h.i();
                                    String s02 = c1498h.s0();
                                    AbstractC3159y.f(s02);
                                    new D(i9, s02, c1498h.m0(), c1498h.e()).h(o.this.f9592a);
                                    a8.H(yVar.c());
                                    Bundle bundle = new Bundle();
                                    bundle.putString("type", "recovered");
                                    new C3330r(o.this.f9592a).b("upcoming_release", bundle);
                                }
                            }
                        }
                    }
                    a8.g();
                    SettingsPreferences.f29323b.g1(o.this.f9592a, true);
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public o(Context context) {
        AbstractC3159y.i(context, "context");
        this.f9592a = context;
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
