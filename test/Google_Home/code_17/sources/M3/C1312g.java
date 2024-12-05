package M3;

import L3.m;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: M3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1312g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1312g f6885a = new C1312g();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1670p f6886b = ComposableLambdaKt.composableLambdaInstance(2125430138, false, a.f6887a);

    /* renamed from: M3.g$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1670p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6887a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0125a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6888a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L3.m f6889b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125a(L3.m mVar, S5.d dVar) {
                super(2, dVar);
                this.f6889b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0125a(this.f6889b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f6888a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    this.f6888a = 1;
                    if (l6.X.b(1500L, this) == e8) {
                        return e8;
                    }
                }
                ((m.a) this.f6889b).a().invoke();
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((C0125a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        a() {
            super(4);
        }

        public final void a(AnimatedContentScope AnimatedContent, L3.m mVar, Composer composer, int i8) {
            boolean z8;
            AbstractC3255y.i(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125430138, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$PaymentSheetScreenKt.lambda-1.<anonymous> (PaymentSheetScreen.kt:216)");
            }
            if (mVar instanceof m.c) {
                composer.startReplaceableGroup(1402856489);
                e4.d.a(SizeKt.m644requiredSize3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1182getOnSurface0d7_KjU(), PrimitiveResources_androidKt.dimensionResource(t3.s.f39711d, composer, 0), 0L, 0, composer, 6, 24);
                composer.endReplaceableGroup();
            } else if (mVar instanceof m.a) {
                composer.startReplaceableGroup(1403175727);
                EffectsKt.LaunchedEffect(mVar, new C0125a(mVar, null), composer, ((i8 >> 3) & 14) | 64);
                IconKt.m1271Iconww6aTOc(PainterResources_androidKt.painterResource(t3.t.f39734s, composer, 0), (String) null, SizeKt.m644requiredSize3ABfNKs(Modifier.Companion, Dp.m5183constructorimpl(48)), MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1182getOnSurface0d7_KjU(), composer, 440, 0);
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

        @Override // a6.InterfaceC1670p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((AnimatedContentScope) obj, (L3.m) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return O5.I.f8278a;
        }
    }

    public final InterfaceC1670p a() {
        return f6886b;
    }
}
