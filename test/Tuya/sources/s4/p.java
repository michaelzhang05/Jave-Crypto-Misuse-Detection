package S4;

import L5.I;
import L5.t;
import X4.C1506p;
import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3326n;
import l5.C3330r;
import l5.C3332t;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final b f9597b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f9598a;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9599a;

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
            int i8 = this.f9599a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                p pVar = p.this;
                this.f9599a = 1;
                if (pVar.g(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9601a;

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9601a == 0) {
                t.b(obj);
                if (p.this.e()) {
                    C3326n a8 = C3326n.f34504t.a(p.this.f9598a);
                    a8.a();
                    ArrayList d02 = a8.d0();
                    a8.g();
                    if (d02.size() > 0) {
                        C3312F c3312f = new C3312F(p.this.f9598a);
                        C3330r c3330r = new C3330r(p.this.f9598a);
                        X4.I c8 = c3312f.c();
                        c3330r.c("elasticGetMinVersion", c8);
                        if (c3312f.g(c8) && c8.d() != null) {
                            String d8 = c8.d();
                            AbstractC3159y.f(d8);
                            JSONObject jSONObject = new JSONObject(d8);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                if (!jSONObject2.isNull("result") && jSONObject2.getInt("result") == 1) {
                                    X4.I z02 = c3312f.z0(d02);
                                    c3330r.c("elasticPostEvents", z02);
                                    if (c3312f.g(z02) && z02.d() != null) {
                                        String d9 = z02.d();
                                        AbstractC3159y.f(d9);
                                        JSONObject jSONObject3 = new JSONObject(d9);
                                        if (!jSONObject3.isNull("success") && jSONObject3.getInt("success") == 1) {
                                            a8.a();
                                            Iterator it = d02.iterator();
                                            while (it.hasNext()) {
                                                a8.E(((C1506p) it.next()).a());
                                            }
                                            a8.g();
                                        }
                                    }
                                }
                            }
                        }
                        p pVar = p.this;
                        pVar.f(pVar.f9598a);
                    }
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public p(Context context) {
        AbstractC3159y.i(context, "context");
        this.f9598a = context;
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        if (C3332t.f34530a.d()) {
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            long v8 = aVar.v(this.f9598a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - v8 > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                aVar.P0(this.f9598a, currentTimeMillis);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context) {
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        a8.I();
        a8.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new c(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
