package com.stripe.android.paymentsheet.ui;

import J3.X;
import L5.I;
import L5.s;
import L5.t;
import X5.n;
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
import e6.InterfaceC2645e;
import j4.AbstractC3087m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import n4.AbstractC3472h;
import n4.C3471g;
import q2.AbstractC3647a;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class SepaMandateActivity extends AppCompatActivity {

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26547b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0654a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SepaMandateActivity f26548a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f26549b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0655a extends C3156v implements Function0 {
                C0655a(Object obj) {
                    super(0, obj, SepaMandateActivity.class, "finish", "finish()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5540invoke();
                    return I.f6487a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5540invoke() {
                    ((SepaMandateActivity) this.receiver).finish();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC3160z implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f26550a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SepaMandateActivity f26551b;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0656a extends AbstractC3160z implements Function0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f26552a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0656a(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f26552a = sepaMandateActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m5541invoke();
                        return I.f6487a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m5541invoke() {
                        Intent putExtra = new Intent().putExtra("extra_activity_result", e.a.f26708a);
                        AbstractC3159y.h(putExtra, "putExtra(...)");
                        this.f26552a.setResult(-1, putExtra);
                        this.f26552a.finish();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$a$a$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0657b extends AbstractC3160z implements Function0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SepaMandateActivity f26553a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0657b(SepaMandateActivity sepaMandateActivity) {
                        super(0);
                        this.f26553a = sepaMandateActivity;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m5542invoke();
                        return I.f6487a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m5542invoke() {
                        this.f26553a.finish();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(String str, SepaMandateActivity sepaMandateActivity) {
                    super(2);
                    this.f26550a = str;
                    this.f26551b = sepaMandateActivity;
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
                        ComposerKt.traceEventStart(-380837143, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SepaMandateActivity.kt:58)");
                    }
                    String str = this.f26550a;
                    composer.startReplaceableGroup(-3848641);
                    boolean changed = composer.changed(this.f26551b);
                    SepaMandateActivity sepaMandateActivity = this.f26551b;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new C0656a(sepaMandateActivity);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-3836662);
                    boolean changed2 = composer.changed(this.f26551b);
                    SepaMandateActivity sepaMandateActivity2 = this.f26551b;
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new C0657b(sepaMandateActivity2);
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
            C0654a(SepaMandateActivity sepaMandateActivity, String str) {
                super(2);
                this.f26548a = sepaMandateActivity;
                this.f26549b = str;
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
                    ComposerKt.traceEventStart(-620021374, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous> (SepaMandateActivity.kt:52)");
                }
                C3471g b8 = AbstractC3472h.b(null, null, composer, 0, 3);
                SepaMandateActivity sepaMandateActivity = this.f26548a;
                composer.startReplaceableGroup(-934017577);
                boolean changed = composer.changed(sepaMandateActivity);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new C0655a(sepaMandateActivity);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                AbstractC3647a.a(b8, null, (Function0) ((InterfaceC2645e) rememberedValue), ComposableLambdaKt.composableLambda(composer, -380837143, true, new b(this.f26549b, this.f26548a)), composer, C3471g.f36159e | 3072, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(2);
            this.f26547b = str;
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
                ComposerKt.traceEventStart(2089289300, i8, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous> (SepaMandateActivity.kt:51)");
            }
            AbstractC3087m.a(null, null, null, ComposableLambdaKt.composableLambda(composer, -620021374, true, new C0654a(SepaMandateActivity.this, this.f26547b)), composer, 3072, 7);
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
            s.a aVar = s.f6511b;
            SepaMandateContract.a.C0658a c0658a = SepaMandateContract.a.f26555b;
            Intent intent = getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            a8 = c0658a.a(intent);
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        if (a8 != null) {
            b8 = s.b(a8);
            if (s.g(b8)) {
                b8 = null;
            }
            SepaMandateContract.a aVar3 = (SepaMandateContract.a) b8;
            if (aVar3 != null) {
                str = aVar3.b();
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
