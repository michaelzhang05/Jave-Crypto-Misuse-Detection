package q4;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: q4.h */
/* loaded from: classes4.dex */
public abstract class AbstractC3851h {

    /* renamed from: q4.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        public static final a f38318a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ModalBottomSheetValue it) {
            AbstractC3255y.i(it, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: q4.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        int f38319a;

        /* renamed from: b */
        int f38320b;

        /* renamed from: c */
        Object f38321c;

        /* renamed from: d */
        /* synthetic */ Object f38322d;

        /* renamed from: e */
        int f38323e;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38322d = obj;
            this.f38323e |= Integer.MIN_VALUE;
            return AbstractC3851h.c(0, null, this);
        }
    }

    public static final /* synthetic */ Object a(int i8, Function1 function1, S5.d dVar) {
        return c(i8, function1, dVar);
    }

    public static final C3850g b(ModalBottomSheetValue modalBottomSheetValue, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(2070707701);
        if ((i9 & 1) != 0) {
            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
        }
        ModalBottomSheetValue modalBottomSheetValue2 = modalBottomSheetValue;
        if ((i9 & 2) != 0) {
            function1 = a.f38318a;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2070707701, i8, -1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetState (StripeBottomSheetState.kt:22)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue2, (AnimationSpec<Float>) AnimationSpecKt.tween$default(0, 0, null, 7, null), function12, true, composer, (i8 & 14) | 3120 | ((i8 << 3) & 896), 0);
        C3845b a8 = AbstractC3846c.a(composer, 0);
        composer.startReplaceableGroup(-21674716);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C3850g(rememberModalBottomSheetState, a8);
            composer.updateRememberedValue(rememberedValue);
        }
        C3850g c3850g = (C3850g) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c3850g;
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
    public static final java.lang.Object c(int r4, kotlin.jvm.functions.Function1 r5, S5.d r6) {
        /*
            boolean r0 = r6 instanceof q4.AbstractC3851h.b
            if (r0 == 0) goto L13
            r0 = r6
            q4.h$b r0 = (q4.AbstractC3851h.b) r0
            int r1 = r0.f38323e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38323e = r1
            goto L18
        L13:
            q4.h$b r0 = new q4.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38322d
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f38323e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r4 = r0.f38320b
            int r5 = r0.f38319a
            java.lang.Object r2 = r0.f38321c
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            O5.t.b(r6)     // Catch: java.util.concurrent.CancellationException -> L31
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
            O5.t.b(r6)
            r6 = 0
            r6 = r5
            r5 = r4
            r4 = 0
        L42:
            if (r4 >= r5) goto L55
            r0.f38321c = r6     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f38319a = r5     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f38320b = r4     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f38323e = r3     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r4 = r6.invoke(r0)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r4 != r1) goto L55
            return r1
        L53:
            int r4 = r4 + r3
            goto L42
        L55:
            O5.I r4 = O5.I.f8278a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.AbstractC3851h.c(int, kotlin.jvm.functions.Function1, S5.d):java.lang.Object");
    }
}
