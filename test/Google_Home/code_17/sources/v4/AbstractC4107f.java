package v4;

import O5.I;
import O5.r;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.M;
import v4.AbstractC4110i;

/* renamed from: v4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4107f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40171a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f40172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Painter f40173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4108g f40174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f40175e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f40176f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f40177g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f40178h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Alignment f40179i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ContentScale f40180j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ColorFilter f40181k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v4.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0912a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f40182a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4108g f40183b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f40184c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f40185d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f40186e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MutableState f40187f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0912a(C4108g c4108g, String str, int i8, int i9, MutableState mutableState, S5.d dVar) {
                super(2, dVar);
                this.f40183b = c4108g;
                this.f40184c = str;
                this.f40185d = i8;
                this.f40186e = i9;
                this.f40187f = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0912a(this.f40183b, this.f40184c, this.f40185d, this.f40186e, this.f40187f, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object g8;
                Bitmap bitmap;
                Object e8 = T5.b.e();
                int i8 = this.f40182a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        g8 = ((s) obj).j();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    C4108g c4108g = this.f40183b;
                    String str = this.f40184c;
                    int i9 = this.f40185d;
                    int i10 = this.f40186e;
                    this.f40182a = 1;
                    g8 = c4108g.g(str, i9, i10, this);
                    if (g8 == e8) {
                        return e8;
                    }
                }
                MutableState mutableState = this.f40187f;
                if (s.h(g8) && (bitmap = (Bitmap) g8) != null) {
                    mutableState.setValue(new AbstractC4110i.c(new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null)));
                }
                MutableState mutableState2 = this.f40187f;
                if (s.e(g8) != null) {
                    mutableState2.setValue(AbstractC4110i.a.f40257a);
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((C0912a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v4.f$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f40188a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8) {
                super(1);
                this.f40188a = z8;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4110i targetState) {
                AbstractC3255y.i(targetState, "targetState");
                if (this.f40188a) {
                    return Boolean.TRUE;
                }
                return targetState;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v4.f$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC3256z implements InterfaceC1670p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1669o f40189a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ BoxWithConstraintsScope f40190b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1669o f40191c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Modifier f40192d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f40193e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Alignment f40194f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ContentScale f40195g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ColorFilter f40196h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC1669o interfaceC1669o, BoxWithConstraintsScope boxWithConstraintsScope, InterfaceC1669o interfaceC1669o2, Modifier modifier, String str, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
                super(4);
                this.f40189a = interfaceC1669o;
                this.f40190b = boxWithConstraintsScope;
                this.f40191c = interfaceC1669o2;
                this.f40192d = modifier;
                this.f40193e = str;
                this.f40194f = alignment;
                this.f40195g = contentScale;
                this.f40196h = colorFilter;
            }

            public final void a(AnimatedContentScope AnimatedContent, AbstractC4110i it, Composer composer, int i8) {
                AbstractC3255y.i(AnimatedContent, "$this$AnimatedContent");
                AbstractC3255y.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1707989893, i8, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous>.<anonymous> (StripeImage.kt:95)");
                }
                if (AbstractC3255y.d(it, AbstractC4110i.a.f40257a)) {
                    composer.startReplaceableGroup(-1892467073);
                    this.f40189a.invoke(this.f40190b, composer, 0);
                    composer.endReplaceableGroup();
                } else if (AbstractC3255y.d(it, AbstractC4110i.b.f40258a)) {
                    composer.startReplaceableGroup(-1892465727);
                    this.f40191c.invoke(this.f40190b, composer, 0);
                    composer.endReplaceableGroup();
                } else if (it instanceof AbstractC4110i.c) {
                    composer.startReplaceableGroup(1463161246);
                    ImageKt.Image(((AbstractC4110i.c) it).a(), this.f40193e, TestTagKt.testTag(this.f40192d, "StripeImageFromUrl"), this.f40194f, this.f40195g, 0.0f, this.f40196h, composer, 8, 32);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(1463500913);
                    composer.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // a6.InterfaceC1670p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                a((AnimatedContentScope) obj, (AbstractC4110i) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z8, Painter painter, C4108g c4108g, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, Modifier modifier, String str2, Alignment alignment, ContentScale contentScale, ColorFilter colorFilter) {
            super(3);
            this.f40171a = str;
            this.f40172b = z8;
            this.f40173c = painter;
            this.f40174d = c4108g;
            this.f40175e = interfaceC1669o;
            this.f40176f = interfaceC1669o2;
            this.f40177g = modifier;
            this.f40178h = str2;
            this.f40179i = alignment;
            this.f40180j = contentScale;
            this.f40181k = colorFilter;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i8) {
            int i9;
            AbstractC3255y.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i8 & 14) == 0) {
                i9 = i8 | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i9 = i8;
            }
            if ((i9 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1632138495, i9, -1, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:61)");
            }
            boolean booleanValue = ((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            r c8 = AbstractC4107f.c(BoxWithConstraints);
            int intValue = ((Number) c8.a()).intValue();
            int intValue2 = ((Number) c8.b()).intValue();
            composer.startReplaceableGroup(-406660964);
            Painter painter = this.f40173c;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = (!booleanValue || painter == null) ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AbstractC4110i.b.f40258a, null, 2, null) : SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new AbstractC4110i.c(painter), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceableGroup();
            String str = this.f40171a;
            EffectsKt.LaunchedEffect(str, new C0912a(this.f40174d, str, intValue, intValue2, mutableState, null), composer, 64);
            Object value = mutableState.getValue();
            composer.startReplaceableGroup(-406637573);
            boolean changed = composer.changed(this.f40172b);
            boolean z8 = this.f40172b;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new b(z8);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            AnimatedContentKt.AnimatedContent(value, null, null, null, "loading_image_animation", (Function1) rememberedValue2, ComposableLambdaKt.composableLambda(composer, 1707989893, true, new c(this.f40175e, BoxWithConstraints, this.f40176f, this.f40177g, this.f40178h, this.f40179i, this.f40180j, this.f40181k)), composer, 1597440, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v4.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4108g f40198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f40200d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContentScale f40201e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ColorFilter f40202f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Painter f40203g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Alignment f40204h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f40205i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f40206j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f40207k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f40208l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f40209m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f40210n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, C4108g c4108g, String str2, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z8, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, int i8, int i9, int i10) {
            super(2);
            this.f40197a = str;
            this.f40198b = c4108g;
            this.f40199c = str2;
            this.f40200d = modifier;
            this.f40201e = contentScale;
            this.f40202f = colorFilter;
            this.f40203g = painter;
            this.f40204h = alignment;
            this.f40205i = z8;
            this.f40206j = interfaceC1669o;
            this.f40207k = interfaceC1669o2;
            this.f40208l = i8;
            this.f40209m = i9;
            this.f40210n = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC4107f.a(this.f40197a, this.f40198b, this.f40199c, this.f40200d, this.f40201e, this.f40202f, this.f40203g, this.f40204h, this.f40205i, this.f40206j, this.f40207k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f40208l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f40209m), this.f40210n);
        }
    }

    public static final void a(String url, C4108g imageLoader, String str, Modifier modifier, ContentScale contentScale, ColorFilter colorFilter, Painter painter, Alignment alignment, boolean z8, InterfaceC1669o interfaceC1669o, InterfaceC1669o interfaceC1669o2, Composer composer, int i8, int i9, int i10) {
        AbstractC3255y.i(url, "url");
        AbstractC3255y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(464230935);
        Modifier modifier2 = (i10 & 8) != 0 ? Modifier.Companion : modifier;
        ContentScale fit = (i10 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        ColorFilter colorFilter2 = (i10 & 32) != 0 ? null : colorFilter;
        Painter painter2 = (i10 & 64) != 0 ? null : painter;
        Alignment center = (i10 & 128) != 0 ? Alignment.Companion.getCenter() : alignment;
        boolean z9 = (i10 & 256) != 0 ? false : z8;
        InterfaceC1669o a8 = (i10 & 512) != 0 ? C4102a.f40137a.a() : interfaceC1669o;
        InterfaceC1669o b8 = (i10 & 1024) != 0 ? C4102a.f40137a.b() : interfaceC1669o2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(464230935, i8, i9, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:59)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -1632138495, true, new a(url, z9, painter2, imageLoader, a8, b8, modifier2, str, center, fit, colorFilter2)), startRestartGroup, 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(url, imageLoader, str, modifier2, fit, colorFilter2, painter2, center, z9, a8, b8, i8, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r c(BoxWithConstraintsScope boxWithConstraintsScope) {
        int i8;
        int i9;
        int m5151getMaxWidthimpl = Constraints.m5151getMaxWidthimpl(boxWithConstraintsScope.mo543getConstraintsmsEJaDk());
        IntSize.Companion companion = IntSize.Companion;
        if (m5151getMaxWidthimpl > IntSize.m5349getWidthimpl(companion.m5354getZeroYbymL2g()) && Constraints.m5151getMaxWidthimpl(boxWithConstraintsScope.mo543getConstraintsmsEJaDk()) < ((int) Dp.Companion.m5202getInfinityD9Ej5fM())) {
            i8 = Constraints.m5151getMaxWidthimpl(boxWithConstraintsScope.mo543getConstraintsmsEJaDk());
        } else {
            i8 = -1;
        }
        if (Constraints.m5150getMaxHeightimpl(boxWithConstraintsScope.mo543getConstraintsmsEJaDk()) > IntSize.m5348getHeightimpl(companion.m5354getZeroYbymL2g()) && Constraints.m5150getMaxHeightimpl(boxWithConstraintsScope.mo543getConstraintsmsEJaDk()) < ((int) Dp.Companion.m5202getInfinityD9Ej5fM())) {
            i9 = Constraints.m5150getMaxHeightimpl(boxWithConstraintsScope.mo543getConstraintsmsEJaDk());
        } else {
            i9 = -1;
        }
        if (i8 == -1) {
            i8 = i9;
        }
        if (i9 == -1) {
            i9 = i8;
        }
        return new r(Integer.valueOf(i8), Integer.valueOf(i9));
    }
}
