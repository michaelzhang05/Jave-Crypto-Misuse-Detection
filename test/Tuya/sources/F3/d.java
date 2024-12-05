package F3;

import L5.I;
import X5.n;
import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleOwner;
import h6.C2758a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;

/* loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f2466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f2467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f2468c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2469d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2470e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f2471f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, Function0 function0, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f2466a = j8;
            this.f2467b = function0;
            this.f2468c = modifier;
            this.f2469d = i8;
            this.f2470e = i9;
            this.f2471f = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f2466a, this.f2467b, this.f2468c, this.f2469d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2470e | 1), this.f2471f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f2472a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f2473a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0) {
                super(2);
                this.f2473a = function0;
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
                    ComposerKt.traceEventStart(-1411609844, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous>.<anonymous> (PollingScreen.kt:153)");
                }
                IconButtonKt.IconButton(this.f2473a, null, false, null, F3.a.f2446a.c(), composer, 24576, 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(2);
            this.f2472a = function0;
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
                ComposerKt.traceEventStart(108078738, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous> (PollingScreen.kt:148)");
            }
            AppBarKt.m1107TopAppBarxWeB9s(F3.a.f2446a.b(), null, ComposableLambdaKt.composableLambda(composer, -1411609844, true, new a(this.f2472a)), null, MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1182getSurface0d7_KjU(), 0L, Dp.m5178constructorimpl(0), composer, 1573254, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f2474a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f2475b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2476c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2477d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f2474a = function0;
            this.f2475b = modifier;
            this.f2476c = i8;
            this.f2477d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            d.b(this.f2474a, this.f2475b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2476c | 1), this.f2477d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0042d extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.polling.b f2478a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f2479b;

        /* renamed from: F3.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f2480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ F3.c f2481b;

            public a(LifecycleOwner lifecycleOwner, F3.c cVar) {
                this.f2480a = lifecycleOwner;
                this.f2481b = cVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f2480a.getLifecycle().removeObserver(this.f2481b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0042d(com.stripe.android.paymentsheet.paymentdatacollection.polling.b bVar, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f2478a = bVar;
            this.f2479b = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            AbstractC3159y.i(DisposableEffect, "$this$DisposableEffect");
            F3.c cVar = new F3.c(this.f2478a);
            this.f2479b.getLifecycle().addObserver(cVar);
            return new a(this.f2479b, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3156v implements Function0 {
        e(Object obj) {
            super(0, obj, com.stripe.android.paymentsheet.paymentdatacollection.polling.b.class, "handleCancel", "handleCancel()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            ((com.stripe.android.paymentsheet.paymentdatacollection.polling.b) this.receiver).k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.polling.b f2482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f2483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.paymentsheet.paymentdatacollection.polling.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f2482a = bVar;
            this.f2483b = modifier;
            this.f2484c = i8;
            this.f2485d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            d.d(this.f2482a, this.f2483b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2484c | 1), this.f2485d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F3.f f2486a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f2487b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f2488c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2489d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2490e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(F3.f fVar, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f2486a = fVar;
            this.f2487b = function0;
            this.f2488c = modifier;
            this.f2489d = i8;
            this.f2490e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            d.c(this.f2486a, this.f2487b, this.f2488c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f2489d | 1), this.f2490e);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2491a;

        static {
            int[] iArr = new int[F3.e.values().length];
            try {
                iArr[F3.e.f2492a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.e.f2493b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.e.f2495d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[F3.e.f2494c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f2491a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r37, kotlin.jvm.functions.Function0 r39, androidx.compose.ui.Modifier r40, int r41, androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.a(long, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function0 r32, androidx.compose.ui.Modifier r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r0 = r32
            r1 = r35
            r2 = r36
            r3 = -826407987(0xffffffffcebe03cd, float:-1.5939601E9)
            r4 = r34
            androidx.compose.runtime.Composer r4 = r4.startRestartGroup(r3)
            r5 = r2 & 1
            if (r5 == 0) goto L16
            r5 = r1 | 6
            goto L26
        L16:
            r5 = r1 & 14
            if (r5 != 0) goto L25
            boolean r5 = r4.changedInstance(r0)
            if (r5 == 0) goto L22
            r5 = 4
            goto L23
        L22:
            r5 = 2
        L23:
            r5 = r5 | r1
            goto L26
        L25:
            r5 = r1
        L26:
            r6 = r2 & 2
            if (r6 == 0) goto L2f
            r5 = r5 | 48
        L2c:
            r7 = r33
            goto L41
        L2f:
            r7 = r1 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L2c
            r7 = r33
            boolean r8 = r4.changed(r7)
            if (r8 == 0) goto L3e
            r8 = 32
            goto L40
        L3e:
            r8 = 16
        L40:
            r5 = r5 | r8
        L41:
            r8 = r5 & 91
            r9 = 18
            if (r8 != r9) goto L53
            boolean r8 = r4.getSkipping()
            if (r8 != 0) goto L4e
            goto L53
        L4e:
            r4.skipToGroupEnd()
            r3 = r4
            goto Laf
        L53:
            if (r6 == 0) goto L5a
            androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.Companion
            r31 = r6
            goto L5c
        L5a:
            r31 = r7
        L5c:
            boolean r6 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r6 == 0) goto L68
            r6 = -1
            java.lang.String r7 = "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling (PollingScreen.kt:145)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r5, r6, r7)
        L68:
            F3.d$b r3 = new F3.d$b
            r3.<init>(r0)
            r6 = 108078738(0x6712692, float:4.53554E-35)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r6, r7, r3)
            F3.a r3 = F3.a.f2446a
            X5.o r26 = r3.d()
            int r3 = r5 >> 3
            r3 = r3 & 14
            r3 = r3 | 384(0x180, float:5.38E-43)
            r28 = r3
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r30 = 131066(0x1fffa, float:1.83663E-40)
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r3 = r4
            r4 = r31
            r27 = r3
            androidx.compose.material.ScaffoldKt.m1320Scaffold27mzLpw(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29, r30)
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto Lad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lad:
            r7 = r31
        Laf:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.endRestartGroup()
            if (r3 == 0) goto Lbd
            F3.d$c r4 = new F3.d$c
            r4.<init>(r0, r7, r1, r2)
            r3.updateScope(r4)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.d.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(F3.f fVar, Function0 function0, Modifier modifier, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1466224530);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(fVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        int i14 = i9 & 4;
        if (i14 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466224530, i10, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:78)");
            }
            int i15 = h.f2491a[fVar.e().ordinal()];
            if (i15 != 1 && i15 != 2 && i15 != 3) {
                if (i15 != 4) {
                    startRestartGroup.startReplaceableGroup(1570766592);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(1570639554);
                    b(function0, modifier, startRestartGroup, (i10 >> 3) & 126, 0);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                startRestartGroup.startReplaceableGroup(1570380952);
                a(fVar.d(), function0, modifier, fVar.c(), startRestartGroup, i10 & PointerIconCompat.TYPE_TEXT, 0);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g(fVar, function0, modifier2, i8, i9));
        }
    }

    public static final void d(com.stripe.android.paymentsheet.paymentdatacollection.polling.b viewModel, Modifier modifier, Composer composer, int i8, int i9) {
        AbstractC3159y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-1574771667);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574771667, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:54)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        State a8 = v4.f.a(viewModel.j(), startRestartGroup, 8);
        EffectsKt.DisposableEffect(lifecycleOwner, new C0042d(viewModel, lifecycleOwner), startRestartGroup, 8);
        c(e(a8), new e(viewModel), SizeKt.fillMaxHeight(modifier, 0.67f), startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(viewModel, modifier, i8, i9));
        }
    }

    private static final F3.f e(State state) {
        return (F3.f) state.getValue();
    }

    private static final String i(long j8, int i8, Composer composer, int i9) {
        boolean z8;
        composer.startReplaceableGroup(-1139194821);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1139194821, i9, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.rememberActivePollingMessage (PollingScreen.kt:209)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(211883508);
        if ((((i9 & 14) ^ 6) > 4 && composer.changed(j8)) || (i9 & 6) == 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            long p8 = C2758a.p(j8);
            int t8 = C2758a.t(j8);
            C2758a.s(j8);
            rememberedValue = context.getString(i8, p8 + ":" + g6.n.e0(String.valueOf(t8), 2, '0'));
            composer.updateRememberedValue(rememberedValue);
        }
        String str = (String) rememberedValue;
        composer.endReplaceableGroup();
        AbstractC3159y.f(str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}
