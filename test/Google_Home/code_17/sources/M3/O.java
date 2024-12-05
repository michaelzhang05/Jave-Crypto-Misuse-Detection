package M3;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f6568a = CompositionLocalKt.staticCompositionLocalOf(a.f6571a);

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f6569b = CompositionLocalKt.staticCompositionLocalOf(b.f6572a);

    /* renamed from: c, reason: collision with root package name */
    private static final ProvidableCompositionLocal f6570c = CompositionLocalKt.staticCompositionLocalOf(c.f6573a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6571a = new a();

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
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6572a = new b();

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
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6573a = new c();

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
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f6574a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1668n interfaceC1668n) {
            super(2);
            this.f6574a = interfaceC1668n;
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
                ComposerKt.traceEventStart(-780814166, i8, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<anonymous> (PrimaryButtonTheme.kt:156)");
            }
            this.f6574a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ K f6575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f6576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P f6577c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f6578d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6579e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6580f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k8, M m8, P p8, InterfaceC1668n interfaceC1668n, int i8, int i9) {
            super(2);
            this.f6575a = k8;
            this.f6576b = m8;
            this.f6577c = p8;
            this.f6578d = interfaceC1668n;
            this.f6579e = i8;
            this.f6580f = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            O.a(this.f6575a, this.f6576b, this.f6577c, this.f6578d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6579e | 1), this.f6580f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if ((r32 & 4) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(M3.K r26, M3.M r27, M3.P r28, a6.InterfaceC1668n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.O.a(M3.K, M3.M, M3.P, a6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ProvidableCompositionLocal b() {
        return f6568a;
    }

    public static final ProvidableCompositionLocal c() {
        return f6569b;
    }

    public static final ProvidableCompositionLocal d() {
        return f6570c;
    }
}
