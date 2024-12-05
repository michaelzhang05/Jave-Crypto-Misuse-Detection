package J3;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import s4.C3755g;

/* renamed from: J3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1216y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.y$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f5480a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X5.n nVar) {
            super(3);
            this.f5480a = nVar;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer, int i8) {
            AbstractC3159y.i(StripeImage, "$this$StripeImage");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1956875215, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous>.<anonymous> (PaymentMethodIcon.kt:62)");
            }
            this.f5480a.invoke(composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.y$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements X5.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X5.n f5481a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X5.n nVar) {
            super(3);
            this.f5481a = nVar;
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer, int i8) {
            AbstractC3159y.i(StripeImage, "$this$StripeImage");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155295931, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous>.<anonymous> (PaymentMethodIcon.kt:61)");
            }
            this.f5481a.invoke(composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.y$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3755g f5484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f5485d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f5486e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Alignment f5487f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5488g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5489h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i8, String str, C3755g c3755g, boolean z8, Modifier modifier, Alignment alignment, int i9, int i10) {
            super(2);
            this.f5482a = i8;
            this.f5483b = str;
            this.f5484c = c3755g;
            this.f5485d = z8;
            this.f5486e = modifier;
            this.f5487f = alignment;
            this.f5488g = i9;
            this.f5489h = i10;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1216y.a(this.f5482a, this.f5483b, this.f5484c, this.f5485d, this.f5486e, this.f5487f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5488g | 1), this.f5489h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.y$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ColorFilter f5491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Alignment f5492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f5493d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i8, ColorFilter colorFilter, Alignment alignment, Modifier modifier) {
            super(2);
            this.f5490a = i8;
            this.f5491b = colorFilter;
            this.f5492c = alignment;
            this.f5493d = modifier;
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
                ComposerKt.traceEventStart(-1193756126, i8, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIcon.<anonymous> (PaymentMethodIcon.kt:43)");
            }
            AbstractC1216y.b(this.f5490a, this.f5491b, this.f5492c, this.f5493d, composer, 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.y$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ColorFilter f5495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Alignment f5496c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f5497d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5498e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i8, ColorFilter colorFilter, Alignment alignment, Modifier modifier, int i9) {
            super(2);
            this.f5494a = i8;
            this.f5495b = colorFilter;
            this.f5496c = alignment;
            this.f5497d = modifier;
            this.f5498e = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1216y.b(this.f5494a, this.f5495b, this.f5496c, this.f5497d, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5498e | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r22, java.lang.String r23, s4.C3755g r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.Alignment r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.AbstractC1216y.a(int, java.lang.String, s4.g, boolean, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(int i8, ColorFilter colorFilter, Alignment alignment, Modifier modifier, Composer composer, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3159y.i(alignment, "alignment");
        AbstractC3159y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-808382466);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(i8)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(colorFilter)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(alignment)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-808382466, i10, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodIconFromResource (PaymentMethodIcon.kt:79)");
            }
            if (i8 != 0) {
                ImageKt.Image(PainterResources_androidKt.painterResource(i8, startRestartGroup, i10 & 14), (String) null, TestTagKt.testTag(modifier, "PaymentMethodIconFomRes"), alignment, (ContentScale) null, 0.0f, colorFilter, startRestartGroup, ((i10 << 3) & 7168) | 56 | ((i10 << 15) & 3670016), 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e(i8, colorFilter, alignment, modifier, i9));
        }
    }
}
