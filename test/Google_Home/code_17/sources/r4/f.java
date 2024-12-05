package r4;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import a6.InterfaceC1672r;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f38725a = new f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r4.c f38727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38728c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f38729d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669o f38730e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f38731f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC1672r f38732g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f38733h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r4.c cVar, long j8, long j9, InterfaceC1669o interfaceC1669o, boolean z8, InterfaceC1672r interfaceC1672r, int i8) {
            super(2);
            this.f38727b = cVar;
            this.f38728c = j8;
            this.f38729d = j9;
            this.f38730e = interfaceC1669o;
            this.f38731f = z8;
            this.f38732g = interfaceC1672r;
            this.f38733h = i8;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            f.this.a(this.f38727b, this.f38728c, this.f38729d, this.f38730e, this.f38731f, this.f38732g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38733h | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38734a = new b();

        b() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateColor, Composer composer, int i8) {
            AbstractC3255y.i(animateColor, "$this$animateColor");
            composer.startReplaceableGroup(1796476355);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1796476355, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:434)");
            }
            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final c f38735a = new c();

        c() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateFloat, Composer composer, int i8) {
            AbstractC3255y.i(animateFloat, "$this$animateFloat");
            composer.startReplaceableGroup(-706009145);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-706009145, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:386)");
            }
            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final d f38736a = new d();

        d() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateColor, Composer composer, int i8) {
            AbstractC3255y.i(animateColor, "$this$animateColor");
            composer.startReplaceableGroup(-1399926130);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399926130, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:424)");
            }
            TweenSpec tween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final e f38737a = new e();

        e() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
        }

        public final FiniteAnimationSpec invoke(Transition.Segment animateFloat, Composer composer, int i8) {
            FiniteAnimationSpec tween;
            AbstractC3255y.i(animateFloat, "$this$animateFloat");
            composer.startReplaceableGroup(-1726628034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1726628034, i8, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:398)");
            }
            r4.c cVar = r4.c.f38689a;
            r4.c cVar2 = r4.c.f38690b;
            if (animateFloat.isTransitioningTo(cVar, cVar2)) {
                tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
            } else if (!animateFloat.isTransitioningTo(cVar2, cVar) && !animateFloat.isTransitioningTo(r4.c.f38691c, cVar2)) {
                tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            } else {
                tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return tween;
        }
    }

    /* renamed from: r4.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0874f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38738a;

        static {
            int[] iArr = new int[r4.c.values().length];
            try {
                iArr[r4.c.f38689a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r4.c.f38690b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r4.c.f38691c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38738a = iArr;
        }
    }

    private f() {
    }

    private static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    private static final long d(State state) {
        return ((Color) state.getValue()).m2986unboximpl();
    }

    private static final long e(State state) {
        return ((Color) state.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01f9, code lost:
    
        if (r32 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ba, code lost:
    
        if (r32 != false) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r4.c r26, long r27, long r29, a6.InterfaceC1669o r31, boolean r32, a6.InterfaceC1672r r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.f.a(r4.c, long, long, a6.o, boolean, a6.r, androidx.compose.runtime.Composer, int):void");
    }
}
