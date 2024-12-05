package T2;

import L5.I;
import M5.AbstractC1246t;
import X5.n;
import X5.o;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C3399A;
import m4.J;
import m4.Q;
import m4.g0;
import m4.s0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9715a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static o f9716b = ComposableLambdaKt.composableLambdaInstance(-1188167286, false, a.f9719a);

    /* renamed from: c, reason: collision with root package name */
    public static n f9717c = ComposableLambdaKt.composableLambdaInstance(-549453615, false, C0213b.f9720a);

    /* renamed from: d, reason: collision with root package name */
    public static n f9718d = ComposableLambdaKt.composableLambdaInstance(1855839629, false, c.f9722a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9719a = new a();

        a() {
            super(3);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3159y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1188167286, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-1.<anonymous> (LinkInlineSignup.kt:258)");
            }
            S2.g.a(false, false, PaddingKt.m604paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5178constructorimpl(16), 0.0f, 0.0f, 13, null), TextAlign.Companion.m5087getStarte0LSkKk(), composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: T2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0213b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0213b f9720a = new C0213b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: T2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9721a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m60invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m60invoke() {
            }
        }

        C0213b() {
            super(2);
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
                ComposerKt.traceEventStart(-549453615, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-2.<anonymous> (LinkInlineSignup.kt:274)");
            }
            g0 g0Var = new g0(null, AbstractC1246t.m());
            s0 b8 = C3399A.a.b(C3399A.f34932h, "email@me.co", false, 2, null);
            Q b9 = Q.a.b(Q.f35194r, "5555555555", null, null, false, false, 30, null);
            s0 a8 = J.f35101h.a("My Name");
            U2.a aVar = U2.a.f11072c;
            a aVar2 = a.f9721a;
            int i9 = (g0.f35498c << 3) | 920322054;
            int i10 = s0.f35685x;
            h.g("Example, Inc.", g0Var, b8, b9, a8, aVar, true, true, true, null, aVar2, null, composer, i9 | (i10 << 6) | (Q.f35195s << 9) | (i10 << 12), 6, 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f9722a = new c();

        c() {
            super(2);
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
                ComposerKt.traceEventStart(1855839629, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-3.<anonymous> (LinkInlineSignup.kt:273)");
            }
            SurfaceKt.m1353SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, b.f9715a.b(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final o a() {
        return f9716b;
    }

    public final n b() {
        return f9717c;
    }
}
