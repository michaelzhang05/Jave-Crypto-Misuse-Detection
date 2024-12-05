package M3;

import M3.C1320o;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import e3.EnumC2791e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import m4.C3431c;
import m4.C3439k;

/* renamed from: M3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1311f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1311f f6879a = new C1311f();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC1669o f6880b = ComposableLambdaKt.composableLambdaInstance(334930206, false, a.f6882a);

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC1668n f6881c = ComposableLambdaKt.composableLambdaInstance(-1877684654, false, b.f6883a);

    /* renamed from: M3.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6882a = new a();

        a() {
            super(3);
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i8) {
            AbstractC3255y.i(TextButton, "$this$TextButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334930206, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-1.<anonymous> (EditPaymentMethod.kt:210)");
            }
            TextKt.m1419Text4IGK_g(StringResources_androidKt.stringResource(t3.w.f39770X, composer, 0), (Modifier) null, Color.m2975copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1177getError0d7_KjU(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, AbstractC3441m.i(C3439k.f35205a.b(), composer, C3431c.f35143e), composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: M3.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6883a = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: M3.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6884a = new a();

            a() {
                super(1);
            }

            public final void a(InterfaceC1318m it) {
                AbstractC3255y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC1318m) obj);
                return O5.I.f8278a;
            }
        }

        b() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1877684654, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-2.<anonymous> (EditPaymentMethod.kt:311)");
            }
            C1320o.b bVar = C1320o.b.f7059a;
            B2.b b8 = B2.c.b("Card");
            EnumC2791e enumC2791e = EnumC2791e.f31451v;
            AbstractC1317l.f(new C1320o(bVar, "4242", b8, true, new C1320o.a(enumC2791e), AbstractC1378t.p(new C1320o.a(EnumC2791e.f31444o), new C1320o.a(enumC2791e)), true, false, null, 384, null), a.f6884a, null, composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final InterfaceC1669o a() {
        return f6880b;
    }
}
