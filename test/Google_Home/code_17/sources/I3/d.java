package I3;

import O5.I;
import a6.InterfaceC1668n;
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
import j6.n;
import k6.C3225a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;

/* loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f4007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f4008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4009d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4010e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4011f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j8, Function0 function0, Modifier modifier, int i8, int i9, int i10) {
            super(2);
            this.f4006a = j8;
            this.f4007b = function0;
            this.f4008c = modifier;
            this.f4009d = i8;
            this.f4010e = i9;
            this.f4011f = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f4006a, this.f4007b, this.f4008c, this.f4009d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4010e | 1), this.f4011f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f4012a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0 f4013a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0 function0) {
                super(2);
                this.f4013a = function0;
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
                    ComposerKt.traceEventStart(-1411609844, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous>.<anonymous> (PollingScreen.kt:153)");
                }
                IconButtonKt.IconButton(this.f4013a, null, false, null, I3.a.f3986a.c(), composer, 24576, 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0 function0) {
            super(2);
            this.f4012a = function0;
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
                ComposerKt.traceEventStart(108078738, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.FailedPolling.<anonymous> (PollingScreen.kt:148)");
            }
            AppBarKt.m1112TopAppBarxWeB9s(I3.a.f3986a.b(), null, ComposableLambdaKt.composableLambda(composer, -1411609844, true, new a(this.f4012a)), null, MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1187getSurface0d7_KjU(), 0L, Dp.m5183constructorimpl(0), composer, 1573254, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f4014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f4015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4016c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4017d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4014a = function0;
            this.f4015b = modifier;
            this.f4016c = i8;
            this.f4017d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            d.b(this.f4014a, this.f4015b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4016c | 1), this.f4017d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I3.d$d, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0067d extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.polling.b f4018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f4019b;

        /* renamed from: I3.d$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements DisposableEffectResult {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f4020a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ I3.c f4021b;

            public a(LifecycleOwner lifecycleOwner, I3.c cVar) {
                this.f4020a = lifecycleOwner;
                this.f4021b = cVar;
            }

            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                this.f4020a.getLifecycle().removeObserver(this.f4021b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0067d(com.stripe.android.paymentsheet.paymentdatacollection.polling.b bVar, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f4018a = bVar;
            this.f4019b = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            AbstractC3255y.i(DisposableEffect, "$this$DisposableEffect");
            I3.c cVar = new I3.c(this.f4018a);
            this.f4019b.getLifecycle().addObserver(cVar);
            return new a(this.f4019b, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class e extends C3252v implements Function0 {
        e(Object obj) {
            super(0, obj, com.stripe.android.paymentsheet.paymentdatacollection.polling.b.class, "handleCancel", "handleCancel()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m19invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m19invoke() {
            ((com.stripe.android.paymentsheet.paymentdatacollection.polling.b) this.receiver).k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.paymentdatacollection.polling.b f4022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f4023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4024c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.paymentsheet.paymentdatacollection.polling.b bVar, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4022a = bVar;
            this.f4023b = modifier;
            this.f4024c = i8;
            this.f4025d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            d.d(this.f4022a, this.f4023b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4024c | 1), this.f4025d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I3.f f4026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f4027b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f4028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(I3.f fVar, Function0 function0, Modifier modifier, int i8, int i9) {
            super(2);
            this.f4026a = fVar;
            this.f4027b = function0;
            this.f4028c = modifier;
            this.f4029d = i8;
            this.f4030e = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            d.c(this.f4026a, this.f4027b, this.f4028c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4029d | 1), this.f4030e);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4031a;

        static {
            int[] iArr = new int[I3.e.values().length];
            try {
                iArr[I3.e.f4032a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.e.f4033b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.e.f4035d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[I3.e.f4034c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4031a = iArr;
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
        throw new UnsupportedOperationException("Method not decompiled: I3.d.a(long, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, int, androidx.compose.runtime.Composer, int, int):void");
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
            I3.d$b r3 = new I3.d$b
            r3.<init>(r0)
            r6 = 108078738(0x6712692, float:4.53554E-35)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r4, r6, r7, r3)
            I3.a r3 = I3.a.f3986a
            a6.o r26 = r3.d()
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
            androidx.compose.material.ScaffoldKt.m1325Scaffold27mzLpw(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29, r30)
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto Lad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lad:
            r7 = r31
        Laf:
            androidx.compose.runtime.ScopeUpdateScope r3 = r3.endRestartGroup()
            if (r3 == 0) goto Lbd
            I3.d$c r4 = new I3.d$c
            r4.<init>(r0, r7, r1, r2)
            r3.updateScope(r4)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.d.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(I3.f fVar, Function0 function0, Modifier modifier, Composer composer, int i8, int i9) {
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
            int i15 = h.f4031a[fVar.e().ordinal()];
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
        AbstractC3255y.i(viewModel, "viewModel");
        Composer startRestartGroup = composer.startRestartGroup(-1574771667);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574771667, i8, -1, "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingScreen (PollingScreen.kt:54)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        State a8 = y4.f.a(viewModel.j(), startRestartGroup, 8);
        EffectsKt.DisposableEffect(lifecycleOwner, new C0067d(viewModel, lifecycleOwner), startRestartGroup, 8);
        c(e(a8), new e(viewModel), SizeKt.fillMaxHeight(modifier, 0.67f), startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f(viewModel, modifier, i8, i9));
        }
    }

    private static final I3.f e(State state) {
        return (I3.f) state.getValue();
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
            long p8 = C3225a.p(j8);
            int t8 = C3225a.t(j8);
            C3225a.s(j8);
            rememberedValue = context.getString(i8, p8 + ":" + n.e0(String.valueOf(t8), 2, '0'));
            composer.updateRememberedValue(rememberedValue);
        }
        String str = (String) rememberedValue;
        composer.endReplaceableGroup();
        AbstractC3255y.f(str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}
