package M3;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m4.AbstractC3441m;
import v4.C4108g;

/* renamed from: M3.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1325u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.u$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4108g f7082c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7083d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7084e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7085f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, C4108g c4108g, boolean z8, String str2, boolean z9) {
            super(3);
            this.f7080a = i8;
            this.f7081b = str;
            this.f7082c = c4108g;
            this.f7083d = z8;
            this.f7084e = str2;
            this.f7085f = z9;
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(ColumnScope RowButton, Composer composer, int i8) {
            AbstractC3255y.i(RowButton, "$this$RowButton");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139491033, i8, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab.<anonymous> (NewPaymentMethodTab.kt:48)");
            }
            Alignment centerStart = Alignment.Companion.getCenterStart();
            Modifier.Companion companion = Modifier.Companion;
            AbstractC1329y.a(this.f7080a, this.f7081b, this.f7082c, this.f7083d, SizeKt.m659widthInVpY3zN4$default(SizeKt.m638height3ABfNKs(companion, z.f7205a.b()), 0.0f, Dp.m5183constructorimpl(36), 1, null), centerStart, composer, 221184 | (C4108g.f40212g << 6), 0);
            r.a(null, this.f7084e, AbstractC3441m.n(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).h(), PaddingKt.m609paddingqDBjuR0$default(companion, 0.0f, Dp.m5183constructorimpl(6), 0.0f, 0.0f, 13, null), this.f7085f, composer, 3072, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.u$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f7086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4108g f7089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f7090e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7091f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7092g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f7093h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f7094i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f7095j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7096k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7097l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f8, int i8, String str, C4108g c4108g, String str2, boolean z8, boolean z9, boolean z10, Modifier modifier, Function0 function0, int i9, int i10) {
            super(2);
            this.f7086a = f8;
            this.f7087b = i8;
            this.f7088c = str;
            this.f7089d = c4108g;
            this.f7090e = str2;
            this.f7091f = z8;
            this.f7092g = z9;
            this.f7093h = z10;
            this.f7094i = modifier;
            this.f7095j = function0;
            this.f7096k = i9;
            this.f7097l = i10;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1325u.a(this.f7086a, this.f7087b, this.f7088c, this.f7089d, this.f7090e, this.f7091f, this.f7092g, this.f7093h, this.f7094i, this.f7095j, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7096k | 1), this.f7097l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(float r22, int r23, java.lang.String r24, v4.C4108g r25, java.lang.String r26, boolean r27, boolean r28, boolean r29, androidx.compose.ui.Modifier r30, kotlin.jvm.functions.Function0 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.AbstractC1325u.a(float, int, java.lang.String, v4.g, java.lang.String, boolean, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }
}
