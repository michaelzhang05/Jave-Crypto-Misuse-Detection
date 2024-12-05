package J3;

import I3.m;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: J3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1199g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1199g f5179a = new C1199g();

    /* renamed from: b, reason: collision with root package name */
    public static X5.p f5180b = ComposableLambdaKt.composableLambdaInstance(2125430138, false, a.f5181a);

    /* renamed from: J3.g$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5181a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0100a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f5182a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ I3.m f5183b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0100a(I3.m mVar, P5.d dVar) {
                super(2, dVar);
                this.f5183b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0100a(this.f5183b, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((C0100a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f5182a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    this.f5182a = 1;
                    if (i6.X.b(1500L, this) == e8) {
                        return e8;
                    }
                }
                ((m.a) this.f5183b).a().invoke();
                return L5.I.f6487a;
            }
        }

        a() {
            super(4);
        }

        public final void a(AnimatedContentScope AnimatedContent, I3.m mVar, Composer composer, int i8) {
            boolean z8;
            AbstractC3159y.i(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125430138, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetScreenKt.lambda-1.<anonymous> (PaymentSheetScreen.kt:216)");
            }
            if (mVar instanceof m.c) {
                composer.startReplaceableGroup(1402856489);
                b4.d.a(SizeKt.m639requiredSize3ABfNKs(Modifier.Companion, Dp.m5178constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getOnSurface0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(q3.s.f37389d, composer, 0), 0L, 0, composer, 6, 24);
                composer.endReplaceableGroup();
            } else if (mVar instanceof m.a) {
                composer.startReplaceableGroup(1403175727);
                EffectsKt.LaunchedEffect(mVar, new C0100a(mVar, null), composer, ((i8 >> 3) & 14) | 64);
                IconKt.m1266Iconww6aTOc(PainterResources_androidKt.painterResource(q3.t.f37412s, composer, 0), (String) null, SizeKt.m639requiredSize3ABfNKs(Modifier.Companion, Dp.m5178constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getOnSurface0d7_KjU(), composer, 440, 0);
                composer.endReplaceableGroup();
            } else {
                if (mVar == null) {
                    z8 = true;
                } else {
                    z8 = mVar instanceof m.b;
                }
                if (z8) {
                    composer.startReplaceableGroup(2123491671);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1403746127);
                    composer.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((AnimatedContentScope) obj, (I3.m) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return L5.I.f6487a;
        }
    }

    public final X5.p a() {
        return f5180b;
    }
}
