package n4;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: n4.h */
/* loaded from: classes4.dex */
public abstract class AbstractC3472h {

    /* renamed from: n4.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        public static final a f36190a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ModalBottomSheetValue it) {
            AbstractC3159y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: n4.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        int f36191a;

        /* renamed from: b */
        int f36192b;

        /* renamed from: c */
        Object f36193c;

        /* renamed from: d */
        /* synthetic */ Object f36194d;

        /* renamed from: e */
        int f36195e;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36194d = obj;
            this.f36195e |= Integer.MIN_VALUE;
            return AbstractC3472h.c(0, null, this);
        }
    }

    public static final /* synthetic */ Object a(int i8, Function1 function1, P5.d dVar) {
        return c(i8, function1, dVar);
    }

    public static final C3471g b(ModalBottomSheetValue modalBottomSheetValue, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(2070707701);
        if ((i9 & 1) != 0) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        ModalBottomSheetValue modalBottomSheetValue2 = modalBottomSheetValue;
        if ((i9 & 2) != 0) {
            function1 = a.f36190a;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2070707701, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetState (StripeBottomSheetState.kt:22)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue2, (AnimationSpec<Float>) AnimationSpecKt.tween$default(0, 0, null, 7, null), function12, true, composer, (i8 & 14) | 3120 | ((i8 << 3) & 896), 0);
        C3466b a8 = AbstractC3467c.a(composer, 0);
        composer.startReplaceableGroup(-21674716);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3471g(rememberModalBottomSheetState, a8);
            composer.updateRememberedValue(rememberedValue);
        }
        C3471g c3471g = (C3471g) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3471g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0053
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(int r4, kotlin.jvm.functions.Function1 r5, P5.d r6) {
        /*
            boolean r0 = r6 instanceof n4.AbstractC3472h.b
            if (r0 == 0) goto L13
            r0 = r6
            n4.h$b r0 = (n4.AbstractC3472h.b) r0
            int r1 = r0.f36195e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36195e = r1
            goto L18
        L13:
            n4.h$b r0 = new n4.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36194d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f36195e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r4 = r0.f36192b
            int r5 = r0.f36191a
            java.lang.Object r2 = r0.f36193c
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            L5.t.b(r6)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L55
        L31:
            r6 = r2
            goto L53
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            L5.t.b(r6)
            r6 = 0
            r6 = r5
            r5 = r4
            r4 = 0
        L42:
            if (r4 >= r5) goto L55
            r0.f36193c = r6     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f36191a = r5     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f36192b = r4     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f36195e = r3     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r4 = r6.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r4 != r1) goto L55
            return r1
        L53:
            int r4 = r4 + r3
            goto L42
        L55:
            L5.I r4 = L5.I.f6487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.AbstractC3472h.c(int, kotlin.jvm.functions.Function1, P5.d):java.lang.Object");
    }
}
