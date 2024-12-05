package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1351g;
import O5.InterfaceC1355k;
import W4.r0;
import a5.C1646m;
import a5.Q;
import a6.InterfaceC1668n;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.x;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.F;
import com.uptodown.activities.UptodownTurboActivity;
import com.uptodown.workers.GetUserDataWorker;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.InterfaceC3249s;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import m2.r;
import o5.AbstractC3686z;
import o5.C3671k;
import o5.C3678r;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class UptodownTurboActivity extends AbstractActivityC2683a {

    /* renamed from: R, reason: collision with root package name */
    public static final a f30011R = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f30012N = O5.l.b(new b());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f30013O = new ViewModelLazy(U.b(F.class), new n(this), new m(this), new o(null, this));

    /* renamed from: P, reason: collision with root package name */
    private com.stripe.android.paymentsheet.u f30014P;

    /* renamed from: Q, reason: collision with root package name */
    private final ActivityResultLauncher f30015Q;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            return r0.c(UptodownTurboActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    /* synthetic */ class c implements t3.p, InterfaceC3249s {
        c() {
        }

        @Override // t3.p
        public final void a(com.stripe.android.paymentsheet.x p02) {
            AbstractC3255y.i(p02, "p0");
            UptodownTurboActivity.this.D3(p02);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof t3.p) && (obj instanceof InterfaceC3249s)) {
                return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return new C3252v(1, UptodownTurboActivity.this, UptodownTurboActivity.class, "onPaymentSheetResult", "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30018a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f30020a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f30020a = uptodownTurboActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3686z abstractC3686z, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3686z, AbstractC3686z.b.f36552a)) {
                    if (abstractC3686z instanceof AbstractC3686z.d) {
                        AbstractC3686z.d dVar2 = (AbstractC3686z.d) abstractC3686z;
                        r.a.c(m2.r.f35037c, this.f30020a, ((F.d) dVar2.a()).c(), null, 4, null);
                        this.f30020a.A3(((F.d) dVar2.a()).b(), ((F.d) dVar2.a()).a());
                    } else if (!AbstractC3255y.d(abstractC3686z, AbstractC3686z.c.f36553a) && AbstractC3255y.d(abstractC3686z, AbstractC3686z.a.f36551a)) {
                        UptodownTurboActivity uptodownTurboActivity = this.f30020a;
                        String string = uptodownTurboActivity.getString(R.string.error_turbo);
                        AbstractC3255y.h(string, "getString(R.string.error_turbo)");
                        uptodownTurboActivity.d2(string);
                    }
                }
                return O5.I.f8278a;
            }
        }

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30018a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L i9 = UptodownTurboActivity.this.p3().i();
                a aVar = new a(UptodownTurboActivity.this);
                this.f30018a = 1;
                if (i9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30021a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f30023a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f30023a = uptodownTurboActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void h(Q q8, UptodownTurboActivity this$0, AbstractC3686z resultTurbo, View view) {
                AbstractC3255y.i(this$0, "this$0");
                AbstractC3255y.i(resultTurbo, "$resultTurbo");
                if (q8 == null) {
                    this$0.E3();
                    return;
                }
                this$0.o3().f12480A.setVisibility(0);
                F p32 = this$0.p3();
                String a8 = ((F.c) ((AbstractC3686z.d) resultTurbo).a()).b().a();
                String id = q8.getId();
                AbstractC3255y.f(id);
                p32.d(this$0, a8, id, "year");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(Q q8, UptodownTurboActivity this$0, AbstractC3686z resultTurbo, View view) {
                AbstractC3255y.i(this$0, "this$0");
                AbstractC3255y.i(resultTurbo, "$resultTurbo");
                if (q8 == null) {
                    this$0.E3();
                    return;
                }
                this$0.o3().f12480A.setVisibility(0);
                F p32 = this$0.p3();
                String a8 = ((F.c) ((AbstractC3686z.d) resultTurbo).a()).a().a();
                String id = q8.getId();
                AbstractC3255y.f(id);
                p32.d(this$0, a8, id, "month");
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object emit(final AbstractC3686z abstractC3686z, S5.d dVar) {
                if (AbstractC3255y.d(abstractC3686z, AbstractC3686z.b.f36552a)) {
                    this.f30023a.o3().f12534z.setVisibility(0);
                    this.f30023a.o3().f12533y.setVisibility(0);
                } else if (abstractC3686z instanceof AbstractC3686z.d) {
                    final Q e8 = Q.f14058k.e(this.f30023a);
                    this.f30023a.o3().f12534z.setVisibility(8);
                    this.f30023a.o3().f12533y.setVisibility(8);
                    AbstractC3686z.d dVar2 = (AbstractC3686z.d) abstractC3686z;
                    this.f30023a.o3().f12511c0.setText(((F.c) dVar2.a()).b().b());
                    this.f30023a.o3().f12503X.setText(((F.c) dVar2.a()).a().b());
                    RelativeLayout relativeLayout = this.f30023a.o3().f12482C;
                    final UptodownTurboActivity uptodownTurboActivity = this.f30023a;
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.D
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownTurboActivity.e.a.h(Q.this, uptodownTurboActivity, abstractC3686z, view);
                        }
                    });
                    RelativeLayout relativeLayout2 = this.f30023a.o3().f12481B;
                    final UptodownTurboActivity uptodownTurboActivity2 = this.f30023a;
                    relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.E
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownTurboActivity.e.a.i(Q.this, uptodownTurboActivity2, abstractC3686z, view);
                        }
                    });
                } else if (!AbstractC3255y.d(abstractC3686z, AbstractC3686z.c.f36553a) && AbstractC3255y.d(abstractC3686z, AbstractC3686z.a.f36551a)) {
                    UptodownTurboActivity uptodownTurboActivity3 = this.f30023a;
                    String string = uptodownTurboActivity3.getString(R.string.error_turbo);
                    AbstractC3255y.h(string, "getString(R.string.error_turbo)");
                    uptodownTurboActivity3.d2(string);
                }
                return O5.I.f8278a;
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30021a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = UptodownTurboActivity.this.p3().e();
                a aVar = new a(UptodownTurboActivity.this);
                this.f30021a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30024a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownTurboActivity f30026a;

            a(UptodownTurboActivity uptodownTurboActivity) {
                this.f30026a = uptodownTurboActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3686z abstractC3686z, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3686z, AbstractC3686z.b.f36552a)) {
                    if (abstractC3686z instanceof AbstractC3686z.d) {
                        new C3671k().q(this.f30026a, (String) ((AbstractC3686z.d) abstractC3686z).a(), this.f30026a.getString(R.string.uptodown_turbo));
                    } else if (!AbstractC3255y.d(abstractC3686z, AbstractC3686z.c.f36553a) && AbstractC3255y.d(abstractC3686z, AbstractC3686z.a.f36551a)) {
                        UptodownTurboActivity uptodownTurboActivity = this.f30026a;
                        String string = uptodownTurboActivity.getString(R.string.error_turbo);
                        AbstractC3255y.h(string, "getString(R.string.error_turbo)");
                        uptodownTurboActivity.d2(string);
                    }
                }
                return O5.I.f8278a;
            }
        }

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30024a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L g8 = UptodownTurboActivity.this.p3().g();
                a aVar = new a(UptodownTurboActivity.this);
                this.f30024a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30027a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f30029c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(h hVar, S5.d dVar) {
            super(2, dVar);
            this.f30029c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f30029c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30027a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                GetUserDataWorker.a aVar = GetUserDataWorker.f31066b;
                UptodownTurboActivity uptodownTurboActivity = UptodownTurboActivity.this;
                h hVar = this.f30029c;
                this.f30027a = 1;
                if (aVar.b(uptodownTurboActivity, hVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Z4.I {
        h() {
        }

        @Override // Z4.I
        public void a() {
            UptodownTurboActivity.this.setResult(100);
            UptodownTurboActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends ClickableSpan {
        i() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
            String string = UptodownTurboActivity.this.getString(R.string.url_support);
            AbstractC3255y.h(string, "getString(R.string.url_support)");
            String string2 = UptodownTurboActivity.this.getString(R.string.support_title);
            AbstractC3255y.h(string2, "getString(R.string.support_title)");
            new C3671k().q(UptodownTurboActivity.this, string, string2);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(UptodownTurboActivity.this, R.color.blue_primary));
            ds.setTypeface(H4.j.f3824g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f30032a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends ClickableSpan {
        k() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            AbstractC3255y.i(widget, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            AbstractC3255y.i(ds, "ds");
            super.updateDrawState(ds);
            ds.setColor(ContextCompat.getColor(UptodownTurboActivity.this, R.color.turbo_main));
            ds.setTypeface(H4.j.f3824g.t());
            ds.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f30034a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return (CharSequence) it.a().get(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30035a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f30035a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30035a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30036a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentActivity componentActivity) {
            super(0);
            this.f30036a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30036a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30037a = function0;
            this.f30038b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30037a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30038b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public UptodownTurboActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.N3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                UptodownTurboActivity.C3(UptodownTurboActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f30015Q = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A3(String str, String str2) {
        com.stripe.android.paymentsheet.u uVar = this.f30014P;
        if (uVar == null) {
            AbstractC3255y.y("paymentSheet");
            uVar = null;
        }
        String string = getString(R.string.app_name);
        AbstractC3255y.h(string, "getString(R.string.app_name)");
        uVar.a(str, new u.g(string, null, null, null, null, null, true, false, null, str2, null, null, 3518, null));
        B3("shown");
    }

    private final void B3(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        new C3678r(this).b("turbo_stripe_form", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(UptodownTurboActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q e8 = Q.f14058k.e(this$0);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.x(this$0)) {
                UptodownApp.a aVar = UptodownApp.f29058B;
                aVar.j0(this$0);
                aVar.i0(this$0);
                this$0.H3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(com.stripe.android.paymentsheet.x xVar) {
        if (xVar instanceof x.a) {
            o3().f12480A.setVisibility(8);
            B3("cancelled");
        } else if (xVar instanceof x.c) {
            o3().f12480A.setVisibility(8);
            B3("failed");
        } else if (xVar instanceof x.b) {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.b(), null, new g(new h(), null), 2, null);
            B3("success");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E3() {
        this.f30015Q.launch(new Intent(this, (Class<?>) LoginActivity.class), UptodownApp.f29058B.b(this));
    }

    private final void F3(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String obj = textView.getText().toString();
        List<C1646m> a8 = C1646m.f14265f.a(obj, "\\[xx](.*?)\\[/xx]");
        SpannableString spannableString = new SpannableString(new j6.j("\\[xx](.*?)\\[/xx]").g(obj, j.f30032a));
        for (C1646m c1646m : a8) {
            int S8 = j6.n.S(spannableString, c1646m.d(), 0, false, 6, null);
            int length = c1646m.d().length() + S8;
            if (S8 >= 0) {
                spannableString.setSpan(new i(), S8, length, 33);
            }
        }
        textView.setText(spannableString);
    }

    private final void G3(TextView textView) {
        String obj = textView.getText().toString();
        List<C1646m> a8 = C1646m.f14265f.a(obj, "\\[xx](.*?)\\[/xx]");
        SpannableString spannableString = new SpannableString(new j6.j("\\[xx](.*?)\\[/xx]").g(obj, l.f30034a));
        for (C1646m c1646m : a8) {
            int S8 = j6.n.S(spannableString, c1646m.d(), 0, false, 6, null);
            int length = c1646m.d().length() + S8;
            if (S8 >= 0) {
                spannableString.setSpan(new k(), S8, length, 33);
            }
        }
        textView.setText(spannableString);
    }

    private final void H3() {
        Q e8 = Q.f14058k.e(this);
        r0 o32 = o3();
        if (e8 != null && e8.y()) {
            o32.f12502W.setVisibility(0);
            o32.f12481B.setVisibility(8);
            o32.f12483D.setVisibility(8);
            o32.f12507a0.setVisibility(8);
            return;
        }
        o32.f12502W.setVisibility(8);
        o32.f12481B.setVisibility(0);
        o32.f12483D.setVisibility(0);
        o32.f12507a0.setVisibility(0);
        p3().f(this);
    }

    private final void n3(ImageView imageView, long j8) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationY", -20.0f, 40.0f);
        ofFloat.setDuration(j8);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0 o3() {
        return (r0) this.f30012N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final F p3() {
        return (F) this.f30013O.getValue();
    }

    private final void q3() {
        final r0 o32 = o3();
        o32.f12510c.setOnClickListener(new View.OnClickListener() { // from class: D4.O3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.r3(UptodownTurboActivity.this, view);
            }
        });
        o32.f12508b.b(o3().getRoot(), new A5.e(this)).b(getWindow().getDecorView().getBackground()).d(20.0f);
        TextView textView = o32.f12485F;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        TextView tvDescTurbo = o32.f12485F;
        AbstractC3255y.h(tvDescTurbo, "tvDescTurbo");
        G3(tvDescTurbo);
        o32.f12509b0.setTypeface(aVar.t());
        o32.f12511c0.setTypeface(aVar.t());
        o32.f12503X.setTypeface(aVar.t());
        o32.f12502W.setTypeface(aVar.t());
        o32.f12507a0.setTypeface(aVar.u());
        o32.f12504Y.setTypeface(aVar.t());
        o32.f12505Z.setTypeface(aVar.t());
        o32.f12486G.setTypeface(aVar.t());
        o32.f12501V.setTypeface(aVar.t());
        o32.f12499T.setTypeface(aVar.t());
        o32.f12493N.setTypeface(aVar.t());
        o32.f12487H.setTypeface(aVar.u());
        o32.f12494O.setTypeface(aVar.t());
        o32.f12488I.setTypeface(aVar.u());
        o32.f12495P.setTypeface(aVar.t());
        o32.f12489J.setTypeface(aVar.u());
        o32.f12496Q.setTypeface(aVar.t());
        o32.f12490K.setTypeface(aVar.u());
        o32.f12497R.setTypeface(aVar.t());
        o32.f12491L.setTypeface(aVar.u());
        o32.f12498S.setTypeface(aVar.t());
        o32.f12492M.setTypeface(aVar.u());
        o32.f12480A.setOnClickListener(new View.OnClickListener() { // from class: D4.P3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.s3(view);
            }
        });
        o32.f12525q.setOnClickListener(new View.OnClickListener() { // from class: D4.Q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.t3(W4.r0.this, view);
            }
        });
        o32.f12526r.setOnClickListener(new View.OnClickListener() { // from class: D4.R3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.u3(W4.r0.this, view);
            }
        });
        o32.f12527s.setOnClickListener(new View.OnClickListener() { // from class: D4.S3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.v3(W4.r0.this, view);
            }
        });
        o32.f12528t.setOnClickListener(new View.OnClickListener() { // from class: D4.T3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.w3(W4.r0.this, view);
            }
        });
        o32.f12529u.setOnClickListener(new View.OnClickListener() { // from class: D4.U3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.x3(W4.r0.this, view);
            }
        });
        o32.f12530v.setOnClickListener(new View.OnClickListener() { // from class: D4.V3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.y3(W4.r0.this, view);
            }
        });
        o32.f12502W.setOnClickListener(new View.OnClickListener() { // from class: D4.W3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UptodownTurboActivity.z3(UptodownTurboActivity.this, view);
            }
        });
        o32.f12500U.setTypeface(aVar.u());
        TextView tvFooterTurbo = o32.f12500U;
        AbstractC3255y.h(tvFooterTurbo, "tvFooterTurbo");
        F3(tvFooterTurbo);
        ImageView ivDiamond1Turbo = o32.f12513e;
        AbstractC3255y.h(ivDiamond1Turbo, "ivDiamond1Turbo");
        n3(ivDiamond1Turbo, 3000L);
        ImageView ivDiamond2Turbo = o32.f12514f;
        AbstractC3255y.h(ivDiamond2Turbo, "ivDiamond2Turbo");
        n3(ivDiamond2Turbo, 5000L);
        ImageView ivDiamond3Turbo = o32.f12515g;
        AbstractC3255y.h(ivDiamond3Turbo, "ivDiamond3Turbo");
        n3(ivDiamond3Turbo, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        H3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UptodownTurboActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(r0 this_with, View view) {
        AbstractC3255y.i(this_with, "$this_with");
        if (this_with.f12487H.getVisibility() == 0) {
            this_with.f12487H.setVisibility(8);
        } else {
            this_with.f12487H.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(r0 this_with, View view) {
        AbstractC3255y.i(this_with, "$this_with");
        if (this_with.f12488I.getVisibility() == 0) {
            this_with.f12488I.setVisibility(8);
        } else {
            this_with.f12488I.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(r0 this_with, View view) {
        AbstractC3255y.i(this_with, "$this_with");
        if (this_with.f12489J.getVisibility() == 0) {
            this_with.f12489J.setVisibility(8);
        } else {
            this_with.f12489J.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(r0 this_with, View view) {
        AbstractC3255y.i(this_with, "$this_with");
        if (this_with.f12490K.getVisibility() == 0) {
            this_with.f12490K.setVisibility(8);
        } else {
            this_with.f12490K.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(r0 this_with, View view) {
        AbstractC3255y.i(this_with, "$this_with");
        if (this_with.f12491L.getVisibility() == 0) {
            this_with.f12491L.setVisibility(8);
        } else {
            this_with.f12491L.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(r0 this_with, View view) {
        AbstractC3255y.i(this_with, "$this_with");
        if (this_with.f12492M.getVisibility() == 0) {
            this_with.f12492M.setVisibility(8);
        } else {
            this_with.f12492M.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(UptodownTurboActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.p3().h(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o3().getRoot());
        q3();
        Bundle bundle2 = new Bundle();
        bundle2.putString("type", "shown");
        new C3678r(this).b("turbo_landing", bundle2);
        this.f30014P = new com.stripe.android.paymentsheet.u(this, new c());
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new d(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(null), 2, null);
    }
}
