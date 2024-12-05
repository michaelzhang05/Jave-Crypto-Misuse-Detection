package V4;

import O5.I;
import O5.t;
import a5.C1649p;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3660F;
import o5.C3674n;
import o5.C3678r;
import o5.C3680t;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final b f11240b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f11241a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11242a;

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
            int i8 = this.f11242a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                p pVar = p.this;
                this.f11242a = 1;
                if (pVar.g(this) == e8) {
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

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11244a;

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11244a == 0) {
                t.b(obj);
                if (p.this.e()) {
                    C3674n a8 = C3674n.f36505t.a(p.this.f11241a);
                    a8.a();
                    ArrayList d02 = a8.d0();
                    a8.l();
                    if (d02.size() > 0) {
                        C3660F c3660f = new C3660F(p.this.f11241a);
                        C3678r c3678r = new C3678r(p.this.f11241a);
                        a5.I c8 = c3660f.c();
                        c3678r.c("elasticGetMinVersion", c8);
                        if (c3660f.g(c8) && c8.d() != null) {
                            String d8 = c8.d();
                            AbstractC3255y.f(d8);
                            JSONObject jSONObject = new JSONObject(d8);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                if (!jSONObject2.isNull("result") && jSONObject2.getInt("result") == 1) {
                                    a5.I z02 = c3660f.z0(d02);
                                    c3678r.c("elasticPostEvents", z02);
                                    if (c3660f.g(z02) && z02.d() != null) {
                                        String d9 = z02.d();
                                        AbstractC3255y.f(d9);
                                        JSONObject jSONObject3 = new JSONObject(d9);
                                        if (!jSONObject3.isNull("success") && jSONObject3.getInt("success") == 1) {
                                            a8.a();
                                            Iterator it = d02.iterator();
                                            while (it.hasNext()) {
                                                a8.E(((C1649p) it.next()).a());
                                            }
                                            a8.l();
                                        }
                                    }
                                }
                            }
                        }
                        p pVar = p.this;
                        pVar.f(pVar.f11241a);
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public p(Context context) {
        AbstractC3255y.i(context, "context");
        this.f11241a = context;
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        if (C3680t.f36531a.d()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            long v8 = aVar.v(this.f11241a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - v8 > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                aVar.P0(this.f11241a, currentTimeMillis);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context) {
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        a8.I();
        a8.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
