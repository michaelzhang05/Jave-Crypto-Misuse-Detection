package V4;

import O5.I;
import O5.t;
import a5.C1632D;
import a5.C1641h;
import a5.y;
import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3660F;
import o5.C3674n;
import o5.C3678r;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private Context f11235a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11236a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f11236a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                o oVar = o.this;
                this.f11236a = 1;
                if (oVar.c(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11238a;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            JSONObject jSONObject;
            T5.b.e();
            if (this.f11238a == 0) {
                t.b(obj);
                if (!SettingsPreferences.f30353b.m0(o.this.f11235a)) {
                    C3674n a8 = C3674n.f36505t.a(o.this.f11235a);
                    a8.a();
                    Iterator it = a8.m0().iterator();
                    while (it.hasNext()) {
                        y yVar = (y) it.next();
                        C1641h c1641h = null;
                        if (j6.n.t(yVar.a(), "upcoming_release", false, 2, null) && yVar.b() != null) {
                            try {
                                String b8 = yVar.b();
                                AbstractC3255y.f(b8);
                                j8 = Long.parseLong(b8);
                            } catch (NumberFormatException unused) {
                                a8.H(yVar.c());
                                j8 = -1;
                            }
                            if (j8 > 0 && a8.t0(j8) == null) {
                                a5.I Q8 = new C3660F(o.this.f11235a).Q(j8);
                                if (!Q8.b() && Q8.d() != null) {
                                    String d8 = Q8.d();
                                    AbstractC3255y.f(d8);
                                    JSONObject jSONObject2 = new JSONObject(d8);
                                    if (!jSONObject2.isNull("success")) {
                                        int i8 = jSONObject2.getInt("success");
                                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                        } else {
                                            jSONObject = null;
                                        }
                                        if (i8 == 1 && jSONObject != null) {
                                            c1641h = C1641h.f14163L0.a(jSONObject);
                                        }
                                    }
                                }
                                if (c1641h != null && c1641h.i() > 0 && c1641h.s0() != null) {
                                    long i9 = c1641h.i();
                                    String s02 = c1641h.s0();
                                    AbstractC3255y.f(s02);
                                    new C1632D(i9, s02, c1641h.m0(), c1641h.g()).h(o.this.f11235a);
                                    a8.H(yVar.c());
                                    Bundle bundle = new Bundle();
                                    bundle.putString("type", "recovered");
                                    new C3678r(o.this.f11235a).b("upcoming_release", bundle);
                                }
                            }
                        }
                    }
                    a8.l();
                    SettingsPreferences.f30353b.g1(o.this.f11235a, true);
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public o(Context context) {
        AbstractC3255y.i(context, "context");
        this.f11235a = context;
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
