package J3;

import J3.C1207o;
import M5.AbstractC1246t;
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
import b3.EnumC1870e;
import j4.AbstractC3087m;
import j4.C3077c;
import j4.C3085k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: J3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1198f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1198f f5173a = new C1198f();

    /* renamed from: b, reason: collision with root package name */
    public static X5.o f5174b = ComposableLambdaKt.composableLambdaInstance(334930206, false, a.f5176a);

    /* renamed from: c, reason: collision with root package name */
    public static X5.n f5175c = ComposableLambdaKt.composableLambdaInstance(-1877684654, false, b.f5177a);

    /* renamed from: J3.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5176a = new a();

        a() {
            super(3);
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i8) {
            AbstractC3159y.i(TextButton, "$this$TextButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334930206, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-1.<anonymous> (EditPaymentMethod.kt:210)");
            }
            TextKt.m1414Text4IGK_g(StringResources_androidKt.stringResource(q3.w.f37448X, composer, 0), (Modifier) null, Color.m2970copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1172getError0d7_KjU(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1) null, AbstractC3087m.i(C3085k.f33229a.b(), composer, C3077c.f33167e), composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: J3.f$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5177a = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J3.f$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5178a = new a();

            a() {
                super(1);
            }

            public final void a(InterfaceC1205m it) {
                AbstractC3159y.i(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC1205m) obj);
                return L5.I.f6487a;
            }
        }

        b() {
            super(2);
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1877684654, i8, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$EditPaymentMethodKt.lambda-2.<anonymous> (EditPaymentMethod.kt:311)");
            }
            C1207o.b bVar = C1207o.b.f5353a;
            InterfaceC3983b b8 = AbstractC3984c.b("Card");
            EnumC1870e enumC1870e = EnumC1870e.f14445v;
            AbstractC1204l.f(new C1207o(bVar, "4242", b8, true, new C1207o.a(enumC1870e), AbstractC1246t.p(new C1207o.a(EnumC1870e.f14438o), new C1207o.a(enumC1870e)), true, false, null, 384, null), a.f5178a, null, composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public final X5.o a() {
        return f5174b;
    }
}
