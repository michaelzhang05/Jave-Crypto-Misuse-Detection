package O3;

import M3.AbstractC1329y;
import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import v4.C4108g;
import w4.AbstractC4148a;

/* loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f8075a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.f8075a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
            this.f8075a.g().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f8078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4108g f8079d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8080e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8081f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8082g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, e eVar, C4108g c4108g, Modifier modifier, int i8, int i9) {
            super(2);
            this.f8076a = z8;
            this.f8077b = z9;
            this.f8078c = eVar;
            this.f8079d = c4108g;
            this.f8080e = modifier;
            this.f8081f = i8;
            this.f8082g = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            k.b(this.f8076a, this.f8077b, this.f8078c, this.f8079d, this.f8080e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8081f | 1), this.f8082g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8083a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8084b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4108g f8085c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8086d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f8087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, String str, C4108g c4108g, boolean z8, Modifier modifier) {
            super(3);
            this.f8083a = i8;
            this.f8084b = str;
            this.f8085c = c4108g;
            this.f8086d = z8;
            this.f8087e = modifier;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3255y.i(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213494546, i8, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:65)");
            }
            int i9 = this.f8083a;
            String str = this.f8084b;
            C4108g c4108g = this.f8085c;
            boolean z8 = this.f8086d;
            Modifier modifier = this.f8087e;
            r rVar = r.f8201a;
            AbstractC1329y.a(i9, str, c4108g, z8, SizeKt.m657width3ABfNKs(SizeKt.m638height3ABfNKs(modifier, rVar.a()), rVar.b()), Alignment.Companion.getCenter(), composer, (C4108g.f40212g << 6) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8091d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4108g f8092e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8093f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8094g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f8095h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f8096i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f8097j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f8098k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f8099l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, int i8, String str, C4108g c4108g, String str2, String str3, boolean z10, Function0 function0, Modifier modifier, int i9, int i10) {
            super(2);
            this.f8088a = z8;
            this.f8089b = z9;
            this.f8090c = i8;
            this.f8091d = str;
            this.f8092e = c4108g;
            this.f8093f = str2;
            this.f8094g = str3;
            this.f8095h = z10;
            this.f8096i = function0;
            this.f8097j = modifier;
            this.f8098k = i9;
            this.f8099l = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            k.a(this.f8088a, this.f8089b, this.f8090c, this.f8091d, this.f8092e, this.f8093f, this.f8094g, this.f8095h, this.f8096i, this.f8097j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8098k | 1), this.f8099l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r22, boolean r23, int r24, java.lang.String r25, v4.C4108g r26, java.lang.String r27, java.lang.String r28, boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.k.a(boolean, boolean, int, java.lang.String, v4.g, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z8, boolean z9, e displayablePaymentMethod, C4108g imageLoader, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        String f8;
        String a8;
        AbstractC3255y.i(displayablePaymentMethod, "displayablePaymentMethod");
        AbstractC3255y.i(imageLoader, "imageLoader");
        Composer startRestartGroup = composer.startRestartGroup(-585829252);
        if ((i9 & 16) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-585829252, i8, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:26)");
        }
        if (DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0) && displayablePaymentMethod.b() != null) {
            f8 = displayablePaymentMethod.b();
        } else {
            f8 = displayablePaymentMethod.f();
        }
        String str = f8;
        int e8 = displayablePaymentMethod.e();
        String a9 = AbstractC4148a.a(displayablePaymentMethod.c(), startRestartGroup, 8);
        B2.b h8 = displayablePaymentMethod.h();
        startRestartGroup.startReplaceableGroup(-1560062597);
        if (h8 == null) {
            a8 = null;
        } else {
            a8 = AbstractC4148a.a(h8, startRestartGroup, 8);
        }
        String str2 = a8;
        startRestartGroup.endReplaceableGroup();
        a(z8, z9, e8, str, imageLoader, a9, str2, displayablePaymentMethod.d(), new a(displayablePaymentMethod), TestTagKt.testTag(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.a()), startRestartGroup, (i8 & 126) | (C4108g.f40212g << 12) | ((i8 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, z9, displayablePaymentMethod, imageLoader, modifier2, i8, i9));
        }
    }
}
