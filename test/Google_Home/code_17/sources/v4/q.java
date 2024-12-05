package V4;

import O5.I;
import O5.t;
import a5.C1647n;
import a5.M;
import a6.InterfaceC1668n;
import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.N;
import o5.C3660F;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11246a;

    /* renamed from: b, reason: collision with root package name */
    private final C1647n f11247b;

    /* renamed from: c, reason: collision with root package name */
    private final M f11248c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11249a;

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
            int i8 = this.f11249a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                q qVar = q.this;
                this.f11249a = 1;
                if (qVar.e(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11251a;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f11251a == 0) {
                t.b(obj);
                String d8 = new C3660F(q.this.f11246a).O0(q.this.f11247b, q.this.f11248c, null).d();
                if (d8 != null && d8.length() != 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(d8);
                        boolean z8 = true;
                        if (jSONObject.isNull("success") || jSONObject.getInt("success") != 1) {
                            z8 = false;
                        }
                        SettingsPreferences.f30353b.X0(q.this.f11246a, z8);
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                        SettingsPreferences.f30353b.X0(q.this.f11246a, false);
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public q(Context context, C1647n deviceInfo, M settingsUTD) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(deviceInfo, "deviceInfo");
        AbstractC3255y.i(settingsUTD, "settingsUTD");
        this.f11246a = context;
        this.f11247b = deviceInfo;
        this.f11248c = settingsUTD;
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
