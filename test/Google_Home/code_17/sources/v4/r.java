package V4;

import O5.I;
import O5.t;
import Z4.D;
import a5.C1639f;
import a5.C1641h;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.M;
import o5.C3660F;
import o5.C3674n;
import o5.C3678r;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private Context f11253a;

    /* renamed from: b, reason: collision with root package name */
    private C1641h f11254b;

    /* renamed from: c, reason: collision with root package name */
    private C1639f f11255c;

    /* renamed from: d, reason: collision with root package name */
    private D f11256d;

    /* renamed from: e, reason: collision with root package name */
    private M f11257e;

    /* renamed from: f, reason: collision with root package name */
    private String f11258f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11259a;

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
            int i8 = this.f11259a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                r rVar = r.this;
                this.f11259a = 1;
                if (rVar.l(this) == e8) {
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
    public static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8278a;
        }

        public final void invoke(Throwable th) {
            if (r.this.f11255c == null) {
                if (r.this.f11254b != null) {
                    r rVar = r.this;
                    C1641h c1641h = rVar.f11254b;
                    AbstractC3255y.f(c1641h);
                    String s02 = c1641h.s0();
                    AbstractC3255y.f(s02);
                    C1641h c1641h2 = r.this.f11254b;
                    AbstractC3255y.f(c1641h2);
                    String y02 = c1641h2.y0();
                    AbstractC3255y.f(y02);
                    rVar.j(s02, y02, r.this.f11258f);
                    return;
                }
                return;
            }
            r rVar2 = r.this;
            C1639f c1639f = rVar2.f11255c;
            AbstractC3255y.f(c1639f);
            String z8 = c1639f.z();
            AbstractC3255y.f(z8);
            C1639f c1639f2 = r.this.f11255c;
            AbstractC3255y.f(c1639f2);
            String J8 = c1639f2.J();
            AbstractC3255y.f(J8);
            rVar2.j(z8, J8, r.this.f11258f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f11262a;

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
            if (this.f11262a == 0) {
                t.b(obj);
                if (r.this.f11255c != null) {
                    C1639f c1639f = r.this.f11255c;
                    AbstractC3255y.f(c1639f);
                    if (c1639f.e0() == null) {
                        r rVar = r.this;
                        Context context = rVar.f11253a;
                        C1639f c1639f2 = r.this.f11255c;
                        AbstractC3255y.f(c1639f2);
                        String J8 = c1639f2.J();
                        AbstractC3255y.f(J8);
                        C1639f c1639f3 = r.this.f11255c;
                        AbstractC3255y.f(c1639f3);
                        String x8 = c1639f3.x();
                        AbstractC3255y.f(x8);
                        rVar.f11258f = rVar.i(context, J8, x8);
                        C1639f c1639f4 = r.this.f11255c;
                        AbstractC3255y.f(c1639f4);
                        c1639f4.M0(r.this.f11258f);
                        C3674n a8 = C3674n.f36505t.a(r.this.f11253a);
                        a8.a();
                        C1639f c1639f5 = r.this.f11255c;
                        AbstractC3255y.f(c1639f5);
                        a8.m1(c1639f5);
                        a8.l();
                    } else {
                        r rVar2 = r.this;
                        C1639f c1639f6 = rVar2.f11255c;
                        AbstractC3255y.f(c1639f6);
                        rVar2.f11258f = c1639f6.e0();
                    }
                } else if (r.this.f11254b != null) {
                    C1641h c1641h = r.this.f11254b;
                    AbstractC3255y.f(c1641h);
                    if (c1641h.e1() == null) {
                        r rVar3 = r.this;
                        Context context2 = rVar3.f11253a;
                        C1641h c1641h2 = r.this.f11254b;
                        AbstractC3255y.f(c1641h2);
                        String y02 = c1641h2.y0();
                        AbstractC3255y.f(y02);
                        C1641h c1641h3 = r.this.f11254b;
                        AbstractC3255y.f(c1641h3);
                        String q02 = c1641h3.q0();
                        AbstractC3255y.f(q02);
                        rVar3.f11258f = rVar3.i(context2, y02, q02);
                    } else {
                        r rVar4 = r.this;
                        C1641h c1641h4 = rVar4.f11254b;
                        AbstractC3255y.f(c1641h4);
                        rVar4.f11258f = c1641h4.e1();
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

    public r(Context context, C1641h c1641h, C1639f c1639f, D d8, M scope) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(scope, "scope");
        this.f11253a = context;
        this.f11254b = c1641h;
        this.f11255c = c1639f;
        this.f11256d = d8;
        this.f11257e = scope;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(Context context, String str, String str2) {
        int i8;
        a5.I n02 = new C3660F(context).n0(str, str2);
        if (n02.d() != null) {
            String d8 = n02.d();
            AbstractC3255y.f(d8);
            if (d8.length() > 0) {
                String d9 = n02.d();
                AbstractC3255y.f(d9);
                JSONObject jSONObject = new JSONObject(d9);
                if (!jSONObject.isNull("success")) {
                    i8 = jSONObject.getInt("success");
                } else {
                    i8 = 0;
                }
                if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (!jSONObject2.isNull("app_url")) {
                        return jSONObject2.getString("app_url");
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(String str, String str2, String str3) {
        if (str3 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(524288);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.f11253a.getString(R.string.share_app_details_msg, str));
            intent.putExtra("android.intent.extra.TEXT", str3);
            Context context = this.f11253a;
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.option_button_share)));
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str2);
            new C3678r(this.f11253a).b("share_app", bundle);
            return;
        }
        D d8 = this.f11256d;
        if (d8 != null) {
            d8.a(str);
        }
    }

    private final void k() {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(this.f11257e, null, null, new a(null), 3, null);
        d8.s(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new c(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }
}
