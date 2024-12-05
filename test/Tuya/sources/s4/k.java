package S4;

import L5.I;
import L5.t;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import l5.C3326n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9545a;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9546a;

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
            int i8 = this.f9546a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                k kVar = k.this;
                this.f9546a = 1;
                if (kVar.c(this) == e8) {
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
        int f9548a;

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
            int i8;
            Q5.b.e();
            if (this.f9548a == 0) {
                t.b(obj);
                C3326n a8 = C3326n.f34504t.a(k.this.f9545a);
                a8.a();
                if (a8.j0() > 0) {
                    X4.I g02 = new C3312F(k.this.f9545a).g0();
                    if (!g02.b() && g02.d() != null) {
                        String d8 = g02.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i9 = 0; i9 < length; i9++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                if (!jSONObject2.isNull("packageName")) {
                                    if (!jSONObject2.isNull("appID")) {
                                        j8 = jSONObject2.getLong("appID");
                                    } else {
                                        j8 = 0;
                                    }
                                    if (!jSONObject2.isNull("hasOldVersions")) {
                                        i8 = jSONObject2.getInt("hasOldVersions");
                                    } else {
                                        i8 = 0;
                                    }
                                    String string = jSONObject2.getString("packageName");
                                    AbstractC3159y.h(string, "jsonObjectTrackedAppInfo.getString(\"packageName\")");
                                    a8.v1(string, j8, i8);
                                }
                            }
                            a8.k1();
                        }
                    }
                }
                a8.g();
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public k(Context context, M scope) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(scope, "scope");
        this.f9545a = context;
        AbstractC2829k.d(scope, null, null, new a(null), 3, null);
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
