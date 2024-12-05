package J3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f4862a = CompositionLocalKt.staticCompositionLocalOf(a.f4865a);

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f4863b = CompositionLocalKt.staticCompositionLocalOf(b.f4866a);

    /* renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f4864c = CompositionLocalKt.staticCompositionLocalOf(c.f4867a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4865a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return new K(0L, 0L, 0L, 0L, 0L, 31, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4866a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return new M(0.0f, 0.0f, 3, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4867a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke() {
            return new P(null, 0L, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f4868a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(X5.n nVar) {
            super(2);
            this.f4868a = nVar;
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
                ComposerKt.traceEventStart(-780814166, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<anonymous> (PrimaryButtonTheme.kt:156)");
            }
            this.f4868a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f4869a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f4870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P f4871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ X5.n f4872d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4873e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f4874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k8, M m8, P p8, X5.n nVar, int i8, int i9) {
            super(2);
            this.f4869a = k8;
            this.f4870b = m8;
            this.f4871c = p8;
            this.f4872d = nVar;
            this.f4873e = i8;
            this.f4874f = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            O.a(this.f4869a, this.f4870b, this.f4871c, this.f4872d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f4873e | 1), this.f4874f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if ((r32 & 4) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(J3.K r26, J3.M r27, J3.P r28, X5.n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.O.a(J3.K, J3.M, J3.P, X5.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ProvidableCompositionLocal b() {
        return f4862a;
    }

    public static final ProvidableCompositionLocal c() {
        return f4863b;
    }

    public static final ProvidableCompositionLocal d() {
        return f4864c;
    }
}
