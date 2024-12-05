package com.stripe.android.paymentsheet.ui;

import M3.X;
import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import com.stripe.android.paymentsheet.ui.SepaMandateContract;
import com.stripe.android.paymentsheet.ui.e;
import h6.InterfaceC2965e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import m4.AbstractC3441m;
import q4.AbstractC3851h;
import q4.C3850g;
import t2.AbstractC4026a;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SepaMandateActivity extends AppCompatActivity {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f27602b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0650a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SepaMandateActivity f27603a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f27604b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0651a extends C3252v implements Function0 {
                C0651a(Object obj) {
                    super(0, obj, SepaMandateActivity.class, "finish", "finish()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5544invoke();
                    return I.f8278a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5544invoke() {
                    ((SepaMandateActivity) this.receiver).finish();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3256z implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f27605a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SepaMandateActivity f27606b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0652a extends AbstractC3256z implements Function0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f27607a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0652a(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f27607a = sepaMandateActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m5545invoke();
                        return I.f8278a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m5545invoke() {
                        Intent putExtra = new Intent().putExtra("extra_activity_result", e.a.f27763a);
                        AbstractC3255y.h(putExtra, "putExtra(...)");
                        this.f27607a.setResult(-1, putExtra);
                        this.f27607a.finish();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0653b extends AbstractC3256z implements Function0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f27608a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0653b(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f27608a = sepaMandateActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m5546invoke();
                        return I.f8278a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m5546invoke() {
                        this.f27608a.finish();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, SepaMandateActivity sepaMandateActivity) {
                    super(2);
                    this.f27605a = str;
                    this.f27606b = sepaMandateActivity;
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
                        ComposerKt.traceEventStart(-380837143, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SepaMandateActivity.kt:58)");
                    }
                    String str = this.f27605a;
                    composer.startReplaceableGroup(-3848641);
                    boolean changed = composer.changed(this.f27606b);
                    SepaMandateActivity sepaMandateActivity = this.f27606b;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new C0652a(sepaMandateActivity);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-3836662);
                    boolean changed2 = composer.changed(this.f27606b);
                    SepaMandateActivity sepaMandateActivity2 = this.f27606b;
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new C0653b(sepaMandateActivity2);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    X.a(str, function0, (Function0) rememberedValue2, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0650a(SepaMandateActivity sepaMandateActivity, String str) {
                super(2);
                this.f27603a = sepaMandateActivity;
                this.f27604b = str;
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
                    ComposerKt.traceEventStart(-620021374, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous> (SepaMandateActivity.kt:52)");
                }
                C3850g b8 = AbstractC3851h.b(null, null, composer, 0, 3);
                SepaMandateActivity sepaMandateActivity = this.f27603a;
                composer.startReplaceableGroup(-934017577);
                boolean changed = composer.changed(sepaMandateActivity);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0651a(sepaMandateActivity);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                AbstractC4026a.a(b8, null, (Function0) ((InterfaceC2965e) rememberedValue), ComposableLambdaKt.composableLambda(composer, -380837143, true, new b(this.f27604b, this.f27603a)), composer, C3850g.f38287e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f27602b = str;
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
                ComposerKt.traceEventStart(2089289300, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous> (SepaMandateActivity.kt:51)");
            }
            AbstractC3441m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -620021374, true, new C0650a(SepaMandateActivity.this, this.f27602b)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b8;
        String str;
        SepaMandateContract.a a8;
        super.onCreate(bundle);
        try {
            s.a aVar = s.f8302b;
            SepaMandateContract.a.C0654a c0654a = SepaMandateContract.a.f27610b;
            Intent intent = getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            a8 = c0654a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        if (a8 != null) {
            b8 = s.b(a8);
            if (s.g(b8)) {
                b8 = null;
            }
            SepaMandateContract.a aVar3 = (SepaMandateContract.a) b8;
            if (aVar3 != null) {
                str = aVar3.a();
            } else {
                str = null;
            }
            if (str == null) {
                finish();
                return;
            } else {
                WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2089289300, true, new a(str)), 1, null);
                return;
            }
        }
        throw new IllegalArgumentException("SepaMandateActivity was started without arguments.".toString());
    }
}
