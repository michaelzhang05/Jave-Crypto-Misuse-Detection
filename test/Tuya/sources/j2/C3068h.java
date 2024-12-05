package j2;

import L5.InterfaceC1227k;
import L5.s;
import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e3.C2582d;
import i6.AbstractC2825i;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import org.json.JSONObject;

/* renamed from: j2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3068h implements InterfaceC3071k {

    /* renamed from: c, reason: collision with root package name */
    private static final a f32986c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f32987d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final P5.g f32988a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f32989b;

    /* renamed from: j2.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: j2.h$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f32990a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f32991b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j2.h$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f32993a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(JSONObject jSONObject) {
                super(0);
                this.f32993a = jSONObject;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(this.f32993a.optLong(CampaignEx.JSON_KEY_TIMESTAMP, -1L));
            }
        }

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            b bVar = new b(dVar);
            bVar.f32991b = obj;
            return bVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b8;
            Q5.b.e();
            if (this.f32990a == 0) {
                L5.t.b(obj);
                C3068h c3068h = C3068h.this;
                try {
                    s.a aVar = L5.s.f6511b;
                    String string = c3068h.d().getString("key_fraud_detection_data", null);
                    if (string == null) {
                        string = "";
                    }
                    JSONObject jSONObject = new JSONObject(string);
                    b8 = L5.s.b(new c3.r(new a(jSONObject)).a(jSONObject));
                } catch (Throwable th) {
                    s.a aVar2 = L5.s.f6511b;
                    b8 = L5.s.b(L5.t.a(th));
                }
                if (L5.s.g(b8)) {
                    return null;
                }
                return b8;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: j2.h$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f32994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f32994a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f32994a.getSharedPreferences("FraudDetectionDataStore", 0);
        }
    }

    public C3068h(Context context, P5.g workContext) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
        this.f32988a = workContext;
        this.f32989b = L5.l.b(new c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences d() {
        return (SharedPreferences) this.f32989b.getValue();
    }

    @Override // j2.InterfaceC3071k
    public Object a(P5.d dVar) {
        return AbstractC2825i.g(this.f32988a, new b(null), dVar);
    }

    @Override // j2.InterfaceC3071k
    public void b(C2582d fraudDetectionData) {
        AbstractC3159y.i(fraudDetectionData, "fraudDetectionData");
        SharedPreferences d8 = d();
        AbstractC3159y.h(d8, "<get-prefs>(...)");
        SharedPreferences.Editor edit = d8.edit();
        edit.putString("key_fraud_detection_data", fraudDetectionData.j().toString());
        edit.apply();
    }
}
