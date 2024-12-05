package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import E3.f;
import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.t;
import X5.n;
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
import i6.M;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.U;
import l6.AbstractC3360h;
import l6.z;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CvcRecollectionActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f26186a = l.b(new a());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1227k f26187b = new ViewModelLazy(U.b(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.class), new c(this), new e(), new d(null, this));

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CvcRecollectionContract.a invoke() {
            CvcRecollectionContract.a.C0633a c0633a = CvcRecollectionContract.a.f26206e;
            Intent intent = CvcRecollectionActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            CvcRecollectionContract.a a8 = c0633a.a(intent);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalStateException("Cannot start CVC Recollection flow without args");
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CvcRecollectionActivity f26190a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0629a extends kotlin.coroutines.jvm.internal.l implements n {

                /* renamed from: a, reason: collision with root package name */
                int f26191a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f26192b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3471g f26193c;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0630a extends kotlin.coroutines.jvm.internal.l implements n {

                    /* renamed from: a, reason: collision with root package name */
                    int f26194a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f26195b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ CvcRecollectionActivity f26196c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ C3471g f26197d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0630a(CvcRecollectionActivity cvcRecollectionActivity, C3471g c3471g, P5.d dVar) {
                        super(2, dVar);
                        this.f26196c = cvcRecollectionActivity;
                        this.f26197d = c3471g;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final P5.d create(Object obj, P5.d dVar) {
                        C0630a c0630a = new C0630a(this.f26196c, this.f26197d, dVar);
                        c0630a.f26195b = obj;
                        return c0630a;
                    }

                    @Override // X5.n
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar, P5.d dVar) {
                        return ((C0630a) create(aVar, dVar)).invokeSuspend(I.f6487a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object e8 = Q5.b.e();
                        int i8 = this.f26194a;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a aVar = (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a) this.f26195b;
                            CvcRecollectionActivity cvcRecollectionActivity = this.f26196c;
                            a.b bVar = com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a.f26211l0;
                            Intent intent = cvcRecollectionActivity.getIntent();
                            AbstractC3159y.h(intent, "getIntent(...)");
                            cvcRecollectionActivity.setResult(-1, bVar.b(intent, aVar));
                            C3471g c3471g = this.f26197d;
                            this.f26194a = 1;
                            if (c3471g.c(this) == e8) {
                                return e8;
                            }
                        }
                        this.f26196c.finish();
                        return I.f6487a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0629a(CvcRecollectionActivity cvcRecollectionActivity, C3471g c3471g, P5.d dVar) {
                    super(2, dVar);
                    this.f26192b = cvcRecollectionActivity;
                    this.f26193c = c3471g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final P5.d create(Object obj, P5.d dVar) {
                    return new C0629a(this.f26192b, this.f26193c, dVar);
                }

                @Override // X5.n
                public final Object invoke(M m8, P5.d dVar) {
                    return ((C0629a) create(m8, dVar)).invokeSuspend(I.f6487a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = Q5.b.e();
                    int i8 = this.f26191a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        z b8 = this.f26192b.q().b();
                        C0630a c0630a = new C0630a(this.f26192b, this.f26193c, null);
                        this.f26191a = 1;
                        if (AbstractC3360h.h(b8, c0630a, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f6487a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0631b extends AbstractC3160z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f26198a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0631b(CvcRecollectionActivity cvcRecollectionActivity) {
                    super(0);
                    this.f26198a = cvcRecollectionActivity;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5529invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5529invoke() {
                    this.f26198a.q().d(c.a.f26254a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC3160z implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ State f26199a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ CvcRecollectionActivity f26200b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public /* synthetic */ class C0632a extends C3156v implements Function1 {
                    C0632a(Object obj) {
                        super(1, obj, com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewAction;)V", 0);
                    }

                    public final void d(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c p02) {
                        AbstractC3159y.i(p02, "p0");
                        ((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d) this.receiver).d(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        d((com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c) obj);
                        return I.f6487a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(State state, CvcRecollectionActivity cvcRecollectionActivity) {
                    super(2);
                    this.f26199a = state;
                    this.f26200b = cvcRecollectionActivity;
                }

                @Override // X5.n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f6487a;
                }

                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-943727818, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:55)");
                    }
                    com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.e(((f) this.f26199a.getValue()).d(), ((f) this.f26199a.getValue()).e(), ((f) this.f26199a.getValue()).c(), new C0632a(this.f26200b.q()), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CvcRecollectionActivity cvcRecollectionActivity) {
                super(2);
                this.f26190a = cvcRecollectionActivity;
            }

            @Override // X5.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f6487a;
            }

            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1441971965, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous>.<anonymous> (CvcRecollectionActivity.kt:35)");
                }
                C3471g b8 = AbstractC3472h.b(null, null, composer, 0, 3);
                State a8 = v4.f.a(this.f26190a.q().c(), composer, 8);
                C0629a c0629a = new C0629a(this.f26190a, b8, null);
                int i9 = C3471g.f36159e;
                EffectsKt.LaunchedEffect(b8, c0629a, composer, i9 | 64);
                AbstractC3647a.a(b8, null, new C0631b(this.f26190a), ComposableLambdaKt.composableLambda(composer, -943727818, true, new c(a8, this.f26190a)), composer, i9 | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        b() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1759306475, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity.onCreate.<anonymous> (CvcRecollectionActivity.kt:34)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, 1441971965, true, new a(CvcRecollectionActivity.this)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26201a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f26201a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26201a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26203b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26202a = function0;
            this.f26203b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26202a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26203b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3160z implements Function0 {
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
        return (CvcRecollectionContract.a) this.f26186a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d q() {
        return (com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d) this.f26187b.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        v4.c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.a(p().b());
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1759306475, true, new b()), 1, null);
    }
}
