package S4;

import L5.I;
import L5.t;
import X4.C1504n;
import X4.M;
import android.content.Context;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.N;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3312F;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9603a;

    /* renamed from: b, reason: collision with root package name */
    private final C1504n f9604b;

    /* renamed from: c, reason: collision with root package name */
    private final M f9605c;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f9606a;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f9606a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                q qVar = q.this;
                this.f9606a = 1;
                if (qVar.e(this) == e8) {
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
        int f9608a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f9608a == 0) {
                t.b(obj);
                String d8 = new C3312F(q.this.f9603a).O0(q.this.f9604b, q.this.f9605c, null).d();
                if (d8 != null && d8.length() != 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(d8);
                        boolean z8 = true;
                        if (jSONObject.isNull("success") || jSONObject.getInt("success") != 1) {
                            z8 = false;
                        }
                        SettingsPreferences.f29323b.X0(q.this.f9603a, z8);
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                        SettingsPreferences.f29323b.X0(q.this.f9603a, false);
                    }
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public q(Context context, C1504n deviceInfo, M settingsUTD) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(deviceInfo, "deviceInfo");
        AbstractC3159y.i(settingsUTD, "settingsUTD");
        this.f9603a = context;
        this.f9604b = deviceInfo;
        this.f9605c = settingsUTD;
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }
}
