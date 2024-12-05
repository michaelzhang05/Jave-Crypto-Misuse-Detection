package R2;

import L5.I;
import X5.n;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f8735a = CompositionLocalKt.staticCompositionLocalOf(c.f8742a);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ R2.b f8736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f8737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(R2.b bVar, n nVar) {
            super(2);
            this.f8736a = bVar;
            this.f8737b = nVar;
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
                ComposerKt.traceEventStart(1467984557, i8, -1, "com.stripe.android.link.theme.DefaultLinkTheme.<anonymous> (Theme.kt:19)");
            }
            MaterialThemeKt.MaterialTheme(this.f8736a.g(), e.a(), MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable), this.f8737b, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f8739b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, n nVar, int i8, int i9) {
            super(2);
            this.f8738a = z8;
            this.f8739b = nVar;
            this.f8740c = i8;
            this.f8741d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            d.a(this.f8738a, this.f8739b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8740c | 1), this.f8741d);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8742a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R2.b invoke() {
            return R2.c.f8732a.a(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if ((r10 & 1) != 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r6, X5.n r7, androidx.compose.runtime.Composer r8, int r9, int r10) {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            java.lang.String r3 = "content"
            kotlin.jvm.internal.AbstractC3159y.i(r7, r3)
            r3 = -327817747(0xffffffffec75e5ed, float:-1.1890905E27)
            androidx.compose.runtime.Composer r8 = r8.startRestartGroup(r3)
            r4 = r9 & 14
            if (r4 != 0) goto L22
            r4 = r10 & 1
            if (r4 != 0) goto L1f
            boolean r4 = r8.changed(r6)
            if (r4 == 0) goto L1f
            r4 = 4
            goto L20
        L1f:
            r4 = 2
        L20:
            r4 = r4 | r9
            goto L23
        L22:
            r4 = r9
        L23:
            r1 = r1 & r10
            if (r1 == 0) goto L29
            r4 = r4 | 48
            goto L39
        L29:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L39
            boolean r1 = r8.changedInstance(r7)
            if (r1 == 0) goto L36
            r1 = 32
            goto L38
        L36:
            r1 = 16
        L38:
            r4 = r4 | r1
        L39:
            r1 = r4 & 91
            r5 = 18
            if (r1 != r5) goto L4a
            boolean r1 = r8.getSkipping()
            if (r1 != 0) goto L46
            goto L4a
        L46:
            r8.skipToGroupEnd()
            goto La4
        L4a:
            r8.startDefaults()
            r1 = r9 & 1
            if (r1 == 0) goto L62
            boolean r1 = r8.getDefaultsInvalid()
            if (r1 == 0) goto L58
            goto L62
        L58:
            r8.skipToGroupEnd()
            r1 = r10 & 1
            if (r1 == 0) goto L6b
        L5f:
            r4 = r4 & (-15)
            goto L6b
        L62:
            r1 = r10 & 1
            if (r1 == 0) goto L6b
            boolean r6 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r8, r0)
            goto L5f
        L6b:
            r8.endDefaults()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L7a
            r1 = -1
            java.lang.String r5 = "com.stripe.android.link.theme.DefaultLinkTheme (Theme.kt:15)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r4, r1, r5)
        L7a:
            R2.c r1 = R2.c.f8732a
            R2.b r1 = r1.a(r6)
            androidx.compose.runtime.ProvidableCompositionLocal r3 = R2.d.f8735a
            androidx.compose.runtime.ProvidedValue r3 = r3.provides(r1)
            androidx.compose.runtime.ProvidedValue[] r4 = new androidx.compose.runtime.ProvidedValue[r2]
            r4[r0] = r3
            R2.d$a r0 = new R2.d$a
            r0.<init>(r1, r7)
            r1 = 1467984557(0x577faaad, float:2.8110851E14)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r1, r2, r0)
            r1 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(r4, r0, r8, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto La4
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        La4:
            androidx.compose.runtime.ScopeUpdateScope r8 = r8.endRestartGroup()
            if (r8 == 0) goto Lb2
            R2.d$b r0 = new R2.d$b
            r0.<init>(r6, r7, r9, r10)
            r8.updateScope(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.d.a(boolean, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final R2.b b(MaterialTheme materialTheme, Composer composer, int i8) {
        AbstractC3159y.i(materialTheme, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1842304894, i8, -1, "com.stripe.android.link.theme.<get-linkColors> (Theme.kt:32)");
        }
        R2.b bVar = (R2.b) composer.consume(f8735a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }
}
