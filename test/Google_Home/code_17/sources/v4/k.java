package V4;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.C3660F;
import o5.C3674n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11188a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11189a;

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
            int i8 = this.f11189a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                k kVar = k.this;
                this.f11189a = 1;
                if (kVar.c(this) == e8) {
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
        int f11191a;

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
            int i8;
            T5.b.e();
            if (this.f11191a == 0) {
                t.b(obj);
                C3674n a8 = C3674n.f36505t.a(k.this.f11188a);
                a8.a();
                if (a8.j0() > 0) {
                    a5.I g02 = new C3660F(k.this.f11188a).g0();
                    if (!g02.b() && g02.d() != null) {
                        String d8 = g02.d();
                        AbstractC3255y.f(d8);
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
                                    AbstractC3255y.h(string, "jsonObjectTrackedAppInfo.getString(\"packageName\")");
                                    a8.v1(string, j8, i8);
                                }
                            }
                            a8.k1();
                        }
                    }
                }
                a8.l();
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public k(Context context, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(scope, "scope");
        this.f11188a = context;
        AbstractC3364k.d(scope, null, null, new a(null), 3, null);
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
