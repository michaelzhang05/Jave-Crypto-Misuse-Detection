package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import H3.f;
import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d;
import com.stripe.android.paymentsheet.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.U;
import l6.M;
import m4.AbstractC3441m;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CvcRecollectionActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f27241a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1355k f27242b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CvcRecollectionContract.a invoke() {
            CvcRecollectionContract.a.C0629a c0629a = CvcRecollectionContract.a.f27261e;
            Intent intent = CvcRecollectionActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            CvcRecollectionContract.a a8 = c0629a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalStateException("Cannot start CVC Recollection flow without args");
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CvcRecollectionActivity f27245a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0625a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f27246a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f27247b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3850g f27248c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0626a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

                    /* renamed from: a, reason: collision with root package name */
                    int f27249a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f27250b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CvcRecollectionActivity f27251c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3850g f27252d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0626a(CvcRecollectionActivity cvcRecollectionActivity, C3850g c3850g, S5.d dVar) {
                        super(2, dVar);
                        this.f27251c = cvcRecollectionActivity;
                        this.f27252d = c3850g;
                    }

                    @Override // a6.InterfaceC1668n
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar, S5.d dVar) {
                        return ((C0626a) create(aVar, dVar)).invokeSuspend(I.f8278a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final S5.d create(Object obj, S5.d dVar) {
                        C0626a c0626a = new C0626a(this.f27251c, this.f27252d, dVar);
                        c0626a.f27250b = obj;
                        return c0626a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = T5.b.e();
                        int i8 = this.f27249a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar = (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a) this.f27250b;
                            CvcRecollectionActivity cvcRecollectionActivity = this.f27251c;
                            a.b bVar = com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a.f27266k0;
                            Intent intent = cvcRecollectionActivity.getIntent();
                            AbstractC3255y.h(intent, "getIntent(...)");
                            cvcRecollectionActivity.setResult(-1, bVar.b(intent, aVar));
                            C3850g c3850g = this.f27252d;
                            this.f27249a = 1;
                            if (c3850g.c(this) == e8) {
                                return e8;
                            }
                        }
                        this.f27251c.finish();
                        return I.f8278a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0625a(CvcRecollectionActivity cvcRecollectionActivity, C3850g c3850g, S5.d dVar) {
                    super(2, dVar);
                    this.f27247b = cvcRecollectionActivity;
                    this.f27248c = c3850g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final S5.d create(Object obj, S5.d dVar) {
                    return new C0625a(this.f27247b, this.f27248c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = T5.b.e();
                    int i8 = this.f27246a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        InterfaceC3687A b8 = this.f27247b.q().b();
                        C0626a c0626a = new C0626a(this.f27247b, this.f27248c, null);
                        this.f27246a = 1;
                        if (AbstractC3708h.j(b8, c0626a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8278a;
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(M m8, S5.d dVar) {
                    return ((C0625a) create(m8, dVar)).invokeSuspend(I.f8278a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0627b extends AbstractC3256z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f27253a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0627b(CvcRecollectionActivity cvcRecollectionActivity) {
                    super(0);
                    this.f27253a = cvcRecollectionActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5533invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5533invoke() {
                    this.f27253a.q().d(c.a.f27309a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f27254a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f27255b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0628a extends C3252v implements Function1 {
                    C0628a(Object obj) {
                        super(1, obj, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)V", 0);
                    }

                    public final void d(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c p02) {
                        AbstractC3255y.i(p02, "p0");
                        ((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d) this.receiver).d(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        d((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c) obj);
                        return I.f8278a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(State state, CvcRecollectionActivity cvcRecollectionActivity) {
                    super(2);
                    this.f27254a = state;
                    this.f27255b = cvcRecollectionActivity;
                }

                @Override // a6.InterfaceC1668n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f8278a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-943727818, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:55)");
                    }
                    com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.e(((f) this.f27254a.getValue()).d(), ((f) this.f27254a.getValue()).e(), ((f) this.f27254a.getValue()).c(), new C0628a(this.f27255b.q()), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CvcRecollectionActivity cvcRecollectionActivity) {
                super(2);
                this.f27245a = cvcRecollectionActivity;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8278a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1441971965, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:35)");
                }
                C3850g b8 = AbstractC3851h.b(null, null, composer, 0, 3);
                State a8 = y4.f.a(this.f27245a.q().c(), composer, 8);
                C0625a c0625a = new C0625a(this.f27245a, b8, null);
                int i9 = C3850g.f38287e;
                EffectsKt.LaunchedEffect(b8, c0625a, composer, i9 | 64);
                AbstractC4026a.a(b8, null, new C0627b(this.f27245a), ComposableLambdaKt.composableLambda(composer, -943727818, true, new c(a8, this.f27245a)), composer, i9 | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1759306475, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous> (CvcRecollectionActivity.kt:34)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1441971965, true, new a(CvcRecollectionActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f27256a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f27256a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f27257a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f27258b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f27257a = function0;
            this.f27258b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27257a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f27258b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3256z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new d.a(CvcRecollectionActivity.this.p());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CvcRecollectionContract.a p() {
        return (CvcRecollectionContract.a) this.f27241a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d q() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d) this.f27242b.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        y4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.a(p().a());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1759306475, true, new b()), 1, null);
    }
}
