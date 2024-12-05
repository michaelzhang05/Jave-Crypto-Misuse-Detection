package W2;

import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
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
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import p4.C3742A;
import p4.J;
import p4.Q;
import p4.g0;
import p4.s0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11372a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1669o f11373b = ComposableLambdaKt.composableLambdaInstance(-1188167286, false, a.f11376a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1668n f11374c = ComposableLambdaKt.composableLambdaInstance(-549453615, false, C0238b.f11377a);

    /* renamed from: d, reason: collision with root package name */
    public static InterfaceC1668n f11375d = ComposableLambdaKt.composableLambdaInstance(1855839629, false, c.f11379a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11376a = new a();

        a() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i8) {
            AbstractC3255y.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1188167286, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-1.<anonymous> (LinkInlineSignup.kt:258)");
            }
            V2.g.a(false, false, PaddingKt.m609paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dp.m5183constructorimpl(16), 0.0f, 0.0f, 13, null), TextAlign.Companion.m5092getStarte0LSkKk(), composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: W2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0238b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0238b f11377a = new C0238b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: W2.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f11378a = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m65invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m65invoke() {
            }
        }

        C0238b() {
            super(2);
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
                ComposerKt.traceEventStart(-549453615, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-2.<anonymous> (LinkInlineSignup.kt:274)");
            }
            g0 g0Var = new g0(null, AbstractC1378t.m());
            s0 b8 = C3742A.a.b(C3742A.f36958h, "email@me.co", false, 2, null);
            Q b9 = Q.a.b(Q.f37220r, "5555555555", null, null, false, false, 30, null);
            s0 a8 = J.f37127h.a("My Name");
            X2.a aVar = X2.a.f12743c;
            a aVar2 = a.f11378a;
            int i9 = (g0.f37524c << 3) | 920322054;
            int i10 = s0.f37711x;
            h.g("Example, Inc.", g0Var, b8, b9, a8, aVar, true, true, true, null, aVar2, null, composer, i9 | (i10 << 6) | (Q.f37221s << 9) | (i10 << 12), 6, 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11379a = new c();

        c() {
            super(2);
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
                ComposerKt.traceEventStart(1855839629, i8, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-3.<anonymous> (LinkInlineSignup.kt:273)");
            }
            SurfaceKt.m1358SurfaceFjzlyU(null, null, 0L, 0L, null, 0.0f, b.f11372a.b(), composer, 1572864, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1669o a() {
        return f11373b;
    }

    public final InterfaceC1668n b() {
        return f11374c;
    }
}
