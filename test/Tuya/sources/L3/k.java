package L3;

import J3.AbstractC1216y;
import L5.I;
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
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;
import t4.AbstractC3794a;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.f6284a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m51invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m51invoke() {
            this.f6284a.g().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6285a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6286b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f6287c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3755g f6288d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6289e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6290f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6291g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, boolean z9, e eVar, C3755g c3755g, Modifier modifier, int i8, int i9) {
            super(2);
            this.f6285a = z8;
            this.f6286b = z9;
            this.f6287c = eVar;
            this.f6288d = c3755g;
            this.f6289e = modifier;
            this.f6290f = i8;
            this.f6291g = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            k.b(this.f6285a, this.f6286b, this.f6287c, this.f6288d, this.f6289e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6290f | 1), this.f6291g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3755g f6294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f6295d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f6296e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, String str, C3755g c3755g, boolean z8, Modifier modifier) {
            super(3);
            this.f6292a = i8;
            this.f6293b = str;
            this.f6294c = c3755g;
            this.f6295d = z8;
            this.f6296e = modifier;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }

        public final void invoke(RowScope PaymentMethodRowButton, Composer composer, int i8) {
            AbstractC3159y.i(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213494546, i8, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:65)");
            }
            int i9 = this.f6292a;
            String str = this.f6293b;
            C3755g c3755g = this.f6294c;
            boolean z8 = this.f6295d;
            Modifier modifier = this.f6296e;
            r rVar = r.f6410a;
            AbstractC1216y.a(i9, str, c3755g, z8, SizeKt.m652width3ABfNKs(SizeKt.m633height3ABfNKs(modifier, rVar.a()), rVar.b()), Alignment.Companion.getCenter(), composer, (C3755g.f37939g << 6) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6297a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f6300d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3755g f6301e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6302f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f6303g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6304h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0 f6305i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f6306j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f6307k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6308l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, boolean z9, int i8, String str, C3755g c3755g, String str2, String str3, boolean z10, Function0 function0, Modifier modifier, int i9, int i10) {
            super(2);
            this.f6297a = z8;
            this.f6298b = z9;
            this.f6299c = i8;
            this.f6300d = str;
            this.f6301e = c3755g;
            this.f6302f = str2;
            this.f6303g = str3;
            this.f6304h = z10;
            this.f6305i = function0;
            this.f6306j = modifier;
            this.f6307k = i9;
            this.f6308l = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            k.a(this.f6297a, this.f6298b, this.f6299c, this.f6300d, this.f6301e, this.f6302f, this.f6303g, this.f6304h, this.f6305i, this.f6306j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6307k | 1), this.f6308l);
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
    public static final void a(boolean r22, boolean r23, int r24, java.lang.String r25, s4.C3755g r26, java.lang.String r27, java.lang.String r28, boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.k.a(boolean, boolean, int, java.lang.String, s4.g, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(boolean z8, boolean z9, e displayablePaymentMethod, C3755g imageLoader, Modifier modifier, Composer composer, int i8, int i9) {
        Modifier modifier2;
        String f8;
        String a8;
        AbstractC3159y.i(displayablePaymentMethod, "displayablePaymentMethod");
        AbstractC3159y.i(imageLoader, "imageLoader");
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
        String a9 = AbstractC3794a.a(displayablePaymentMethod.c(), startRestartGroup, 8);
        InterfaceC3983b h8 = displayablePaymentMethod.h();
        startRestartGroup.startReplaceableGroup(-1560062597);
        if (h8 == null) {
            a8 = null;
        } else {
            a8 = AbstractC3794a.a(h8, startRestartGroup, 8);
        }
        String str2 = a8;
        startRestartGroup.endReplaceableGroup();
        a(z8, z9, e8, str, imageLoader, a9, str2, displayablePaymentMethod.d(), new a(displayablePaymentMethod), TestTagKt.testTag(modifier2, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.a()), startRestartGroup, (i8 & 126) | (C3755g.f37939g << 12) | ((i8 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new b(z8, z9, displayablePaymentMethod, imageLoader, modifier2, i8, i9));
        }
    }
}
