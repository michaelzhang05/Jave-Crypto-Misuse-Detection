package m2;

import O5.InterfaceC1355k;
import O5.s;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import h3.C2902d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.M;
import org.json.JSONObject;

/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3422h implements InterfaceC3425k {

    /* renamed from: c, reason: collision with root package name */
    private static final a f34962c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f34963d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final S5.g f34964a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f34965b;

    /* renamed from: m2.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: m2.h$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f34966a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34967b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: m2.h$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f34969a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(JSONObject jSONObject) {
                super(0);
                this.f34969a = jSONObject;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(this.f34969a.optLong(CampaignEx.JSON_KEY_TIMESTAMP, -1L));
            }
        }

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            b bVar = new b(dVar);
            bVar.f34967b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            T5.b.e();
            if (this.f34966a == 0) {
                O5.t.b(obj);
                C3422h c3422h = C3422h.this;
                try {
                    s.a aVar = O5.s.f8302b;
                    String string = c3422h.d().getString("key_fraud_detection_data", null);
                    if (string == null) {
                        string = "";
                    }
                    JSONObject jSONObject = new JSONObject(string);
                    b8 = O5.s.b(new f3.r(new a(jSONObject)).a(jSONObject));
                } catch (Throwable th) {
                    s.a aVar2 = O5.s.f8302b;
                    b8 = O5.s.b(O5.t.a(th));
                }
                if (O5.s.g(b8)) {
                    return null;
                }
                return b8;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: m2.h$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f34970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f34970a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f34970a.getSharedPreferences("FraudDetectionDataStore", 0);
        }
    }

    public C3422h(Context context, S5.g workContext) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
        this.f34964a = workContext;
        this.f34965b = O5.l.b(new c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences d() {
        return (SharedPreferences) this.f34965b.getValue();
    }

    @Override // m2.InterfaceC3425k
    public Object a(S5.d dVar) {
        return AbstractC3360i.g(this.f34964a, new b(null), dVar);
    }

    @Override // m2.InterfaceC3425k
    public void b(C2902d fraudDetectionData) {
        AbstractC3255y.i(fraudDetectionData, "fraudDetectionData");
        SharedPreferences d8 = d();
        AbstractC3255y.h(d8, "<get-prefs>(...)");
        SharedPreferences.Editor edit = d8.edit();
        edit.putString("key_fraud_detection_data", fraudDetectionData.l().toString());
        edit.apply();
    }
}
